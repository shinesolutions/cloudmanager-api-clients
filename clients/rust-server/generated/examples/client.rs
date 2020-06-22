#![allow(missing_docs, unused_variables, trivial_casts)]

extern crate openapi_client;
#[allow(unused_extern_crates)]
extern crate futures;
#[allow(unused_extern_crates)]
#[macro_use]
extern crate swagger;
#[allow(unused_extern_crates)]
extern crate clap;
extern crate tokio_core;
extern crate uuid;

use swagger::{ContextBuilder, EmptyContext, XSpanIdString, Has, Push, AuthData};

#[allow(unused_imports)]
use futures::{Future, future, Stream, stream};
use tokio_core::reactor;
#[allow(unused_imports)]
use openapi_client::{ApiNoContext, ContextWrapperExt,
                      ApiError,
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
use clap::{App, Arg};

fn main() {
    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
    "GetBranches",
    "DeleteEnvironment",
    "DownloadLogs",
    "GetEnvironment",
    "GetEnvironmentLogs",
    "GetEnvironments",
    "AdvancePipelineExecution",
    "CancelPipelineExecutionStep",
    "GetCurrentExecution",
    "GetExecution",
    "GetExecutions",
    "GetStepLogs",
    "StartPipeline",
    "StepMetric",
    "StepState",
    "DeletePipeline",
    "GetPipeline",
    "GetPipelines",
    "DeleteProgram",
    "GetProgram",
    "GetPrograms",
    "GetRepositories",
    "GetRepository",
    "GetEnvironmentVariables",
    "PatchEnvironmentVariables",
])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("cloudmanager.adobe.io")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("80")
            .help("Port to contact"))
        .get_matches();

    let mut core = reactor::Core::new().unwrap();
    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());
    let client = if matches.is_present("https") {
        // Using Simple HTTPS
        openapi_client::Client::try_new_https(core.handle(), &base_url, "examples/ca.pem")
            .expect("Failed to create HTTPS client")
    } else {
        // Using HTTP
        openapi_client::Client::try_new_http(core.handle(), &base_url)
            .expect("Failed to create HTTP client")
    };

    let context: make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString) =
        make_context!(ContextBuilder, EmptyContext, None as Option<AuthData>, XSpanIdString(self::uuid::Uuid::new_v4().to_string()));
    let client = client.with_context(context);

    match matches.value_of("operation") {

        Some("GetBranches") => {
            let result = core.run(client.get_branches("program_id_example".to_string(), "repository_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("DeleteEnvironment") => {
            let result = core.run(client.delete_environment("program_id_example".to_string(), "environment_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("DownloadLogs") => {
            let result = core.run(client.download_logs("program_id_example".to_string(), "environment_id_example".to_string(), "service_example".to_string(), "name_example".to_string(), "date_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), Some("accept_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetEnvironment") => {
            let result = core.run(client.get_environment("program_id_example".to_string(), "environment_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetEnvironmentLogs") => {
            let result = core.run(client.get_environment_logs("program_id_example".to_string(), "environment_id_example".to_string(), 56, "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetEnvironments") => {
            let result = core.run(client.get_environments("program_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), Some("_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("AdvancePipelineExecution") => {
            let result = core.run(client.advance_pipeline_execution("program_id_example".to_string(), "pipeline_id_example".to_string(), "execution_id_example".to_string(), "phase_id_example".to_string(), "step_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), "content_type_example".to_string(), Object));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("CancelPipelineExecutionStep") => {
            let result = core.run(client.cancel_pipeline_execution_step("program_id_example".to_string(), "pipeline_id_example".to_string(), "execution_id_example".to_string(), "phase_id_example".to_string(), "step_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), "content_type_example".to_string(), Object));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetCurrentExecution") => {
            let result = core.run(client.get_current_execution("program_id_example".to_string(), "pipeline_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetExecution") => {
            let result = core.run(client.get_execution("program_id_example".to_string(), "pipeline_id_example".to_string(), "execution_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetExecutions") => {
            let result = core.run(client.get_executions("program_id_example".to_string(), "pipeline_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), Some("start_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetStepLogs") => {
            let result = core.run(client.get_step_logs("program_id_example".to_string(), "pipeline_id_example".to_string(), "execution_id_example".to_string(), "phase_id_example".to_string(), "step_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), Some("file_example".to_string()), Some("accept_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("StartPipeline") => {
            let result = core.run(client.start_pipeline("program_id_example".to_string(), "pipeline_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), "content_type_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("StepMetric") => {
            let result = core.run(client.step_metric("program_id_example".to_string(), "pipeline_id_example".to_string(), "execution_id_example".to_string(), "phase_id_example".to_string(), "step_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("StepState") => {
            let result = core.run(client.step_state("program_id_example".to_string(), "pipeline_id_example".to_string(), "execution_id_example".to_string(), "phase_id_example".to_string(), "step_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("DeletePipeline") => {
            let result = core.run(client.delete_pipeline("program_id_example".to_string(), "pipeline_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetPipeline") => {
            let result = core.run(client.get_pipeline("program_id_example".to_string(), "pipeline_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetPipelines") => {
            let result = core.run(client.get_pipelines("program_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("PatchPipeline") => {
        //     let result = core.run(client.patch_pipeline("program_id_example".to_string(), "pipeline_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), "content_type_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        //  },

        Some("DeleteProgram") => {
            let result = core.run(client.delete_program("program_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetProgram") => {
            let result = core.run(client.get_program("program_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetPrograms") => {
            let result = core.run(client.get_programs("x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetRepositories") => {
            let result = core.run(client.get_repositories("program_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetRepository") => {
            let result = core.run(client.get_repository("program_id_example".to_string(), "repository_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("GetEnvironmentVariables") => {
            let result = core.run(client.get_environment_variables("2351".to_string(), "128".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        Some("PatchEnvironmentVariables") => {
            let result = core.run(client.patch_environment_variables("program_id_example".to_string(), "environment_id_example".to_string(), "x_gw_ims_org_id_example".to_string(), "authorization_example".to_string(), "x_api_key_example".to_string(), "content_type_example".to_string(), &Vec::new()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
         },

        _ => {
            panic!("Invalid operation provided")
        }
    }
}

