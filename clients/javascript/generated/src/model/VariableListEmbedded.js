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
import Variable from './Variable';

/**
 * The VariableListEmbedded model module.
 * @module model/VariableListEmbedded
 * @version 1.0.0
 */
class VariableListEmbedded {
    /**
     * Constructs a new <code>VariableListEmbedded</code>.
     * @alias module:model/VariableListEmbedded
     */
    constructor() { 
        
        VariableListEmbedded.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VariableListEmbedded</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VariableListEmbedded} obj Optional instance to populate.
     * @return {module:model/VariableListEmbedded} The populated <code>VariableListEmbedded</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VariableListEmbedded();

            if (data.hasOwnProperty('variables')) {
                obj['variables'] = ApiClient.convertToType(data['variables'], [Variable]);
            }
        }
        return obj;
    }


}

/**
 * Variables set on environment
 * @member {Array.<module:model/Variable>} variables
 */
VariableListEmbedded.prototype['variables'] = undefined;






export default VariableListEmbedded;

