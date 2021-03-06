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
import { HalLink } from './halLink';

export class PipelineLinks {
    'httpNsAdobeComAdobecloudRelProgram'?: HalLink;
    'httpNsAdobeComAdobecloudRelExecution'?: HalLink;
    'httpNsAdobeComAdobecloudRelExecutions'?: HalLink;
    'httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution'?: HalLink;
    'self'?: HalLink;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "httpNsAdobeComAdobecloudRelProgram",
            "baseName": "http://ns.adobe.com/adobecloud/rel/program",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelExecution",
            "baseName": "http://ns.adobe.com/adobecloud/rel/execution",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelExecutions",
            "baseName": "http://ns.adobe.com/adobecloud/rel/executions",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution",
            "baseName": "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution",
            "type": "HalLink"
        },
        {
            "name": "self",
            "baseName": "self",
            "type": "HalLink"
        }    ];

    static getAttributeTypeMap() {
        return PipelineLinks.attributeTypeMap;
    }
}

