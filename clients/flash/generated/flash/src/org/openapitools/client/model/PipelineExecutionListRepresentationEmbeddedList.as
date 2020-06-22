package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PipelineExecution;

    public class PipelineExecutionListRepresentationEmbeddedList implements ListWrapper {
        // This declaration below of _PipelineExecutionListRepresentation__embedded_obj_class is to force flash compiler to include this class
        private var _pipelineExecutionListRepresentationEmbedded_obj_class: org.openapitools.client.model.PipelineExecutionListRepresentationEmbedded = null;
        [XmlElements(name="pipelineExecutionListRepresentationEmbedded", type="org.openapitools.client.model.PipelineExecutionListRepresentationEmbedded")]
        public var pipelineExecutionListRepresentationEmbedded: Array = new Array();

        public function getList(): Array{
            return pipelineExecutionListRepresentationEmbedded;
        }

}

}
