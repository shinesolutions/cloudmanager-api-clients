# org.openapitools.client - Kotlin client library for Cloud Manager API

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://cloudmanager.adobe.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BranchesApi* | [**getBranches**](docs/BranchesApi.md#getbranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches
*EnvironmentsApi* | [**deleteEnvironment**](docs/EnvironmentsApi.md#deleteenvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
*EnvironmentsApi* | [**downloadLogs**](docs/EnvironmentsApi.md#downloadlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
*EnvironmentsApi* | [**getEnvironment**](docs/EnvironmentsApi.md#getenvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
*EnvironmentsApi* | [**getEnvironmentLogs**](docs/EnvironmentsApi.md#getenvironmentlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
*EnvironmentsApi* | [**getEnvironments**](docs/EnvironmentsApi.md#getenvironments) | **GET** /api/program/{programId}/environments | List Environments
*PipelineExecutionApi* | [**advancePipelineExecution**](docs/PipelineExecutionApi.md#advancepipelineexecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
*PipelineExecutionApi* | [**cancelPipelineExecutionStep**](docs/PipelineExecutionApi.md#cancelpipelineexecutionstep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
*PipelineExecutionApi* | [**getCurrentExecution**](docs/PipelineExecutionApi.md#getcurrentexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
*PipelineExecutionApi* | [**getExecution**](docs/PipelineExecutionApi.md#getexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
*PipelineExecutionApi* | [**getExecutions**](docs/PipelineExecutionApi.md#getexecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
*PipelineExecutionApi* | [**getStepLogs**](docs/PipelineExecutionApi.md#getsteplogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
*PipelineExecutionApi* | [**startPipeline**](docs/PipelineExecutionApi.md#startpipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
*PipelineExecutionApi* | [**stepMetric**](docs/PipelineExecutionApi.md#stepmetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
*PipelineExecutionApi* | [**stepState**](docs/PipelineExecutionApi.md#stepstate) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state
*PipelinesApi* | [**deletePipeline**](docs/PipelinesApi.md#deletepipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
*PipelinesApi* | [**getPipeline**](docs/PipelinesApi.md#getpipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
*PipelinesApi* | [**getPipelines**](docs/PipelinesApi.md#getpipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
*PipelinesApi* | [**patchPipeline**](docs/PipelinesApi.md#patchpipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
*ProgramsApi* | [**deleteProgram**](docs/ProgramsApi.md#deleteprogram) | **DELETE** /api/program/{programId} | Delete Program
*ProgramsApi* | [**getProgram**](docs/ProgramsApi.md#getprogram) | **GET** /api/program/{programId} | Get Program
*ProgramsApi* | [**getPrograms**](docs/ProgramsApi.md#getprograms) | **GET** /api/programs | Lists Programs
*RepositoriesApi* | [**getRepositories**](docs/RepositoriesApi.md#getrepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
*RepositoriesApi* | [**getRepository**](docs/RepositoriesApi.md#getrepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository
*VariablesApi* | [**getEnvironmentVariables**](docs/VariablesApi.md#getenvironmentvariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
*VariablesApi* | [**patchEnvironmentVariables**](docs/VariablesApi.md#patchenvironmentvariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.BadRequestError](docs/BadRequestError.md)
 - [org.openapitools.client.models.BranchList](docs/BranchList.md)
 - [org.openapitools.client.models.BranchListEmbedded](docs/BranchListEmbedded.md)
 - [org.openapitools.client.models.EmbeddedProgram](docs/EmbeddedProgram.md)
 - [org.openapitools.client.models.Environment](docs/Environment.md)
 - [org.openapitools.client.models.EnvironmentLinks](docs/EnvironmentLinks.md)
 - [org.openapitools.client.models.EnvironmentList](docs/EnvironmentList.md)
 - [org.openapitools.client.models.EnvironmentListEmbedded](docs/EnvironmentListEmbedded.md)
 - [org.openapitools.client.models.EnvironmentLog](docs/EnvironmentLog.md)
 - [org.openapitools.client.models.EnvironmentLogLinks](docs/EnvironmentLogLinks.md)
 - [org.openapitools.client.models.EnvironmentLogs](docs/EnvironmentLogs.md)
 - [org.openapitools.client.models.EnvironmentLogsEmbedded](docs/EnvironmentLogsEmbedded.md)
 - [org.openapitools.client.models.EnvironmentLogsLinks](docs/EnvironmentLogsLinks.md)
 - [org.openapitools.client.models.HalLink](docs/HalLink.md)
 - [org.openapitools.client.models.InvalidParameter](docs/InvalidParameter.md)
 - [org.openapitools.client.models.Metric](docs/Metric.md)
 - [org.openapitools.client.models.MissingParameter](docs/MissingParameter.md)
 - [org.openapitools.client.models.Pipeline](docs/Pipeline.md)
 - [org.openapitools.client.models.PipelineExecution](docs/PipelineExecution.md)
 - [org.openapitools.client.models.PipelineExecutionEmbedded](docs/PipelineExecutionEmbedded.md)
 - [org.openapitools.client.models.PipelineExecutionLinks](docs/PipelineExecutionLinks.md)
 - [org.openapitools.client.models.PipelineExecutionListRepresentation](docs/PipelineExecutionListRepresentation.md)
 - [org.openapitools.client.models.PipelineExecutionListRepresentationEmbedded](docs/PipelineExecutionListRepresentationEmbedded.md)
 - [org.openapitools.client.models.PipelineExecutionListRepresentationLinks](docs/PipelineExecutionListRepresentationLinks.md)
 - [org.openapitools.client.models.PipelineExecutionStepState](docs/PipelineExecutionStepState.md)
 - [org.openapitools.client.models.PipelineExecutionStepStateLinks](docs/PipelineExecutionStepStateLinks.md)
 - [org.openapitools.client.models.PipelineLinks](docs/PipelineLinks.md)
 - [org.openapitools.client.models.PipelineList](docs/PipelineList.md)
 - [org.openapitools.client.models.PipelineListEmbedded](docs/PipelineListEmbedded.md)
 - [org.openapitools.client.models.PipelinePhase](docs/PipelinePhase.md)
 - [org.openapitools.client.models.PipelineStepMetrics](docs/PipelineStepMetrics.md)
 - [org.openapitools.client.models.Program](docs/Program.md)
 - [org.openapitools.client.models.ProgramLinks](docs/ProgramLinks.md)
 - [org.openapitools.client.models.ProgramList](docs/ProgramList.md)
 - [org.openapitools.client.models.ProgramListEmbedded](docs/ProgramListEmbedded.md)
 - [org.openapitools.client.models.ProgramListLinks](docs/ProgramListLinks.md)
 - [org.openapitools.client.models.Repository](docs/Repository.md)
 - [org.openapitools.client.models.RepositoryBranch](docs/RepositoryBranch.md)
 - [org.openapitools.client.models.RepositoryBranchLinks](docs/RepositoryBranchLinks.md)
 - [org.openapitools.client.models.RepositoryLinks](docs/RepositoryLinks.md)
 - [org.openapitools.client.models.RepositoryList](docs/RepositoryList.md)
 - [org.openapitools.client.models.RepositoryListEmbedded](docs/RepositoryListEmbedded.md)
 - [org.openapitools.client.models.RequestedPageDetails](docs/RequestedPageDetails.md)
 - [org.openapitools.client.models.Variable](docs/Variable.md)
 - [org.openapitools.client.models.VariableList](docs/VariableList.md)
 - [org.openapitools.client.models.VariableListEmbedded](docs/VariableListEmbedded.md)
 - [org.openapitools.client.models.VariableListLinks](docs/VariableListLinks.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
