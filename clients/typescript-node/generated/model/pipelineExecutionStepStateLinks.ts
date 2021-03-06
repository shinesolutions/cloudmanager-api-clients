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

export class PipelineExecutionStepStateLinks {
    'httpNsAdobeComAdobecloudRelExecution'?: HalLink;
    'httpNsAdobeComAdobecloudRelPipeline'?: HalLink;
    'httpNsAdobeComAdobecloudRelPipelineLogs'?: HalLink;
    'httpNsAdobeComAdobecloudRelPipelineMetrics'?: HalLink;
    'httpNsAdobeComAdobecloudRelPipelineAdvance'?: HalLink;
    'httpNsAdobeComAdobecloudRelPipelineCancel'?: HalLink;
    'httpNsAdobeComAdobecloudRelProgram'?: HalLink;
    'self'?: HalLink;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "httpNsAdobeComAdobecloudRelExecution",
            "baseName": "http://ns.adobe.com/adobecloud/rel/execution",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelPipeline",
            "baseName": "http://ns.adobe.com/adobecloud/rel/pipeline",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelPipelineLogs",
            "baseName": "http://ns.adobe.com/adobecloud/rel/pipeline/logs",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelPipelineMetrics",
            "baseName": "http://ns.adobe.com/adobecloud/rel/pipeline/metrics",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelPipelineAdvance",
            "baseName": "http://ns.adobe.com/adobecloud/rel/pipeline/advance",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelPipelineCancel",
            "baseName": "http://ns.adobe.com/adobecloud/rel/pipeline/cancel",
            "type": "HalLink"
        },
        {
            "name": "httpNsAdobeComAdobecloudRelProgram",
            "baseName": "http://ns.adobe.com/adobecloud/rel/program",
            "type": "HalLink"
        },
        {
            "name": "self",
            "baseName": "self",
            "type": "HalLink"
        }    ];

    static getAttributeTypeMap() {
        return PipelineExecutionStepStateLinks.attributeTypeMap;
    }
}

