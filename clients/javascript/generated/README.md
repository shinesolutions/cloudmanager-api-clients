# node-aem-cloudmanager-api-client

NodeAemCloudmanagerApiClient - JavaScript client for node-aem-cloudmanager-api-client
This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen
For more information, please visit [http://shinesolutions.com](http://shinesolutions.com)

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/), please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install node-aem-cloudmanager-api-client --save
```

Finally, you need to build the module:

```shell
npm run build
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

To use the link you just defined in your project, switch to the directory you want to use your node-aem-cloudmanager-api-client from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

Finally, you need to build the module:

```shell
npm run build
```

#### git

If the library is hosted at a git repository, e.g.https://github.com/GIT_USER_ID/GIT_REPO_ID
then install it via:

```shell
    npm install GIT_USER_ID/GIT_REPO_ID --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var NodeAemCloudmanagerApiClient = require('node-aem-cloudmanager-api-client');


var api = new NodeAemCloudmanagerApiClient.BranchesApi()
var programId = "programId_example"; // {String} Identifier of the program.
var repositoryId = "repositoryId_example"; // {String} Identifier of the repository
var xGwImsOrgId = "xGwImsOrgId_example"; // {String} IMS organization ID that the request is being made under.
var authorization = "authorization_example"; // {String} Bearer [token] - An access token for the technical account created through integration with Adobe IO
var xApiKey = "xApiKey_example"; // {String} IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://cloudmanager.adobe.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*NodeAemCloudmanagerApiClient.BranchesApi* | [**getBranches**](docs/BranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches
*NodeAemCloudmanagerApiClient.EnvironmentsApi* | [**deleteEnvironment**](docs/EnvironmentsApi.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
*NodeAemCloudmanagerApiClient.EnvironmentsApi* | [**downloadLogs**](docs/EnvironmentsApi.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
*NodeAemCloudmanagerApiClient.EnvironmentsApi* | [**getEnvironment**](docs/EnvironmentsApi.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
*NodeAemCloudmanagerApiClient.EnvironmentsApi* | [**getEnvironmentLogs**](docs/EnvironmentsApi.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
*NodeAemCloudmanagerApiClient.EnvironmentsApi* | [**getEnvironments**](docs/EnvironmentsApi.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**advancePipelineExecution**](docs/PipelineExecutionApi.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**cancelPipelineExecutionStep**](docs/PipelineExecutionApi.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**getCurrentExecution**](docs/PipelineExecutionApi.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**getExecution**](docs/PipelineExecutionApi.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**getExecutions**](docs/PipelineExecutionApi.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**getStepLogs**](docs/PipelineExecutionApi.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**startPipeline**](docs/PipelineExecutionApi.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**stepMetric**](docs/PipelineExecutionApi.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
*NodeAemCloudmanagerApiClient.PipelineExecutionApi* | [**stepState**](docs/PipelineExecutionApi.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state
*NodeAemCloudmanagerApiClient.PipelinesApi* | [**deletePipeline**](docs/PipelinesApi.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
*NodeAemCloudmanagerApiClient.PipelinesApi* | [**getPipeline**](docs/PipelinesApi.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
*NodeAemCloudmanagerApiClient.PipelinesApi* | [**getPipelines**](docs/PipelinesApi.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
*NodeAemCloudmanagerApiClient.PipelinesApi* | [**patchPipeline**](docs/PipelinesApi.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
*NodeAemCloudmanagerApiClient.ProgramsApi* | [**deleteProgram**](docs/ProgramsApi.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
*NodeAemCloudmanagerApiClient.ProgramsApi* | [**getProgram**](docs/ProgramsApi.md#getProgram) | **GET** /api/program/{programId} | Get Program
*NodeAemCloudmanagerApiClient.ProgramsApi* | [**getPrograms**](docs/ProgramsApi.md#getPrograms) | **GET** /api/programs | Lists Programs
*NodeAemCloudmanagerApiClient.RepositoriesApi* | [**getRepositories**](docs/RepositoriesApi.md#getRepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
*NodeAemCloudmanagerApiClient.RepositoriesApi* | [**getRepository**](docs/RepositoriesApi.md#getRepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository
*NodeAemCloudmanagerApiClient.VariablesApi* | [**getEnvironmentVariables**](docs/VariablesApi.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
*NodeAemCloudmanagerApiClient.VariablesApi* | [**patchEnvironmentVariables**](docs/VariablesApi.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


## Documentation for Models

 - [NodeAemCloudmanagerApiClient.BadRequestError](docs/BadRequestError.md)
 - [NodeAemCloudmanagerApiClient.BranchList](docs/BranchList.md)
 - [NodeAemCloudmanagerApiClient.BranchListEmbedded](docs/BranchListEmbedded.md)
 - [NodeAemCloudmanagerApiClient.EmbeddedProgram](docs/EmbeddedProgram.md)
 - [NodeAemCloudmanagerApiClient.Environment](docs/Environment.md)
 - [NodeAemCloudmanagerApiClient.EnvironmentLinks](docs/EnvironmentLinks.md)
 - [NodeAemCloudmanagerApiClient.EnvironmentList](docs/EnvironmentList.md)
 - [NodeAemCloudmanagerApiClient.EnvironmentListEmbedded](docs/EnvironmentListEmbedded.md)
 - [NodeAemCloudmanagerApiClient.EnvironmentLog](docs/EnvironmentLog.md)
 - [NodeAemCloudmanagerApiClient.EnvironmentLogLinks](docs/EnvironmentLogLinks.md)
 - [NodeAemCloudmanagerApiClient.EnvironmentLogs](docs/EnvironmentLogs.md)
 - [NodeAemCloudmanagerApiClient.EnvironmentLogsEmbedded](docs/EnvironmentLogsEmbedded.md)
 - [NodeAemCloudmanagerApiClient.EnvironmentLogsLinks](docs/EnvironmentLogsLinks.md)
 - [NodeAemCloudmanagerApiClient.HalLink](docs/HalLink.md)
 - [NodeAemCloudmanagerApiClient.InvalidParameter](docs/InvalidParameter.md)
 - [NodeAemCloudmanagerApiClient.Metric](docs/Metric.md)
 - [NodeAemCloudmanagerApiClient.MissingParameter](docs/MissingParameter.md)
 - [NodeAemCloudmanagerApiClient.Pipeline](docs/Pipeline.md)
 - [NodeAemCloudmanagerApiClient.PipelineExecution](docs/PipelineExecution.md)
 - [NodeAemCloudmanagerApiClient.PipelineExecutionEmbedded](docs/PipelineExecutionEmbedded.md)
 - [NodeAemCloudmanagerApiClient.PipelineExecutionLinks](docs/PipelineExecutionLinks.md)
 - [NodeAemCloudmanagerApiClient.PipelineExecutionListRepresentation](docs/PipelineExecutionListRepresentation.md)
 - [NodeAemCloudmanagerApiClient.PipelineExecutionListRepresentationEmbedded](docs/PipelineExecutionListRepresentationEmbedded.md)
 - [NodeAemCloudmanagerApiClient.PipelineExecutionListRepresentationLinks](docs/PipelineExecutionListRepresentationLinks.md)
 - [NodeAemCloudmanagerApiClient.PipelineExecutionStepState](docs/PipelineExecutionStepState.md)
 - [NodeAemCloudmanagerApiClient.PipelineExecutionStepStateLinks](docs/PipelineExecutionStepStateLinks.md)
 - [NodeAemCloudmanagerApiClient.PipelineLinks](docs/PipelineLinks.md)
 - [NodeAemCloudmanagerApiClient.PipelineList](docs/PipelineList.md)
 - [NodeAemCloudmanagerApiClient.PipelineListEmbedded](docs/PipelineListEmbedded.md)
 - [NodeAemCloudmanagerApiClient.PipelinePhase](docs/PipelinePhase.md)
 - [NodeAemCloudmanagerApiClient.PipelineStepMetrics](docs/PipelineStepMetrics.md)
 - [NodeAemCloudmanagerApiClient.Program](docs/Program.md)
 - [NodeAemCloudmanagerApiClient.ProgramLinks](docs/ProgramLinks.md)
 - [NodeAemCloudmanagerApiClient.ProgramList](docs/ProgramList.md)
 - [NodeAemCloudmanagerApiClient.ProgramListEmbedded](docs/ProgramListEmbedded.md)
 - [NodeAemCloudmanagerApiClient.ProgramListLinks](docs/ProgramListLinks.md)
 - [NodeAemCloudmanagerApiClient.Repository](docs/Repository.md)
 - [NodeAemCloudmanagerApiClient.RepositoryBranch](docs/RepositoryBranch.md)
 - [NodeAemCloudmanagerApiClient.RepositoryBranchLinks](docs/RepositoryBranchLinks.md)
 - [NodeAemCloudmanagerApiClient.RepositoryLinks](docs/RepositoryLinks.md)
 - [NodeAemCloudmanagerApiClient.RepositoryList](docs/RepositoryList.md)
 - [NodeAemCloudmanagerApiClient.RepositoryListEmbedded](docs/RepositoryListEmbedded.md)
 - [NodeAemCloudmanagerApiClient.RequestedPageDetails](docs/RequestedPageDetails.md)
 - [NodeAemCloudmanagerApiClient.Variable](docs/Variable.md)
 - [NodeAemCloudmanagerApiClient.VariableList](docs/VariableList.md)
 - [NodeAemCloudmanagerApiClient.VariableListEmbedded](docs/VariableListEmbedded.md)
 - [NodeAemCloudmanagerApiClient.VariableListLinks](docs/VariableListLinks.md)


## Documentation for Authorization

All endpoints do not require authorization.
