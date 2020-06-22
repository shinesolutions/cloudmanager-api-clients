<?php

/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * Cloud Manager API
 * @version 1.0.0
 */

$router->get('/', function () use ($router) {
    return $router->app->version();
});

/**
 * get getBranches
 * Summary: List Branches
 * Notes: Returns the list of branches from a repository
 */
$router->get('/api/program/{programId}/repository/{repositoryId}/branches', 'BranchesApi@getBranches');
/**
 * delete deleteEnvironment
 * Summary: DeleteEnvironment
 * Notes: Delete environment
 */
$router->delete('/api/program/{programId}/environment/{environmentId}', 'EnvironmentsApi@deleteEnvironment');
/**
 * get getEnvironment
 * Summary: Get Environment
 * Notes: Returns an environment by its id
 */
$router->get('/api/program/{programId}/environment/{environmentId}', 'EnvironmentsApi@getEnvironment');
/**
 * get getEnvironmentLogs
 * Summary: Get Environment Logs
 * Notes: List all logs available in environment
 */
$router->get('/api/program/{programId}/environment/{environmentId}/logs', 'EnvironmentsApi@getEnvironmentLogs');
/**
 * get downloadLogs
 * Summary: Download Logs
 * Notes: Download environment logs
 */
$router->get('/api/program/{programId}/environment/{environmentId}/logs/download', 'EnvironmentsApi@downloadLogs');
/**
 * get getEnvironments
 * Summary: List Environments
 * Notes: Lists all environments in an program
 */
$router->get('/api/program/{programId}/environments', 'EnvironmentsApi@getEnvironments');
/**
 * get getCurrentExecution
 * Summary: Get current pipeline execution
 * Notes: Returns current pipeline execution if any.
 */
$router->get('/api/program/{programId}/pipeline/{pipelineId}/execution', 'PipelineExecutionApi@getCurrentExecution');
/**
 * put startPipeline
 * Summary: Start the pipeline
 * Notes: Starts the Pipeline. This works only if the pipeline is not already started.
 */
$router->put('/api/program/{programId}/pipeline/{pipelineId}/execution', 'PipelineExecutionApi@startPipeline');
/**
 * get getExecution
 * Summary: Get pipeline execution
 * Notes: Returns a pipeline execution by id
 */
$router->get('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}', 'PipelineExecutionApi@getExecution');
/**
 * get stepState
 * Summary: Get step state
 * Notes: 
 */
$router->get('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}', 'PipelineExecutionApi@stepState');
/**
 * put advancePipelineExecution
 * Summary: Advance
 * Notes: Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
 */
$router->put('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance', 'PipelineExecutionApi@advancePipelineExecution');
/**
 * put cancelPipelineExecutionStep
 * Summary: Cancel
 * Notes: Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
 */
$router->put('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel', 'PipelineExecutionApi@cancelPipelineExecutionStep');
/**
 * get getStepLogs
 * Summary: Get logs
 * Notes: Get the logs associated with a step.
 */
$router->get('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs', 'PipelineExecutionApi@getStepLogs');
/**
 * get stepMetric
 * Summary: Get step metrics
 * Notes: 
 */
$router->get('/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics', 'PipelineExecutionApi@stepMetric');
/**
 * get getExecutions
 * Summary: List Executions
 * Notes: Returns the history of pipeline executions in a newest to oldest order
 */
$router->get('/api/program/{programId}/pipeline/{pipelineId}/executions', 'PipelineExecutionApi@getExecutions');
/**
 * delete deletePipeline
 * Summary: Delete a Pipeline
 * Notes: Delete a pipeline. All the data is wiped.
 */
$router->delete('/api/program/{programId}/pipeline/{pipelineId}', 'PipelinesApi@deletePipeline');
/**
 * get getPipeline
 * Summary: Get Pipeline
 * Notes: Returns a pipeline by its id
 */
$router->get('/api/program/{programId}/pipeline/{pipelineId}', 'PipelinesApi@getPipeline');
/**
 * patch patchPipeline
 * Summary: Patches Pipeline
 * Notes: Patches a pipeline within an program.
 */
$router->patch('/api/program/{programId}/pipeline/{pipelineId}', 'PipelinesApi@patchPipeline');
/**
 * get getPipelines
 * Summary: List Pipelines
 * Notes: Returns all the pipelines that the requesting user has access to in an program
 */
$router->get('/api/program/{programId}/pipelines', 'PipelinesApi@getPipelines');
/**
 * delete deleteProgram
 * Summary: Delete Program
 * Notes: Delete an program
 */
$router->delete('/api/program/{programId}', 'ProgramsApi@deleteProgram');
/**
 * get getProgram
 * Summary: Get Program
 * Notes: Returns a program by its id
 */
$router->get('/api/program/{programId}', 'ProgramsApi@getProgram');
/**
 * get getPrograms
 * Summary: Lists Programs
 * Notes: Returns all programs that the requesting user has access to
 */
$router->get('/api/programs', 'ProgramsApi@getPrograms');
/**
 * get getRepositories
 * Summary: Lists Repositories
 * Notes: Lists all Repositories in an program
 */
$router->get('/api/program/{programId}/repositories', 'RepositoriesApi@getRepositories');
/**
 * get getRepository
 * Summary: Get Repository
 * Notes: Returns an repository by its id
 */
$router->get('/api/program/{programId}/repository/{repositoryId}', 'RepositoriesApi@getRepository');
/**
 * get getEnvironmentVariables
 * Summary: List User Environment Variables
 * Notes: List the user defined variables for an environment (Cloud Service only).
 */
$router->get('/api/program/{programId}/environment/{environmentId}/variables', 'VariablesApi@getEnvironmentVariables');
/**
 * patch patchEnvironmentVariables
 * Summary: Patch User Environment Variables
 * Notes: Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
 */
$router->patch('/api/program/{programId}/environment/{environmentId}/variables', 'VariablesApi@patchEnvironmentVariables');

