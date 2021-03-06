# pyaemcloudmanagerapi
This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen
For more information, please visit [http://shinesolutions.com](http://shinesolutions.com)

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install pyaemcloudmanagerapi
```
(you may need to run `pip` with root permission: `sudo pip install pyaemcloudmanagerapi`)

Then import the package:
```python
import pyaemcloudmanagerapi
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import pyaemcloudmanagerapi
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import pyaemcloudmanagerapi
from pyaemcloudmanagerapi.rest import ApiException
from pprint import pprint


# Defining host is optional and default to https://cloudmanager.adobe.io
configuration.host = "https://cloudmanager.adobe.io"
# Enter a context with an instance of the API client
with pyaemcloudmanagerapi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pyaemcloudmanagerapi.BranchesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
repository_id = 'repository_id_example' # str | Identifier of the repository
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # List Branches
        api_response = api_instance.get_branches(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling BranchesApi->get_branches: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://cloudmanager.adobe.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BranchesApi* | [**get_branches**](docs/BranchesApi.md#get_branches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches
*EnvironmentsApi* | [**delete_environment**](docs/EnvironmentsApi.md#delete_environment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
*EnvironmentsApi* | [**download_logs**](docs/EnvironmentsApi.md#download_logs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
*EnvironmentsApi* | [**get_environment**](docs/EnvironmentsApi.md#get_environment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
*EnvironmentsApi* | [**get_environment_logs**](docs/EnvironmentsApi.md#get_environment_logs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
*EnvironmentsApi* | [**get_environments**](docs/EnvironmentsApi.md#get_environments) | **GET** /api/program/{programId}/environments | List Environments
*PipelineExecutionApi* | [**advance_pipeline_execution**](docs/PipelineExecutionApi.md#advance_pipeline_execution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
*PipelineExecutionApi* | [**cancel_pipeline_execution_step**](docs/PipelineExecutionApi.md#cancel_pipeline_execution_step) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
*PipelineExecutionApi* | [**get_current_execution**](docs/PipelineExecutionApi.md#get_current_execution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
*PipelineExecutionApi* | [**get_execution**](docs/PipelineExecutionApi.md#get_execution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
*PipelineExecutionApi* | [**get_executions**](docs/PipelineExecutionApi.md#get_executions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
*PipelineExecutionApi* | [**get_step_logs**](docs/PipelineExecutionApi.md#get_step_logs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
*PipelineExecutionApi* | [**start_pipeline**](docs/PipelineExecutionApi.md#start_pipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
*PipelineExecutionApi* | [**step_metric**](docs/PipelineExecutionApi.md#step_metric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
*PipelineExecutionApi* | [**step_state**](docs/PipelineExecutionApi.md#step_state) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state
*PipelinesApi* | [**delete_pipeline**](docs/PipelinesApi.md#delete_pipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
*PipelinesApi* | [**get_pipeline**](docs/PipelinesApi.md#get_pipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
*PipelinesApi* | [**get_pipelines**](docs/PipelinesApi.md#get_pipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
*PipelinesApi* | [**patch_pipeline**](docs/PipelinesApi.md#patch_pipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
*ProgramsApi* | [**delete_program**](docs/ProgramsApi.md#delete_program) | **DELETE** /api/program/{programId} | Delete Program
*ProgramsApi* | [**get_program**](docs/ProgramsApi.md#get_program) | **GET** /api/program/{programId} | Get Program
*ProgramsApi* | [**get_programs**](docs/ProgramsApi.md#get_programs) | **GET** /api/programs | Lists Programs
*RepositoriesApi* | [**get_repositories**](docs/RepositoriesApi.md#get_repositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
*RepositoriesApi* | [**get_repository**](docs/RepositoriesApi.md#get_repository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository
*VariablesApi* | [**get_environment_variables**](docs/VariablesApi.md#get_environment_variables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
*VariablesApi* | [**patch_environment_variables**](docs/VariablesApi.md#patch_environment_variables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


## Documentation For Models

 - [BadRequestError](docs/BadRequestError.md)
 - [BranchList](docs/BranchList.md)
 - [BranchListEmbedded](docs/BranchListEmbedded.md)
 - [EmbeddedProgram](docs/EmbeddedProgram.md)
 - [Environment](docs/Environment.md)
 - [EnvironmentLinks](docs/EnvironmentLinks.md)
 - [EnvironmentList](docs/EnvironmentList.md)
 - [EnvironmentListEmbedded](docs/EnvironmentListEmbedded.md)
 - [EnvironmentLog](docs/EnvironmentLog.md)
 - [EnvironmentLogLinks](docs/EnvironmentLogLinks.md)
 - [EnvironmentLogs](docs/EnvironmentLogs.md)
 - [EnvironmentLogsEmbedded](docs/EnvironmentLogsEmbedded.md)
 - [EnvironmentLogsLinks](docs/EnvironmentLogsLinks.md)
 - [HalLink](docs/HalLink.md)
 - [InvalidParameter](docs/InvalidParameter.md)
 - [Metric](docs/Metric.md)
 - [MissingParameter](docs/MissingParameter.md)
 - [Pipeline](docs/Pipeline.md)
 - [PipelineExecution](docs/PipelineExecution.md)
 - [PipelineExecutionEmbedded](docs/PipelineExecutionEmbedded.md)
 - [PipelineExecutionLinks](docs/PipelineExecutionLinks.md)
 - [PipelineExecutionListRepresentation](docs/PipelineExecutionListRepresentation.md)
 - [PipelineExecutionListRepresentationEmbedded](docs/PipelineExecutionListRepresentationEmbedded.md)
 - [PipelineExecutionListRepresentationLinks](docs/PipelineExecutionListRepresentationLinks.md)
 - [PipelineExecutionStepState](docs/PipelineExecutionStepState.md)
 - [PipelineExecutionStepStateLinks](docs/PipelineExecutionStepStateLinks.md)
 - [PipelineLinks](docs/PipelineLinks.md)
 - [PipelineList](docs/PipelineList.md)
 - [PipelineListEmbedded](docs/PipelineListEmbedded.md)
 - [PipelinePhase](docs/PipelinePhase.md)
 - [PipelineStepMetrics](docs/PipelineStepMetrics.md)
 - [Program](docs/Program.md)
 - [ProgramLinks](docs/ProgramLinks.md)
 - [ProgramList](docs/ProgramList.md)
 - [ProgramListEmbedded](docs/ProgramListEmbedded.md)
 - [ProgramListLinks](docs/ProgramListLinks.md)
 - [Repository](docs/Repository.md)
 - [RepositoryBranch](docs/RepositoryBranch.md)
 - [RepositoryBranchLinks](docs/RepositoryBranchLinks.md)
 - [RepositoryLinks](docs/RepositoryLinks.md)
 - [RepositoryList](docs/RepositoryList.md)
 - [RepositoryListEmbedded](docs/RepositoryListEmbedded.md)
 - [RequestedPageDetails](docs/RequestedPageDetails.md)
 - [Variable](docs/Variable.md)
 - [VariableList](docs/VariableList.md)
 - [VariableListEmbedded](docs/VariableListEmbedded.md)
 - [VariableListLinks](docs/VariableListLinks.md)


## Documentation For Authorization

 All endpoints do not require authorization.

## Author

opensource@shinesolutions.com
