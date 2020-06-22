use hyper;
use serde;
use serde_json;

#[derive(Debug)]
pub enum Error<T> {
    UriError(hyper::error::UriError),
    Hyper(hyper::Error),
    Serde(serde_json::Error),
    ApiError(ApiError<T>),
}

#[derive(Debug)]
pub struct ApiError<T> {
    pub code: hyper::StatusCode,
    pub content: Option<T>,
}

impl<'de, T> From<(hyper::StatusCode, &'de [u8])> for Error<T> 
    where T: serde::Deserialize<'de> {
    fn from(e: (hyper::StatusCode, &'de [u8])) -> Self {
        if e.1.len() == 0 {
            return Error::ApiError(ApiError{
                code: e.0,
                content: None,
            });
        }
        match serde_json::from_slice::<T>(e.1) {
            Ok(t) => Error::ApiError(ApiError{
                code: e.0,
                content: Some(t),
            }),
            Err(e) => {
                Error::from(e)
            }
        }
    }
}

impl<T> From<hyper::Error> for Error<T> {
    fn from(e: hyper::Error) -> Self {
        return Error::Hyper(e)
    }
}

impl<T> From<serde_json::Error> for Error<T> {
    fn from(e: serde_json::Error) -> Self {
        return Error::Serde(e)
    }
}

mod request;

mod branches_api;
pub use self::branches_api::{ BranchesApi, BranchesApiClient };
mod environments_api;
pub use self::environments_api::{ EnvironmentsApi, EnvironmentsApiClient };
mod pipeline_execution_api;
pub use self::pipeline_execution_api::{ PipelineExecutionApi, PipelineExecutionApiClient };
mod pipelines_api;
pub use self::pipelines_api::{ PipelinesApi, PipelinesApiClient };
mod programs_api;
pub use self::programs_api::{ ProgramsApi, ProgramsApiClient };
mod repositories_api;
pub use self::repositories_api::{ RepositoriesApi, RepositoriesApiClient };
mod variables_api;
pub use self::variables_api::{ VariablesApi, VariablesApiClient };

pub mod configuration;
pub mod client;
