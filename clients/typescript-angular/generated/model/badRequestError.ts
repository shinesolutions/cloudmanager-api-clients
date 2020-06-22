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
import { InvalidParameter } from './invalidParameter';
import { MissingParameter } from './missingParameter';


/**
 * A Bad Request response error.
 */
export interface BadRequestError { 
    /**
     * HTTP status code of the response.
     */
    status?: number;
    /**
     * Error type identifier.
     */
    type?: string;
    /**
     * A short summary of the error.
     */
    title?: string;
    /**
     * Request\'s missing parameters.
     */
    missingParams?: Array<MissingParameter>;
    /**
     * Request\'s invalid parameters.
     */
    invalidParams?: Array<InvalidParameter>;
}

