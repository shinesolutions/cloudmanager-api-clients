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

import { RequestFile } from '../api';
import { PipelineExecutionEmbedded } from './pipelineExecutionEmbedded';
import { PipelineExecutionLinks } from './pipelineExecutionLinks';

/**
* Wraps a pipeline execution
*/
export class PipelineExecution {
    /**
    * Pipeline execution identifier
    */
    'id'?: string;
    /**
    * Identifier of the program. Unique within the space.
    */
    'programId'?: string;
    /**
    * Identifier of the pipeline. Unique within the space.
    */
    'pipelineId'?: string;
    /**
    * Version of the artifacts generated during this execution
    */
    'artifactsVersion'?: string;
    /**
    * AdobeID who started the pipeline. Empty for auto triggered builds
    */
    'user'?: string;
    /**
    * Status of the execution
    */
    'status'?: PipelineExecution.StatusEnum;
    /**
    * How the execution was triggered.
    */
    'trigger'?: PipelineExecution.TriggerEnum;
    /**
    * Start time
    */
    'createdAt'?: Date;
    /**
    * Date of last status change
    */
    'updatedAt'?: Date;
    /**
    * Date the execution reached a final state
    */
    'finishedAt'?: Date;
    'embedded'?: PipelineExecutionEmbedded;
    'links'?: PipelineExecutionLinks;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "programId",
            "baseName": "programId",
            "type": "string"
        },
        {
            "name": "pipelineId",
            "baseName": "pipelineId",
            "type": "string"
        },
        {
            "name": "artifactsVersion",
            "baseName": "artifactsVersion",
            "type": "string"
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "PipelineExecution.StatusEnum"
        },
        {
            "name": "trigger",
            "baseName": "trigger",
            "type": "PipelineExecution.TriggerEnum"
        },
        {
            "name": "createdAt",
            "baseName": "createdAt",
            "type": "Date"
        },
        {
            "name": "updatedAt",
            "baseName": "updatedAt",
            "type": "Date"
        },
        {
            "name": "finishedAt",
            "baseName": "finishedAt",
            "type": "Date"
        },
        {
            "name": "embedded",
            "baseName": "_embedded",
            "type": "PipelineExecutionEmbedded"
        },
        {
            "name": "links",
            "baseName": "_links",
            "type": "PipelineExecutionLinks"
        }    ];

    static getAttributeTypeMap() {
        return PipelineExecution.attributeTypeMap;
    }
}

export namespace PipelineExecution {
    export enum StatusEnum {
        NOTSTARTED = <any> 'NOT_STARTED',
        RUNNING = <any> 'RUNNING',
        CANCELLING = <any> 'CANCELLING',
        CANCELLED = <any> 'CANCELLED',
        FINISHED = <any> 'FINISHED',
        ERROR = <any> 'ERROR',
        FAILED = <any> 'FAILED'
    }
    export enum TriggerEnum {
        ONCOMMIT = <any> 'ON_COMMIT',
        MANUAL = <any> 'MANUAL',
        SCHEDULE = <any> 'SCHEDULE',
        PUSHUPGRADES = <any> 'PUSH_UPGRADES'
    }
}
