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
    BranchListEmbedded,
    BranchListEmbeddedFromJSON,
    BranchListEmbeddedFromJSONTyped,
    BranchListEmbeddedToJSON,
    ProgramListLinks,
    ProgramListLinksFromJSON,
    ProgramListLinksFromJSONTyped,
    ProgramListLinksToJSON,
} from './';

/**
 * 
 * @export
 * @interface BranchList
 */
export interface BranchList {
    /**
     * 
     * @type {number}
     * @memberof BranchList
     */
    totalNumberOfItems?: number;
    /**
     * 
     * @type {BranchListEmbedded}
     * @memberof BranchList
     */
    embedded?: BranchListEmbedded;
    /**
     * 
     * @type {ProgramListLinks}
     * @memberof BranchList
     */
    links?: ProgramListLinks;
}

export function BranchListFromJSON(json: any): BranchList {
    return BranchListFromJSONTyped(json, false);
}

export function BranchListFromJSONTyped(json: any, ignoreDiscriminator: boolean): BranchList {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'totalNumberOfItems': !exists(json, '_totalNumberOfItems') ? undefined : json['_totalNumberOfItems'],
        'embedded': !exists(json, '_embedded') ? undefined : BranchListEmbeddedFromJSON(json['_embedded']),
        'links': !exists(json, '_links') ? undefined : ProgramListLinksFromJSON(json['_links']),
    };
}

export function BranchListToJSON(value?: BranchList | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        '_totalNumberOfItems': value.totalNumberOfItems,
        '_embedded': BranchListEmbeddedToJSON(value.embedded),
        '_links': ProgramListLinksToJSON(value.links),
    };
}


