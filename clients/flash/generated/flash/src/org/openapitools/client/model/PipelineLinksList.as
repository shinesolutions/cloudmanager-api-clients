package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class PipelineLinksList implements ListWrapper {
        // This declaration below of _Pipeline__links_obj_class is to force flash compiler to include this class
        private var _pipelineLinks_obj_class: org.openapitools.client.model.PipelineLinks = null;
        [XmlElements(name="pipelineLinks", type="org.openapitools.client.model.PipelineLinks")]
        public var pipelineLinks: Array = new Array();

        public function getList(): Array{
            return pipelineLinks;
        }

}

}
