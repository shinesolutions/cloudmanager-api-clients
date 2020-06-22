package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class PipelineExecutionStepStateLinksList implements ListWrapper {
        // This declaration below of _pipelineExecutionStepState__links_obj_class is to force flash compiler to include this class
        private var _pipelineExecutionStepStateLinks_obj_class: org.openapitools.client.model.PipelineExecutionStepStateLinks = null;
        [XmlElements(name="pipelineExecutionStepStateLinks", type="org.openapitools.client.model.PipelineExecutionStepStateLinks")]
        public var pipelineExecutionStepStateLinks: Array = new Array();

        public function getList(): Array{
            return pipelineExecutionStepStateLinks;
        }

}

}
