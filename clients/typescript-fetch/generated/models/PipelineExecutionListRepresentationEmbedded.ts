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
    PipelineExecution,
    PipelineExecutionFromJSON,
    PipelineExecutionFromJSONTyped,
    PipelineExecutionToJSON,
} from './';

/**
 * 
 * @export
 * @interface PipelineExecutionListRepresentationEmbedded
 */
export interface PipelineExecutionListRepresentationEmbedded {
    /**
     * 
     * @type {Array<PipelineExecution>}
     * @memberof PipelineExecutionListRepresentationEmbedded
     */
    executions?: Array<PipelineExecution>;
}

export function PipelineExecutionListRepresentationEmbeddedFromJSON(json: any): PipelineExecutionListRepresentationEmbedded {
    return PipelineExecutionListRepresentationEmbeddedFromJSONTyped(json, false);
}

export function PipelineExecutionListRepresentationEmbeddedFromJSONTyped(json: any, ignoreDiscriminator: boolean): PipelineExecutionListRepresentationEmbedded {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'executions': !exists(json, 'executions') ? undefined : ((json['executions'] as Array<any>).map(PipelineExecutionFromJSON)),
    };
}

export function PipelineExecutionListRepresentationEmbeddedToJSON(value?: PipelineExecutionListRepresentationEmbedded | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'executions': value.executions === undefined ? undefined : ((value.executions as Array<any>).map(PipelineExecutionToJSON)),
    };
}


