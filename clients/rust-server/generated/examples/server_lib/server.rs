//! Server implementation of openapi_client.

#![allow(unused_imports)]

use futures::{self, Future};
use chrono;
use std::collections::HashMap;
use std::marker::PhantomData;
use swagger;
use swagger::{Has, XSpanIdString};

use openapi_client::{Api, ApiError,
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
use openapi_client::models;

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Api<C> for Server<C> where C: Has<XSpanIdString>{

    /// List Branches
    fn get_branches(&self, program_id: String, repository_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetBranchesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_branches(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// DeleteEnvironment
    fn delete_environment(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=DeleteEnvironmentResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_environment(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Download Logs
    fn download_logs(&self, program_id: String, environment_id: String, service: String, name: String, date: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, accept: Option<String>, context: &C) -> Box<dyn Future<Item=DownloadLogsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("download_logs(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, accept, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get Environment
    fn get_environment(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetEnvironmentResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_environment(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get Environment Logs
    fn get_environment_logs(&self, program_id: String, environment_id: String, days: i32, x_gw_ims_org_id: String, authorization: String, x_api_key: String, service: Option<&Vec<String>>, name: Option<&Vec<String>>, context: &C) -> Box<dyn Future<Item=GetEnvironmentLogsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_environment_logs(\"{}\", \"{}\", {}, \"{}\", \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, service, name, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// List Environments
    fn get_environments(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, _type: Option<String>, context: &C) -> Box<dyn Future<Item=GetEnvironmentsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_environments(\"{}\", \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", program_id, x_gw_ims_org_id, authorization, x_api_key, _type, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Advance
    fn advance_pipeline_execution(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: object, context: &C) -> Box<dyn Future<Item=AdvancePipelineExecutionResponse, Error=ApiError>> {
        let context = context.clone();
        println!("advance_pipeline_execution(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {}) - X-Span-ID: {:?}", program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Cancel
    fn cancel_pipeline_execution_step(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: object, context: &C) -> Box<dyn Future<Item=CancelPipelineExecutionStepResponse, Error=ApiError>> {
        let context = context.clone();
        println!("cancel_pipeline_execution_step(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {}) - X-Span-ID: {:?}", program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get current pipeline execution
    fn get_current_execution(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetCurrentExecutionResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_current_execution(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get pipeline execution
    fn get_execution(&self, program_id: String, pipeline_id: String, execution_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetExecutionResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_execution(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// List Executions
    fn get_executions(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, start: Option<String>, limit: Option<i32>, context: &C) -> Box<dyn Future<Item=GetExecutionsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_executions(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, start, limit, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get logs
    fn get_step_logs(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, file: Option<String>, accept: Option<String>, context: &C) -> Box<dyn Future<Item=GetStepLogsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_step_logs(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, file, accept, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Start the pipeline
    fn start_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, context: &C) -> Box<dyn Future<Item=StartPipelineResponse, Error=ApiError>> {
        let context = context.clone();
        println!("start_pipeline(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get step metrics
    fn step_metric(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=StepMetricResponse, Error=ApiError>> {
        let context = context.clone();
        println!("step_metric(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get step state
    fn step_state(&self, program_id: String, pipeline_id: String, execution_id: String, phase_id: String, step_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=StepStateResponse, Error=ApiError>> {
        let context = context.clone();
        println!("step_state(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Delete a Pipeline
    fn delete_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=DeletePipelineResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_pipeline(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get Pipeline
    fn get_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetPipelineResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_pipeline(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// List Pipelines
    fn get_pipelines(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetPipelinesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_pipelines(\"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Patches Pipeline
    fn patch_pipeline(&self, program_id: String, pipeline_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: models::Pipeline, context: &C) -> Box<dyn Future<Item=PatchPipelineResponse, Error=ApiError>> {
        let context = context.clone();
        println!("patch_pipeline(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Delete Program
    fn delete_program(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=DeleteProgramResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_program(\"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get Program
    fn get_program(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetProgramResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_program(\"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Lists Programs
    fn get_programs(&self, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetProgramsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_programs(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Lists Repositories
    fn get_repositories(&self, program_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetRepositoriesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_repositories(\"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Get Repository
    fn get_repository(&self, program_id: String, repository_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetRepositoryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_repository(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// List User Environment Variables
    fn get_environment_variables(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, context: &C) -> Box<dyn Future<Item=GetEnvironmentVariablesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_environment_variables(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Patch User Environment Variables
    fn patch_environment_variables(&self, program_id: String, environment_id: String, x_gw_ims_org_id: String, authorization: String, x_api_key: String, content_type: String, body: &Vec<models::Variable>, context: &C) -> Box<dyn Future<Item=PatchEnvironmentVariablesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("patch_environment_variables(\"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

}
