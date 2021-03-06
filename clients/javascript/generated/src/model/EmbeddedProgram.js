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
 *
 */

import ApiClient from '../ApiClient';

/**
 * The EmbeddedProgram model module.
 * @module model/EmbeddedProgram
 * @version 1.0.0
 */
class EmbeddedProgram {
    /**
     * Constructs a new <code>EmbeddedProgram</code>.
     * Describes an __Embedded Program__
     * @alias module:model/EmbeddedProgram
     */
    constructor() { 
        
        EmbeddedProgram.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EmbeddedProgram</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EmbeddedProgram} obj Optional instance to populate.
     * @return {module:model/EmbeddedProgram} The populated <code>EmbeddedProgram</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmbeddedProgram();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ApiClient.convertToType(data['enabled'], 'Boolean');
            }
            if (data.hasOwnProperty('tenantId')) {
                obj['tenantId'] = ApiClient.convertToType(data['tenantId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the program. Unique within the space.
 * @member {String} id
 */
EmbeddedProgram.prototype['id'] = undefined;

/**
 * Name of the program
 * @member {String} name
 */
EmbeddedProgram.prototype['name'] = undefined;

/**
 * Whether this Program has been enabled for Cloud Manager usage
 * @member {Boolean} enabled
 * @default false
 */
EmbeddedProgram.prototype['enabled'] = false;

/**
 * Tenant Id
 * @member {String} tenantId
 */
EmbeddedProgram.prototype['tenantId'] = undefined;






export default EmbeddedProgram;

