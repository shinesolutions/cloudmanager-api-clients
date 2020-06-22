# Cloud Manager API Bash client

## Overview

This is a Bash client script for accessing Cloud Manager API service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image

You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash

The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X

On OSX you might need to install bash-completion using Homebrew:

```shell
brew install bash-completion
```

and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh

In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.

## Documentation for API Endpoints

All URIs are relative to **

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

