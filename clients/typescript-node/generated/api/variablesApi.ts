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

import localVarRequest = require('request');
import http = require('http');

/* tslint:disable:no-unused-locals */
import { Variable } from '../model/variable';
import { VariableList } from '../model/variableList';

import { ObjectSerializer, Authentication, VoidAuth, Interceptor } from '../model/models';

import { HttpError, RequestFile } from './apis';

let defaultBasePath = 'https://cloudmanager.adobe.io';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum VariablesApiApiKeys {
}

export class VariablesApi {
    protected _basePath = defaultBasePath;
    protected _defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    protected interceptors: Interceptor[] = [];

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    set defaultHeaders(defaultHeaders: any) {
        this._defaultHeaders = defaultHeaders;
    }

    get defaultHeaders() {
        return this._defaultHeaders;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
        this.authentications.default = auth;
    }

    public setApiKey(key: VariablesApiApiKeys, value: string) {
        (this.authentications as any)[VariablesApiApiKeys[key]].apiKey = value;
    }

    public addInterceptor(interceptor: Interceptor) {
        this.interceptors.push(interceptor);
    }

    /**
     * List the user defined variables for an environment (Cloud Service only).
     * @summary List User Environment Variables
     * @param programId Identifier of the program
     * @param environmentId Identifier of the environment
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public async getEnvironmentVariables (programId: string, environmentId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: VariableList;  }> {
        const localVarPath = this.basePath + '/api/program/{programId}/environment/{environmentId}/variables'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'environmentId' + '}', encodeURIComponent(String(environmentId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling getEnvironmentVariables.');
        }

        // verify required parameter 'environmentId' is not null or undefined
        if (environmentId === null || environmentId === undefined) {
            throw new Error('Required parameter environmentId was null or undefined when calling getEnvironmentVariables.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getEnvironmentVariables.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getEnvironmentVariables.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getEnvironmentVariables.');
        }

        localVarHeaderParams['x-gw-ims-org-id'] = ObjectSerializer.serialize(xGwImsOrgId, "string");
        localVarHeaderParams['Authorization'] = ObjectSerializer.serialize(authorization, "string");
        localVarHeaderParams['x-api-key'] = ObjectSerializer.serialize(xApiKey, "string");
        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        let authenticationPromise = Promise.resolve();
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.ClientResponse; body: VariableList;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        body = ObjectSerializer.deserialize(body, "VariableList");
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
    /**
     * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     * @summary Patch User Environment Variables
     * @param programId Identifier of the program
     * @param environmentId Identifier of the environment
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param contentType Must always be application/json
     * @param body The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.
     */
    public async patchEnvironmentVariables (programId: string, environmentId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, contentType: string, body: Array<Variable>, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: VariableList;  }> {
        const localVarPath = this.basePath + '/api/program/{programId}/environment/{environmentId}/variables'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)))
            .replace('{' + 'environmentId' + '}', encodeURIComponent(String(environmentId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'programId' is not null or undefined
        if (programId === null || programId === undefined) {
            throw new Error('Required parameter programId was null or undefined when calling patchEnvironmentVariables.');
        }

        // verify required parameter 'environmentId' is not null or undefined
        if (environmentId === null || environmentId === undefined) {
            throw new Error('Required parameter environmentId was null or undefined when calling patchEnvironmentVariables.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling patchEnvironmentVariables.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling patchEnvironmentVariables.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling patchEnvironmentVariables.');
        }

        // verify required parameter 'contentType' is not null or undefined
        if (contentType === null || contentType === undefined) {
            throw new Error('Required parameter contentType was null or undefined when calling patchEnvironmentVariables.');
        }

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new Error('Required parameter body was null or undefined when calling patchEnvironmentVariables.');
        }

        localVarHeaderParams['x-gw-ims-org-id'] = ObjectSerializer.serialize(xGwImsOrgId, "string");
        localVarHeaderParams['Authorization'] = ObjectSerializer.serialize(authorization, "string");
        localVarHeaderParams['x-api-key'] = ObjectSerializer.serialize(xApiKey, "string");
        localVarHeaderParams['Content-Type'] = ObjectSerializer.serialize(contentType, "string");
        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PATCH',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
            body: ObjectSerializer.serialize(body, "Array<Variable>")
        };

        let authenticationPromise = Promise.resolve();
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.ClientResponse; body: VariableList;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        body = ObjectSerializer.deserialize(body, "VariableList");
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
}
