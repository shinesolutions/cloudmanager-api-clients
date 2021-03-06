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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  ProgramList,
  Program,
} from './models';

/**
 * deleteProgram - parameters interface
 */
export interface IDeleteProgramParams {
  programId: string;
  xGwImsOrgId: string;
  authorization: string;
  xApiKey: string;
}

/**
 * getProgram - parameters interface
 */
export interface IGetProgramParams {
  programId: string;
  xGwImsOrgId: string;
  authorization: string;
  xApiKey: string;
}

/**
 * getPrograms - parameters interface
 */
export interface IGetProgramsParams {
  xGwImsOrgId: string;
  authorization: string;
  xApiKey: string;
}

/**
 * ProgramsApi - API class
 */
@autoinject()
export class ProgramsApi extends Api {

  /**
   * Creates a new ProgramsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Delete Program
   * Delete an program
   * @param params.programId Identifier of the program
   * @param params.xGwImsOrgId IMS organization ID that the request is being made under.
   * @param params.authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
   * @param params.xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
   */
  async deleteProgram(params: IDeleteProgramParams): Promise<Program> {
    // Verify required parameters are set
    this.ensureParamIsSet('deleteProgram', params, 'programId');
    this.ensureParamIsSet('deleteProgram', params, 'xGwImsOrgId');
    this.ensureParamIsSet('deleteProgram', params, 'authorization');
    this.ensureParamIsSet('deleteProgram', params, 'xApiKey');

    // Create URL to call
    const url = `${this.basePath}/api/program/{programId}`
      .replace(`{${'programId'}}`, encodeURIComponent(`${params['programId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()
      .withHeader('x-gw-ims-org-id', params['xGwImsOrgId'])      .withHeader('Authorization', params['authorization'])      .withHeader('x-api-key', params['xApiKey'])
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get Program
   * Returns a program by its id
   * @param params.programId Identifier of the program
   * @param params.xGwImsOrgId IMS organization ID that the request is being made under.
   * @param params.authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
   * @param params.xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
   */
  async getProgram(params: IGetProgramParams): Promise<Program> {
    // Verify required parameters are set
    this.ensureParamIsSet('getProgram', params, 'programId');
    this.ensureParamIsSet('getProgram', params, 'xGwImsOrgId');
    this.ensureParamIsSet('getProgram', params, 'authorization');
    this.ensureParamIsSet('getProgram', params, 'xApiKey');

    // Create URL to call
    const url = `${this.basePath}/api/program/{programId}`
      .replace(`{${'programId'}}`, encodeURIComponent(`${params['programId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      .withHeader('x-gw-ims-org-id', params['xGwImsOrgId'])      .withHeader('Authorization', params['authorization'])      .withHeader('x-api-key', params['xApiKey'])
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Lists Programs
   * Returns all programs that the requesting user has access to
   * @param params.xGwImsOrgId IMS organization ID that the request is being made under.
   * @param params.authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
   * @param params.xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
   */
  async getPrograms(params: IGetProgramsParams): Promise<ProgramList> {
    // Verify required parameters are set
    this.ensureParamIsSet('getPrograms', params, 'xGwImsOrgId');
    this.ensureParamIsSet('getPrograms', params, 'authorization');
    this.ensureParamIsSet('getPrograms', params, 'xApiKey');

    // Create URL to call
    const url = `${this.basePath}/api/programs`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      .withHeader('x-gw-ims-org-id', params['xGwImsOrgId'])      .withHeader('Authorization', params['authorization'])      .withHeader('x-api-key', params['xApiKey'])
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

