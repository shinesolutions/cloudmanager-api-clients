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


import * as $ from 'jquery';
import * as models from '../model/models';
import { COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


export class PipelinesApi {
    protected basePath = 'https://cloudmanager.adobe.io';
    public defaultHeaders: Array<string> = [];
    public defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings = undefined;
    public configuration: Configuration = new Configuration();

    constructor(basePath?: string, configuration?: Configuration, defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
        if (defaultExtraJQueryAjaxSettings) {
            this.defaultExtraJQueryAjaxSettings = defaultExtraJQueryAjaxSettings;
        }
    }

    private extendObj<T1 extends object, T2 extends T1>(objA: T2, objB: T2): T1|T2 {
        for (let key in objB) {
            if (objB.hasOwnProperty(key)) {
                objA[key] = objB[key];
            }
        }
        return objA;
    }

    /**
     * Delete a pipeline. All the data is wiped.
     * @summary Delete a Pipeline
     * @param programId Identifier of the program
     * @param pipelineId Identifier of the pipeline
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public deletePipeline(programId: string, pipelineId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body?: any;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}'.replace('{' + 'programId' + '}', encodeURIComponent(String(programId))).replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling deletePipeline.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling deletePipeline.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling deletePipeline.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling deletePipeline.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling deletePipeline.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        headerParams['x-gw-ims-org-id'] = String(xGwImsOrgId);

        headerParams['Authorization'] = String(authorization);

        headerParams['x-api-key'] = String(xApiKey);

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'DELETE',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body?: any;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Returns a pipeline by its id
     * @summary Get Pipeline
     * @param programId Identifier of the program
     * @param pipelineId Identifier of the pipeline
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public getPipeline(programId: string, pipelineId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: models.Pipeline;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}'.replace('{' + 'programId' + '}', encodeURIComponent(String(programId))).replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling getPipeline.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling getPipeline.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getPipeline.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getPipeline.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getPipeline.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        headerParams['x-gw-ims-org-id'] = String(xGwImsOrgId);

        headerParams['Authorization'] = String(authorization);

        headerParams['x-api-key'] = String(xApiKey);

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: models.Pipeline;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: models.Pipeline, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Returns all the pipelines that the requesting user has access to in an program
     * @summary List Pipelines
     * @param programId Identifier of the program
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public getPipelines(programId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: models.PipelineList;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/api/program/{programId}/pipelines'.replace('{' + 'programId' + '}', encodeURIComponent(String(programId)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling getPipelines.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getPipelines.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getPipelines.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getPipelines.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        headerParams['x-gw-ims-org-id'] = String(xGwImsOrgId);

        headerParams['Authorization'] = String(authorization);

        headerParams['x-api-key'] = String(xApiKey);

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'GET',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: models.PipelineList;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: models.PipelineList, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * Patches a pipeline within an program.
     * @summary Patches Pipeline
     * @param programId Identifier of the program
     * @param pipelineId Identifier of the pipeline
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param contentType Must always be application/json
     * @param body The updated Pipeline
     */
    public patchPipeline(programId: string, pipelineId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, contentType: string, body: models.Pipeline, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body: models.Pipeline;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/api/program/{programId}/pipeline/{pipelineId}'.replace('{' + 'programId' + '}', encodeURIComponent(String(programId))).replace('{' + 'pipelineId' + '}', encodeURIComponent(String(pipelineId)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling patchPipeline.');
        }

        // verify required parameter 'pipelineId' is not null or undefined
        if (pipelineId === null || pipelineId === undefined) {
            throw new Error('Required parameter pipelineId was null or undefined when calling patchPipeline.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling patchPipeline.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling patchPipeline.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling patchPipeline.');
        }

        // verify required parameter 'contentType' is not null or undefined
        if (contentType === null || contentType === undefined) {
            throw new Error('Required parameter contentType was null or undefined when calling patchPipeline.');
        }

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling patchPipeline.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        headerParams['x-gw-ims-org-id'] = String(xGwImsOrgId);

        headerParams['Authorization'] = String(authorization);

        headerParams['x-api-key'] = String(xApiKey);

        headerParams['Content-Type'] = String(contentType);

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];


        headerParams['Content-Type'] = 'application/json';

        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'PATCH',
            headers: headerParams,
            processData: false
        };

        requestOptions.data = JSON.stringify(body);
        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body: models.Pipeline;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: models.Pipeline, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

}
