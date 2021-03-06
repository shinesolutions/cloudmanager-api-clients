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
    EnvironmentLog,
    EnvironmentLogFromJSON,
    EnvironmentLogFromJSONTyped,
    EnvironmentLogToJSON,
} from './';

/**
 * 
 * @export
 * @interface EnvironmentLogsEmbedded
 */
export interface EnvironmentLogsEmbedded {
    /**
     * Links to logs
     * @type {Array<EnvironmentLog>}
     * @memberof EnvironmentLogsEmbedded
     */
    downloads?: Array<EnvironmentLog>;
}

export function EnvironmentLogsEmbeddedFromJSON(json: any): EnvironmentLogsEmbedded {
    return EnvironmentLogsEmbeddedFromJSONTyped(json, false);
}

export function EnvironmentLogsEmbeddedFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnvironmentLogsEmbedded {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'downloads': !exists(json, 'downloads') ? undefined : ((json['downloads'] as Array<any>).map(EnvironmentLogFromJSON)),
    };
}

export function EnvironmentLogsEmbeddedToJSON(value?: EnvironmentLogsEmbedded | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'downloads': value.downloads === undefined ? undefined : ((value.downloads as Array<any>).map(EnvironmentLogToJSON)),
    };
}


