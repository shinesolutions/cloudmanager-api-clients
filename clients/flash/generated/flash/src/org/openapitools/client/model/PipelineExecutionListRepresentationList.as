package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PipelineExecutionListRepresentationEmbedded;
import org.openapitools.client.model.PipelineExecutionListRepresentationLinks;
import org.openapitools.client.model.RequestedPageDetails;

    public class PipelineExecutionListRepresentationList implements ListWrapper {
        // This declaration below of _PipelineExecutionListRepresentation_obj_class is to force flash compiler to include this class
        private var _pipelineExecutionListRepresentation_obj_class: org.openapitools.client.model.PipelineExecutionListRepresentation = null;
        [XmlElements(name="pipelineExecutionListRepresentation", type="org.openapitools.client.model.PipelineExecutionListRepresentation")]
        public var pipelineExecutionListRepresentation: Array = new Array();

        public function getList(): Array{
            return pipelineExecutionListRepresentation;
        }

}

}
