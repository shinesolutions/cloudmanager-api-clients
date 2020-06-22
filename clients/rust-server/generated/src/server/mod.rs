#![allow(unused_extern_crates)]
extern crate serde_ignored;
extern crate tokio_core;
extern crate native_tls;
extern crate hyper_tls;
extern crate openssl;
extern crate mime;
extern crate chrono;
extern crate percent_encoding;
extern crate url;

use std::sync::Arc;
use std::marker::PhantomData;
use futures::{Future, future, Stream, stream};
use hyper;
use hyper::{Request, Response, Error, StatusCode};
use hyper::header::{Headers, ContentType};
use self::url::form_urlencoded;
use mimetypes;
use serde_json;

#[allow(unused_imports)]
use std::collections::{HashMap, BTreeMap};
#[allow(unused_imports)]
use swagger;
use std::io;

#[allow(unused_imports)]
use std::collections::BTreeSet;

pub use swagger::auth::Authorization;
use swagger::{ApiError, XSpanId, XSpanIdString, Has, RequestParser};
use swagger::auth::Scopes;
use swagger::headers::SafeHeaders;

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
#[allow(unused_imports)]
use models;

pub mod context;

header! { (Warning, "Warning") => [String] }

mod paths {
    extern crate regex;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/api/program/(?P<program_id>[^/?#]*)$",
            r"^/api/program/(?P<program_id>[^/?#]*)/environment/(?P<environment_id>[^/?#]*)$",
            r"^/api/program/(?P<program_id>[^/?#]*)/environment/(?P<environment_id>[^/?#]*)/logs$",
            r"^/api/program/(?P<program_id>[^/?#]*)/environment/(?P<environment_id>[^/?#]*)/logs/download$",
            r"^/api/program/(?P<program_id>[^/?#]*)/environment/(?P<environment_id>[^/?#]*)/variables$",
            r"^/api/program/(?P<program_id>[^/?#]*)/environments$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)/advance$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)/cancel$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)/logs$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)/metrics$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/executions$",
            r"^/api/program/(?P<program_id>[^/?#]*)/pipelines$",
            r"^/api/program/(?P<program_id>[^/?#]*)/repositories$",
            r"^/api/program/(?P<program_id>[^/?#]*)/repository/(?P<repository_id>[^/?#]*)$",
            r"^/api/program/(?P<program_id>[^/?#]*)/repository/(?P<repository_id>[^/?#]*)/branches$",
            r"^/api/programs$"
        ]).unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID: usize = 0;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID: usize = 1;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/environment/(?P<environment_id>[^/?#]*)$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS: usize = 2;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/environment/(?P<environment_id>[^/?#]*)/logs$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS_DOWNLOAD: usize = 3;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS_DOWNLOAD: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/environment/(?P<environment_id>[^/?#]*)/logs/download$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES: usize = 4;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/environment/(?P<environment_id>[^/?#]*)/variables$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_ENVIRONMENTS: usize = 5;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENTS: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/environments$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID: usize = 6;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION: usize = 7;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID: usize = 8;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID: usize = 9;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_ADVANCE: usize = 10;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_ADVANCE: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)/advance$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_CANCEL: usize = 11;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_CANCEL: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)/cancel$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_LOGS: usize = 12;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_LOGS: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)/logs$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_METRICS: usize = 13;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_METRICS: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/execution/(?P<execution_id>[^/?#]*)/phase/(?P<phase_id>[^/?#]*)/step/(?P<step_id>[^/?#]*)/metrics$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTIONS: usize = 14;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTIONS: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipeline/(?P<pipeline_id>[^/?#]*)/executions$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_PIPELINES: usize = 15;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_PIPELINES: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/pipelines$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_REPOSITORIES: usize = 16;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_REPOSITORIES: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/repositories$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID: usize = 17;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/repository/(?P<repository_id>[^/?#]*)$").unwrap();
    }
    pub static ID_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID_BRANCHES: usize = 18;
    lazy_static! {
        pub static ref REGEX_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID_BRANCHES: regex::Regex = regex::Regex::new(r"^/api/program/(?P<program_id>[^/?#]*)/repository/(?P<repository_id>[^/?#]*)/branches$").unwrap();
    }
    pub static ID_API_PROGRAMS: usize = 19;
}

pub struct NewService<T, C> {
    api_impl: Arc<T>,
    marker: PhantomData<C>,
}

impl<T, C> NewService<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString>  + 'static
{
    pub fn new<U: Into<Arc<T>>>(api_impl: U) -> NewService<T, C> {
        NewService{api_impl: api_impl.into(), marker: PhantomData}
    }
}

impl<T, C> hyper::server::NewService for NewService<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString>  + 'static
{
    type Request = (Request, C);
    type Response = Response;
    type Error = Error;
    type Instance = Service<T, C>;

    fn new_service(&self) -> Result<Self::Instance, io::Error> {
        Ok(Service::new(self.api_impl.clone()))
    }
}

pub struct Service<T, C> {
    api_impl: Arc<T>,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString>  + 'static {
    pub fn new<U: Into<Arc<T>>>(api_impl: U) -> Service<T, C> {
        Service{api_impl: api_impl.into(), marker: PhantomData}
    }
}

impl<T, C> hyper::server::Service for Service<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString>  + 'static
{
    type Request = (Request, C);
    type Response = Response;
    type Error = Error;
    type Future = Box<dyn Future<Item=Response, Error=Error>>;

    fn call(&self, (req, mut context): Self::Request) -> Self::Future {
        let api_impl = self.api_impl.clone();
        let (method, uri, _, headers, body) = req.deconstruct();
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        // This match statement is duplicated below in `parse_operation_id()`.
        // Please update both places if changing how this code is autogenerated.
        match &method {

            // GetBranches - GET /api/program/{programId}/repository/{repositoryId}/branches
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID_BRANCHES) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID_BRANCHES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID_BRANCHES in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID_BRANCHES.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_repository_id = match percent_encoding::percent_decode(path_params["repository_id"].as_bytes()).decode_utf8() {
                    Ok(param_repository_id) => match param_repository_id.parse::<String>() {
                        Ok(param_repository_id) => param_repository_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter repositoryId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["repository_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_branches(param_program_id, param_repository_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetBranchesResponse::SuccessfulRetrievalOfTheListOfRepositoryBranches

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_BRANCHES_SUCCESSFUL_RETRIEVAL_OF_THE_LIST_OF_REPOSITORY_BRANCHES.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // DeleteEnvironment - DELETE /api/program/{programId}/environment/{environmentId}
            &hyper::Method::Delete if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_environment_id = match percent_encoding::percent_decode(path_params["environment_id"].as_bytes()).decode_utf8() {
                    Ok(param_environment_id) => match param_environment_id.parse::<String>() {
                        Ok(param_environment_id) => param_environment_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter environmentId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["environment_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.delete_environment(param_program_id, param_environment_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteEnvironmentResponse::EnvironmentDeleted

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(201).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_ENVIRONMENT_ENVIRONMENT_DELETED.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                DeleteEnvironmentResponse::EnvironmentDeletionInProgress

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(400).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_ENVIRONMENT_ENVIRONMENT_DELETION_IN_PROGRESS.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                DeleteEnvironmentResponse::EnvironmentNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // DownloadLogs - GET /api/program/{programId}/environment/{environmentId}/logs/download
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS_DOWNLOAD) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS_DOWNLOAD
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS_DOWNLOAD in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS_DOWNLOAD.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_environment_id = match percent_encoding::percent_decode(path_params["environment_id"].as_bytes()).decode_utf8() {
                    Ok(param_environment_id) => match param_environment_id.parse::<String>() {
                        Ok(param_environment_id) => param_environment_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter environmentId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["environment_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                header! { (RequestAccept, "Accept") => [String] }
                let param_accept = headers.safe_get::<RequestAccept>().map(|header| header.0.clone());
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_service = query_params.iter().filter(|e| e.0 == "service").map(|e| e.1.to_owned())
                    .nth(0);
                let param_service = match param_service {
                    Some(param_service) => match param_service.parse::<String>() {
                        Ok(param_service) => param_service,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter service - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter service"))),
                };
                let param_name = query_params.iter().filter(|e| e.0 == "name").map(|e| e.1.to_owned())
                    .nth(0);
                let param_name = match param_name {
                    Some(param_name) => match param_name.parse::<String>() {
                        Ok(param_name) => param_name,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter name - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter name"))),
                };
                let param_date = query_params.iter().filter(|e| e.0 == "date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_date = match param_date {
                    Some(param_date) => match param_date.parse::<String>() {
                        Ok(param_date) => param_date,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter date - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter date"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.download_logs(param_program_id, param_environment_id, param_service, param_name, param_date, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_accept, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DownloadLogsResponse::SuccessfulRetrievalOfLogs


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                DownloadLogsResponse::InvalidParameters

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(400).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DOWNLOAD_LOGS_INVALID_PARAMETERS.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                DownloadLogsResponse::EnvironmentNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetEnvironment - GET /api/program/{programId}/environment/{environmentId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_environment_id = match percent_encoding::percent_decode(path_params["environment_id"].as_bytes()).decode_utf8() {
                    Ok(param_environment_id) => match param_environment_id.parse::<String>() {
                        Ok(param_environment_id) => param_environment_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter environmentId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["environment_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_environment(param_program_id, param_environment_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetEnvironmentResponse::SuccessfulOperation

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ENVIRONMENT_SUCCESSFUL_OPERATION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetEnvironmentLogs - GET /api/program/{programId}/environment/{environmentId}/logs
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_environment_id = match percent_encoding::percent_decode(path_params["environment_id"].as_bytes()).decode_utf8() {
                    Ok(param_environment_id) => match param_environment_id.parse::<String>() {
                        Ok(param_environment_id) => param_environment_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter environmentId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["environment_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_service = query_params.iter().filter(|e| e.0 == "service").map(|e| e.1.to_owned())
                    .filter_map(|param_service| param_service.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_service = if !param_service.is_empty() {
                    Some(param_service)
                } else {
                    None
                };
                let param_name = query_params.iter().filter(|e| e.0 == "name").map(|e| e.1.to_owned())
                    .filter_map(|param_name| param_name.parse::<String>().ok())
                    .collect::<Vec<_>>();
                let param_name = if !param_name.is_empty() {
                    Some(param_name)
                } else {
                    None
                };
                let param_days = query_params.iter().filter(|e| e.0 == "days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_days = match param_days {
                    Some(param_days) => match param_days.parse::<i32>() {
                        Ok(param_days) => param_days,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse query parameter days - doesn't match schema: {}", e)))),
                    },
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required query parameter days"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_environment_logs(param_program_id, param_environment_id, param_days, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_service.as_ref(), param_name.as_ref(), &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetEnvironmentLogsResponse::SuccessfulRetrievalOfLogsForAnEnvironment

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ENVIRONMENT_LOGS_SUCCESSFUL_RETRIEVAL_OF_LOGS_FOR_AN_ENVIRONMENT.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetEnvironmentLogsResponse::InvalidParameters

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(400).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ENVIRONMENT_LOGS_INVALID_PARAMETERS.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetEnvironmentLogsResponse::EnvironmentNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetEnvironments - GET /api/program/{programId}/environments
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENTS) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENTS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_ENVIRONMENTS in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENTS.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param__type = query_params.iter().filter(|e| e.0 == "type").map(|e| e.1.to_owned())
                    .nth(0);

                let param__type = param__type.and_then(|param__type| param__type.parse::<>().ok());
                Box::new({
                        {{
                                Box::new(api_impl.get_environments(param_program_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param__type, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetEnvironmentsResponse::SuccessfulRetrievalOfEnvironmentList

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ENVIRONMENTS_SUCCESSFUL_RETRIEVAL_OF_ENVIRONMENT_LIST.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetEnvironmentsResponse::ProgramNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // AdvancePipelineExecution - PUT /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance
            &hyper::Method::Put if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_ADVANCE) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_ADVANCE
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_ADVANCE in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_ADVANCE.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                let param_execution_id = match percent_encoding::percent_decode(path_params["execution_id"].as_bytes()).decode_utf8() {
                    Ok(param_execution_id) => match param_execution_id.parse::<String>() {
                        Ok(param_execution_id) => param_execution_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter executionId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["execution_id"]))))
                };
                let param_phase_id = match percent_encoding::percent_decode(path_params["phase_id"].as_bytes()).decode_utf8() {
                    Ok(param_phase_id) => match param_phase_id.parse::<String>() {
                        Ok(param_phase_id) => param_phase_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter phaseId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["phase_id"]))))
                };
                let param_step_id = match percent_encoding::percent_decode(path_params["step_id"].as_bytes()).decode_utf8() {
                    Ok(param_step_id) => match param_step_id.parse::<String>() {
                        Ok(param_step_id) => param_step_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter stepId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["step_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                header! { (RequestContentType, "Content-Type") => [String] }
                let param_content_type = match headers.get::<RequestContentType>() {
                    Some(param_content_type) => param_content_type.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Content-Type"))),
                };
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<dyn Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_body: Option<object> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_body) => param_body,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter body - doesn't match schema: {}", e)))),
                                    }
                                } else {
                                    None
                                };
                                let param_body = match param_body {
                                    Some(param_body) => param_body,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter body"))),
                                };
                                Box::new(api_impl.advance_pipeline_execution(param_program_id, param_pipeline_id, param_execution_id, param_phase_id, param_step_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_content_type, param_body, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdvancePipelineExecutionResponse::SuccessfulResumeOfPipelineExecution


                                                => {
                                                    response.set_status(StatusCode::try_from(202).unwrap());

                                                },
                                                AdvancePipelineExecutionResponse::MissingPermissionForUserToAdvanceThePipelineExecution


                                                => {
                                                    response.set_status(StatusCode::try_from(403).unwrap());

                                                },
                                                AdvancePipelineExecutionResponse::NoPipelineExecutionExitsOrUnknownPipelineOrProgram


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter body: {}", e)))),
                        }
                    })
                ) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // CancelPipelineExecutionStep - PUT /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel
            &hyper::Method::Put if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_CANCEL) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_CANCEL
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_CANCEL in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_CANCEL.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                let param_execution_id = match percent_encoding::percent_decode(path_params["execution_id"].as_bytes()).decode_utf8() {
                    Ok(param_execution_id) => match param_execution_id.parse::<String>() {
                        Ok(param_execution_id) => param_execution_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter executionId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["execution_id"]))))
                };
                let param_phase_id = match percent_encoding::percent_decode(path_params["phase_id"].as_bytes()).decode_utf8() {
                    Ok(param_phase_id) => match param_phase_id.parse::<String>() {
                        Ok(param_phase_id) => param_phase_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter phaseId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["phase_id"]))))
                };
                let param_step_id = match percent_encoding::percent_decode(path_params["step_id"].as_bytes()).decode_utf8() {
                    Ok(param_step_id) => match param_step_id.parse::<String>() {
                        Ok(param_step_id) => param_step_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter stepId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["step_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                header! { (RequestContentType, "Content-Type") => [String] }
                let param_content_type = match headers.get::<RequestContentType>() {
                    Some(param_content_type) => param_content_type.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Content-Type"))),
                };
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<dyn Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_body: Option<object> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_body) => param_body,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter body - doesn't match schema: {}", e)))),
                                    }
                                } else {
                                    None
                                };
                                let param_body = match param_body {
                                    Some(param_body) => param_body,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter body"))),
                                };
                                Box::new(api_impl.cancel_pipeline_execution_step(param_program_id, param_pipeline_id, param_execution_id, param_phase_id, param_step_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_content_type, param_body, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CancelPipelineExecutionStepResponse::SuccessfulCancelOfPipelineExecution


                                                => {
                                                    response.set_status(StatusCode::try_from(202).unwrap());

                                                },
                                                CancelPipelineExecutionStepResponse::MissingPermissionForUserToCancelTheCurrentPipelineExecution


                                                => {
                                                    response.set_status(StatusCode::try_from(403).unwrap());

                                                },
                                                CancelPipelineExecutionStepResponse::NoPipelineExecutionExitsOrUnknownPipelineOrProgram


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter body: {}", e)))),
                        }
                    })
                ) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetCurrentExecution - GET /api/program/{programId}/pipeline/{pipelineId}/execution
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_current_execution(param_program_id, param_pipeline_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetCurrentExecutionResponse::SuccessfulRetrievalOfCurrentExecution

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_CURRENT_EXECUTION_SUCCESSFUL_RETRIEVAL_OF_CURRENT_EXECUTION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetCurrentExecutionResponse::NoPipelineExecutionExitsOrUnknownPipelineOrProgram


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetExecution - GET /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                let param_execution_id = match percent_encoding::percent_decode(path_params["execution_id"].as_bytes()).decode_utf8() {
                    Ok(param_execution_id) => match param_execution_id.parse::<String>() {
                        Ok(param_execution_id) => param_execution_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter executionId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["execution_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_execution(param_program_id, param_pipeline_id, param_execution_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetExecutionResponse::SuccessfulRetrievalOfExecution

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_EXECUTION_SUCCESSFUL_RETRIEVAL_OF_EXECUTION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetExecutionResponse::NoPipelineExecutionExitsOrUnknownPipelineOrApplication


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetExecutions - GET /api/program/{programId}/pipeline/{pipelineId}/executions
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTIONS) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTIONS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTIONS in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTIONS.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start = query_params.iter().filter(|e| e.0 == "start").map(|e| e.1.to_owned())
                    .nth(0);

                let param_start = param_start.and_then(|param_start| param_start.parse::<>().ok());
                let param_limit = query_params.iter().filter(|e| e.0 == "limit").map(|e| e.1.to_owned())
                    .nth(0);

                let param_limit = param_limit.and_then(|param_limit| param_limit.parse::<>().ok());
                Box::new({
                        {{
                                Box::new(api_impl.get_executions(param_program_id, param_pipeline_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_start, param_limit, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetExecutionsResponse::SuccessfulRetrievalOfExecutionHistory

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_EXECUTIONS_SUCCESSFUL_RETRIEVAL_OF_EXECUTION_HISTORY.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetExecutionsResponse::MissingPermissionForUserToReadExecutions


                                                => {
                                                    response.set_status(StatusCode::try_from(403).unwrap());

                                                },
                                                GetExecutionsResponse::PipelineDoesNotExist


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetStepLogs - GET /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_LOGS) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_LOGS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_LOGS in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_LOGS.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                let param_execution_id = match percent_encoding::percent_decode(path_params["execution_id"].as_bytes()).decode_utf8() {
                    Ok(param_execution_id) => match param_execution_id.parse::<String>() {
                        Ok(param_execution_id) => param_execution_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter executionId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["execution_id"]))))
                };
                let param_phase_id = match percent_encoding::percent_decode(path_params["phase_id"].as_bytes()).decode_utf8() {
                    Ok(param_phase_id) => match param_phase_id.parse::<String>() {
                        Ok(param_phase_id) => param_phase_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter phaseId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["phase_id"]))))
                };
                let param_step_id = match percent_encoding::percent_decode(path_params["step_id"].as_bytes()).decode_utf8() {
                    Ok(param_step_id) => match param_step_id.parse::<String>() {
                        Ok(param_step_id) => param_step_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter stepId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["step_id"]))))
                };
                // Header parameters
                header! { (RequestAccept, "Accept") => [String] }
                let param_accept = headers.safe_get::<RequestAccept>().map(|header| header.0.clone());
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_file = query_params.iter().filter(|e| e.0 == "file").map(|e| e.1.to_owned())
                    .nth(0);

                let param_file = param_file.and_then(|param_file| param_file.parse::<>().ok());
                Box::new({
                        {{
                                Box::new(api_impl.get_step_logs(param_program_id, param_pipeline_id, param_execution_id, param_phase_id, param_step_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_file, param_accept, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetStepLogsResponse::SuccessfulRetrievalOfLogs


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                },
                                                GetStepLogsResponse::MissingPermissionForUserToReadLogs


                                                => {
                                                    response.set_status(StatusCode::try_from(403).unwrap());

                                                },
                                                GetStepLogsResponse::PipelineExecutionDoesNotExist


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // StartPipeline - PUT /api/program/{programId}/pipeline/{pipelineId}/execution
            &hyper::Method::Put if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                header! { (RequestContentType, "Content-Type") => [String] }
                let param_content_type = match headers.get::<RequestContentType>() {
                    Some(param_content_type) => param_content_type.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Content-Type"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.start_pipeline(param_program_id, param_pipeline_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_content_type, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                StartPipelineResponse::SuccessfulStartedPipelineExecution


                                                => {
                                                    response.set_status(StatusCode::try_from(201).unwrap());

                                                },
                                                StartPipelineResponse::RequestConflictsWithTheExpectedStateOfPipeline


                                                => {
                                                    response.set_status(StatusCode::try_from(400).unwrap());

                                                },
                                                StartPipelineResponse::NoPipelineExecutionExitsOrUnknownPipelineOrApplication


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                                StartPipelineResponse::CannotStartExecution


                                                => {
                                                    response.set_status(StatusCode::try_from(412).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // StepMetric - GET /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_METRICS) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_METRICS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_METRICS in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_METRICS.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                let param_execution_id = match percent_encoding::percent_decode(path_params["execution_id"].as_bytes()).decode_utf8() {
                    Ok(param_execution_id) => match param_execution_id.parse::<String>() {
                        Ok(param_execution_id) => param_execution_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter executionId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["execution_id"]))))
                };
                let param_phase_id = match percent_encoding::percent_decode(path_params["phase_id"].as_bytes()).decode_utf8() {
                    Ok(param_phase_id) => match param_phase_id.parse::<String>() {
                        Ok(param_phase_id) => param_phase_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter phaseId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["phase_id"]))))
                };
                let param_step_id = match percent_encoding::percent_decode(path_params["step_id"].as_bytes()).decode_utf8() {
                    Ok(param_step_id) => match param_step_id.parse::<String>() {
                        Ok(param_step_id) => param_step_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter stepId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["step_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.step_metric(param_program_id, param_pipeline_id, param_execution_id, param_phase_id, param_step_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                StepMetricResponse::SuccessfulRetrievalOfMetrics

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::STEP_METRIC_SUCCESSFUL_RETRIEVAL_OF_METRICS.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                StepMetricResponse::MissingPermissionForUserToReadMetrics


                                                => {
                                                    response.set_status(StatusCode::try_from(403).unwrap());

                                                },
                                                StepMetricResponse::PipelineExecutionDoesNotExist


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // StepState - GET /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                let param_execution_id = match percent_encoding::percent_decode(path_params["execution_id"].as_bytes()).decode_utf8() {
                    Ok(param_execution_id) => match param_execution_id.parse::<String>() {
                        Ok(param_execution_id) => param_execution_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter executionId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["execution_id"]))))
                };
                let param_phase_id = match percent_encoding::percent_decode(path_params["phase_id"].as_bytes()).decode_utf8() {
                    Ok(param_phase_id) => match param_phase_id.parse::<String>() {
                        Ok(param_phase_id) => param_phase_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter phaseId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["phase_id"]))))
                };
                let param_step_id = match percent_encoding::percent_decode(path_params["step_id"].as_bytes()).decode_utf8() {
                    Ok(param_step_id) => match param_step_id.parse::<String>() {
                        Ok(param_step_id) => param_step_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter stepId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["step_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.step_state(param_program_id, param_pipeline_id, param_execution_id, param_phase_id, param_step_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                StepStateResponse::SuccessfulRetrievalOfStepState

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::STEP_STATE_SUCCESSFUL_RETRIEVAL_OF_STEP_STATE.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                StepStateResponse::MissingPermissionForUserToReadStep


                                                => {
                                                    response.set_status(StatusCode::try_from(403).unwrap());

                                                },
                                                StepStateResponse::PipelineExecutionDoesNotExist


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // DeletePipeline - DELETE /api/program/{programId}/pipeline/{pipelineId}
            &hyper::Method::Delete if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.delete_pipeline(param_program_id, param_pipeline_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeletePipelineResponse::SuccessfulOperation


                                                => {
                                                    response.set_status(StatusCode::try_from(0).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetPipeline - GET /api/program/{programId}/pipeline/{pipelineId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_pipeline(param_program_id, param_pipeline_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetPipelineResponse::SuccessfulRetrievalOfPipeline

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_PIPELINE_SUCCESSFUL_RETRIEVAL_OF_PIPELINE.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetPipelineResponse::PipelineNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetPipelines - GET /api/program/{programId}/pipelines
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINES) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINES in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINES.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_pipelines(param_program_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetPipelinesResponse::SuccessfulOperation

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_PIPELINES_SUCCESSFUL_OPERATION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // PatchPipeline - PATCH /api/program/{programId}/pipeline/{pipelineId}
            &hyper::Method::Patch if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_pipeline_id = match percent_encoding::percent_decode(path_params["pipeline_id"].as_bytes()).decode_utf8() {
                    Ok(param_pipeline_id) => match param_pipeline_id.parse::<String>() {
                        Ok(param_pipeline_id) => param_pipeline_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter pipelineId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pipeline_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                header! { (RequestContentType, "Content-Type") => [String] }
                let param_content_type = match headers.get::<RequestContentType>() {
                    Some(param_content_type) => param_content_type.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Content-Type"))),
                };
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<dyn Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_body: Option<models::Pipeline> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_body) => param_body,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter body - doesn't match schema: {}", e)))),
                                    }
                                } else {
                                    None
                                };
                                let param_body = match param_body {
                                    Some(param_body) => param_body,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter body"))),
                                };
                                Box::new(api_impl.patch_pipeline(param_program_id, param_pipeline_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_content_type, param_body, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PatchPipelineResponse::SuccessfulOperation

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::PATCH_PIPELINE_SUCCESSFUL_OPERATION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter body: {}", e)))),
                        }
                    })
                ) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // DeleteProgram - DELETE /api/program/{programId}
            &hyper::Method::Delete if path.matched(paths::ID_API_PROGRAM_PROGRAMID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.delete_program(param_program_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                DeleteProgramResponse::SuccessfulOperation

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_PROGRAM_SUCCESSFUL_OPERATION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                DeleteProgramResponse::DeleteWasSuccessful

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(202).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::DELETE_PROGRAM_DELETE_WAS_SUCCESSFUL.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                DeleteProgramResponse::Forbidden


                                                => {
                                                    response.set_status(StatusCode::try_from(403).unwrap());

                                                },
                                                DeleteProgramResponse::ProgramNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                                DeleteProgramResponse::DeletionNotSupported


                                                => {
                                                    response.set_status(StatusCode::try_from(412).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetProgram - GET /api/program/{programId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_program(param_program_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetProgramResponse::SuccessfulRetrievalOfProgram

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_PROGRAM_SUCCESSFUL_RETRIEVAL_OF_PROGRAM.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetProgramResponse::ProgramNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetPrograms - GET /api/programs
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAMS) => {
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_programs(param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetProgramsResponse::SuccessfulOperation

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_PROGRAMS_SUCCESSFUL_OPERATION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetRepositories - GET /api/program/{programId}/repositories
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_REPOSITORIES) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_REPOSITORIES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_REPOSITORIES in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_REPOSITORIES.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_repositories(param_program_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetRepositoriesResponse::SuccessfulOperation

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_REPOSITORIES_SUCCESSFUL_OPERATION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetRepository - GET /api/program/{programId}/repository/{repositoryId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_repository_id = match percent_encoding::percent_decode(path_params["repository_id"].as_bytes()).decode_utf8() {
                    Ok(param_repository_id) => match param_repository_id.parse::<String>() {
                        Ok(param_repository_id) => param_repository_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter repositoryId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["repository_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_repository(param_program_id, param_repository_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetRepositoryResponse::SuccessfulOperation

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_REPOSITORY_SUCCESSFUL_OPERATION.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // GetEnvironmentVariables - GET /api/program/{programId}/environment/{environmentId}/variables
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_environment_id = match percent_encoding::percent_decode(path_params["environment_id"].as_bytes()).decode_utf8() {
                    Ok(param_environment_id) => match param_environment_id.parse::<String>() {
                        Ok(param_environment_id) => param_environment_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter environmentId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["environment_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                Box::new({
                        {{
                                Box::new(api_impl.get_environment_variables(param_program_id, param_environment_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetEnvironmentVariablesResponse::SuccessfulRetrievalOfEnvironmentVariables

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ENVIRONMENT_VARIABLES_SUCCESSFUL_RETRIEVAL_OF_ENVIRONMENT_VARIABLES.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                GetEnvironmentVariablesResponse::EnvironmentNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                        }}
                }) as Box<dyn Future<Item=Response, Error=Error>>
            },

            // PatchEnvironmentVariables - PATCH /api/program/{programId}/environment/{environmentId}/variables
            &hyper::Method::Patch if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES) => {
                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES in set but failed match against \"{}\"", path, paths::REGEX_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES.as_str())
                    );
                let param_program_id = match percent_encoding::percent_decode(path_params["program_id"].as_bytes()).decode_utf8() {
                    Ok(param_program_id) => match param_program_id.parse::<String>() {
                        Ok(param_program_id) => param_program_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter programId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["program_id"]))))
                };
                let param_environment_id = match percent_encoding::percent_decode(path_params["environment_id"].as_bytes()).decode_utf8() {
                    Ok(param_environment_id) => match param_environment_id.parse::<String>() {
                        Ok(param_environment_id) => param_environment_id,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter environmentId: {:?}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["environment_id"]))))
                };
                // Header parameters
                header! { (RequestXGwImsOrgId, "x-gw-ims-org-id") => [String] }
                let param_x_gw_ims_org_id = match headers.get::<RequestXGwImsOrgId>() {
                    Some(param_x_gw_ims_org_id) => param_x_gw_ims_org_id.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-gw-ims-org-id"))),
                };
                header! { (RequestAuthorization, "Authorization") => [String] }
                let param_authorization = match headers.get::<RequestAuthorization>() {
                    Some(param_authorization) => param_authorization.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Authorization"))),
                };
                header! { (RequestXApiKey, "x-api-key") => [String] }
                let param_x_api_key = match headers.get::<RequestXApiKey>() {
                    Some(param_x_api_key) => param_x_api_key.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header x-api-key"))),
                };
                header! { (RequestContentType, "Content-Type") => [String] }
                let param_content_type = match headers.get::<RequestContentType>() {
                    Some(param_content_type) => param_content_type.0.clone(),
                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing or invalid required header Content-Type"))),
                };
                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                Box::new(body.concat2()
                    .then(move |result| -> Box<dyn Future<Item=Response, Error=Error>> {
                        match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_body: Option<Vec<models::Variable>> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_body) => param_body,
                                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse body parameter body - doesn't match schema: {}", e)))),
                                    }
                                } else {
                                    None
                                };
                                let param_body = match param_body {
                                    Some(param_body) => param_body,
                                    None => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body("Missing required body parameter body"))),
                                };
                                Box::new(api_impl.patch_environment_variables(param_program_id, param_environment_id, param_x_gw_ims_org_id, param_authorization, param_x_api_key, param_content_type, param_body.as_ref(), &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &dyn Has<XSpanIdString>).get().0.to_string()));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().set(Warning(format!("Ignoring unknown fields in body: {:?}", unused_elements)));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PatchEnvironmentVariablesResponse::SuccessfulUpdateOfEnvironmentVariables

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::PATCH_ENVIRONMENT_VARIABLES_SUCCESSFUL_UPDATE_OF_ENVIRONMENT_VARIABLES.clone()));

                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    response.set_body(body);
                                                },
                                                PatchEnvironmentVariablesResponse::EnvironmentNotFound


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))
                            },
                            Err(e) => Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't read body parameter body: {}", e)))),
                        }
                    })
                ) as Box<dyn Future<Item=Response, Error=Error>>
            },

            _ => Box::new(future::ok(Response::new().with_status(StatusCode::NotFound))) as Box<dyn Future<Item=Response, Error=Error>>,
        }
    }
}

impl<T, C> Clone for Service<T, C>
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker.clone(),
        }
    }
}


/// Request parser for `Api`.
pub struct ApiRequestParser;
impl RequestParser for ApiRequestParser {
    fn parse_operation_id(request: &Request) -> Result<&'static str, ()> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match request.method() {

            // GetBranches - GET /api/program/{programId}/repository/{repositoryId}/branches
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID_BRANCHES) => Ok("GetBranches"),

            // DeleteEnvironment - DELETE /api/program/{programId}/environment/{environmentId}
            &hyper::Method::Delete if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID) => Ok("DeleteEnvironment"),

            // DownloadLogs - GET /api/program/{programId}/environment/{environmentId}/logs/download
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS_DOWNLOAD) => Ok("DownloadLogs"),

            // GetEnvironment - GET /api/program/{programId}/environment/{environmentId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID) => Ok("GetEnvironment"),

            // GetEnvironmentLogs - GET /api/program/{programId}/environment/{environmentId}/logs
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_LOGS) => Ok("GetEnvironmentLogs"),

            // GetEnvironments - GET /api/program/{programId}/environments
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENTS) => Ok("GetEnvironments"),

            // AdvancePipelineExecution - PUT /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance
            &hyper::Method::Put if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_ADVANCE) => Ok("AdvancePipelineExecution"),

            // CancelPipelineExecutionStep - PUT /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel
            &hyper::Method::Put if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_CANCEL) => Ok("CancelPipelineExecutionStep"),

            // GetCurrentExecution - GET /api/program/{programId}/pipeline/{pipelineId}/execution
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION) => Ok("GetCurrentExecution"),

            // GetExecution - GET /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID) => Ok("GetExecution"),

            // GetExecutions - GET /api/program/{programId}/pipeline/{pipelineId}/executions
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTIONS) => Ok("GetExecutions"),

            // GetStepLogs - GET /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_LOGS) => Ok("GetStepLogs"),

            // StartPipeline - PUT /api/program/{programId}/pipeline/{pipelineId}/execution
            &hyper::Method::Put if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION) => Ok("StartPipeline"),

            // StepMetric - GET /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID_METRICS) => Ok("StepMetric"),

            // StepState - GET /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID_EXECUTION_EXECUTIONID_PHASE_PHASEID_STEP_STEPID) => Ok("StepState"),

            // DeletePipeline - DELETE /api/program/{programId}/pipeline/{pipelineId}
            &hyper::Method::Delete if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID) => Ok("DeletePipeline"),

            // GetPipeline - GET /api/program/{programId}/pipeline/{pipelineId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID) => Ok("GetPipeline"),

            // GetPipelines - GET /api/program/{programId}/pipelines
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINES) => Ok("GetPipelines"),

            // PatchPipeline - PATCH /api/program/{programId}/pipeline/{pipelineId}
            &hyper::Method::Patch if path.matched(paths::ID_API_PROGRAM_PROGRAMID_PIPELINE_PIPELINEID) => Ok("PatchPipeline"),

            // DeleteProgram - DELETE /api/program/{programId}
            &hyper::Method::Delete if path.matched(paths::ID_API_PROGRAM_PROGRAMID) => Ok("DeleteProgram"),

            // GetProgram - GET /api/program/{programId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID) => Ok("GetProgram"),

            // GetPrograms - GET /api/programs
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAMS) => Ok("GetPrograms"),

            // GetRepositories - GET /api/program/{programId}/repositories
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_REPOSITORIES) => Ok("GetRepositories"),

            // GetRepository - GET /api/program/{programId}/repository/{repositoryId}
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_REPOSITORY_REPOSITORYID) => Ok("GetRepository"),

            // GetEnvironmentVariables - GET /api/program/{programId}/environment/{environmentId}/variables
            &hyper::Method::Get if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES) => Ok("GetEnvironmentVariables"),

            // PatchEnvironmentVariables - PATCH /api/program/{programId}/environment/{environmentId}/variables
            &hyper::Method::Patch if path.matched(paths::ID_API_PROGRAM_PROGRAMID_ENVIRONMENT_ENVIRONMENTID_VARIABLES) => Ok("PatchEnvironmentVariables"),
            _ => Err(()),
        }
    }
}
