package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PipelineExecutionEmbedded;
import org.openapitools.client.model.PipelineExecutionLinks;

    public class PipelineExecutionList implements ListWrapper {
        // This declaration below of _pipelineExecution_obj_class is to force flash compiler to include this class
        private var _pipelineExecution_obj_class: org.openapitools.client.model.PipelineExecution = null;
        [XmlElements(name="pipelineExecution", type="org.openapitools.client.model.PipelineExecution")]
        public var pipelineExecution: Array = new Array();

        public function getList(): Array{
            return pipelineExecution;
        }

}

}
