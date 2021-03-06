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
package org.openapitools.server

import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location

object Paths {
    /**
     * List Branches
     * Returns the list of branches from a repository
     * @param programId Identifier of the program. 
     * @param repositoryId Identifier of the repository 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/repository/{repositoryId}/branches") class getBranches(val programId: kotlin.String, val repositoryId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * DeleteEnvironment
     * Delete environment
     * @param programId Identifier of the application 
     * @param environmentId Identifier of the environment 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/environment/{environmentId}") class deleteEnvironment(val programId: kotlin.String, val environmentId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Download Logs
     * Download environment logs
     * @param programId Identifier of the program 
     * @param environmentId Identifier of the environment 
     * @param service Name of service 
     * @param name Name of log 
     * @param date date for which log is required 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     * @param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/environment/{environmentId}/logs/download") class downloadLogs(val programId: kotlin.String, val environmentId: kotlin.String, val service: kotlin.String, val name: kotlin.String, val date: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String, val accept: kotlin.String? = null)

    /**
     * Get Environment
     * Returns an environment by its id
     * @param programId Identifier of the program 
     * @param environmentId Identifier of the environment 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/environment/{environmentId}") class getEnvironment(val programId: kotlin.String, val environmentId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Get Environment Logs
     * List all logs available in environment
     * @param programId Identifier of the program 
     * @param environmentId Identifier of the environment 
     * @param days number of days for which logs are required 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     * @param service Names of services (optional)
     * @param name Names of log (optional)
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/environment/{environmentId}/logs") class getEnvironmentLogs(val programId: kotlin.String, val environmentId: kotlin.String, val days: kotlin.Int, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String, val service: kotlin.Array<kotlin.String>? = null, val name: kotlin.Array<kotlin.String>? = null)

    /**
     * List Environments
     * Lists all environments in an program
     * @param programId Identifier of the program 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     * @param type Type of the environment (optional)
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/environments") class getEnvironments(val programId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String, val type: kotlin.String? = null)

    /**
     * Get current pipeline execution
     * Returns current pipeline execution if any.
     * @param programId Identifier of the program. 
     * @param pipelineId Identifier of the pipeline 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipeline/{pipelineId}/execution") class getCurrentExecution(val programId: kotlin.String, val pipelineId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Get pipeline execution
     * Returns a pipeline execution by id
     * @param programId Identifier of the program. 
     * @param pipelineId Identifier of the pipeline 
     * @param executionId Identifier of the execution 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}") class getExecution(val programId: kotlin.String, val pipelineId: kotlin.String, val executionId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * List Executions
     * Returns the history of pipeline executions in a newest to oldest order
     * @param programId Identifier of the program. 
     * @param pipelineId Identifier of the pipeline 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     * @param start Pagination start parameter (optional)
     * @param limit Pagination limit parameter (optional)
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipeline/{pipelineId}/executions") class getExecutions(val programId: kotlin.String, val pipelineId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String, val start: kotlin.String? = null, val limit: kotlin.Int? = null)

    /**
     * Get logs
     * Get the logs associated with a step.
     * @param programId Identifier of the program. 
     * @param pipelineId Identifier of the pipeline 
     * @param executionId Identifier of the execution 
     * @param phaseId Identifier of the phase 
     * @param stepId Identifier of the step 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     * @param file Identifier of the log file (optional)
     * @param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs") class getStepLogs(val programId: kotlin.String, val pipelineId: kotlin.String, val executionId: kotlin.String, val phaseId: kotlin.String, val stepId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String, val file: kotlin.String? = null, val accept: kotlin.String? = null)

    /**
     * Get step metrics
     * 
     * @param programId Identifier of the program. 
     * @param pipelineId Identifier of the pipeline 
     * @param executionId Identifier of the execution 
     * @param phaseId Identifier of the phase 
     * @param stepId Identifier of the step 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics") class stepMetric(val programId: kotlin.String, val pipelineId: kotlin.String, val executionId: kotlin.String, val phaseId: kotlin.String, val stepId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Get step state
     * 
     * @param programId Identifier of the program. 
     * @param pipelineId Identifier of the pipeline 
     * @param executionId Identifier of the execution 
     * @param phaseId Identifier of the phase 
     * @param stepId Identifier of the step 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}") class stepState(val programId: kotlin.String, val pipelineId: kotlin.String, val executionId: kotlin.String, val phaseId: kotlin.String, val stepId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Delete a Pipeline
     * Delete a pipeline. All the data is wiped.
     * @param programId Identifier of the program 
     * @param pipelineId Identifier of the pipeline 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipeline/{pipelineId}") class deletePipeline(val programId: kotlin.String, val pipelineId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Get Pipeline
     * Returns a pipeline by its id
     * @param programId Identifier of the program 
     * @param pipelineId Identifier of the pipeline 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipeline/{pipelineId}") class getPipeline(val programId: kotlin.String, val pipelineId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * List Pipelines
     * Returns all the pipelines that the requesting user has access to in an program
     * @param programId Identifier of the program 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/pipelines") class getPipelines(val programId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Delete Program
     * Delete an program
     * @param programId Identifier of the program 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}") class deleteProgram(val programId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Get Program
     * Returns a program by its id
     * @param programId Identifier of the program 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}") class getProgram(val programId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Lists Programs
     * Returns all programs that the requesting user has access to
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/programs") class getPrograms(val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Lists Repositories
     * Lists all Repositories in an program
     * @param programId Identifier of the program 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/repositories") class getRepositories(val programId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * Get Repository
     * Returns an repository by its id
     * @param programId Identifier of the program 
     * @param repositoryId Identifier of the repository 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/repository/{repositoryId}") class getRepository(val programId: kotlin.String, val repositoryId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

    /**
     * List User Environment Variables
     * List the user defined variables for an environment (Cloud Service only).
     * @param programId Identifier of the program 
     * @param environmentId Identifier of the environment 
     * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
     * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
     */
    @KtorExperimentalLocationsAPI
    @Location("/api/program/{programId}/environment/{environmentId}/variables") class getEnvironmentVariables(val programId: kotlin.String, val environmentId: kotlin.String, val xMinusGwMinusImsMinusOrgMinusId: kotlin.String, val authorization: kotlin.String, val xMinusApiMinusKey: kotlin.String)

}
