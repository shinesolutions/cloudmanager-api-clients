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
    HalLink,
    HalLinkFromJSON,
    HalLinkFromJSONTyped,
    HalLinkToJSON,
} from './';

/**
 * 
 * @export
 * @interface VariableListLinks
 */
export interface VariableListLinks {
    /**
     * 
     * @type {HalLink}
     * @memberof VariableListLinks
     */
    httpNsAdobeComAdobecloudRelEnvironment?: HalLink;
    /**
     * 
     * @type {HalLink}
     * @memberof VariableListLinks
     */
    httpNsAdobeComAdobecloudRelProgram?: HalLink;
    /**
     * 
     * @type {HalLink}
     * @memberof VariableListLinks
     */
    self?: HalLink;
}

export function VariableListLinksFromJSON(json: any): VariableListLinks {
    return VariableListLinksFromJSONTyped(json, false);
}

export function VariableListLinksFromJSONTyped(json: any, ignoreDiscriminator: boolean): VariableListLinks {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'httpNsAdobeComAdobecloudRelEnvironment': !exists(json, 'http://ns.adobe.com/adobecloud/rel/environment') ? undefined : HalLinkFromJSON(json['http://ns.adobe.com/adobecloud/rel/environment']),
        'httpNsAdobeComAdobecloudRelProgram': !exists(json, 'http://ns.adobe.com/adobecloud/rel/program') ? undefined : HalLinkFromJSON(json['http://ns.adobe.com/adobecloud/rel/program']),
        'self': !exists(json, 'self') ? undefined : HalLinkFromJSON(json['self']),
    };
}

export function VariableListLinksToJSON(value?: VariableListLinks | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'http://ns.adobe.com/adobecloud/rel/environment': HalLinkToJSON(value.httpNsAdobeComAdobecloudRelEnvironment),
        'http://ns.adobe.com/adobecloud/rel/program': HalLinkToJSON(value.httpNsAdobeComAdobecloudRelProgram),
        'self': HalLinkToJSON(value.self),
    };
}


