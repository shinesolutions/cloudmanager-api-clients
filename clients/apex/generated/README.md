# Cloud Manager API API Client


This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASBranchesApi api = new OASBranchesApi();

Map<String, Object> params = new Map<String, Object>{
    'programId' => 'null',
    'repositoryId' => 'null',
    'xGwImsOrgId' => 'null',
    'authorization' => 'null',
    'xApiKey' => 'null'
};

try {
    // cross your fingers
    OASBranchList result = api.getBranches(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://cloudmanager.adobe.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASBranchesApi* | [**getBranches**](OASBranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches
*OASEnvironmentsApi* | [**deleteEnvironment**](OASEnvironmentsApi.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
*OASEnvironmentsApi* | [**downloadLogs**](OASEnvironmentsApi.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
*OASEnvironmentsApi* | [**getEnvironment**](OASEnvironmentsApi.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
*OASEnvironmentsApi* | [**getEnvironmentLogs**](OASEnvironmentsApi.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
*OASEnvironmentsApi* | [**getEnvironments**](OASEnvironmentsApi.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments
*OASPipelineExecutionApi* | [**advancePipelineExecution**](OASPipelineExecutionApi.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
*OASPipelineExecutionApi* | [**cancelPipelineExecutionStep**](OASPipelineExecutionApi.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
*OASPipelineExecutionApi* | [**getCurrentExecution**](OASPipelineExecutionApi.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
*OASPipelineExecutionApi* | [**getExecution**](OASPipelineExecutionApi.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
*OASPipelineExecutionApi* | [**getExecutions**](OASPipelineExecutionApi.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
*OASPipelineExecutionApi* | [**getStepLogs**](OASPipelineExecutionApi.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
*OASPipelineExecutionApi* | [**startPipeline**](OASPipelineExecutionApi.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
*OASPipelineExecutionApi* | [**stepMetric**](OASPipelineExecutionApi.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
*OASPipelineExecutionApi* | [**stepState**](OASPipelineExecutionApi.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state
*OASPipelinesApi* | [**deletePipeline**](OASPipelinesApi.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
*OASPipelinesApi* | [**getPipeline**](OASPipelinesApi.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
*OASPipelinesApi* | [**getPipelines**](OASPipelinesApi.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
*OASPipelinesApi* | [**patchPipeline**](OASPipelinesApi.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
*OASProgramsApi* | [**deleteProgram**](OASProgramsApi.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
*OASProgramsApi* | [**getProgram**](OASProgramsApi.md#getProgram) | **GET** /api/program/{programId} | Get Program
*OASProgramsApi* | [**getPrograms**](OASProgramsApi.md#getPrograms) | **GET** /api/programs | Lists Programs
*OASRepositoriesApi* | [**getRepositories**](OASRepositoriesApi.md#getRepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
*OASRepositoriesApi* | [**getRepository**](OASRepositoriesApi.md#getRepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository
*OASVariablesApi* | [**getEnvironmentVariables**](OASVariablesApi.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
*OASVariablesApi* | [**patchEnvironmentVariables**](OASVariablesApi.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


## Documentation for Models

 - [OASBadRequestError](OASBadRequestError.md)
 - [OASBranchList](OASBranchList.md)
 - [OASBranchListEmbedded](OASBranchListEmbedded.md)
 - [OASEmbeddedProgram](OASEmbeddedProgram.md)
 - [OASEnvironment](OASEnvironment.md)
 - [OASEnvironmentLinks](OASEnvironmentLinks.md)
 - [OASEnvironmentList](OASEnvironmentList.md)
 - [OASEnvironmentListEmbedded](OASEnvironmentListEmbedded.md)
 - [OASEnvironmentLog](OASEnvironmentLog.md)
 - [OASEnvironmentLogLinks](OASEnvironmentLogLinks.md)
 - [OASEnvironmentLogs](OASEnvironmentLogs.md)
 - [OASEnvironmentLogsEmbedded](OASEnvironmentLogsEmbedded.md)
 - [OASEnvironmentLogsLinks](OASEnvironmentLogsLinks.md)
 - [OASHalLink](OASHalLink.md)
 - [OASInvalidParameter](OASInvalidParameter.md)
 - [OASMetric](OASMetric.md)
 - [OASMissingParameter](OASMissingParameter.md)
 - [OASPipeline](OASPipeline.md)
 - [OASPipelineExecution](OASPipelineExecution.md)
 - [OASPipelineExecutionEmbedded](OASPipelineExecutionEmbedded.md)
 - [OASPipelineExecutionLinks](OASPipelineExecutionLinks.md)
 - [OASPipelineExecutionListRepresentati](OASPipelineExecutionListRepresentati.md)
 - [OASPipelineExecutionStepState](OASPipelineExecutionStepState.md)
 - [OASPipelineExecutionStepStateLinks](OASPipelineExecutionStepStateLinks.md)
 - [OASPipelineLinks](OASPipelineLinks.md)
 - [OASPipelineList](OASPipelineList.md)
 - [OASPipelineListEmbedded](OASPipelineListEmbedded.md)
 - [OASPipelinePhase](OASPipelinePhase.md)
 - [OASPipelineStepMetrics](OASPipelineStepMetrics.md)
 - [OASProgram](OASProgram.md)
 - [OASProgramLinks](OASProgramLinks.md)
 - [OASProgramList](OASProgramList.md)
 - [OASProgramListEmbedded](OASProgramListEmbedded.md)
 - [OASProgramListLinks](OASProgramListLinks.md)
 - [OASRepository](OASRepository.md)
 - [OASRepositoryBranch](OASRepositoryBranch.md)
 - [OASRepositoryBranchLinks](OASRepositoryBranchLinks.md)
 - [OASRepositoryLinks](OASRepositoryLinks.md)
 - [OASRepositoryList](OASRepositoryList.md)
 - [OASRepositoryListEmbedded](OASRepositoryListEmbedded.md)
 - [OASRequestedPageDetails](OASRequestedPageDetails.md)
 - [OASVariable](OASVariable.md)
 - [OASVariableList](OASVariableList.md)
 - [OASVariableListEmbedded](OASVariableListEmbedded.md)
 - [OASVariableListLinks](OASVariableListLinks.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Author

opensource@shinesolutions.com

