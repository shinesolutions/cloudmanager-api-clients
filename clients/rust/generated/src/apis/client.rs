use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient {
    branches_api: Box<dyn crate::apis::BranchesApi>,
    environments_api: Box<dyn crate::apis::EnvironmentsApi>,
    pipeline_execution_api: Box<dyn crate::apis::PipelineExecutionApi>,
    pipelines_api: Box<dyn crate::apis::PipelinesApi>,
    programs_api: Box<dyn crate::apis::ProgramsApi>,
    repositories_api: Box<dyn crate::apis::RepositoriesApi>,
    variables_api: Box<dyn crate::apis::VariablesApi>,
}

impl APIClient {
    pub fn new<C: hyper::client::Connect>(configuration: Configuration<C>) -> APIClient {
        let rc = Rc::new(configuration);

        APIClient {
            branches_api: Box::new(crate::apis::BranchesApiClient::new(rc.clone())),
            environments_api: Box::new(crate::apis::EnvironmentsApiClient::new(rc.clone())),
            pipeline_execution_api: Box::new(crate::apis::PipelineExecutionApiClient::new(rc.clone())),
            pipelines_api: Box::new(crate::apis::PipelinesApiClient::new(rc.clone())),
            programs_api: Box::new(crate::apis::ProgramsApiClient::new(rc.clone())),
            repositories_api: Box::new(crate::apis::RepositoriesApiClient::new(rc.clone())),
            variables_api: Box::new(crate::apis::VariablesApiClient::new(rc.clone())),
        }
    }

    pub fn branches_api(&self) -> &dyn crate::apis::BranchesApi{
        self.branches_api.as_ref()
    }

    pub fn environments_api(&self) -> &dyn crate::apis::EnvironmentsApi{
        self.environments_api.as_ref()
    }

    pub fn pipeline_execution_api(&self) -> &dyn crate::apis::PipelineExecutionApi{
        self.pipeline_execution_api.as_ref()
    }

    pub fn pipelines_api(&self) -> &dyn crate::apis::PipelinesApi{
        self.pipelines_api.as_ref()
    }

    pub fn programs_api(&self) -> &dyn crate::apis::ProgramsApi{
        self.programs_api.as_ref()
    }

    pub fn repositories_api(&self) -> &dyn crate::apis::RepositoriesApi{
        self.repositories_api.as_ref()
    }

    pub fn variables_api(&self) -> &dyn crate::apis::VariablesApi{
        self.variables_api.as_ref()
    }

}
