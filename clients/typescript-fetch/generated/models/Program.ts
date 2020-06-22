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
    ProgramLinks,
    ProgramLinksFromJSON,
    ProgramLinksFromJSONTyped,
    ProgramLinksToJSON,
} from './';

/**
 * Describes a __Program__
 * @export
 * @interface Program
 */
export interface Program {
    /**
     * Identifier of the program. Unique within the space.
     * @type {string}
     * @memberof Program
     */
    id?: string;
    /**
     * Name of the program
     * @type {string}
     * @memberof Program
     */
    name: string;
    /**
     * Whether this Program has been enabled for Cloud Manager usage
     * @type {boolean}
     * @memberof Program
     */
    enabled?: boolean;
    /**
     * Tenant Id
     * @type {string}
     * @memberof Program
     */
    tenantId?: string;
    /**
     * Organisation Id
     * @type {string}
     * @memberof Program
     */
    imsOrgId?: string;
    /**
     * 
     * @type {ProgramLinks}
     * @memberof Program
     */
    links?: ProgramLinks;
}

export function ProgramFromJSON(json: any): Program {
    return ProgramFromJSONTyped(json, false);
}

export function ProgramFromJSONTyped(json: any, ignoreDiscriminator: boolean): Program {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': !exists(json, 'id') ? undefined : json['id'],
        'name': json['name'],
        'enabled': !exists(json, 'enabled') ? undefined : json['enabled'],
        'tenantId': !exists(json, 'tenantId') ? undefined : json['tenantId'],
        'imsOrgId': !exists(json, 'imsOrgId') ? undefined : json['imsOrgId'],
        'links': !exists(json, '_links') ? undefined : ProgramLinksFromJSON(json['_links']),
    };
}

export function ProgramToJSON(value?: Program | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'name': value.name,
        'enabled': value.enabled,
        'tenantId': value.tenantId,
        'imsOrgId': value.imsOrgId,
        '_links': ProgramLinksToJSON(value.links),
    };
}


