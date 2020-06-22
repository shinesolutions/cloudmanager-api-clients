package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PipelineExecutionStepState;

    public class PipelineExecutionEmbeddedList implements ListWrapper {
        // This declaration below of _pipelineExecution__embedded_obj_class is to force flash compiler to include this class
        private var _pipelineExecutionEmbedded_obj_class: org.openapitools.client.model.PipelineExecutionEmbedded = null;
        [XmlElements(name="pipelineExecutionEmbedded", type="org.openapitools.client.model.PipelineExecutionEmbedded")]
        public var pipelineExecutionEmbedded: Array = new Array();

        public function getList(): Array{
            return pipelineExecutionEmbedded;
        }

}

}
