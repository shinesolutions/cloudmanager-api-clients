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

export class EnvironmentLinks {
    'httpNsAdobeComAdobecloudRelProgram'?: HalLink;
    'httpNsAdobeComAdobecloudRelPipeline'?: HalLink;
    'httpNsAdobeComAdobecloudRelAuthor'?: HalLink;
    'httpNsAdobeComAdobecloudRelPublish'?: HalLink;
    'httpNsAdobeComAdobecloudRelDeveloperConsole'?: HalLink;
    'httpNsAdobeComAdobecloudRelLogs'?: HalLink;
    'httpNsAdobeComAdobecloudRelVariables'?: HalLink;
    'self'?: HalLink;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "httpNsAdobeComAdobecloudRelProgram",
            "baseName": "http://ns.adobe.com/adobecloud/rel/program",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelPipeline",
            "baseName": "http://ns.adobe.com/adobecloud/rel/pipeline",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelAuthor",
            "baseName": "http://ns.adobe.com/adobecloud/rel/author",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelPublish",
            "baseName": "http://ns.adobe.com/adobecloud/rel/publish",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelDeveloperConsole",
            "baseName": "http://ns.adobe.com/adobecloud/rel/developerConsole",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelLogs",
            "baseName": "http://ns.adobe.com/adobecloud/rel/logs",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelVariables",
            "baseName": "http://ns.adobe.com/adobecloud/rel/variables",
            "type": "HalLink"
        },
        {
            "name": "self",
            "baseName": "self",
            "type": "HalLink"
        }    ];

    static getAttributeTypeMap() {
        return EnvironmentLinks.attributeTypeMap;
    }
}

