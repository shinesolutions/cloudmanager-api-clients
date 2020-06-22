/*
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

/// EmbeddedProgram : Describes an __Embedded Program__



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct EmbeddedProgram {
    /// Identifier of the program. Unique within the space.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// Name of the program
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Whether this Program has been enabled for Cloud Manager usage
    #[serde(rename = "enabled", skip_serializing_if = "Option::is_none")]
    pub enabled: Option<bool>,
    /// Tenant Id
    #[serde(rename = "tenantId", skip_serializing_if = "Option::is_none")]
    pub tenant_id: Option<String>,
}

impl EmbeddedProgram {
    /// Describes an __Embedded Program__
    pub fn new() -> EmbeddedProgram {
        EmbeddedProgram {
            id: None,
            name: None,
            enabled: None,
            tenant_id: None,
        }
    }
}


