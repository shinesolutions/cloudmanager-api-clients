#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]

#[macro_use]
extern crate lazy_static;
#[macro_use]
extern crate log;
#[macro_use]
extern crate serde_derive;

#[cfg(any(feature = "client", feature = "server"))]
#[macro_use]
extern crate hyper;
#[cfg(any(feature = "client", feature = "server"))]
#[macro_use]
extern crate url;

// Crates for conversion support
#[cfg(feature = "conversion")]
#[macro_use]
extern crate frunk_derives;
#[cfg(feature = "conversion")]
#[macro_use]
extern crate frunk_enum_derive;
#[cfg(feature = "conversion")]
extern crate frunk_core;

extern crate mime;
extern crate serde;
extern crate serde_json;

extern crate futures;
extern crate chrono;
extern crate swagger;

use futures::Stream;
use std::io::Error;

#[allow(unused_imports)]
use std::collections::HashMap;

#[cfg(any(feature = "client", feature = "server"))]
mod mimetypes;

#[deprecated(note = "Import swagger-rs directly")]
pub use swagger::{ApiError, ContextWrapper};
#[deprecated(note = "Import futures directly")]
pub use futures::Future;

pub const BASE_PATH: &'static str = "";
pub const API_VERSION: &'static str = "1.0.0";


#[derive(Debug, PartialEq)]
pub enum GetBranchesResponse {
    /// Successful retrieval of the list of repository branches
    SuccessfulRetrievalOfTheListOfRepositoryBranches
    (models::BranchList)
}

#[derive(Debug, PartialEq)]
pub enum DeleteEnvironmentResponse {
    /// Environment deleted
    EnvironmentDeleted
    (models::Environment)
    ,
    /// Environment deletion in progress
    EnvironmentDeletionInProgress
    (models::BadRequestError)
    ,
    /// Environment not found
    EnvironmentNotFound
}

#[derive(Debug, PartialEq)]
pub enum DownloadLogsResponse {
    /// Successful retrieval of logs
    SuccessfulRetrievalOfLogs
    ,
    /// invalid parameters
    InvalidParameters
    (models::BadRequestError)
    ,
    /// Environment not found
    EnvironmentNotFound
}

#[derive(Debug, PartialEq)]
pub enum GetEnvironmentResponse {
    /// successful operation
    SuccessfulOperation
    (models::Environment)
}

#[derive(Debug, PartialEq)]
pub enum GetEnvironmentLogsResponse {
    /// Successful retrieval of logs for an environment
    SuccessfulRetrievalOfLogsForAnEnvironment
    (models::EnvironmentLogs)
    ,
    /// invalid parameters
    InvalidParameters
    (models::BadRequestError)
    ,
    /// Environment not found
    EnvironmentNotFound
}

#[derive(Debug, PartialEq)]
pub enum GetEnvironmentsResponse {
    /// Successful retrieval of environment list
    SuccessfulRetrievalOfEnvironmentList
    (models::EnvironmentList)
    ,
    /// Program not found
    ProgramNotFound
}

#[derive(Debug, PartialEq)]
pub enum AdvancePipelineExecutionResponse {
    /// Successful resume of pipeline execution
    SuccessfulResumeOfPipelineExecution
    ,
    /// Missing permission for user to advance the pipeline execution
    MissingPermissionForUserToAdvanceThePipelineExecution
    ,
    /// No pipeline execution exits or unknown pipeline or program
    NoPipelineExecutionExitsOrUnknownPipelineOrProgram
}

#[derive(Debug, PartialEq)]
pub enum CancelPipelineExecutionStepResponse {
    /// Successful cancel of pipeline execution
    SuccessfulCancelOfPipelineExecution
    ,
    /// Missing permission for user to cancel the current pipeline execution
    MissingPermissionForUserToCancelTheCurrentPipelineExecution
    ,
    /// No pipeline execution exits or unknown pipeline or program
    NoPipelineExecutionExitsOrUnknownPipelineOrProgram
}

#[derive(Debug, PartialEq)]
pub enum GetCurrentExecutionResponse {
    /// Successful retrieval of current execution
    SuccessfulRetrievalOfCurrentExecution
    (models::PipelineExecution)
    ,
    /// No pipeline execution exits or unknown pipeline or program
    NoPipelineExecutionExitsOrUnknownPipelineOrProgram
}

#[derive(Debug, PartialEq)]
pub enum GetExecutionResponse {
    /// Successful retrieval of execution
    SuccessfulRetrievalOfExecution
    (models::PipelineExecution)
    ,
    /// No pipeline execution exits or unknown pipeline or application
    NoPipelineExecutionExitsOrUnknownPipelineOrApplication
}

#[derive(Debug, PartialEq)]
pub enum GetExecutionsResponse {
    /// Successful retrieval of execution history
    SuccessfulRetrievalOfExecutionHistory
    (models::PipelineExecutionListRepresentation)
    ,
    /// Missing permission for user to read executions
    MissingPermissionForUserToReadExecutions
    ,
    /// Pipeline does not exist
    PipelineDoesNotExist
}

#[derive(Debug, PartialEq)]
pub enum GetStepLogsResponse {
    /// Successful retrieval of logs
    SuccessfulRetrievalOfLogs
    ,
    /// Missing permission for user to read logs
    MissingPermissionForUserToReadLogs
    ,
    /// Pipeline execution does not exist
    PipelineExecutionDoesNotExist
}

#[derive(Debug, PartialEq)]
pub enum StartPipelineResponse {
    /// Successful started pipeline execution
    SuccessfulStartedPipelineExecution
    ,
    /// Request conflicts with the expected state of pipeline
    RequestConflictsWithTheExpectedStateOfPipeline
    ,
    /// No pipeline execution exits or unknown pipeline or application
    NoPipelineExecutionExitsOrUnknownPipelineOrApplication
    ,
    /// Cannot start execution: programId={programId}, pipelineId={pipelineId} currentExecutionId={executionId}, reason='Execution already in progress.
    CannotStartExecution
}

#[derive(Debug, PartialEq)]
pub enum StepMetricResponse {
    /// Successful retrieval of metrics
    SuccessfulRetrievalOfMetrics
    (models::PipelineStepMetrics)
    ,
    /// Missing permission for user to read metrics
    MissingPermissionForUserToReadMetrics
    ,
    /// Pipeline execution does not exist
    PipelineExecutionDoesNotExist
}

#[derive(Debug, PartialEq)]
pub enum StepStateResponse {
    /// Successful retrieval of step state
    SuccessfulRetrievalOfStepState
    (models::PipelineExecutionStepState)
    ,
    /// Missing permission for user to read step
    MissingPermissionForUserToReadStep
    ,
    /// Pipeline execution does not exist
    PipelineExecutionDoesNotExist
}

#[derive(Debug, PartialEq)]
pub enum DeletePipelineResponse {
    /// successful operation
    SuccessfulOperation
}

#[derive(Debug, PartialEq)]
pub enum GetPipelineResponse {
    /// Successful retrieval of pipeline
    SuccessfulRetrievalOfPipeline
    (models::Pipeline)
    ,
    /// Pipeline not found
    PipelineNotFound
}

#[derive(Debug, PartialEq)]
pub enum GetPipelinesResponse {
    /// successful operation
    SuccessfulOperation
    (models::PipelineList)
}

#[derive(Debug, PartialEq)]
pub enum PatchPipelineResponse {
    /// successful operation
    SuccessfulOperation
    (models::Pipeline)
}

#[derive(Debug, PartialEq)]
pub enum DeleteProgramResponse {
    /// successful operation
    SuccessfulOperation
    (models::Program)
    ,
    /// Delete was successful.
    DeleteWasSuccessful
    (models::Program)
    ,
    /// Forbidden.
    Forbidden
    ,
    /// Program not found.
    ProgramNotFound
    ,
    /// Deletion not supported
    DeletionNotSupported
}

#[derive(Debug, PartialEq)]
pub enum GetProgramResponse {
    /// Successful retrieval of program
    SuccessfulRetrievalOfProgram
    (models::Program)
    ,
    /// Program not found
    ProgramNotFound
}

#[derive(Debug, PartialEq)]
pub enum GetProgramsResponse {
    /// successful operation
    SuccessfulOperation
    (models::ProgramList)
}

#[derive(Debug, PartialEq)]
pub enum GetRepositoriesResponse {
    /// successful operation
    SuccessfulOperation
    (models::RepositoryList)
}

#[derive(Debug, PartialEq)]
pub enum GetRepositoryResponse {
    /// successful operation
    SuccessfulOperation
    (models::Repository)
}

#[derive(Debug, PartialEq)]
pub enum GetEnvironmentVariablesResponse {
    /// Successful retrieval of environment variables
    SuccessfulRetrievalOfEnvironmentVariables
    (models::VariableList)
    ,
    /// Environment not found
    EnvironmentNotFound
}

#[derive(Debug, PartialEq)]
pub enum PatchEnvironmentVariablesResponse {
    /// Successful update of environment variables
    SuccessfulUpdateOfEnvironmentVariables
    (models::VariableList)
    ,
    /// Environment not found
    EnvironmentNotFound
}


/// API
pub trait Api<C> {

    /// List Branches
    fn get_branches(&self, program_id: String, repository_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetBranchesResponse, Error=ApiError>>;

    /// DeleteEnvironment
    fn delete_environment(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=DeleteEnvironmentResponse, Error=ApiError>>;

    /// Download Logs
    fn download_logs(&self, program_id: String, environment_id: String, service: String, name: String, date: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, accept: Option<String>, context: &C) -> Box<dyn Future<Item=DownloadLogsResponse, Error=ApiError>>;

    /// Get Environment
    fn get_environment(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetEnvironmentResponse, Error=ApiError>>;

    /// Get Environment Logs
    fn get_environment_logs(&self, program_id: String, environment_id: String, days: i32, x_gw_ims_org_id: String, authorization: String, x_api_key: String, service: Option<&Vec<String>>, name: Option<&Vec<String>>, context: &C) -> Box<dyn Future<Item=GetEnvironmentLogsResponse, Error=ApiError>>;

    /// List Environments
    fn get_environments(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, _type: Option<String>, context: &C) -> Box<dyn Future<Item=GetEnvironmentsResponse, Error=ApiError>>;

    /// Advance
    fn advance_pipeline_execution(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: object, context: &C) -> Box<dyn Future<Item=AdvancePipelineExecutionResponse, Error=ApiError>>;

    /// Cancel
    fn cancel_pipeline_execution_step(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: object, context: &C) -> Box<dyn Future<Item=CancelPipelineExecutionStepResponse, Error=ApiError>>;

    /// Get current pipeline execution
    fn get_current_execution(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetCurrentExecutionResponse, Error=ApiError>>;

    /// Get pipeline execution
    fn get_execution(&self, program_id: String, pipeline_id: String, execution_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetExecutionResponse, Error=ApiError>>;

    /// List Executions
    fn get_executions(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, start: Option<String>, limit: Option<i32>, context: &C) -> Box<dyn Future<Item=GetExecutionsResponse, Error=ApiError>>;

    /// Get logs
    fn get_step_logs(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, file: Option<String>, accept: Option<String>, context: &C) -> Box<dyn Future<Item=GetStepLogsResponse, Error=ApiError>>;

    /// Start the pipeline
    fn start_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, context: &C) -> Box<dyn Future<Item=StartPipelineResponse, Error=ApiError>>;

    /// Get step metrics
    fn step_metric(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=StepMetricResponse, Error=ApiError>>;

    /// Get step state
    fn step_state(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=StepStateResponse, Error=ApiError>>;

    /// Delete a Pipeline
    fn delete_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=DeletePipelineResponse, Error=ApiError>>;

    /// Get Pipeline
    fn get_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetPipelineResponse, Error=ApiError>>;

    /// List Pipelines
    fn get_pipelines(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetPipelinesResponse, Error=ApiError>>;

    /// Patches Pipeline
    fn patch_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: models::Pipeline, context: &C) -> Box<dyn Future<Item=PatchPipelineResponse, Error=ApiError>>;

    /// Delete Program
    fn delete_program(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=DeleteProgramResponse, Error=ApiError>>;

    /// Get Program
    fn get_program(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetProgramResponse, Error=ApiError>>;

    /// Lists Programs
    fn get_programs(&self, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetProgramsResponse, Error=ApiError>>;

    /// Lists Repositories
    fn get_repositories(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetRepositoriesResponse, Error=ApiError>>;

    /// Get Repository
    fn get_repository(&self, program_id: String, repository_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetRepositoryResponse, Error=ApiError>>;

    /// List User Environment Variables
    fn get_environment_variables(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetEnvironmentVariablesResponse, Error=ApiError>>;

    /// Patch User Environment Variables
    fn patch_environment_variables(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: &Vec<models::Variable>, context: &C) -> Box<dyn Future<Item=PatchEnvironmentVariablesResponse, Error=ApiError>>;

}

/// API without a `Context`
pub trait ApiNoContext {

    /// List Branches
    fn get_branches(&self, program_id: String, repository_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetBranchesResponse, Error=ApiError>>;

    /// DeleteEnvironment
    fn delete_environment(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=DeleteEnvironmentResponse, Error=ApiError>>;

    /// Download Logs
    fn download_logs(&self, program_id: String, environment_id: String, service: String, name: String, date: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, accept: Option<String>) -> Box<dyn Future<Item=DownloadLogsResponse, Error=ApiError>>;

    /// Get Environment
    fn get_environment(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetEnvironmentResponse, Error=ApiError>>;

    /// Get Environment Logs
    fn get_environment_logs(&self, program_id: String, environment_id: String, days: i32, x_gw_ims_org_id: String, authorization: String, x_api_key: String, service: Option<&Vec<String>>, name: Option<&Vec<String>>) -> Box<dyn Future<Item=GetEnvironmentLogsResponse, Error=ApiError>>;

    /// List Environments
    fn get_environments(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, _type: Option<String>) -> Box<dyn Future<Item=GetEnvironmentsResponse, Error=ApiError>>;

    /// Advance
    fn advance_pipeline_execution(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: object) -> Box<dyn Future<Item=AdvancePipelineExecutionResponse, Error=ApiError>>;

    /// Cancel
    fn cancel_pipeline_execution_step(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: object) -> Box<dyn Future<Item=CancelPipelineExecutionStepResponse, Error=ApiError>>;

    /// Get current pipeline execution
    fn get_current_execution(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetCurrentExecutionResponse, Error=ApiError>>;

    /// Get pipeline execution
    fn get_execution(&self, program_id: String, pipeline_id: String, execution_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetExecutionResponse, Error=ApiError>>;

    /// List Executions
    fn get_executions(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, start: Option<String>, limit: Option<i32>) -> Box<dyn Future<Item=GetExecutionsResponse, Error=ApiError>>;

    /// Get logs
    fn get_step_logs(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, file: Option<String>, accept: Option<String>) -> Box<dyn Future<Item=GetStepLogsResponse, Error=ApiError>>;

    /// Start the pipeline
    fn start_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String) -> Box<dyn Future<Item=StartPipelineResponse, Error=ApiError>>;

    /// Get step metrics
    fn step_metric(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=StepMetricResponse, Error=ApiError>>;

    /// Get step state
    fn step_state(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=StepStateResponse, Error=ApiError>>;

    /// Delete a Pipeline
    fn delete_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=DeletePipelineResponse, Error=ApiError>>;

    /// Get Pipeline
    fn get_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetPipelineResponse, Error=ApiError>>;

    /// List Pipelines
    fn get_pipelines(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetPipelinesResponse, Error=ApiError>>;

    /// Patches Pipeline
    fn patch_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: models::Pipeline) -> Box<dyn Future<Item=PatchPipelineResponse, Error=ApiError>>;

    /// Delete Program
    fn delete_program(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=DeleteProgramResponse, Error=ApiError>>;

    /// Get Program
    fn get_program(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetProgramResponse, Error=ApiError>>;

    /// Lists Programs
    fn get_programs(&self, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetProgramsResponse, Error=ApiError>>;

    /// Lists Repositories
    fn get_repositories(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetRepositoriesResponse, Error=ApiError>>;

    /// Get Repository
    fn get_repository(&self, program_id: String, repository_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetRepositoryResponse, Error=ApiError>>;

    /// List User Environment Variables
    fn get_environment_variables(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetEnvironmentVariablesResponse, Error=ApiError>>;

    /// Patch User Environment Variables
    fn patch_environment_variables(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: &Vec<models::Variable>) -> Box<dyn Future<Item=PatchEnvironmentVariablesResponse, Error=ApiError>>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<'a, C> where Self: Sized {
    /// Binds this API to a context.
    fn with_context(self: &'a Self, context: C) -> ContextWrapper<'a, Self, C>;
}

impl<'a, T: Api<C> + Sized, C> ContextWrapperExt<'a, C> for T {
    fn with_context(self: &'a T, context: C) -> ContextWrapper<'a, T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

impl<'a, T: Api<C>, C> ApiNoContext for ContextWrapper<'a, T, C> {

    /// List Branches
    fn get_branches(&self, program_id: String, repository_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetBranchesResponse, Error=ApiError>> {
        self.api().get_branches(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// DeleteEnvironment
    fn delete_environment(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=DeleteEnvironmentResponse, Error=ApiError>> {
        self.api().delete_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Download Logs
    fn download_logs(&self, program_id: String, environment_id: String, service: String, name: String, date: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, accept: Option<String>) -> Box<dyn Future<Item=DownloadLogsResponse, Error=ApiError>> {
        self.api().download_logs(program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, accept, &self.context())
    }

    /// Get Environment
    fn get_environment(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetEnvironmentResponse, Error=ApiError>> {
        self.api().get_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Get Environment Logs
    fn get_environment_logs(&self, program_id: String, environment_id: String, days: i32, x_gw_ims_org_id: String, authorization: String, x_api_key: String, service: Option<&Vec<String>>, name: Option<&Vec<String>>) -> Box<dyn Future<Item=GetEnvironmentLogsResponse, Error=ApiError>> {
        self.api().get_environment_logs(program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, service, name, &self.context())
    }

    /// List Environments
    fn get_environments(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, _type: Option<String>) -> Box<dyn Future<Item=GetEnvironmentsResponse, Error=ApiError>> {
        self.api().get_environments(program_id, x_gw_ims_org_id, authorization, x_api_key, _type, &self.context())
    }

    /// Advance
    fn advance_pipeline_execution(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: object) -> Box<dyn Future<Item=AdvancePipelineExecutionResponse, Error=ApiError>> {
        self.api().advance_pipeline_execution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body, &self.context())
    }

    /// Cancel
    fn cancel_pipeline_execution_step(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: object) -> Box<dyn Future<Item=CancelPipelineExecutionStepResponse, Error=ApiError>> {
        self.api().cancel_pipeline_execution_step(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body, &self.context())
    }

    /// Get current pipeline execution
    fn get_current_execution(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetCurrentExecutionResponse, Error=ApiError>> {
        self.api().get_current_execution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Get pipeline execution
    fn get_execution(&self, program_id: String, pipeline_id: String, execution_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetExecutionResponse, Error=ApiError>> {
        self.api().get_execution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// List Executions
    fn get_executions(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, start: Option<String>, limit: Option<i32>) -> Box<dyn Future<Item=GetExecutionsResponse, Error=ApiError>> {
        self.api().get_executions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, start, limit, &self.context())
    }

    /// Get logs
    fn get_step_logs(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, file: Option<String>, accept: Option<String>) -> Box<dyn Future<Item=GetStepLogsResponse, Error=ApiError>> {
        self.api().get_step_logs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, file, accept, &self.context())
    }

    /// Start the pipeline
    fn start_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String) -> Box<dyn Future<Item=StartPipelineResponse, Error=ApiError>> {
        self.api().start_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, &self.context())
    }

    /// Get step metrics
    fn step_metric(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=StepMetricResponse, Error=ApiError>> {
        self.api().step_metric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Get step state
    fn step_state(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=StepStateResponse, Error=ApiError>> {
        self.api().step_state(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Delete a Pipeline
    fn delete_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=DeletePipelineResponse, Error=ApiError>> {
        self.api().delete_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Get Pipeline
    fn get_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetPipelineResponse, Error=ApiError>> {
        self.api().get_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// List Pipelines
    fn get_pipelines(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetPipelinesResponse, Error=ApiError>> {
        self.api().get_pipelines(program_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Patches Pipeline
    fn patch_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: models::Pipeline) -> Box<dyn Future<Item=PatchPipelineResponse, Error=ApiError>> {
        self.api().patch_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body, &self.context())
    }

    /// Delete Program
    fn delete_program(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=DeleteProgramResponse, Error=ApiError>> {
        self.api().delete_program(program_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Get Program
    fn get_program(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetProgramResponse, Error=ApiError>> {
        self.api().get_program(program_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Lists Programs
    fn get_programs(&self, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetProgramsResponse, Error=ApiError>> {
        self.api().get_programs(x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Lists Repositories
    fn get_repositories(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetRepositoriesResponse, Error=ApiError>> {
        self.api().get_repositories(program_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Get Repository
    fn get_repository(&self, program_id: String, repository_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetRepositoryResponse, Error=ApiError>> {
        self.api().get_repository(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// List User Environment Variables
    fn get_environment_variables(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String) -> Box<dyn Future<Item=GetEnvironmentVariablesResponse, Error=ApiError>> {
        self.api().get_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, &self.context())
    }

    /// Patch User Environment Variables
    fn patch_environment_variables(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: &Vec<models::Variable>) -> Box<dyn Future<Item=PatchEnvironmentVariablesResponse, Error=ApiError>> {
        self.api().patch_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body, &self.context())
    }

}

#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use self::client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

pub mod models;
