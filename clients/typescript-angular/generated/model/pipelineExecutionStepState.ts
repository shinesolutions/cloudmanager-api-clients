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
import { PipelineExecutionStepStateLinks } from './pipelineExecutionStepStateLinks';


/**
 * Describes the status of a particular pipeline execution step for display purposes
 */
export interface PipelineExecutionStepState { 
    id?: string;
    stepId?: string;
    phaseId?: string;
    /**
     * Name of the action
     */
    action?: string;
    /**
     * Target repository
     */
    repository?: string;
    /**
     * Target branch
     */
    branch?: string;
    /**
     * Target environment
     */
    environment?: string;
    /**
     * Target environment type
     */
    environmentType?: string;
    /**
     * Start time
     */
    startedAt?: string;
    /**
     * Date the execution reached a final state
     */
    finishedAt?: string;
    /**
     * Information about step result
     */
    details?: { [key: string]: object; };
    /**
     * Action status
     */
    status?: PipelineExecutionStepState.StatusEnum;
    _links?: PipelineExecutionStepStateLinks;
}
export namespace PipelineExecutionStepState {
    export type StatusEnum = 'NOT_STARTED' | 'RUNNING' | 'FINISHED' | 'ERROR' | 'ROLLING_BACK' | 'ROLLED_BACK' | 'WAITING' | 'CANCELLED' | 'FAILED';
    export const StatusEnum = {
        NOTSTARTED: 'NOT_STARTED' as StatusEnum,
        RUNNING: 'RUNNING' as StatusEnum,
        FINISHED: 'FINISHED' as StatusEnum,
        ERROR: 'ERROR' as StatusEnum,
        ROLLINGBACK: 'ROLLING_BACK' as StatusEnum,
        ROLLEDBACK: 'ROLLED_BACK' as StatusEnum,
        WAITING: 'WAITING' as StatusEnum,
        CANCELLED: 'CANCELLED' as StatusEnum,
        FAILED: 'FAILED' as StatusEnum
    };
}


