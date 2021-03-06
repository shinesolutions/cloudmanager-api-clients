# Org.OpenAPITools - the C# library for the Cloud Manager API

This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpClientCodegen
    For more information, please visit [http://shinesolutions.com](http://shinesolutions.com)

## Frameworks supported


- .NET 4.0 or later
- Windows Phone 7.1 (Mango)

## Dependencies


- [RestSharp](https://www.nuget.org/packages/RestSharp) - 105.1.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 7.0.0 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.2.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:

```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)

## Installation

Run the following command to generate the DLL

- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:

```csharp
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

```


## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out Org.OpenAPITools.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.


## Getting Started

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Example
    {
        public static void Main()
        {

            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new BranchesApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var repositoryId = repositoryId_example;  // string | Identifier of the repository
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // List Branches
                BranchList result = apiInstance.GetBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling BranchesApi.GetBranches: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }

        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://cloudmanager.adobe.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BranchesApi* | [**GetBranches**](docs/BranchesApi.md#getbranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches
*EnvironmentsApi* | [**DeleteEnvironment**](docs/EnvironmentsApi.md#deleteenvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
*EnvironmentsApi* | [**DownloadLogs**](docs/EnvironmentsApi.md#downloadlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
*EnvironmentsApi* | [**GetEnvironment**](docs/EnvironmentsApi.md#getenvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
*EnvironmentsApi* | [**GetEnvironmentLogs**](docs/EnvironmentsApi.md#getenvironmentlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
*EnvironmentsApi* | [**GetEnvironments**](docs/EnvironmentsApi.md#getenvironments) | **GET** /api/program/{programId}/environments | List Environments
*PipelineExecutionApi* | [**AdvancePipelineExecution**](docs/PipelineExecutionApi.md#advancepipelineexecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
*PipelineExecutionApi* | [**CancelPipelineExecutionStep**](docs/PipelineExecutionApi.md#cancelpipelineexecutionstep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
*PipelineExecutionApi* | [**GetCurrentExecution**](docs/PipelineExecutionApi.md#getcurrentexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
*PipelineExecutionApi* | [**GetExecution**](docs/PipelineExecutionApi.md#getexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
*PipelineExecutionApi* | [**GetExecutions**](docs/PipelineExecutionApi.md#getexecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
*PipelineExecutionApi* | [**GetStepLogs**](docs/PipelineExecutionApi.md#getsteplogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
*PipelineExecutionApi* | [**StartPipeline**](docs/PipelineExecutionApi.md#startpipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
*PipelineExecutionApi* | [**StepMetric**](docs/PipelineExecutionApi.md#stepmetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
*PipelineExecutionApi* | [**StepState**](docs/PipelineExecutionApi.md#stepstate) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state
*PipelinesApi* | [**DeletePipeline**](docs/PipelinesApi.md#deletepipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
*PipelinesApi* | [**GetPipeline**](docs/PipelinesApi.md#getpipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
*PipelinesApi* | [**GetPipelines**](docs/PipelinesApi.md#getpipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
*PipelinesApi* | [**PatchPipeline**](docs/PipelinesApi.md#patchpipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
*ProgramsApi* | [**DeleteProgram**](docs/ProgramsApi.md#deleteprogram) | **DELETE** /api/program/{programId} | Delete Program
*ProgramsApi* | [**GetProgram**](docs/ProgramsApi.md#getprogram) | **GET** /api/program/{programId} | Get Program
*ProgramsApi* | [**GetPrograms**](docs/ProgramsApi.md#getprograms) | **GET** /api/programs | Lists Programs
*RepositoriesApi* | [**GetRepositories**](docs/RepositoriesApi.md#getrepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
*RepositoriesApi* | [**GetRepository**](docs/RepositoriesApi.md#getrepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository
*VariablesApi* | [**GetEnvironmentVariables**](docs/VariablesApi.md#getenvironmentvariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
*VariablesApi* | [**PatchEnvironmentVariables**](docs/VariablesApi.md#patchenvironmentvariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


## Documentation for Models

 - [Model.BadRequestError](docs/BadRequestError.md)
 - [Model.BranchList](docs/BranchList.md)
 - [Model.BranchListEmbedded](docs/BranchListEmbedded.md)
 - [Model.EmbeddedProgram](docs/EmbeddedProgram.md)
 - [Model.Environment](docs/Environment.md)
 - [Model.EnvironmentLinks](docs/EnvironmentLinks.md)
 - [Model.EnvironmentList](docs/EnvironmentList.md)
 - [Model.EnvironmentListEmbedded](docs/EnvironmentListEmbedded.md)
 - [Model.EnvironmentLog](docs/EnvironmentLog.md)
 - [Model.EnvironmentLogLinks](docs/EnvironmentLogLinks.md)
 - [Model.EnvironmentLogs](docs/EnvironmentLogs.md)
 - [Model.EnvironmentLogsEmbedded](docs/EnvironmentLogsEmbedded.md)
 - [Model.EnvironmentLogsLinks](docs/EnvironmentLogsLinks.md)
 - [Model.HalLink](docs/HalLink.md)
 - [Model.InvalidParameter](docs/InvalidParameter.md)
 - [Model.Metric](docs/Metric.md)
 - [Model.MissingParameter](docs/MissingParameter.md)
 - [Model.Pipeline](docs/Pipeline.md)
 - [Model.PipelineExecution](docs/PipelineExecution.md)
 - [Model.PipelineExecutionEmbedded](docs/PipelineExecutionEmbedded.md)
 - [Model.PipelineExecutionLinks](docs/PipelineExecutionLinks.md)
 - [Model.PipelineExecutionListRepresentation](docs/PipelineExecutionListRepresentation.md)
 - [Model.PipelineExecutionListRepresentationEmbedded](docs/PipelineExecutionListRepresentationEmbedded.md)
 - [Model.PipelineExecutionListRepresentationLinks](docs/PipelineExecutionListRepresentationLinks.md)
 - [Model.PipelineExecutionStepState](docs/PipelineExecutionStepState.md)
 - [Model.PipelineExecutionStepStateLinks](docs/PipelineExecutionStepStateLinks.md)
 - [Model.PipelineLinks](docs/PipelineLinks.md)
 - [Model.PipelineList](docs/PipelineList.md)
 - [Model.PipelineListEmbedded](docs/PipelineListEmbedded.md)
 - [Model.PipelinePhase](docs/PipelinePhase.md)
 - [Model.PipelineStepMetrics](docs/PipelineStepMetrics.md)
 - [Model.Program](docs/Program.md)
 - [Model.ProgramLinks](docs/ProgramLinks.md)
 - [Model.ProgramList](docs/ProgramList.md)
 - [Model.ProgramListEmbedded](docs/ProgramListEmbedded.md)
 - [Model.ProgramListLinks](docs/ProgramListLinks.md)
 - [Model.Repository](docs/Repository.md)
 - [Model.RepositoryBranch](docs/RepositoryBranch.md)
 - [Model.RepositoryBranchLinks](docs/RepositoryBranchLinks.md)
 - [Model.RepositoryLinks](docs/RepositoryLinks.md)
 - [Model.RepositoryList](docs/RepositoryList.md)
 - [Model.RepositoryListEmbedded](docs/RepositoryListEmbedded.md)
 - [Model.RequestedPageDetails](docs/RequestedPageDetails.md)
 - [Model.Variable](docs/Variable.md)
 - [Model.VariableList](docs/VariableList.md)
 - [Model.VariableListEmbedded](docs/VariableListEmbedded.md)
 - [Model.VariableListLinks](docs/VariableListLinks.md)


## Documentation for Authorization

All endpoints do not require authorization.
