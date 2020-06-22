/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit

    lazy_static! {
        /// Create Mime objects for the response content types for GetBranches
        pub static ref GET_BRANCHES_SUCCESSFUL_RETRIEVAL_OF_THE_LIST_OF_REPOSITORY_BRANCHES: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for DeleteEnvironment
        pub static ref DELETE_ENVIRONMENT_ENVIRONMENT_DELETED: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for DeleteEnvironment
        pub static ref DELETE_ENVIRONMENT_ENVIRONMENT_DELETION_IN_PROGRESS: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for DownloadLogs
        pub static ref DOWNLOAD_LOGS_INVALID_PARAMETERS: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetEnvironment
        pub static ref GET_ENVIRONMENT_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetEnvironmentLogs
        pub static ref GET_ENVIRONMENT_LOGS_SUCCESSFUL_RETRIEVAL_OF_LOGS_FOR_AN_ENVIRONMENT: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetEnvironmentLogs
        pub static ref GET_ENVIRONMENT_LOGS_INVALID_PARAMETERS: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetEnvironments
        pub static ref GET_ENVIRONMENTS_SUCCESSFUL_RETRIEVAL_OF_ENVIRONMENT_LIST: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetCurrentExecution
        pub static ref GET_CURRENT_EXECUTION_SUCCESSFUL_RETRIEVAL_OF_CURRENT_EXECUTION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetExecution
        pub static ref GET_EXECUTION_SUCCESSFUL_RETRIEVAL_OF_EXECUTION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetExecutions
        pub static ref GET_EXECUTIONS_SUCCESSFUL_RETRIEVAL_OF_EXECUTION_HISTORY: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for StepMetric
        pub static ref STEP_METRIC_SUCCESSFUL_RETRIEVAL_OF_METRICS: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for StepState
        pub static ref STEP_STATE_SUCCESSFUL_RETRIEVAL_OF_STEP_STATE: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetPipeline
        pub static ref GET_PIPELINE_SUCCESSFUL_RETRIEVAL_OF_PIPELINE: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetPipelines
        pub static ref GET_PIPELINES_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for PatchPipeline
        pub static ref PATCH_PIPELINE_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for DeleteProgram
        pub static ref DELETE_PROGRAM_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for DeleteProgram
        pub static ref DELETE_PROGRAM_DELETE_WAS_SUCCESSFUL: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetProgram
        pub static ref GET_PROGRAM_SUCCESSFUL_RETRIEVAL_OF_PROGRAM: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetPrograms
        pub static ref GET_PROGRAMS_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetRepositories
        pub static ref GET_REPOSITORIES_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetRepository
        pub static ref GET_REPOSITORY_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetEnvironmentVariables
        pub static ref GET_ENVIRONMENT_VARIABLES_SUCCESSFUL_RETRIEVAL_OF_ENVIRONMENT_VARIABLES: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for PatchEnvironmentVariables
        pub static ref PATCH_ENVIRONMENT_VARIABLES_SUCCESSFUL_UPDATE_OF_ENVIRONMENT_VARIABLES: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;

    lazy_static! {
        /// Create Mime objects for the request content types for AdvancePipelineExecution
        pub static ref ADVANCE_PIPELINE_EXECUTION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the request content types for CancelPipelineExecutionStep
        pub static ref CANCEL_PIPELINE_EXECUTION_STEP: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the request content types for PatchPipeline
        pub static ref PATCH_PIPELINE: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the request content types for PatchEnvironmentVariables
        pub static ref PATCH_ENVIRONMENT_VARIABLES: Mime = "application/json".parse().unwrap();
    }

}
