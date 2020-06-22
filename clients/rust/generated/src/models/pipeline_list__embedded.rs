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
pub struct PipelineListEmbedded {
    #[serde(rename = "pipelines", skip_serializing_if = "Option::is_none")]
    pub pipelines: Option<Vec<crate::models::Pipeline>>,
}

impl PipelineListEmbedded {
    pub fn new() -> PipelineListEmbedded {
        PipelineListEmbedded {
            pipelines: None,
        }
    }
}


