package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class PipelineExecutionListRepresentationLinksList implements ListWrapper {
        // This declaration below of _PipelineExecutionListRepresentation__links_obj_class is to force flash compiler to include this class
        private var _pipelineExecutionListRepresentationLinks_obj_class: org.openapitools.client.model.PipelineExecutionListRepresentationLinks = null;
        [XmlElements(name="pipelineExecutionListRepresentationLinks", type="org.openapitools.client.model.PipelineExecutionListRepresentationLinks")]
        public var pipelineExecutionListRepresentationLinks: Array = new Array();

        public function getList(): Array{
            return pipelineExecutionListRepresentationLinks;
        }

}

}
