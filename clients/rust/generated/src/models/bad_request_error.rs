/*
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

/// BadRequestError : A Bad Request response error.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct BadRequestError {
    /// HTTP status code of the response.
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<i32>,
    /// Error type identifier.
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub _type: Option<String>,
    /// A short summary of the error.
    #[serde(rename = "title", skip_serializing_if = "Option::is_none")]
    pub title: Option<String>,
    /// Request's missing parameters.
    #[serde(rename = "missingParams", skip_serializing_if = "Option::is_none")]
    pub missing_params: Option<Vec<crate::models::MissingParameter>>,
    /// Request's invalid parameters.
    #[serde(rename = "invalidParams", skip_serializing_if = "Option::is_none")]
    pub invalid_params: Option<Vec<crate::models::InvalidParameter>>,
}

impl BadRequestError {
    /// A Bad Request response error.
    pub fn new() -> BadRequestError {
        BadRequestError {
            status: None,
            _type: None,
            title: None,
            missing_params: None,
            invalid_params: None,
        }
    }
}


