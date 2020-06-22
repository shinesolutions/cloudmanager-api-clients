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
import ProgramListEmbedded from './ProgramListEmbedded';
import ProgramListLinks from './ProgramListLinks';

/**
 * The ProgramList model module.
 * @module model/ProgramList
 * @version 1.0.0
 */
class ProgramList {
    /**
     * Constructs a new <code>ProgramList</code>.
     * @alias module:model/ProgramList
     */
    constructor() { 
        
        ProgramList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProgramList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProgramList} obj Optional instance to populate.
     * @return {module:model/ProgramList} The populated <code>ProgramList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProgramList();

            if (data.hasOwnProperty('_totalNumberOfItems')) {
                obj['_totalNumberOfItems'] = ApiClient.convertToType(data['_totalNumberOfItems'], 'Number');
            }
            if (data.hasOwnProperty('_embedded')) {
                obj['_embedded'] = ProgramListEmbedded.constructFromObject(data['_embedded']);
            }
            if (data.hasOwnProperty('_links')) {
                obj['_links'] = ProgramListLinks.constructFromObject(data['_links']);
            }
        }
        return obj;
    }


}

/**
 * @member {Number} _totalNumberOfItems
 */
ProgramList.prototype['_totalNumberOfItems'] = undefined;

/**
 * @member {module:model/ProgramListEmbedded} _embedded
 */
ProgramList.prototype['_embedded'] = undefined;

/**
 * @member {module:model/ProgramListLinks} _links
 */
ProgramList.prototype['_links'] = undefined;






export default ProgramList;

