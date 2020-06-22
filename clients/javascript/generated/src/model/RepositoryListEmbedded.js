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
import Repository from './Repository';

/**
 * The RepositoryListEmbedded model module.
 * @module model/RepositoryListEmbedded
 * @version 1.0.0
 */
class RepositoryListEmbedded {
    /**
     * Constructs a new <code>RepositoryListEmbedded</code>.
     * @alias module:model/RepositoryListEmbedded
     */
    constructor() { 
        
        RepositoryListEmbedded.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RepositoryListEmbedded</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RepositoryListEmbedded} obj Optional instance to populate.
     * @return {module:model/RepositoryListEmbedded} The populated <code>RepositoryListEmbedded</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RepositoryListEmbedded();

            if (data.hasOwnProperty('repositories')) {
                obj['repositories'] = ApiClient.convertToType(data['repositories'], [Repository]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/Repository>} repositories
 */
RepositoryListEmbedded.prototype['repositories'] = undefined;






export default RepositoryListEmbedded;

