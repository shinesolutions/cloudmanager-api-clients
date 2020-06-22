# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.BranchesApi;

public class BranchesApiExample {

    public static void main(String[] args) {
        BranchesApi apiInstance = new BranchesApi();
        String programId = null; // String | Identifier of the program.
        String repositoryId = null; // String | Identifier of the repository
        String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
        String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
        String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
        try {
            BranchList result = apiInstance.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchesApi#getBranches");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cloudmanager.adobe.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BranchesApi* | [**getBranches**](docs/BranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches
*EnvironmentsApi* | [**deleteEnvironment**](docs/EnvironmentsApi.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
*EnvironmentsApi* | [**downloadLogs**](docs/EnvironmentsApi.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
*EnvironmentsApi* | [**getEnvironment**](docs/EnvironmentsApi.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
*EnvironmentsApi* | [**getEnvironmentLogs**](docs/EnvironmentsApi.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
*EnvironmentsApi* | [**getEnvironments**](docs/EnvironmentsApi.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments
*PipelineExecutionApi* | [**advancePipelineExecution**](docs/PipelineExecutionApi.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
*PipelineExecutionApi* | [**cancelPipelineExecutionStep**](docs/PipelineExecutionApi.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
*PipelineExecutionApi* | [**getCurrentExecution**](docs/PipelineExecutionApi.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
*PipelineExecutionApi* | [**getExecution**](docs/PipelineExecutionApi.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
*PipelineExecutionApi* | [**getExecutions**](docs/PipelineExecutionApi.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
*PipelineExecutionApi* | [**getStepLogs**](docs/PipelineExecutionApi.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
*PipelineExecutionApi* | [**startPipeline**](docs/PipelineExecutionApi.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
*PipelineExecutionApi* | [**stepMetric**](docs/PipelineExecutionApi.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
*PipelineExecutionApi* | [**stepState**](docs/PipelineExecutionApi.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state
*PipelinesApi* | [**deletePipeline**](docs/PipelinesApi.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
*PipelinesApi* | [**getPipeline**](docs/PipelinesApi.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
*PipelinesApi* | [**getPipelines**](docs/PipelinesApi.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
*PipelinesApi* | [**patchPipeline**](docs/PipelinesApi.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
*ProgramsApi* | [**deleteProgram**](docs/ProgramsApi.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
*ProgramsApi* | [**getProgram**](docs/ProgramsApi.md#getProgram) | **GET** /api/program/{programId} | Get Program
*ProgramsApi* | [**getPrograms**](docs/ProgramsApi.md#getPrograms) | **GET** /api/programs | Lists Programs
*RepositoriesApi* | [**getRepositories**](docs/RepositoriesApi.md#getRepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
*RepositoriesApi* | [**getRepository**](docs/RepositoriesApi.md#getRepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository
*VariablesApi* | [**getEnvironmentVariables**](docs/VariablesApi.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
*VariablesApi* | [**patchEnvironmentVariables**](docs/VariablesApi.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


## Documentation for Models

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


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

opensource@shinesolutions.com

