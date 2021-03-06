# OpenAPIClient

This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

This ObjC package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 
- Build package: org.openapitools.codegen.languages.ObjcClientCodegen
For more information, please visit [http://shinesolutions.com](http://shinesolutions.com)

## Requirements

The SDK requires [**ARC (Automatic Reference Counting)**](http://stackoverflow.com/questions/7778356/how-to-enable-disable-automatic-reference-counting) to be enabled in the Xcode project.

## Installation & Usage
### Install from Github using [CocoaPods](https://cocoapods.org/)

Add the following to the Podfile:

```ruby
pod 'OpenAPIClient', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'
```

To specify a particular branch, append `, :branch => 'branch-name-here'`

To specify a particular commit, append `, :commit => '11aa22'`

### Install from local path using [CocoaPods](https://cocoapods.org/)

Put the SDK under your project folder (e.g. /path/to/objc_project/Vendor/OpenAPIClient) and then add the following to the Podfile:

```ruby
pod 'OpenAPIClient', :path => 'Vendor/OpenAPIClient'
```

### Usage

Import the following:

```objc
#import <OpenAPIClient/OAIApiClient.h>
#import <OpenAPIClient/OAIDefaultConfiguration.h>
// load models
#import <OpenAPIClient/OAIBadRequestError.h>
#import <OpenAPIClient/OAIBranchList.h>
#import <OpenAPIClient/OAIBranchListEmbedded.h>
#import <OpenAPIClient/OAIEmbeddedProgram.h>
#import <OpenAPIClient/OAIEnvironment.h>
#import <OpenAPIClient/OAIEnvironmentLinks.h>
#import <OpenAPIClient/OAIEnvironmentList.h>
#import <OpenAPIClient/OAIEnvironmentListEmbedded.h>
#import <OpenAPIClient/OAIEnvironmentLog.h>
#import <OpenAPIClient/OAIEnvironmentLogLinks.h>
#import <OpenAPIClient/OAIEnvironmentLogs.h>
#import <OpenAPIClient/OAIEnvironmentLogsEmbedded.h>
#import <OpenAPIClient/OAIEnvironmentLogsLinks.h>
#import <OpenAPIClient/OAIHalLink.h>
#import <OpenAPIClient/OAIInvalidParameter.h>
#import <OpenAPIClient/OAIMetric.h>
#import <OpenAPIClient/OAIMissingParameter.h>
#import <OpenAPIClient/OAIPipeline.h>
#import <OpenAPIClient/OAIPipelineExecution.h>
#import <OpenAPIClient/OAIPipelineExecutionEmbedded.h>
#import <OpenAPIClient/OAIPipelineExecutionLinks.h>
#import <OpenAPIClient/OAIPipelineExecutionListRepresentation.h>
#import <OpenAPIClient/OAIPipelineExecutionListRepresentationEmbedded.h>
#import <OpenAPIClient/OAIPipelineExecutionListRepresentationLinks.h>
#import <OpenAPIClient/OAIPipelineExecutionStepState.h>
#import <OpenAPIClient/OAIPipelineExecutionStepStateLinks.h>
#import <OpenAPIClient/OAIPipelineLinks.h>
#import <OpenAPIClient/OAIPipelineList.h>
#import <OpenAPIClient/OAIPipelineListEmbedded.h>
#import <OpenAPIClient/OAIPipelinePhase.h>
#import <OpenAPIClient/OAIPipelineStepMetrics.h>
#import <OpenAPIClient/OAIProgram.h>
#import <OpenAPIClient/OAIProgramLinks.h>
#import <OpenAPIClient/OAIProgramList.h>
#import <OpenAPIClient/OAIProgramListEmbedded.h>
#import <OpenAPIClient/OAIProgramListLinks.h>
#import <OpenAPIClient/OAIRepository.h>
#import <OpenAPIClient/OAIRepositoryBranch.h>
#import <OpenAPIClient/OAIRepositoryBranchLinks.h>
#import <OpenAPIClient/OAIRepositoryLinks.h>
#import <OpenAPIClient/OAIRepositoryList.h>
#import <OpenAPIClient/OAIRepositoryListEmbedded.h>
#import <OpenAPIClient/OAIRequestedPageDetails.h>
#import <OpenAPIClient/OAIVariable.h>
#import <OpenAPIClient/OAIVariableList.h>
#import <OpenAPIClient/OAIVariableListEmbedded.h>
#import <OpenAPIClient/OAIVariableListLinks.h>
// load API classes for accessing endpoints
#import <OpenAPIClient/OAIBranchesApi.h>
#import <OpenAPIClient/OAIEnvironmentsApi.h>
#import <OpenAPIClient/OAIPipelineExecutionApi.h>
#import <OpenAPIClient/OAIPipelinesApi.h>
#import <OpenAPIClient/OAIProgramsApi.h>
#import <OpenAPIClient/OAIRepositoriesApi.h>
#import <OpenAPIClient/OAIVariablesApi.h>

```

## Recommendation

It's recommended to create an instance of ApiClient per thread in a multi-threaded environment to avoid any potential issues.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```objc


NSString* *programId = @"programId_example"; // Identifier of the program.
NSString* *repositoryId = @"repositoryId_example"; // Identifier of the repository
NSString* *xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* *authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* *xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIBranchesApi *apiInstance = [[OAIBranchesApi alloc] init];

// List Branches
[apiInstance getBranchesWithProgramId:programId
    repositoryId:repositoryId
    xGwImsOrgId:xGwImsOrgId
    authorization:authorization
    xApiKey:xApiKey
              completionHandler: ^(OAIBranchList* output, NSError* error) {
                            if (output) {
                                NSLog(@"%@", output);
                            }
                            if (error) {
                                NSLog(@"Error: %@", error);
                            }
                        }];

```

## Documentation for API Endpoints

All URIs are relative to *https://cloudmanager.adobe.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OAIBranchesApi* | [**getBranches**](docs/OAIBranchesApi.md#getbranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches
*OAIEnvironmentsApi* | [**deleteEnvironment**](docs/OAIEnvironmentsApi.md#deleteenvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
*OAIEnvironmentsApi* | [**downloadLogs**](docs/OAIEnvironmentsApi.md#downloadlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
*OAIEnvironmentsApi* | [**getEnvironment**](docs/OAIEnvironmentsApi.md#getenvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
*OAIEnvironmentsApi* | [**getEnvironmentLogs**](docs/OAIEnvironmentsApi.md#getenvironmentlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
*OAIEnvironmentsApi* | [**getEnvironments**](docs/OAIEnvironmentsApi.md#getenvironments) | **GET** /api/program/{programId}/environments | List Environments
*OAIPipelineExecutionApi* | [**advancePipelineExecution**](docs/OAIPipelineExecutionApi.md#advancepipelineexecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
*OAIPipelineExecutionApi* | [**cancelPipelineExecutionStep**](docs/OAIPipelineExecutionApi.md#cancelpipelineexecutionstep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
*OAIPipelineExecutionApi* | [**getCurrentExecution**](docs/OAIPipelineExecutionApi.md#getcurrentexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
*OAIPipelineExecutionApi* | [**getExecution**](docs/OAIPipelineExecutionApi.md#getexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
*OAIPipelineExecutionApi* | [**getExecutions**](docs/OAIPipelineExecutionApi.md#getexecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
*OAIPipelineExecutionApi* | [**getStepLogs**](docs/OAIPipelineExecutionApi.md#getsteplogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
*OAIPipelineExecutionApi* | [**startPipeline**](docs/OAIPipelineExecutionApi.md#startpipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
*OAIPipelineExecutionApi* | [**stepMetric**](docs/OAIPipelineExecutionApi.md#stepmetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
*OAIPipelineExecutionApi* | [**stepState**](docs/OAIPipelineExecutionApi.md#stepstate) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state
*OAIPipelinesApi* | [**deletePipeline**](docs/OAIPipelinesApi.md#deletepipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
*OAIPipelinesApi* | [**getPipeline**](docs/OAIPipelinesApi.md#getpipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
*OAIPipelinesApi* | [**getPipelines**](docs/OAIPipelinesApi.md#getpipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
*OAIPipelinesApi* | [**patchPipeline**](docs/OAIPipelinesApi.md#patchpipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
*OAIProgramsApi* | [**deleteProgram**](docs/OAIProgramsApi.md#deleteprogram) | **DELETE** /api/program/{programId} | Delete Program
*OAIProgramsApi* | [**getProgram**](docs/OAIProgramsApi.md#getprogram) | **GET** /api/program/{programId} | Get Program
*OAIProgramsApi* | [**getPrograms**](docs/OAIProgramsApi.md#getprograms) | **GET** /api/programs | Lists Programs
*OAIRepositoriesApi* | [**getRepositories**](docs/OAIRepositoriesApi.md#getrepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
*OAIRepositoriesApi* | [**getRepository**](docs/OAIRepositoriesApi.md#getrepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository
*OAIVariablesApi* | [**getEnvironmentVariables**](docs/OAIVariablesApi.md#getenvironmentvariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
*OAIVariablesApi* | [**patchEnvironmentVariables**](docs/OAIVariablesApi.md#patchenvironmentvariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


## Documentation For Models

 - [OAIBadRequestError](docs/OAIBadRequestError.md)
 - [OAIBranchList](docs/OAIBranchList.md)
 - [OAIBranchListEmbedded](docs/OAIBranchListEmbedded.md)
 - [OAIEmbeddedProgram](docs/OAIEmbeddedProgram.md)
 - [OAIEnvironment](docs/OAIEnvironment.md)
 - [OAIEnvironmentLinks](docs/OAIEnvironmentLinks.md)
 - [OAIEnvironmentList](docs/OAIEnvironmentList.md)
 - [OAIEnvironmentListEmbedded](docs/OAIEnvironmentListEmbedded.md)
 - [OAIEnvironmentLog](docs/OAIEnvironmentLog.md)
 - [OAIEnvironmentLogLinks](docs/OAIEnvironmentLogLinks.md)
 - [OAIEnvironmentLogs](docs/OAIEnvironmentLogs.md)
 - [OAIEnvironmentLogsEmbedded](docs/OAIEnvironmentLogsEmbedded.md)
 - [OAIEnvironmentLogsLinks](docs/OAIEnvironmentLogsLinks.md)
 - [OAIHalLink](docs/OAIHalLink.md)
 - [OAIInvalidParameter](docs/OAIInvalidParameter.md)
 - [OAIMetric](docs/OAIMetric.md)
 - [OAIMissingParameter](docs/OAIMissingParameter.md)
 - [OAIPipeline](docs/OAIPipeline.md)
 - [OAIPipelineExecution](docs/OAIPipelineExecution.md)
 - [OAIPipelineExecutionEmbedded](docs/OAIPipelineExecutionEmbedded.md)
 - [OAIPipelineExecutionLinks](docs/OAIPipelineExecutionLinks.md)
 - [OAIPipelineExecutionListRepresentation](docs/OAIPipelineExecutionListRepresentation.md)
 - [OAIPipelineExecutionListRepresentationEmbedded](docs/OAIPipelineExecutionListRepresentationEmbedded.md)
 - [OAIPipelineExecutionListRepresentationLinks](docs/OAIPipelineExecutionListRepresentationLinks.md)
 - [OAIPipelineExecutionStepState](docs/OAIPipelineExecutionStepState.md)
 - [OAIPipelineExecutionStepStateLinks](docs/OAIPipelineExecutionStepStateLinks.md)
 - [OAIPipelineLinks](docs/OAIPipelineLinks.md)
 - [OAIPipelineList](docs/OAIPipelineList.md)
 - [OAIPipelineListEmbedded](docs/OAIPipelineListEmbedded.md)
 - [OAIPipelinePhase](docs/OAIPipelinePhase.md)
 - [OAIPipelineStepMetrics](docs/OAIPipelineStepMetrics.md)
 - [OAIProgram](docs/OAIProgram.md)
 - [OAIProgramLinks](docs/OAIProgramLinks.md)
 - [OAIProgramList](docs/OAIProgramList.md)
 - [OAIProgramListEmbedded](docs/OAIProgramListEmbedded.md)
 - [OAIProgramListLinks](docs/OAIProgramListLinks.md)
 - [OAIRepository](docs/OAIRepository.md)
 - [OAIRepositoryBranch](docs/OAIRepositoryBranch.md)
 - [OAIRepositoryBranchLinks](docs/OAIRepositoryBranchLinks.md)
 - [OAIRepositoryLinks](docs/OAIRepositoryLinks.md)
 - [OAIRepositoryList](docs/OAIRepositoryList.md)
 - [OAIRepositoryListEmbedded](docs/OAIRepositoryListEmbedded.md)
 - [OAIRequestedPageDetails](docs/OAIRequestedPageDetails.md)
 - [OAIVariable](docs/OAIVariable.md)
 - [OAIVariableList](docs/OAIVariableList.md)
 - [OAIVariableListEmbedded](docs/OAIVariableListEmbedded.md)
 - [OAIVariableListLinks](docs/OAIVariableListLinks.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author

opensource@shinesolutions.com


