/* tslint:disable */
/* eslint-disable */
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface InvalidParameter
 */
export interface InvalidParameter {
    /**
     * Name of the invalid parameter.
     * @type {string}
     * @memberof InvalidParameter
     */
    name?: string;
    /**
     * Reason of why the parameter\'s value is not accepted.
     * @type {string}
     * @memberof InvalidParameter
     */
    reason?: string;
}

export function InvalidParameterFromJSON(json: any): InvalidParameter {
    return InvalidParameterFromJSONTyped(json, false);
}

export function InvalidParameterFromJSONTyped(json: any, ignoreDiscriminator: boolean): InvalidParameter {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'name': !exists(json, 'name') ? undefined : json['name'],
        'reason': !exists(json, 'reason') ? undefined : json['reason'],
    };
}

export function InvalidParameterToJSON(value?: InvalidParameter | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'name': value.name,
        'reason': value.reason,
    };
}


