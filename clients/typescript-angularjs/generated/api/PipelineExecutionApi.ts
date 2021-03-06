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

import * as models from '../model/models';

/* tslint:disable:no-unused-variable member-ordering */

export class PipelineExecutionApi {
    protected basePath = 'https://cloudmanager.adobe.io';
    public defaultHeaders : any = {};

    static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

    constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
        if (basePath !== undefined) {
            this.basePath = basePath;
        }
    }

    /**
     * Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
     * @summary Advance
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param executionId Identifier of the execution
     * @param phaseId Identifier of the phase
     * @param stepId Identifier of the step
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param contentType Must always be application/json
     * @param body Input for advance. See documentation for details.
     */
    public advancePipelineExecution (programId: string, pipelineId: string, executionId: string, phaseId: string, stepId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, contentType: string, body: object, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)))
            .replace('{' + 'executionId' + '}', encodeURIComponent(String(executionId)))
            .replace('{' + 'phaseId' + '}', encodeURIComponent(String(phaseId)))
            .replace('{' + 'stepId' + '}', encodeURIComponent(String(stepId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'executionId' is not null or undefined
        if (executionId === null || executionId === undefined) {
            throw new Error('Required parameter executionId was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'phaseId' is not null or undefined
        if (phaseId === null || phaseId === undefined) {
            throw new Error('Required parameter phaseId was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'stepId' is not null or undefined
        if (stepId === null || stepId === undefined) {
            throw new Error('Required parameter stepId was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'contentType' is not null or undefined
        if (contentType === null || contentType === undefined) {
            throw new Error('Required parameter contentType was null or undefined when calling advancePipelineExecution.');
        }

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling advancePipelineExecution.');
        }

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        headerParams['Content-Type'] = contentType;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'PUT',
            url: localVarPath,
            data: body,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
     * @summary Cancel
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param executionId Identifier of the execution
     * @param phaseId Identifier of the phase
     * @param stepId Identifier of the step
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param contentType Must always be application/json
     * @param body Input for advance. See documentation for details.
     */
    public cancelPipelineExecutionStep (programId: string, pipelineId: string, executionId: string, phaseId: string, stepId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, contentType: string, body: object, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)))
            .replace('{' + 'executionId' + '}', encodeURIComponent(String(executionId)))
            .replace('{' + 'phaseId' + '}', encodeURIComponent(String(phaseId)))
            .replace('{' + 'stepId' + '}', encodeURIComponent(String(stepId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'executionId' is not null or undefined
        if (executionId === null || executionId === undefined) {
            throw new Error('Required parameter executionId was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'phaseId' is not null or undefined
        if (phaseId === null || phaseId === undefined) {
            throw new Error('Required parameter phaseId was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'stepId' is not null or undefined
        if (stepId === null || stepId === undefined) {
            throw new Error('Required parameter stepId was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'contentType' is not null or undefined
        if (contentType === null || contentType === undefined) {
            throw new Error('Required parameter contentType was null or undefined when calling cancelPipelineExecutionStep.');
        }

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling cancelPipelineExecutionStep.');
        }

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        headerParams['Content-Type'] = contentType;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'PUT',
            url: localVarPath,
            data: body,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Returns current pipeline execution if any.
     * @summary Get current pipeline execution
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public getCurrentExecution (programId: string, pipelineId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.PipelineExecution> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/execution'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling getCurrentExecution.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling getCurrentExecution.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getCurrentExecution.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getCurrentExecution.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getCurrentExecution.');
        }

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Returns a pipeline execution by id
     * @summary Get pipeline execution
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param executionId Identifier of the execution
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public getExecution (programId: string, pipelineId: string, executionId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.PipelineExecution> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)))
            .replace('{' + 'executionId' + '}', encodeURIComponent(String(executionId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling getExecution.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling getExecution.');
        }

        // verify required parameter 'executionId' is not null or undefined
        if (executionId === null || executionId === undefined) {
            throw new Error('Required parameter executionId was null or undefined when calling getExecution.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getExecution.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getExecution.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getExecution.');
        }

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Returns the history of pipeline executions in a newest to oldest order
     * @summary List Executions
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param start Pagination start parameter
     * @param limit Pagination limit parameter
     */
    public getExecutions (programId: string, pipelineId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, start?: string, limit?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.PipelineExecutionListRepresentation> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/executions'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling getExecutions.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling getExecutions.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getExecutions.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getExecutions.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getExecutions.');
        }

        if (start !== undefined) {
            queryParameters['start'] = start;
        }

        if (limit !== undefined) {
            queryParameters['limit'] = limit;
        }

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Get the logs associated with a step.
     * @summary Get logs
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param executionId Identifier of the execution
     * @param phaseId Identifier of the phase
     * @param stepId Identifier of the step
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param file Identifier of the log file
     * @param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
     */
    public getStepLogs (programId: string, pipelineId: string, executionId: string, phaseId: string, stepId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, file?: string, accept?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)))
            .replace('{' + 'executionId' + '}', encodeURIComponent(String(executionId)))
            .replace('{' + 'phaseId' + '}', encodeURIComponent(String(phaseId)))
            .replace('{' + 'stepId' + '}', encodeURIComponent(String(stepId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling getStepLogs.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling getStepLogs.');
        }

        // verify required parameter 'executionId' is not null or undefined
        if (executionId === null || executionId === undefined) {
            throw new Error('Required parameter executionId was null or undefined when calling getStepLogs.');
        }

        // verify required parameter 'phaseId' is not null or undefined
        if (phaseId === null || phaseId === undefined) {
            throw new Error('Required parameter phaseId was null or undefined when calling getStepLogs.');
        }

        // verify required parameter 'stepId' is not null or undefined
        if (stepId === null || stepId === undefined) {
            throw new Error('Required parameter stepId was null or undefined when calling getStepLogs.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getStepLogs.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getStepLogs.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getStepLogs.');
        }

        if (file !== undefined) {
            queryParameters['file'] = file;
        }

        headerParams['Accept'] = accept;

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * Starts the Pipeline. This works only if the pipeline is not already started.
     * @summary Start the pipeline
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param contentType Must always be application/json
     */
    public startPipeline (programId: string, pipelineId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, contentType: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/execution'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling startPipeline.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling startPipeline.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling startPipeline.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling startPipeline.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling startPipeline.');
        }

        // verify required parameter 'contentType' is not null or undefined
        if (contentType === null || contentType === undefined) {
            throw new Error('Required parameter contentType was null or undefined when calling startPipeline.');
        }

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        headerParams['Content-Type'] = contentType;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'PUT',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * 
     * @summary Get step metrics
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param executionId Identifier of the execution
     * @param phaseId Identifier of the phase
     * @param stepId Identifier of the step
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public stepMetric (programId: string, pipelineId: string, executionId: string, phaseId: string, stepId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.PipelineStepMetrics> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)))
            .replace('{' + 'executionId' + '}', encodeURIComponent(String(executionId)))
            .replace('{' + 'phaseId' + '}', encodeURIComponent(String(phaseId)))
            .replace('{' + 'stepId' + '}', encodeURIComponent(String(stepId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling stepMetric.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling stepMetric.');
        }

        // verify required parameter 'executionId' is not null or undefined
        if (executionId === null || executionId === undefined) {
            throw new Error('Required parameter executionId was null or undefined when calling stepMetric.');
        }

        // verify required parameter 'phaseId' is not null or undefined
        if (phaseId === null || phaseId === undefined) {
            throw new Error('Required parameter phaseId was null or undefined when calling stepMetric.');
        }

        // verify required parameter 'stepId' is not null or undefined
        if (stepId === null || stepId === undefined) {
            throw new Error('Required parameter stepId was null or undefined when calling stepMetric.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling stepMetric.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling stepMetric.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling stepMetric.');
        }

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * 
     * @summary Get step state
     * @param programId Identifier of the program.
     * @param pipelineId Identifier of the pipeline
     * @param executionId Identifier of the execution
     * @param phaseId Identifier of the phase
     * @param stepId Identifier of the step
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public stepState (programId: string, pipelineId: string, executionId: string, phaseId: string, stepId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.PipelineExecutionStepState> {
        const localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)))
            .replace('{' + 'executionId' + '}', encodeURIComponent(String(executionId)))
            .replace('{' + 'phaseId' + '}', encodeURIComponent(String(phaseId)))
            .replace('{' + 'stepId' + '}', encodeURIComponent(String(stepId)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling stepState.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling stepState.');
        }

        // verify required parameter 'executionId' is not null or undefined
        if (executionId === null || executionId === undefined) {
            throw new Error('Required parameter executionId was null or undefined when calling stepState.');
        }

        // verify required parameter 'phaseId' is not null or undefined
        if (phaseId === null || phaseId === undefined) {
            throw new Error('Required parameter phaseId was null or undefined when calling stepState.');
        }

        // verify required parameter 'stepId' is not null or undefined
        if (stepId === null || stepId === undefined) {
            throw new Error('Required parameter stepId was null or undefined when calling stepState.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling stepState.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling stepState.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling stepState.');
        }

        headerParams['x-gw-ims-org-id'] = xGwImsOrgId;

        headerParams['Authorization'] = authorization;

        headerParams['x-api-key'] = xApiKey;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
}
