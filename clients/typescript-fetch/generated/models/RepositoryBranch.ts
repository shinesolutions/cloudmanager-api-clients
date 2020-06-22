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
    RepositoryBranchLinks,
    RepositoryBranchLinksFromJSON,
    RepositoryBranchLinksFromJSONTyped,
    RepositoryBranchLinksToJSON,
} from './';

/**
 * Represents a Git Branch
 * @export
 * @interface RepositoryBranch
 */
export interface RepositoryBranch {
    /**
     * Identifier of the program. Unique within the space
     * @type {string}
     * @memberof RepositoryBranch
     */
    programId?: string;
    /**
     * Identifier of the repository
     * @type {number}
     * @memberof RepositoryBranch
     */
    repositoryId?: number;
    /**
     * Name of the branch
     * @type {string}
     * @memberof RepositoryBranch
     */
    name?: string;
    /**
     * 
     * @type {RepositoryBranchLinks}
     * @memberof RepositoryBranch
     */
    links?: RepositoryBranchLinks;
}

export function RepositoryBranchFromJSON(json: any): RepositoryBranch {
    return RepositoryBranchFromJSONTyped(json, false);
}

export function RepositoryBranchFromJSONTyped(json: any, ignoreDiscriminator: boolean): RepositoryBranch {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'programId': !exists(json, 'programId') ? undefined : json['programId'],
        'repositoryId': !exists(json, 'repositoryId') ? undefined : json['repositoryId'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'links': !exists(json, '_links') ? undefined : RepositoryBranchLinksFromJSON(json['_links']),
    };
}

export function RepositoryBranchToJSON(value?: RepositoryBranch | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'programId': value.programId,
        'repositoryId': value.repositoryId,
        'name': value.name,
        '_links': RepositoryBranchLinksToJSON(value.links),
    };
}


