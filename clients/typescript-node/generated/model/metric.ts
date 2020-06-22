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

/**
* Describes a __Metric__
*/
export class Metric {
    /**
    * KPI result identifier
    */
    'id'?: string;
    /**
    * Severity of the metric
    */
    'severity'?: Metric.SeverityEnum;
    /**
    * Whether metric is considered passed
    */
    'passed'?: boolean;
    /**
    * Whether user override the failed metric
    */
    'override'?: boolean;
    /**
    * Expected value for the metric
    */
    'actualValue'?: string;
    /**
    * Expected value for the metric
    */
    'expectedValue'?: string;
    /**
    * Comparator used for the metric
    */
    'comparator'?: Metric.ComparatorEnum;
    /**
    * KPI identifier
    */
    'kpi'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "severity",
            "baseName": "severity",
            "type": "Metric.SeverityEnum"
        },
        {
            "name": "passed",
            "baseName": "passed",
            "type": "boolean"
        },
        {
            "name": "override",
            "baseName": "override",
            "type": "boolean"
        },
        {
            "name": "actualValue",
            "baseName": "actualValue",
            "type": "string"
        },
        {
            "name": "expectedValue",
            "baseName": "expectedValue",
            "type": "string"
        },
        {
            "name": "comparator",
            "baseName": "comparator",
            "type": "Metric.ComparatorEnum"
        },
        {
            "name": "kpi",
            "baseName": "kpi",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Metric.attributeTypeMap;
    }
}

export namespace Metric {
    export enum SeverityEnum {
        Critical = <any> 'critical',
        Important = <any> 'important',
        Informational = <any> 'informational'
    }
    export enum ComparatorEnum {
        GT = <any> 'GT',
        GTE = <any> 'GTE',
        LT = <any> 'LT',
        LTE = <any> 'LTE',
        EQ = <any> 'EQ',
        NEQ = <any> 'NEQ'
    }
}
