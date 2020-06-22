#![allow(unused_extern_crates)]
extern crate tokio_core;
extern crate native_tls;
extern crate hyper_tls;
extern crate openssl;
extern crate mime;
extern crate chrono;
extern crate url;

use hyper;
use hyper::header::{Headers, ContentType};
use hyper::Uri;
use self::url::percent_encoding::{utf8_percent_encode, PATH_SEGMENT_ENCODE_SET, QUERY_ENCODE_SET};
use futures;
use futures::{Future, Stream};
use futures::{future, stream};
use self::tokio_core::reactor::Handle;
use std::borrow::Cow;
use std::io::{Read, Error, ErrorKind};
use std::error;
use std::fmt;
use std::path::Path;
use std::sync::Arc;
use std::str;
use std::str::FromStr;
use std::string::ToString;
use swagger::headers::SafeHeaders;

use mimetypes;
use serde_json;

#[allow(unused_imports)]
use std::collections::{HashMap, BTreeMap};
#[allow(unused_imports)]
use swagger;

use swagger::{ApiError, XSpanId, XSpanIdString, Has, AuthData};

use {Api,
     GetBranchesResponse,
     DeleteEnvironmentResponse,
     DownloadLogsResponse,
     GetEnvironmentResponse,
     GetEnvironmentLogsResponse,
     GetEnvironmentsResponse,
     AdvancePipelineExecutionResponse,
     CancelPipelineExecutionStepResponse,
     GetCurrentExecutionResponse,
     GetExecutionResponse,
     GetExecutionsResponse,
     GetStepLogsResponse,
     StartPipelineResponse,
     StepMetricResponse,
     StepStateResponse,
     DeletePipelineResponse,
     GetPipelineResponse,
     GetPipelinesResponse,
     PatchPipelineResponse,
     DeleteProgramResponse,
     GetProgramResponse,
     GetProgramsResponse,
     GetRepositoriesResponse,
     GetRepositoryResponse,
     GetEnvironmentVariablesResponse,
     PatchEnvironmentVariablesResponse
     };
use models;

define_encode_set! {
    /// This encode set is used for object IDs
    ///
    /// Aside from the special characters defined in the `PATH_SEGMENT_ENCODE_SET`,
    /// the vertical bar (|) is encoded.
    pub ID_ENCODE_SET = [PATH_SEGMENT_ENCODE_SET] | {'|'}
}

/// Convert input into a base path, e.g. "http://example:123". Also checks the scheme as it goes.
fn into_base_path(input: &str, correct_scheme: Option<&'static str>) -> Result<String, ClientInitError> {
    // First convert to Uri, since a base path is a subset of Uri.
    let uri = Uri::from_str(input)?;

    let scheme = uri.scheme().ok_or(ClientInitError::InvalidScheme)?;

    // Check the scheme if necessary
    if let Some(correct_scheme) = correct_scheme {
        if scheme != correct_scheme {
            return Err(ClientInitError::InvalidScheme);
        }
    }

    let host = uri.host().ok_or_else(|| ClientInitError::MissingHost)?;
    let port = uri.port().map(|x| format!(":{}", x)).unwrap_or_default();
    Ok(format!("{}://{}{}", scheme, host, port))
}

/// A client that implements the API by making HTTP calls out to a server.
pub struct Client<F> where
  F: Future<Item=hyper::Response, Error=hyper::Error> + 'static {
    client_service: Arc<Box<dyn hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=F>>>,
    base_path: String,
}

impl<F> fmt::Debug for Client<F> where
   F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(f, "Client {{ base_path: {} }}", self.base_path)
    }
}

impl<F> Clone for Client<F> where
   F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static {
    fn clone(&self) -> Self {
        Client {
            client_service: self.client_service.clone(),
            base_path: self.base_path.clone()
        }
    }
}

impl Client<hyper::client::FutureResponse> {

    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    pub fn try_new_http(handle: Handle, base_path: &str) -> Result<Client<hyper::client::FutureResponse>, ClientInitError> {
        let http_connector = swagger::http_connector();
        Self::try_new_with_connector::<hyper::client::HttpConnector>(
            handle,
            base_path,
            Some("http"),
            http_connector,
        )
    }

    /// Create a client with a TLS connection to the server.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    pub fn try_new_https<CA>(
        handle: Handle,
        base_path: &str,
        ca_certificate: CA,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        CA: AsRef<Path>,
    {
        let https_connector = swagger::https_connector(ca_certificate);
        Self::try_new_with_connector::<hyper_tls::HttpsConnector<hyper::client::HttpConnector>>(
            handle,
            base_path,
            Some("https"),
            https_connector,
        )
    }

    /// Create a client with a mutually authenticated TLS connection to the server.
    ///
    /// # Arguments
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    /// * `client_key` - Path to the client private key
    /// * `client_certificate` - Path to the client's public certificate associated with the private key
    pub fn try_new_https_mutual<CA, K, C>(
        handle: Handle,
        base_path: &str,
        ca_certificate: CA,
        client_key: K,
        client_certificate: C,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        CA: AsRef<Path>,
        K: AsRef<Path>,
        C: AsRef<Path>,
    {
        let https_connector =
            swagger::https_mutual_connector(ca_certificate, client_key, client_certificate);
        Self::try_new_with_connector::<hyper_tls::HttpsConnector<hyper::client::HttpConnector>>(
            handle,
            base_path,
            Some("https"),
            https_connector,
        )
    }

    /// Create a client with a custom implementation of hyper::client::Connect.
    ///
    /// Intended for use with custom implementations of connect for e.g. protocol logging
    /// or similar functionality which requires wrapping the transport layer. When wrapping a TCP connection,
    /// this function should be used in conjunction with
    /// `swagger::{http_connector, https_connector, https_mutual_connector}`.
    ///
    /// For ordinary tcp connections, prefer the use of `try_new_http`, `try_new_https`
    /// and `try_new_https_mutual`, to avoid introducing a dependency on the underlying transport layer.
    ///
    /// # Arguments
    ///
    /// * `handle` - tokio reactor handle to use for execution
    /// * `base_path` - base path of the client API, i.e. "www.my-api-implementation.com"
    /// * `protocol` - Which protocol to use when constructing the request url, e.g. `Some("http")`
    /// * `connector_fn` - Function which returns an implementation of `hyper::client::Connect`
    pub fn try_new_with_connector<C>(
        handle: Handle,
        base_path: &str,
        protocol: Option<&'static str>,
        connector_fn: Box<dyn Fn(&Handle) -> C + Send + Sync>,
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    where
        C: hyper::client::Connect + hyper::client::Service,
    {
        let connector = connector_fn(&handle);
        let client_service = Box::new(hyper::Client::configure().connector(connector).build(
            &handle,
        ));

        Ok(Client {
            client_service: Arc::new(client_service),
            base_path: into_base_path(base_path, protocol)?,
        })
    }

    /// Constructor for creating a `Client` by passing in a pre-made `hyper` client.
    ///
    /// One should avoid relying on this function if possible, since it adds a dependency on the underlying transport
    /// implementation, which it would be better to abstract away. Therefore, using this function may lead to a loss of
    /// code generality, which may make it harder to move the application to a serverless environment, for example.
    ///
    /// The reason for this function's existence is to support legacy test code, which did mocking at the hyper layer.
    /// This is not a recommended way to write new tests. If other reasons are found for using this function, they
    /// should be mentioned here.
    #[deprecated(note="Use try_new_with_client_service instead")]
    pub fn try_new_with_hyper_client(
        hyper_client: Arc<Box<dyn hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=hyper::client::FutureResponse>>>,
        handle: Handle,
        base_path: &str
    ) -> Result<Client<hyper::client::FutureResponse>, ClientInitError>
    {
        Ok(Client {
            client_service: hyper_client,
            base_path: into_base_path(base_path, None)?,
        })
    }
}

impl<F> Client<F> where
    F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static
{
    /// Constructor for creating a `Client` by passing in a pre-made `hyper` client Service.
    ///
    /// This allows adding custom wrappers around the underlying transport, for example for logging.
    pub fn try_new_with_client_service(client_service: Arc<Box<dyn hyper::client::Service<Request=hyper::Request<hyper::Body>, Response=hyper::Response, Error=hyper::Error, Future=F>>>,
                                       handle: Handle,
                                       base_path: &str)
                                    -> Result<Client<F>, ClientInitError>
    {
        Ok(Client {
            client_service: client_service,
            base_path: into_base_path(base_path, None)?,
        })
    }
}

impl<F, C> Api<C> for Client<F> where
    F: Future<Item=hyper::Response, Error=hyper::Error>  + 'static,
    C: Has<XSpanIdString> {

    fn get_branches(&self, param_program_id: String, param_repository_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetBranchesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/repository/{repository_id}/branches",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), repository_id=utf8_percent_encode(&param_repository_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::BranchList>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetBranchesResponse::SuccessfulRetrievalOfTheListOfRepositoryBranches(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_environment(&self, param_program_id: String, param_environment_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=DeleteEnvironmentResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/environment/{environment_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), environment_id=utf8_percent_encode(&param_environment_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                201 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::Environment>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            DeleteEnvironmentResponse::EnvironmentDeleted(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::BadRequestError>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            DeleteEnvironmentResponse::EnvironmentDeletionInProgress(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteEnvironmentResponse::EnvironmentNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn download_logs(&self, param_program_id: String, param_environment_id: String, param_service: String, param_name: String, param_date: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_accept: Option<String>, context: &C) -> Box<dyn Future<Item=DownloadLogsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/environment/{environment_id}/logs/download",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), environment_id=utf8_percent_encode(&param_environment_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());
        query_string.append_pair("service", &param_service.to_string());
        query_string.append_pair("name", &param_name.to_string());
        query_string.append_pair("date", &param_date.to_string());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        header! { (RequestAccept, "Accept") => [String] }
        param_accept.map(|header| request.headers_mut().set(RequestAccept(header)));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DownloadLogsResponse::SuccessfulRetrievalOfLogs
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::BadRequestError>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            DownloadLogsResponse::InvalidParameters(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DownloadLogsResponse::EnvironmentNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_environment(&self, param_program_id: String, param_environment_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetEnvironmentResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/environment/{environment_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), environment_id=utf8_percent_encode(&param_environment_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::Environment>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetEnvironmentResponse::SuccessfulOperation(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_environment_logs(&self, param_program_id: String, param_environment_id: String, param_days: i32, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_service: Option<&Vec<String>>, param_name: Option<&Vec<String>>, context: &C) -> Box<dyn Future<Item=GetEnvironmentLogsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/environment/{environment_id}/logs",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), environment_id=utf8_percent_encode(&param_environment_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());

        if let Some(service) = param_service {
            query_string.append_pair("service", &service.join(","));
        }
        if let Some(name) = param_name {
            query_string.append_pair("name", &name.join(","));
        }        query_string.append_pair("days", &param_days.to_string());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::EnvironmentLogs>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetEnvironmentLogsResponse::SuccessfulRetrievalOfLogsForAnEnvironment(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::BadRequestError>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetEnvironmentLogsResponse::InvalidParameters(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetEnvironmentLogsResponse::EnvironmentNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_environments(&self, param_program_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param__type: Option<String>, context: &C) -> Box<dyn Future<Item=GetEnvironmentsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/environments",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());

        if let Some(_type) = param__type {
            query_string.append_pair("type", &_type.to_string());
        }

        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::EnvironmentList>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetEnvironmentsResponse::SuccessfulRetrievalOfEnvironmentList(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetEnvironmentsResponse::ProgramNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn advance_pipeline_execution(&self, param_program_id: String, param_pipeline_id: String, param_execution_id: String, param_phase_id: String, param_step_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_content_type: String, param_body: object, context: &C) -> Box<dyn Future<Item=AdvancePipelineExecutionResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}/advance",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET), execution_id=utf8_percent_encode(&param_execution_id.to_string(), ID_ENCODE_SET), phase_id=utf8_percent_encode(&param_phase_id.to_string(), ID_ENCODE_SET), step_id=utf8_percent_encode(&param_step_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);

        // Body parameter
        let body = serde_json::to_string(&param_body).expect("impossible to fail to serialize");
        request.set_body(body);

        request.headers_mut().set(ContentType(mimetypes::requests::ADVANCE_PIPELINE_EXECUTION.clone()));

        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        header! { (RequestContentType, "Content-Type") => [String] }
        request.headers_mut().set(RequestContentType(param_content_type));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                202 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            AdvancePipelineExecutionResponse::SuccessfulResumeOfPipelineExecution
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                403 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            AdvancePipelineExecutionResponse::MissingPermissionForUserToAdvanceThePipelineExecution
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            AdvancePipelineExecutionResponse::NoPipelineExecutionExitsOrUnknownPipelineOrProgram
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn cancel_pipeline_execution_step(&self, param_program_id: String, param_pipeline_id: String, param_execution_id: String, param_phase_id: String, param_step_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_content_type: String, param_body: object, context: &C) -> Box<dyn Future<Item=CancelPipelineExecutionStepResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}/cancel",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET), execution_id=utf8_percent_encode(&param_execution_id.to_string(), ID_ENCODE_SET), phase_id=utf8_percent_encode(&param_phase_id.to_string(), ID_ENCODE_SET), step_id=utf8_percent_encode(&param_step_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);

        let body = serde_json::to_string(&param_body).expect("impossible to fail to serialize");
        request.set_body(body);

        request.headers_mut().set(ContentType(mimetypes::requests::CANCEL_PIPELINE_EXECUTION_STEP.clone()));

        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        header! { (RequestContentType, "Content-Type") => [String] }
        request.headers_mut().set(RequestContentType(param_content_type));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                202 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            CancelPipelineExecutionStepResponse::SuccessfulCancelOfPipelineExecution
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                403 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            CancelPipelineExecutionStepResponse::MissingPermissionForUserToCancelTheCurrentPipelineExecution
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            CancelPipelineExecutionStepResponse::NoPipelineExecutionExitsOrUnknownPipelineOrProgram
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_current_execution(&self, param_program_id: String, param_pipeline_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetCurrentExecutionResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/execution",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::PipelineExecution>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetCurrentExecutionResponse::SuccessfulRetrievalOfCurrentExecution(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetCurrentExecutionResponse::NoPipelineExecutionExitsOrUnknownPipelineOrProgram
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_execution(&self, param_program_id: String, param_pipeline_id: String, param_execution_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetExecutionResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET), execution_id=utf8_percent_encode(&param_execution_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::PipelineExecution>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetExecutionResponse::SuccessfulRetrievalOfExecution(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetExecutionResponse::NoPipelineExecutionExitsOrUnknownPipelineOrApplication
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_executions(&self, param_program_id: String, param_pipeline_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_start: Option<String>, param_limit: Option<i32>, context: &C) -> Box<dyn Future<Item=GetExecutionsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/executions",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());

        if let Some(start) = param_start {
            query_string.append_pair("start", &start.to_string());
        }
        if let Some(limit) = param_limit {
            query_string.append_pair("limit", &limit.to_string());
        }

        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::PipelineExecutionListRepresentation>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetExecutionsResponse::SuccessfulRetrievalOfExecutionHistory(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                403 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetExecutionsResponse::MissingPermissionForUserToReadExecutions
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetExecutionsResponse::PipelineDoesNotExist
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_step_logs(&self, param_program_id: String, param_pipeline_id: String, param_execution_id: String, param_phase_id: String, param_step_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_file: Option<String>, param_accept: Option<String>, context: &C) -> Box<dyn Future<Item=GetStepLogsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}/logs",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET), execution_id=utf8_percent_encode(&param_execution_id.to_string(), ID_ENCODE_SET), phase_id=utf8_percent_encode(&param_phase_id.to_string(), ID_ENCODE_SET), step_id=utf8_percent_encode(&param_step_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());

        if let Some(file) = param_file {
            query_string.append_pair("file", &file.to_string());
        }

        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestAccept, "Accept") => [String] }
        param_accept.map(|header| request.headers_mut().set(RequestAccept(header)));
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetStepLogsResponse::SuccessfulRetrievalOfLogs
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                403 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetStepLogsResponse::MissingPermissionForUserToReadLogs
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetStepLogsResponse::PipelineExecutionDoesNotExist
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn start_pipeline(&self, param_program_id: String, param_pipeline_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_content_type: String, context: &C) -> Box<dyn Future<Item=StartPipelineResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/execution",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Put, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        header! { (RequestContentType, "Content-Type") => [String] }
        request.headers_mut().set(RequestContentType(param_content_type));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                201 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            StartPipelineResponse::SuccessfulStartedPipelineExecution
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                400 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            StartPipelineResponse::RequestConflictsWithTheExpectedStateOfPipeline
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            StartPipelineResponse::NoPipelineExecutionExitsOrUnknownPipelineOrApplication
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                412 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            StartPipelineResponse::CannotStartExecution
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn step_metric(&self, param_program_id: String, param_pipeline_id: String, param_execution_id: String, param_phase_id: String, param_step_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=StepMetricResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}/metrics",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET), execution_id=utf8_percent_encode(&param_execution_id.to_string(), ID_ENCODE_SET), phase_id=utf8_percent_encode(&param_phase_id.to_string(), ID_ENCODE_SET), step_id=utf8_percent_encode(&param_step_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::PipelineStepMetrics>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            StepMetricResponse::SuccessfulRetrievalOfMetrics(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                403 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            StepMetricResponse::MissingPermissionForUserToReadMetrics
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            StepMetricResponse::PipelineExecutionDoesNotExist
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn step_state(&self, param_program_id: String, param_pipeline_id: String, param_execution_id: String, param_phase_id: String, param_step_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=StepStateResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET), execution_id=utf8_percent_encode(&param_execution_id.to_string(), ID_ENCODE_SET), phase_id=utf8_percent_encode(&param_phase_id.to_string(), ID_ENCODE_SET), step_id=utf8_percent_encode(&param_step_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::PipelineExecutionStepState>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            StepStateResponse::SuccessfulRetrievalOfStepState(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                403 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            StepStateResponse::MissingPermissionForUserToReadStep
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            StepStateResponse::PipelineExecutionDoesNotExist
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_pipeline(&self, param_program_id: String, param_pipeline_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=DeletePipelineResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                0 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeletePipelineResponse::SuccessfulOperation
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_pipeline(&self, param_program_id: String, param_pipeline_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetPipelineResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::Pipeline>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetPipelineResponse::SuccessfulRetrievalOfPipeline(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetPipelineResponse::PipelineNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_pipelines(&self, param_program_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetPipelinesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipelines",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::PipelineList>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetPipelinesResponse::SuccessfulOperation(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn patch_pipeline(&self, param_program_id: String, param_pipeline_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_content_type: String, param_body: models::Pipeline, context: &C) -> Box<dyn Future<Item=PatchPipelineResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/pipeline/{pipeline_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), pipeline_id=utf8_percent_encode(&param_pipeline_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Patch, uri);

        let body = serde_json::to_string(&param_body).expect("impossible to fail to serialize");
        request.set_body(body);

        request.headers_mut().set(ContentType(mimetypes::requests::PATCH_PIPELINE.clone()));

        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        header! { (RequestContentType, "Content-Type") => [String] }
        request.headers_mut().set(RequestContentType(param_content_type));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::Pipeline>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            PatchPipelineResponse::SuccessfulOperation(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn delete_program(&self, param_program_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=DeleteProgramResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Delete, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::Program>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            DeleteProgramResponse::SuccessfulOperation(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                202 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::Program>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            DeleteProgramResponse::DeleteWasSuccessful(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                403 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteProgramResponse::Forbidden
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteProgramResponse::ProgramNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                412 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            DeleteProgramResponse::DeletionNotSupported
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_program(&self, param_program_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetProgramResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::Program>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetProgramResponse::SuccessfulRetrievalOfProgram(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetProgramResponse::ProgramNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_programs(&self, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetProgramsResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/programs",
            self.base_path
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::ProgramList>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetProgramsResponse::SuccessfulOperation(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_repositories(&self, param_program_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetRepositoriesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/repositories",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::RepositoryList>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetRepositoriesResponse::SuccessfulOperation(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_repository(&self, param_program_id: String, param_repository_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetRepositoryResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/repository/{repository_id}",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), repository_id=utf8_percent_encode(&param_repository_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::Repository>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetRepositoryResponse::SuccessfulOperation(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn get_environment_variables(&self, param_program_id: String, param_environment_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, context: &C) -> Box<dyn Future<Item=GetEnvironmentVariablesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/environment/{environment_id}/variables",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), environment_id=utf8_percent_encode(&param_environment_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Get, uri);


        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::VariableList>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            GetEnvironmentVariablesResponse::SuccessfulRetrievalOfEnvironmentVariables(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            GetEnvironmentVariablesResponse::EnvironmentNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

    fn patch_environment_variables(&self, param_program_id: String, param_environment_id: String, param_x_gw_ims_org_id: String, param_authorization: String, param_x_api_key: String, param_content_type: String, param_body: &Vec<models::Variable>, context: &C) -> Box<dyn Future<Item=PatchEnvironmentVariablesResponse, Error=ApiError>> {
        let mut uri = format!(
            "{}/api/program/{program_id}/environment/{environment_id}/variables",
            self.base_path, program_id=utf8_percent_encode(&param_program_id.to_string(), ID_ENCODE_SET), environment_id=utf8_percent_encode(&param_environment_id.to_string(), ID_ENCODE_SET)
        );

        let mut query_string = self::url::form_urlencoded::Serializer::new("".to_owned());


        let query_string_str = query_string.finish();
        if !query_string_str.is_empty() {
            uri += "?";
            uri += &query_string_str;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Box::new(futures::done(Err(ApiError(format!("Unable to build URI: {}", err))))),
        };

        let mut request = hyper::Request::new(hyper::Method::Patch, uri);

        let body = serde_json::to_string(&param_body).expect("impossible to fail to serialize");
        request.set_body(body);

        request.headers_mut().set(ContentType(mimetypes::requests::PATCH_ENVIRONMENT_VARIABLES.clone()));

        request.headers_mut().set(XSpanId((context as &dyn Has<XSpanIdString>).get().0.clone()));

        // Header parameters
        header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
        request.headers_mut().set(RequestXGwImsOrgId(param_x_gw_ims_org_id));
        header! { (RequestAuthorization, "Authorization") => [String] }
        request.headers_mut().set(RequestAuthorization(param_authorization));
        header! { (RequestXApiKey, "x-api-key") => [String] }
        request.headers_mut().set(RequestXApiKey(param_x_api_key));
        header! { (RequestContentType, "Content-Type") => [String] }
        request.headers_mut().set(RequestContentType(param_content_type));
        Box::new(self.client_service.call(request)
                             .map_err(|e| ApiError(format!("No response received: {}", e)))
                             .and_then(|mut response| {
            match response.status().as_u16() {
                200 => {
                    let body = response.body();
                    Box::new(
                        body
                        .concat2()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e)))
                        .and_then(|body|
                            str::from_utf8(&body)
                            .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))
                            .and_then(|body|
                                serde_json::from_str::<models::VariableList>(body)
                                .map_err(|e| e.into())
                            )
                        )
                        .map(move |body| {
                            PatchEnvironmentVariablesResponse::SuccessfulUpdateOfEnvironmentVariables(body)
                        })
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                404 => {
                    let body = response.body();
                    Box::new(

                        future::ok(
                            PatchEnvironmentVariablesResponse::EnvironmentNotFound
                        )
                    ) as Box<dyn Future<Item=_, Error=_>>
                },
                code => {
                    let headers = response.headers().clone();
                    Box::new(response.body()
                            .take(100)
                            .concat2()
                            .then(move |body|
                                future::err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                                    code,
                                    headers,
                                    match body {
                                        Ok(ref body) => match str::from_utf8(body) {
                                            Ok(body) => Cow::from(body),
                                            Err(e) => Cow::from(format!("<Body was not UTF8: {:?}>", e)),
                                        },
                                        Err(e) => Cow::from(format!("<Failed to read body: {}>", e)),
                                    })))
                            )
                    ) as Box<dyn Future<Item=_, Error=_>>
                }
            }
        }))

    }

}

#[derive(Debug)]
pub enum ClientInitError {
    InvalidScheme,
    InvalidUri(hyper::error::UriError),
    MissingHost,
    SslError(openssl::error::ErrorStack)
}

impl From<hyper::error::UriError> for ClientInitError {
    fn from(err: hyper::error::UriError) -> ClientInitError {
        ClientInitError::InvalidUri(err)
    }
}

impl From<openssl::error::ErrorStack> for ClientInitError {
    fn from(err: openssl::error::ErrorStack) -> ClientInitError {
        ClientInitError::SslError(err)
    }
}

impl fmt::Display for ClientInitError {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        (self as &dyn fmt::Debug).fmt(f)
    }
}

impl error::Error for ClientInitError {
    fn description(&self) -> &str {
        "Failed to produce a hyper client."
    }
}
