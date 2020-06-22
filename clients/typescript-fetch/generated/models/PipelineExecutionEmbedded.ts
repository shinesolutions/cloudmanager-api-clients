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
    PipelineExecutionStepState,
    PipelineExecutionStepStateFromJSON,
    PipelineExecutionStepStateFromJSONTyped,
    PipelineExecutionStepStateToJSON,
} from './';

/**
 * 
 * @export
 * @interface PipelineExecutionEmbedded
 */
export interface PipelineExecutionEmbedded {
    /**
     * 
     * @type {Array<PipelineExecutionStepState>}
     * @memberof PipelineExecutionEmbedded
     */
    stepStates?: Array<PipelineExecutionStepState>;
}

export function PipelineExecutionEmbeddedFromJSON(json: any): PipelineExecutionEmbedded {
    return PipelineExecutionEmbeddedFromJSONTyped(json, false);
}

export function PipelineExecutionEmbeddedFromJSONTyped(json: any, ignoreDiscriminator: boolean): PipelineExecutionEmbedded {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'stepStates': !exists(json, 'stepStates') ? undefined : ((json['stepStates'] as Array<any>).map(PipelineExecutionStepStateFromJSON)),
    };
}

export function PipelineExecutionEmbeddedToJSON(value?: PipelineExecutionEmbedded | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'stepStates': value.stepStates === undefined ? undefined : ((value.stepStates as Array<any>).map(PipelineExecutionStepStateToJSON)),
    };
}


