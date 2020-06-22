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
import HalLink from './HalLink';

/**
 * The PipelineExecutionLinks model module.
 * @module model/PipelineExecutionLinks
 * @version 1.0.0
 */
class PipelineExecutionLinks {
    /**
     * Constructs a new <code>PipelineExecutionLinks</code>.
     * @alias module:model/PipelineExecutionLinks
     */
    constructor() { 
        
        PipelineExecutionLinks.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PipelineExecutionLinks</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PipelineExecutionLinks} obj Optional instance to populate.
     * @return {module:model/PipelineExecutionLinks} The populated <code>PipelineExecutionLinks</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PipelineExecutionLinks();

            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/program')) {
                obj['http://ns.adobe.com/adobecloud/rel/program'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/program']);
            }
            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/pipeline')) {
                obj['http://ns.adobe.com/adobecloud/rel/pipeline'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/pipeline']);
            }
            if (data.hasOwnProperty('self')) {
                obj['self'] = HalLink.constructFromObject(data['self']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/program
 */
PipelineExecutionLinks.prototype['http://ns.adobe.com/adobecloud/rel/program'] = undefined;

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/pipeline
 */
PipelineExecutionLinks.prototype['http://ns.adobe.com/adobecloud/rel/pipeline'] = undefined;

/**
 * @member {module:model/HalLink} self
 */
PipelineExecutionLinks.prototype['self'] = undefined;






export default PipelineExecutionLinks;

