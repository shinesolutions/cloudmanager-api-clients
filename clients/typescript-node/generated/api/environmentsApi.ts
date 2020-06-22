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
import { BadRequestError } from '../model/badRequestError';
import { Environment } from '../model/environment';
import { EnvironmentList } from '../model/environmentList';
import { EnvironmentLogs } from '../model/environmentLogs';

import { ObjectSerializer, Authentication, VoidAuth, Interceptor } from '../model/models';

import { HttpError, RequestFile } from './apis';

let defaultBasePath = 'https://cloudmanager.adobe.io';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum EnvironmentsApiApiKeys {
}

export class EnvironmentsApi {
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

    public setApiKey(key: EnvironmentsApiApiKeys, value: string) {
        (this.authentications as any)[EnvironmentsApiApiKeys[key]].apiKey = value;
    }

    public addInterceptor(interceptor: Interceptor) {
        this.interceptors.push(interceptor);
    }

    /**
     * Delete environment
     * @summary DeleteEnvironment
     * @param programId Identifier of the application
     * @param environmentId Identifier of the environment
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public async deleteEnvironment (programId: string, environmentId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Environment;  }> {
        const localVarPath = this.basePath + '/api/program/{programId}/environment/{environmentId}'
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
            throw new Error('Required parameter programId was null or undefined when calling deleteEnvironment.');
        }

        // verify required parameter 'environmentId' is not null or undefined
        if (environmentId === null || environmentId === undefined) {
            throw new Error('Required parameter environmentId was null or undefined when calling deleteEnvironment.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling deleteEnvironment.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling deleteEnvironment.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling deleteEnvironment.');
        }

        localVarHeaderParams['x-gw-ims-org-id'] = ObjectSerializer.serialize(xGwImsOrgId, "string");
        localVarHeaderParams['Authorization'] = ObjectSerializer.serialize(authorization, "string");
        localVarHeaderParams['x-api-key'] = ObjectSerializer.serialize(xApiKey, "string");
        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
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
            return new Promise<{ response: http.ClientResponse; body: Environment;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        body = ObjectSerializer.deserialize(body, "Environment");
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
     * Download environment logs
     * @summary Download Logs
     * @param programId Identifier of the program
     * @param environmentId Identifier of the environment
     * @param service Name of service
     * @param name Name of log
     * @param date date for which log is required
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
     */
    public async downloadLogs (programId: string, environmentId: string, service: string, name: string, date: string, xGwImsOrgId: string, authorization: string, xApiKey: string, accept?: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/api/program/{programId}/environment/{environmentId}/logs/download'
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
            throw new Error('Required parameter programId was null or undefined when calling downloadLogs.');
        }

        // verify required parameter 'environmentId' is not null or undefined
        if (environmentId === null || environmentId === undefined) {
            throw new Error('Required parameter environmentId was null or undefined when calling downloadLogs.');
        }

        // verify required parameter 'service' is not null or undefined
        if (service === null || service === undefined) {
            throw new Error('Required parameter service was null or undefined when calling downloadLogs.');
        }

        // verify required parameter 'name' is not null or undefined
        if (name === null || name === undefined) {
            throw new Error('Required parameter name was null or undefined when calling downloadLogs.');
        }

        // verify required parameter 'date' is not null or undefined
        if (date === null || date === undefined) {
            throw new Error('Required parameter date was null or undefined when calling downloadLogs.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling downloadLogs.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling downloadLogs.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling downloadLogs.');
        }

        if (service !== undefined) {
            localVarQueryParameters['service'] = ObjectSerializer.serialize(service, "string");
        }

        if (name !== undefined) {
            localVarQueryParameters['name'] = ObjectSerializer.serialize(name, "string");
        }

        if (date !== undefined) {
            localVarQueryParameters['date'] = ObjectSerializer.serialize(date, "string");
        }

        localVarHeaderParams['x-gw-ims-org-id'] = ObjectSerializer.serialize(xGwImsOrgId, "string");
        localVarHeaderParams['Authorization'] = ObjectSerializer.serialize(authorization, "string");
        localVarHeaderParams['x-api-key'] = ObjectSerializer.serialize(xApiKey, "string");
        localVarHeaderParams['Accept'] = ObjectSerializer.serialize(accept, "string");
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
            return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
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
     * Returns an environment by its id
     * @summary Get Environment
     * @param programId Identifier of the program
     * @param environmentId Identifier of the environment
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     */
    public async getEnvironment (programId: string, environmentId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: Environment;  }> {
        const localVarPath = this.basePath + '/api/program/{programId}/environment/{environmentId}'
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
            throw new Error('Required parameter programId was null or undefined when calling getEnvironment.');
        }

        // verify required parameter 'environmentId' is not null or undefined
        if (environmentId === null || environmentId === undefined) {
            throw new Error('Required parameter environmentId was null or undefined when calling getEnvironment.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getEnvironment.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getEnvironment.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getEnvironment.');
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
            return new Promise<{ response: http.ClientResponse; body: Environment;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        body = ObjectSerializer.deserialize(body, "Environment");
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
     * List all logs available in environment
     * @summary Get Environment Logs
     * @param programId Identifier of the program
     * @param environmentId Identifier of the environment
     * @param days number of days for which logs are required
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param service Names of services
     * @param name Names of log
     */
    public async getEnvironmentLogs (programId: string, environmentId: string, days: number, xGwImsOrgId: string, authorization: string, xApiKey: string, service?: Array<string>, name?: Array<string>, options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: EnvironmentLogs;  }> {
        const localVarPath = this.basePath + '/api/program/{programId}/environment/{environmentId}/logs'
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
            throw new Error('Required parameter programId was null or undefined when calling getEnvironmentLogs.');
        }

        // verify required parameter 'environmentId' is not null or undefined
        if (environmentId === null || environmentId === undefined) {
            throw new Error('Required parameter environmentId was null or undefined when calling getEnvironmentLogs.');
        }

        // verify required parameter 'days' is not null or undefined
        if (days === null || days === undefined) {
            throw new Error('Required parameter days was null or undefined when calling getEnvironmentLogs.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getEnvironmentLogs.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getEnvironmentLogs.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getEnvironmentLogs.');
        }

        if (service !== undefined) {
            localVarQueryParameters['service'] = ObjectSerializer.serialize(service, "Array<string>");
        }

        if (name !== undefined) {
            localVarQueryParameters['name'] = ObjectSerializer.serialize(name, "Array<string>");
        }

        if (days !== undefined) {
            localVarQueryParameters['days'] = ObjectSerializer.serialize(days, "number");
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
            return new Promise<{ response: http.ClientResponse; body: EnvironmentLogs;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        body = ObjectSerializer.deserialize(body, "EnvironmentLogs");
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
     * Lists all environments in an program
     * @summary List Environments
     * @param programId Identifier of the program
     * @param xGwImsOrgId IMS organization ID that the request is being made under.
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
     * @param type Type of the environment
     */
    public async getEnvironments (programId: string, xGwImsOrgId: string, authorization: string, xApiKey: string, type?: 'dev' | 'stage' | 'prod', options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.ClientResponse; body: EnvironmentList;  }> {
        const localVarPath = this.basePath + '/api/program/{programId}/environments'
            .replace('{' + 'programId' + '}', encodeURIComponent(String(programId)));
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
            throw new Error('Required parameter programId was null or undefined when calling getEnvironments.');
        }

        // verify required parameter 'xGwImsOrgId' is not null or undefined
        if (xGwImsOrgId === null || xGwImsOrgId === undefined) {
            throw new Error('Required parameter xGwImsOrgId was null or undefined when calling getEnvironments.');
        }

        // verify required parameter 'authorization' is not null or undefined
        if (authorization === null || authorization === undefined) {
            throw new Error('Required parameter authorization was null or undefined when calling getEnvironments.');
        }

        // verify required parameter 'xApiKey' is not null or undefined
        if (xApiKey === null || xApiKey === undefined) {
            throw new Error('Required parameter xApiKey was null or undefined when calling getEnvironments.');
        }

        if (type !== undefined) {
            localVarQueryParameters['type'] = ObjectSerializer.serialize(type, "'dev' | 'stage' | 'prod'");
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
            return new Promise<{ response: http.ClientResponse; body: EnvironmentList;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        body = ObjectSerializer.deserialize(body, "EnvironmentList");
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
