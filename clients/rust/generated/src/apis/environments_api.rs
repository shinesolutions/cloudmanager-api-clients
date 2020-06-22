/*
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

use std::rc::Rc;
use std::borrow::Borrow;
#[allow(unused_imports)]
use std::option::Option;

use hyper;
use serde_json;
use futures::Future;

use super::{Error, configuration};
use super::request as __internal_request;

pub struct EnvironmentsApiClient<C: hyper::client::Connect> {
    configuration: Rc<configuration::Configuration<C>>,
}

impl<C: hyper::client::Connect> EnvironmentsApiClient<C> {
    pub fn new(configuration: Rc<configuration::Configuration<C>>) -> EnvironmentsApiClient<C> {
        EnvironmentsApiClient {
            configuration,
        }
    }
}

pub trait EnvironmentsApi {
    fn delete_environment(&self, program_id: &str, environment_id: &str, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str) -> Box<dyn Future<Item = crate::models::Environment, Error = Error<serde_json::Value>>>;
    fn download_logs(&self, program_id: &str, environment_id: &str, service: &str, name: &str, date: &str, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str, accept: Option<&str>) -> Box<dyn Future<Item = (), Error = Error<serde_json::Value>>>;
    fn get_environment(&self, program_id: &str, environment_id: &str, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str) -> Box<dyn Future<Item = crate::models::Environment, Error = Error<serde_json::Value>>>;
    fn get_environment_logs(&self, program_id: &str, environment_id: &str, days: i32, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str, service: Option<Vec<String>>, name: Option<Vec<String>>) -> Box<dyn Future<Item = crate::models::EnvironmentLogs, Error = Error<serde_json::Value>>>;
    fn get_environments(&self, program_id: &str, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str, _type: Option<&str>) -> Box<dyn Future<Item = crate::models::EnvironmentList, Error = Error<serde_json::Value>>>;
}

impl<C: hyper::client::Connect>EnvironmentsApi for EnvironmentsApiClient<C> {
    fn delete_environment(&self, program_id: &str, environment_id: &str, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str) -> Box<dyn Future<Item = crate::models::Environment, Error = Error<serde_json::Value>>> {
        let mut req = __internal_request::Request::new(hyper::Method::Delete, "/api/program/{programId}/environment/{environmentId}".to_string())
        ;
        req = req.with_path_param("programId".to_string(), program_id.to_string());
        req = req.with_path_param("environmentId".to_string(), environment_id.to_string());
        req = req.with_header_param("x-gw-ims-org-id".to_string(), x_gw_ims_org_id.to_string());
        req = req.with_header_param("Authorization".to_string(), authorization.to_string());
        req = req.with_header_param("x-api-key".to_string(), x_api_key.to_string());

        req.execute(self.configuration.borrow())
    }

    fn download_logs(&self, program_id: &str, environment_id: &str, service: &str, name: &str, date: &str, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str, accept: Option<&str>) -> Box<dyn Future<Item = (), Error = Error<serde_json::Value>>> {
        let mut req = __internal_request::Request::new(hyper::Method::Get, "/api/program/{programId}/environment/{environmentId}/logs/download".to_string())
        ;
        req = req.with_query_param("service".to_string(), service.to_string());
        req = req.with_query_param("name".to_string(), name.to_string());
        req = req.with_query_param("date".to_string(), date.to_string());
        req = req.with_path_param("programId".to_string(), program_id.to_string());
        req = req.with_path_param("environmentId".to_string(), environment_id.to_string());
        req = req.with_header_param("x-gw-ims-org-id".to_string(), x_gw_ims_org_id.to_string());
        req = req.with_header_param("Authorization".to_string(), authorization.to_string());
        req = req.with_header_param("x-api-key".to_string(), x_api_key.to_string());
        if let Some(param_value) = accept {
            req = req.with_header_param("Accept".to_string(), param_value.to_string());
        }
        req = req.returns_nothing();

        req.execute(self.configuration.borrow())
    }

    fn get_environment(&self, program_id: &str, environment_id: &str, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str) -> Box<dyn Future<Item = crate::models::Environment, Error = Error<serde_json::Value>>> {
        let mut req = __internal_request::Request::new(hyper::Method::Get, "/api/program/{programId}/environment/{environmentId}".to_string())
        ;
        req = req.with_path_param("programId".to_string(), program_id.to_string());
        req = req.with_path_param("environmentId".to_string(), environment_id.to_string());
        req = req.with_header_param("x-gw-ims-org-id".to_string(), x_gw_ims_org_id.to_string());
        req = req.with_header_param("Authorization".to_string(), authorization.to_string());
        req = req.with_header_param("x-api-key".to_string(), x_api_key.to_string());

        req.execute(self.configuration.borrow())
    }

    fn get_environment_logs(&self, program_id: &str, environment_id: &str, days: i32, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str, service: Option<Vec<String>>, name: Option<Vec<String>>) -> Box<dyn Future<Item = crate::models::EnvironmentLogs, Error = Error<serde_json::Value>>> {
        let mut req = __internal_request::Request::new(hyper::Method::Get, "/api/program/{programId}/environment/{environmentId}/logs".to_string())
        ;
        if let Some(ref s) = service {
            req = req.with_query_param("service".to_string(), s.join(",").to_string());
        }
        if let Some(ref s) = name {
            req = req.with_query_param("name".to_string(), s.join(",").to_string());
        }
        req = req.with_query_param("days".to_string(), days.to_string());
        req = req.with_path_param("programId".to_string(), program_id.to_string());
        req = req.with_path_param("environmentId".to_string(), environment_id.to_string());
        req = req.with_header_param("x-gw-ims-org-id".to_string(), x_gw_ims_org_id.to_string());
        req = req.with_header_param("Authorization".to_string(), authorization.to_string());
        req = req.with_header_param("x-api-key".to_string(), x_api_key.to_string());

        req.execute(self.configuration.borrow())
    }

    fn get_environments(&self, program_id: &str, x_gw_ims_org_id: &str, authorization: &str, x_api_key: &str, _type: Option<&str>) -> Box<dyn Future<Item = crate::models::EnvironmentList, Error = Error<serde_json::Value>>> {
        let mut req = __internal_request::Request::new(hyper::Method::Get, "/api/program/{programId}/environments".to_string())
        ;
        if let Some(ref s) = _type {
            req = req.with_query_param("type".to_string(), s.to_string());
        }
        req = req.with_path_param("programId".to_string(), program_id.to_string());
        req = req.with_header_param("x-gw-ims-org-id".to_string(), x_gw_ims_org_id.to_string());
        req = req.with_header_param("Authorization".to_string(), authorization.to_string());
        req = req.with_header_param("x-api-key".to_string(), x_api_key.to_string());

        req.execute(self.configuration.borrow())
    }

}
