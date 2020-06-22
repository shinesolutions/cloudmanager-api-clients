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
* A named value than can be set on an Environment
*/
export class Variable {
    /**
    * Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
    */
    'name'?: string;
    /**
    * Value of the variable. Read-Write for non-secrets, write-only for secrets.
    */
    'value'?: string;
    /**
    * Type of the variable. Default `string` if missing. Cannot be changed after creation.
    */
    'type'?: Variable.TypeEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "Variable.TypeEnum"
        }    ];

    static getAttributeTypeMap() {
        return Variable.attributeTypeMap;
    }
}

export namespace Variable {
    export enum TypeEnum {
        String = <any> 'string',
        SecretString = <any> 'secretString'
    }
}
