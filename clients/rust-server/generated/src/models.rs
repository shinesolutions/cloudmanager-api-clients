#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;

use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;
use std::string::ParseError;


/// A Bad Request response error.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct BadRequestError {
    /// HTTP status code of the response.
    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<i32>,

    /// Error type identifier.
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

    /// A short summary of the error.
    #[serde(rename = "title")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub title: Option<String>,

    /// Request's missing parameters.
    #[serde(rename = "missingParams")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub missing_params: Option<Vec<models::MissingParameter>>,

    /// Request's invalid parameters.
    #[serde(rename = "invalidParams")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub invalid_params: Option<Vec<models::InvalidParameter>>,

}

impl BadRequestError {
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


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct BranchList {
    #[serde(rename = "_totalNumberOfItems")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _total_number_of_items: Option<i32>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::BranchListEmbedded>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::ProgramListLinks>,

}

impl BranchList {
    pub fn new() -> BranchList {
        BranchList {
            _total_number_of_items: None,
            _embedded: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct BranchListEmbedded {
    #[serde(rename = "branches")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub branches: Option<Vec<models::RepositoryBranch>>,

}

impl BranchListEmbedded {
    pub fn new() -> BranchListEmbedded {
        BranchListEmbedded {
            branches: None,
        }
    }
}


/// Describes an __Embedded Program__
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EmbeddedProgram {
    /// Identifier of the program. Unique within the space.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    /// Name of the program
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Whether this Program has been enabled for Cloud Manager usage
    #[serde(rename = "enabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub enabled: Option<bool>,

    /// Tenant Id
    #[serde(rename = "tenantId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tenant_id: Option<String>,

}

impl EmbeddedProgram {
    pub fn new() -> EmbeddedProgram {
        EmbeddedProgram {
            id: None,
            name: None,
            enabled: Some(false),
            tenant_id: None,
        }
    }
}


/// An Environment that 
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct Environment {
    /// id
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    /// Identifier of the program. Unique within the space.
    #[serde(rename = "programId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub program_id: Option<String>,

    /// Name of the environment
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Description of the environment
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    /// Type of the environment
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::EnvironmentLinks>,

}

impl Environment {
    pub fn new() -> Environment {
        Environment {
            id: None,
            program_id: None,
            name: None,
            description: None,
            _type: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EnvironmentLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/program")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_program: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/pipeline")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_pipeline: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/author")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_author: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/publish")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_publish: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/developerConsole")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_developer_console: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/logs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_logs: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/variables")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_variables: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl EnvironmentLinks {
    pub fn new() -> EnvironmentLinks {
        EnvironmentLinks {
            http__ns_adobe_com_adobecloud_rel_program: None,
            http__ns_adobe_com_adobecloud_rel_pipeline: None,
            http__ns_adobe_com_adobecloud_rel_author: None,
            http__ns_adobe_com_adobecloud_rel_publish: None,
            http__ns_adobe_com_adobecloud_rel_developer_console: None,
            http__ns_adobe_com_adobecloud_rel_logs: None,
            http__ns_adobe_com_adobecloud_rel_variables: None,
            _self: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EnvironmentList {
    #[serde(rename = "_totalNumberOfItems")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _total_number_of_items: Option<i32>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::EnvironmentListEmbedded>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::ProgramListLinks>,

}

impl EnvironmentList {
    pub fn new() -> EnvironmentList {
        EnvironmentList {
            _total_number_of_items: None,
            _embedded: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EnvironmentListEmbedded {
    #[serde(rename = "environments")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub environments: Option<Vec<models::Environment>>,

}

impl EnvironmentListEmbedded {
    pub fn new() -> EnvironmentListEmbedded {
        EnvironmentListEmbedded {
            environments: None,
        }
    }
}


/// Log from Environment
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EnvironmentLog {
    /// Name of the service
    #[serde(rename = "service")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service: Option<String>,

    /// Name of the Log
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// date of the Log
    #[serde(rename = "date")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date: Option<String>,

    #[serde(rename = "programId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub program_id: Option<i64>,

    #[serde(rename = "environmentId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub environment_id: Option<i64>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::EnvironmentLogLinks>,

}

impl EnvironmentLog {
    pub fn new() -> EnvironmentLog {
        EnvironmentLog {
            service: None,
            name: None,
            date: None,
            program_id: None,
            environment_id: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EnvironmentLogLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/logs/download")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_logs_download: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/logs/tail")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_logs_tail: Option<models::HalLink>,

}

impl EnvironmentLogLinks {
    pub fn new() -> EnvironmentLogLinks {
        EnvironmentLogLinks {
            http__ns_adobe_com_adobecloud_rel_logs_download: None,
            http__ns_adobe_com_adobecloud_rel_logs_tail: None,
        }
    }
}


/// Logs of an Environment
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EnvironmentLogs {
    /// Name of the service
    #[serde(rename = "service")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub service: Option<Vec<String>>,

    /// Name of the Log
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<Vec<String>>,

    /// Number of days
    #[serde(rename = "days")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub days: Option<i32>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::EnvironmentLogsLinks>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::EnvironmentLogsEmbedded>,

}

impl EnvironmentLogs {
    pub fn new() -> EnvironmentLogs {
        EnvironmentLogs {
            service: None,
            name: None,
            days: None,
            _links: None,
            _embedded: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EnvironmentLogsEmbedded {
    /// Links to logs
    #[serde(rename = "downloads")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub downloads: Option<Vec<models::EnvironmentLog>>,

}

impl EnvironmentLogsEmbedded {
    pub fn new() -> EnvironmentLogsEmbedded {
        EnvironmentLogsEmbedded {
            downloads: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct EnvironmentLogsLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/program")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_program: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl EnvironmentLogsLinks {
    pub fn new() -> EnvironmentLogsLinks {
        EnvironmentLogsLinks {
            http__ns_adobe_com_adobecloud_rel_program: None,
            _self: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct HalLink {
    #[serde(rename = "href")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub href: Option<String>,

    #[serde(rename = "templated")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub templated: Option<bool>,

    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

    #[serde(rename = "deprecation")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub deprecation: Option<String>,

    #[serde(rename = "profile")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub profile: Option<String>,

    #[serde(rename = "title")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub title: Option<String>,

    #[serde(rename = "hreflang")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub hreflang: Option<String>,

    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

}

impl HalLink {
    pub fn new() -> HalLink {
        HalLink {
            href: None,
            templated: Some(false),
            _type: None,
            deprecation: None,
            profile: None,
            title: None,
            hreflang: None,
            name: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct InvalidParameter {
    /// Name of the invalid parameter.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Reason of why the parameter's value is not accepted.
    #[serde(rename = "reason")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reason: Option<String>,

}

impl InvalidParameter {
    pub fn new() -> InvalidParameter {
        InvalidParameter {
            name: None,
            reason: None,
        }
    }
}


/// Describes a __Metric__
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct Metric {
    /// KPI result identifier
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    /// Severity of the metric
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "severity")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub severity: Option<String>,

    /// Whether metric is considered passed
    #[serde(rename = "passed")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub passed: Option<bool>,

    /// Whether user override the failed metric
    #[serde(rename = "override")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _override: Option<bool>,

    /// Expected value for the metric
    #[serde(rename = "actualValue")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub actual_value: Option<String>,

    /// Expected value for the metric
    #[serde(rename = "expectedValue")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub expected_value: Option<String>,

    /// Comparator used for the metric
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "comparator")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub comparator: Option<String>,

    /// KPI identifier
    #[serde(rename = "kpi")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub kpi: Option<String>,

}

impl Metric {
    pub fn new() -> Metric {
        Metric {
            id: None,
            severity: None,
            passed: Some(false),
            _override: Some(false),
            actual_value: None,
            expected_value: None,
            comparator: None,
            kpi: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct MissingParameter {
    /// Name of the missing parameter.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Type of the missing parameter.
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

}

impl MissingParameter {
    pub fn new() -> MissingParameter {
        MissingParameter {
            name: None,
            _type: None,
        }
    }
}


/// Describes a __CI/CD Pipeline__
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct Pipeline {
    /// Identifier of the pipeline. Unique within the program.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    /// Identifier of the program. Unique within the space.
    #[serde(rename = "programId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub program_id: Option<String>,

    /// Name of the pipeline
    #[serde(rename = "name")]
    pub name: String,

    /// How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "trigger")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trigger: Option<String>,

    /// Pipeline status
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<String>,

    /// Create date
    #[serde(rename = "createdAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub created_at: Option<chrono::DateTime<chrono::Utc>>,

    /// Update date
    #[serde(rename = "updatedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub updated_at: Option<chrono::DateTime<chrono::Utc>>,

    /// Last pipeline execution start
    #[serde(rename = "lastStartedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub last_started_at: Option<chrono::DateTime<chrono::Utc>>,

    /// Last pipeline execution end
    #[serde(rename = "lastFinishedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub last_finished_at: Option<chrono::DateTime<chrono::Utc>>,

    /// Pipeline phases in execution order
    #[serde(rename = "phases")]
    pub phases: Vec<models::PipelinePhase>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::PipelineLinks>,

}

impl Pipeline {
    pub fn new(name: String, phases: Vec<models::PipelinePhase>, ) -> Pipeline {
        Pipeline {
            id: None,
            program_id: None,
            name: name,
            trigger: None,
            status: None,
            created_at: None,
            updated_at: None,
            last_started_at: None,
            last_finished_at: None,
            phases: phases,
            _links: None,
        }
    }
}


/// Wraps a pipeline execution
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineExecution {
    /// Pipeline execution identifier
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    /// Identifier of the program. Unique within the space.
    #[serde(rename = "programId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub program_id: Option<String>,

    /// Identifier of the pipeline. Unique within the space.
    #[serde(rename = "pipelineId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pipeline_id: Option<String>,

    /// Version of the artifacts generated during this execution
    #[serde(rename = "artifactsVersion")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub artifacts_version: Option<String>,

    /// AdobeID who started the pipeline. Empty for auto triggered builds
    #[serde(rename = "user")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user: Option<String>,

    /// Status of the execution
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<String>,

    /// How the execution was triggered.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "trigger")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trigger: Option<String>,

    /// Start time
    #[serde(rename = "createdAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub created_at: Option<chrono::DateTime<chrono::Utc>>,

    /// Date of last status change
    #[serde(rename = "updatedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub updated_at: Option<chrono::DateTime<chrono::Utc>>,

    /// Date the execution reached a final state
    #[serde(rename = "finishedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub finished_at: Option<chrono::DateTime<chrono::Utc>>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::PipelineExecutionEmbedded>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::PipelineExecutionLinks>,

}

impl PipelineExecution {
    pub fn new() -> PipelineExecution {
        PipelineExecution {
            id: None,
            program_id: None,
            pipeline_id: None,
            artifacts_version: None,
            user: None,
            status: None,
            trigger: None,
            created_at: None,
            updated_at: None,
            finished_at: None,
            _embedded: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineExecutionEmbedded {
    #[serde(rename = "stepStates")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub step_states: Option<Vec<models::PipelineExecutionStepState>>,

}

impl PipelineExecutionEmbedded {
    pub fn new() -> PipelineExecutionEmbedded {
        PipelineExecutionEmbedded {
            step_states: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineExecutionLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/program")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_program: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/pipeline")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_pipeline: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl PipelineExecutionLinks {
    pub fn new() -> PipelineExecutionLinks {
        PipelineExecutionLinks {
            http__ns_adobe_com_adobecloud_rel_program: None,
            http__ns_adobe_com_adobecloud_rel_pipeline: None,
            _self: None,
        }
    }
}


/// List of pipeline executions
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineExecutionListRepresentation {
    #[serde(rename = "_totalNumberOfItems")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _total_number_of_items: Option<i32>,

    #[serde(rename = "_page")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _page: Option<models::RequestedPageDetails>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::PipelineExecutionListRepresentationEmbedded>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::PipelineExecutionListRepresentationLinks>,

}

impl PipelineExecutionListRepresentation {
    pub fn new() -> PipelineExecutionListRepresentation {
        PipelineExecutionListRepresentation {
            _total_number_of_items: None,
            _page: None,
            _embedded: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineExecutionListRepresentationEmbedded {
    #[serde(rename = "executions")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub executions: Option<Vec<models::PipelineExecution>>,

}

impl PipelineExecutionListRepresentationEmbedded {
    pub fn new() -> PipelineExecutionListRepresentationEmbedded {
        PipelineExecutionListRepresentationEmbedded {
            executions: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineExecutionListRepresentationLinks {
    #[serde(rename = "next")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub next: Option<models::HalLink>,

    #[serde(rename = "page")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub page: Option<models::HalLink>,

    #[serde(rename = "prev")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub prev: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

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


/// Describes the status of a particular pipeline execution step for display purposes
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineExecutionStepState {
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    #[serde(rename = "stepId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub step_id: Option<String>,

    #[serde(rename = "phaseId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub phase_id: Option<String>,

    /// Name of the action
    #[serde(rename = "action")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub action: Option<String>,

    /// Target repository
    #[serde(rename = "repository")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub repository: Option<String>,

    /// Target branch
    #[serde(rename = "branch")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub branch: Option<String>,

    /// Target environment
    #[serde(rename = "environment")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub environment: Option<String>,

    /// Target environment type
    #[serde(rename = "environmentType")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub environment_type: Option<String>,

    /// Start time
    #[serde(rename = "startedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub started_at: Option<chrono::DateTime<chrono::Utc>>,

    /// Date the execution reached a final state
    #[serde(rename = "finishedAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub finished_at: Option<chrono::DateTime<chrono::Utc>>,

    /// Information about step result
    #[serde(rename = "details")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub details: Option<HashMap<String, object>>,

    /// Action status
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<String>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::PipelineExecutionStepStateLinks>,

}

impl PipelineExecutionStepState {
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


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineExecutionStepStateLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/execution")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_execution: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/pipeline")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_pipeline: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/pipeline/logs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_pipeline_logs: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/pipeline/metrics")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_pipeline_metrics: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/pipeline/advance")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_pipeline_advance: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/pipeline/cancel")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_pipeline_cancel: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/program")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_program: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl PipelineExecutionStepStateLinks {
    pub fn new() -> PipelineExecutionStepStateLinks {
        PipelineExecutionStepStateLinks {
            http__ns_adobe_com_adobecloud_rel_execution: None,
            http__ns_adobe_com_adobecloud_rel_pipeline: None,
            http__ns_adobe_com_adobecloud_rel_pipeline_logs: None,
            http__ns_adobe_com_adobecloud_rel_pipeline_metrics: None,
            http__ns_adobe_com_adobecloud_rel_pipeline_advance: None,
            http__ns_adobe_com_adobecloud_rel_pipeline_cancel: None,
            http__ns_adobe_com_adobecloud_rel_program: None,
            _self: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/program")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_program: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/execution")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_execution: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/executions")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_executions: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_rollback_last_successful_execution: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl PipelineLinks {
    pub fn new() -> PipelineLinks {
        PipelineLinks {
            http__ns_adobe_com_adobecloud_rel_program: None,
            http__ns_adobe_com_adobecloud_rel_execution: None,
            http__ns_adobe_com_adobecloud_rel_executions: None,
            http__ns_adobe_com_adobecloud_rel_rollback_last_successful_execution: None,
            _self: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineList {
    #[serde(rename = "_totalNumberOfItems")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _total_number_of_items: Option<i32>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::PipelineListEmbedded>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::ProgramListLinks>,

}

impl PipelineList {
    pub fn new() -> PipelineList {
        PipelineList {
            _total_number_of_items: None,
            _embedded: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineListEmbedded {
    #[serde(rename = "pipelines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pipelines: Option<Vec<models::Pipeline>>,

}

impl PipelineListEmbedded {
    pub fn new() -> PipelineListEmbedded {
        PipelineListEmbedded {
            pipelines: None,
        }
    }
}


/// Describes a phase of a pipeline
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelinePhase {
    /// Name of the phase
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Type of the phase
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "type")]
    pub _type: String,

    /// Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
    #[serde(rename = "repositoryId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub repository_id: Option<String>,

    /// Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
    #[serde(rename = "branch")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub branch: Option<String>,

    /// Identifier of the target environment. Mandatory if type=DEPLOY
    #[serde(rename = "environmentId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub environment_id: Option<String>,

}

impl PipelinePhase {
    pub fn new(_type: String, ) -> PipelinePhase {
        PipelinePhase {
            name: None,
            _type: _type,
            repository_id: None,
            branch: None,
            environment_id: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct PipelineStepMetrics {
    /// metrics
    #[serde(rename = "metrics")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub metrics: Option<Vec<models::Metric>>,

}

impl PipelineStepMetrics {
    pub fn new() -> PipelineStepMetrics {
        PipelineStepMetrics {
            metrics: None,
        }
    }
}


/// Describes a __Program__
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct Program {
    /// Identifier of the program. Unique within the space.
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    /// Name of the program
    #[serde(rename = "name")]
    pub name: String,

    /// Whether this Program has been enabled for Cloud Manager usage
    #[serde(rename = "enabled")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub enabled: Option<bool>,

    /// Tenant Id
    #[serde(rename = "tenantId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub tenant_id: Option<String>,

    /// Organisation Id
    #[serde(rename = "imsOrgId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub ims_org_id: Option<String>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::ProgramLinks>,

}

impl Program {
    pub fn new(name: String, ) -> Program {
        Program {
            id: None,
            name: name,
            enabled: Some(false),
            tenant_id: None,
            ims_org_id: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct ProgramLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/pipelines")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_pipelines: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/environments")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_environments: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/repositories")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_repositories: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl ProgramLinks {
    pub fn new() -> ProgramLinks {
        ProgramLinks {
            http__ns_adobe_com_adobecloud_rel_pipelines: None,
            http__ns_adobe_com_adobecloud_rel_environments: None,
            http__ns_adobe_com_adobecloud_rel_repositories: None,
            _self: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct ProgramList {
    #[serde(rename = "_totalNumberOfItems")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _total_number_of_items: Option<i32>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::ProgramListEmbedded>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::ProgramListLinks>,

}

impl ProgramList {
    pub fn new() -> ProgramList {
        ProgramList {
            _total_number_of_items: None,
            _embedded: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct ProgramListEmbedded {
    #[serde(rename = "programs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub programs: Option<Vec<models::EmbeddedProgram>>,

}

impl ProgramListEmbedded {
    pub fn new() -> ProgramListEmbedded {
        ProgramListEmbedded {
            programs: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct ProgramListLinks {
    #[serde(rename = "next")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub next: Option<models::HalLink>,

    #[serde(rename = "prev")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub prev: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl ProgramListLinks {
    pub fn new() -> ProgramListLinks {
        ProgramListLinks {
            next: None,
            prev: None,
            _self: None,
        }
    }
}


/// A sourcecode repository
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct Repository {
    /// Repository name
    #[serde(rename = "repo")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub repo: Option<String>,

    /// description
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::RepositoryLinks>,

}

impl Repository {
    pub fn new() -> Repository {
        Repository {
            repo: None,
            description: None,
            _links: None,
        }
    }
}


/// Represents a Git Branch
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct RepositoryBranch {
    /// Identifier of the program. Unique within the space
    #[serde(rename = "programId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub program_id: Option<String>,

    /// Identifier of the repository
    #[serde(rename = "repositoryId")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub repository_id: Option<i64>,

    /// Name of the branch
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::RepositoryBranchLinks>,

}

impl RepositoryBranch {
    pub fn new() -> RepositoryBranch {
        RepositoryBranch {
            program_id: None,
            repository_id: None,
            name: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct RepositoryBranchLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/program")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_program: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/repository")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_repository: Option<models::HalLink>,

}

impl RepositoryBranchLinks {
    pub fn new() -> RepositoryBranchLinks {
        RepositoryBranchLinks {
            http__ns_adobe_com_adobecloud_rel_program: None,
            http__ns_adobe_com_adobecloud_rel_repository: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct RepositoryLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/program")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_program: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/branches")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_branches: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl RepositoryLinks {
    pub fn new() -> RepositoryLinks {
        RepositoryLinks {
            http__ns_adobe_com_adobecloud_rel_program: None,
            http__ns_adobe_com_adobecloud_rel_branches: None,
            _self: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct RepositoryList {
    #[serde(rename = "_totalNumberOfItems")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _total_number_of_items: Option<i32>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::RepositoryListEmbedded>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::ProgramListLinks>,

}

impl RepositoryList {
    pub fn new() -> RepositoryList {
        RepositoryList {
            _total_number_of_items: None,
            _embedded: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct RepositoryListEmbedded {
    #[serde(rename = "repositories")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub repositories: Option<Vec<models::Repository>>,

}

impl RepositoryListEmbedded {
    pub fn new() -> RepositoryListEmbedded {
        RepositoryListEmbedded {
            repositories: None,
        }
    }
}


/// Filtering and sorting page details
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct RequestedPageDetails {
    #[serde(rename = "start")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start: Option<i32>,

    #[serde(rename = "limit")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub limit: Option<i32>,

    #[serde(rename = "orderBy")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub order_by: Option<String>,

    #[serde(rename = "property")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub property: Option<Vec<String>>,

    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

    #[serde(rename = "next")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub next: Option<i32>,

    #[serde(rename = "prev")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub prev: Option<i32>,

}

impl RequestedPageDetails {
    pub fn new() -> RequestedPageDetails {
        RequestedPageDetails {
            start: None,
            limit: None,
            order_by: None,
            property: None,
            _type: None,
            next: None,
            prev: None,
        }
    }
}


/// A named value than can be set on an Environment
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct Variable {
    /// Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Value of the variable. Read-Write for non-secrets, write-only for secrets.
    #[serde(rename = "value")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub value: Option<String>,

    /// Type of the variable. Default `string` if missing. Cannot be changed after creation.
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _type: Option<String>,

}

impl Variable {
    pub fn new() -> Variable {
        Variable {
            name: None,
            value: None,
            _type: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct VariableList {
    #[serde(rename = "_totalNumberOfItems")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _total_number_of_items: Option<i32>,

    #[serde(rename = "_embedded")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _embedded: Option<models::VariableListEmbedded>,

    #[serde(rename = "_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _links: Option<models::VariableListLinks>,

}

impl VariableList {
    pub fn new() -> VariableList {
        VariableList {
            _total_number_of_items: None,
            _embedded: None,
            _links: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct VariableListEmbedded {
    /// Variables set on environment
    #[serde(rename = "variables")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub variables: Option<Vec<models::Variable>>,

}

impl VariableListEmbedded {
    pub fn new() -> VariableListEmbedded {
        VariableListEmbedded {
            variables: None,
        }
    }
}


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
#[cfg_attr(feature = "conversion", derive(LabelledGeneric))]
pub struct VariableListLinks {
    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/environment")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_environment: Option<models::HalLink>,

    #[serde(rename = "http://ns.adobe.com/adobecloud/rel/program")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub http__ns_adobe_com_adobecloud_rel_program: Option<models::HalLink>,

    #[serde(rename = "self")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub _self: Option<models::HalLink>,

}

impl VariableListLinks {
    pub fn new() -> VariableListLinks {
        VariableListLinks {
            http__ns_adobe_com_adobecloud_rel_environment: None,
            http__ns_adobe_com_adobecloud_rel_program: None,
            _self: None,
        }
    }
}

