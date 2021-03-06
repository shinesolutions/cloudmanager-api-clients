/*
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

/// PipelineExecutionStepState : Describes the status of a particular pipeline execution step for display purposes



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PipelineExecutionStepState {
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    #[serde(rename = "stepId", skip_serializing_if = "Option::is_none")]
    pub step_id: Option<String>,
    #[serde(rename = "phaseId", skip_serializing_if = "Option::is_none")]
    pub phase_id: Option<String>,
    /// Name of the action
    #[serde(rename = "action", skip_serializing_if = "Option::is_none")]
    pub action: Option<String>,
    /// Target repository
    #[serde(rename = "repository", skip_serializing_if = "Option::is_none")]
    pub repository: Option<String>,
    /// Target branch
    #[serde(rename = "branch", skip_serializing_if = "Option::is_none")]
    pub branch: Option<String>,
    /// Target environment
    #[serde(rename = "environment", skip_serializing_if = "Option::is_none")]
    pub environment: Option<String>,
    /// Target environment type
    #[serde(rename = "environmentType", skip_serializing_if = "Option::is_none")]
    pub environment_type: Option<String>,
    /// Start time
    #[serde(rename = "startedAt", skip_serializing_if = "Option::is_none")]
    pub started_at: Option<String>,
    /// Date the execution reached a final state
    #[serde(rename = "finishedAt", skip_serializing_if = "Option::is_none")]
    pub finished_at: Option<String>,
    /// Information about step result
    #[serde(rename = "details", skip_serializing_if = "Option::is_none")]
    pub details: Option<::std::collections::HashMap<String, serde_json::Value>>,
    /// Action status
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<Status>,
    #[serde(rename = "_links", skip_serializing_if = "Option::is_none")]
    pub _links: Option<crate::models::PipelineExecutionStepStateLinks>,
}

impl PipelineExecutionStepState {
    /// Describes the status of a particular pipeline execution step for display purposes
    pub fn new() -> PipelineExecutionStepState {
        PipelineExecutionStepState {
            id: None,
            step_id: None,
            phase_id: None,
            action: None,
            repository: None,
            branch: None,
            environment: None,
            environment_type: None,
            started_at: None,
            finished_at: None,
            details: None,
            status: None,
            _links: None,
        }
    }
}

/// Action status
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Status {
    #[serde(rename = "NOT_STARTED")]
    NOTSTARTED,
    #[serde(rename = "RUNNING")]
    RUNNING,
    #[serde(rename = "FINISHED")]
    FINISHED,
    #[serde(rename = "ERROR")]
    ERROR,
    #[serde(rename = "ROLLING_BACK")]
    ROLLINGBACK,
    #[serde(rename = "ROLLED_BACK")]
    ROLLEDBACK,
    #[serde(rename = "WAITING")]
    WAITING,
    #[serde(rename = "CANCELLED")]
    CANCELLED,
    #[serde(rename = "FAILED")]
    FAILED,
}

