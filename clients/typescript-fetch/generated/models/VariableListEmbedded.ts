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
import {
    Variable,
    VariableFromJSON,
    VariableFromJSONTyped,
    VariableToJSON,
} from './';

/**
 * 
 * @export
 * @interface VariableListEmbedded
 */
export interface VariableListEmbedded {
    /**
     * Variables set on environment
     * @type {Array<Variable>}
     * @memberof VariableListEmbedded
     */
    variables?: Array<Variable>;
}

export function VariableListEmbeddedFromJSON(json: any): VariableListEmbedded {
    return VariableListEmbeddedFromJSONTyped(json, false);
}

export function VariableListEmbeddedFromJSONTyped(json: any, ignoreDiscriminator: boolean): VariableListEmbedded {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'variables': !exists(json, 'variables') ? undefined : ((json['variables'] as Array<any>).map(VariableFromJSON)),
    };
}

export function VariableListEmbeddedToJSON(value?: VariableListEmbedded | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'variables': value.variables === undefined ? undefined : ((value.variables as Array<any>).map(VariableToJSON)),
    };
}


