package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class PipelineExecutionLinksList implements ListWrapper {
        // This declaration below of _pipelineExecution__links_obj_class is to force flash compiler to include this class
        private var _pipelineExecutionLinks_obj_class: org.openapitools.client.model.PipelineExecutionLinks = null;
        [XmlElements(name="pipelineExecutionLinks", type="org.openapitools.client.model.PipelineExecutionLinks")]
        public var pipelineExecutionLinks: Array = new Array();

        public function getList(): Array{
            return pipelineExecutionLinks;
        }

}

}
