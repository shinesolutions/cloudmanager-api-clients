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
import RepositoryLinks from './RepositoryLinks';

/**
 * The Repository model module.
 * @module model/Repository
 * @version 1.0.0
 */
class Repository {
    /**
     * Constructs a new <code>Repository</code>.
     * A sourcecode repository
     * @alias module:model/Repository
     */
    constructor() { 
        
        Repository.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Repository</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Repository} obj Optional instance to populate.
     * @return {module:model/Repository} The populated <code>Repository</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Repository();

            if (data.hasOwnProperty('repo')) {
                obj['repo'] = ApiClient.convertToType(data['repo'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('_links')) {
                obj['_links'] = RepositoryLinks.constructFromObject(data['_links']);
            }
        }
        return obj;
    }


}

/**
 * Repository name
 * @member {String} repo
 */
Repository.prototype['repo'] = undefined;

/**
 * description
 * @member {String} description
 */
Repository.prototype['description'] = undefined;

/**
 * @member {module:model/RepositoryLinks} _links
 */
Repository.prototype['_links'] = undefined;






export default Repository;

