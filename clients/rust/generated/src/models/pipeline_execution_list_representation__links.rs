/*
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PipelineExecutionListRepresentationLinks {
    #[serde(rename = "next", skip_serializing_if = "Option::is_none")]
    pub next: Option<crate::models::HalLink>,
    #[serde(rename = "page", skip_serializing_if = "Option::is_none")]
    pub page: Option<crate::models::HalLink>,
    #[serde(rename = "prev", skip_serializing_if = "Option::is_none")]
    pub prev: Option<crate::models::HalLink>,
    #[serde(rename = "self", skip_serializing_if = "Option::is_none")]
    pub _self: Option<crate::models::HalLink>,
}

impl PipelineExecutionListRepresentationLinks {
    pub fn new() -> PipelineExecutionListRepresentationLinks {
        PipelineExecutionListRepresentationLinks {
            next: None,
            page: None,
            prev: None,
            _self: None,
        }
    }
}


