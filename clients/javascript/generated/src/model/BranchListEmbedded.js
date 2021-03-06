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
import RepositoryBranch from './RepositoryBranch';

/**
 * The BranchListEmbedded model module.
 * @module model/BranchListEmbedded
 * @version 1.0.0
 */
class BranchListEmbedded {
    /**
     * Constructs a new <code>BranchListEmbedded</code>.
     * @alias module:model/BranchListEmbedded
     */
    constructor() { 
        
        BranchListEmbedded.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BranchListEmbedded</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BranchListEmbedded} obj Optional instance to populate.
     * @return {module:model/BranchListEmbedded} The populated <code>BranchListEmbedded</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BranchListEmbedded();

            if (data.hasOwnProperty('branches')) {
                obj['branches'] = ApiClient.convertToType(data['branches'], [RepositoryBranch]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/RepositoryBranch>} branches
 */
BranchListEmbedded.prototype['branches'] = undefined;






export default BranchListEmbedded;

