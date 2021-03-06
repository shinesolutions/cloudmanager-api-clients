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
 * The PipelineExecutionStepStateLinks model module.
 * @module model/PipelineExecutionStepStateLinks
 * @version 1.0.0
 */
class PipelineExecutionStepStateLinks {
    /**
     * Constructs a new <code>PipelineExecutionStepStateLinks</code>.
     * @alias module:model/PipelineExecutionStepStateLinks
     */
    constructor() { 
        
        PipelineExecutionStepStateLinks.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PipelineExecutionStepStateLinks</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PipelineExecutionStepStateLinks} obj Optional instance to populate.
     * @return {module:model/PipelineExecutionStepStateLinks} The populated <code>PipelineExecutionStepStateLinks</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PipelineExecutionStepStateLinks();

            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/execution')) {
                obj['http://ns.adobe.com/adobecloud/rel/execution'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/execution']);
            }
            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/pipeline')) {
                obj['http://ns.adobe.com/adobecloud/rel/pipeline'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/pipeline']);
            }
            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/pipeline/logs')) {
                obj['http://ns.adobe.com/adobecloud/rel/pipeline/logs'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/pipeline/logs']);
            }
            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/pipeline/metrics')) {
                obj['http://ns.adobe.com/adobecloud/rel/pipeline/metrics'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/pipeline/metrics']);
            }
            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/pipeline/advance')) {
                obj['http://ns.adobe.com/adobecloud/rel/pipeline/advance'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/pipeline/advance']);
            }
            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/pipeline/cancel')) {
                obj['http://ns.adobe.com/adobecloud/rel/pipeline/cancel'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/pipeline/cancel']);
            }
            if (data.hasOwnProperty('http://ns.adobe.com/adobecloud/rel/program')) {
                obj['http://ns.adobe.com/adobecloud/rel/program'] = HalLink.constructFromObject(data['http://ns.adobe.com/adobecloud/rel/program']);
            }
            if (data.hasOwnProperty('self')) {
                obj['self'] = HalLink.constructFromObject(data['self']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/execution
 */
PipelineExecutionStepStateLinks.prototype['http://ns.adobe.com/adobecloud/rel/execution'] = undefined;

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/pipeline
 */
PipelineExecutionStepStateLinks.prototype['http://ns.adobe.com/adobecloud/rel/pipeline'] = undefined;

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/pipeline/logs
 */
PipelineExecutionStepStateLinks.prototype['http://ns.adobe.com/adobecloud/rel/pipeline/logs'] = undefined;

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/pipeline/metrics
 */
PipelineExecutionStepStateLinks.prototype['http://ns.adobe.com/adobecloud/rel/pipeline/metrics'] = undefined;

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/pipeline/advance
 */
PipelineExecutionStepStateLinks.prototype['http://ns.adobe.com/adobecloud/rel/pipeline/advance'] = undefined;

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/pipeline/cancel
 */
PipelineExecutionStepStateLinks.prototype['http://ns.adobe.com/adobecloud/rel/pipeline/cancel'] = undefined;

/**
 * @member {module:model/HalLink} http://ns.adobe.com/adobecloud/rel/program
 */
PipelineExecutionStepStateLinks.prototype['http://ns.adobe.com/adobecloud/rel/program'] = undefined;

/**
 * @member {module:model/HalLink} self
 */
PipelineExecutionStepStateLinks.prototype['self'] = undefined;






export default PipelineExecutionStepStateLinks;

