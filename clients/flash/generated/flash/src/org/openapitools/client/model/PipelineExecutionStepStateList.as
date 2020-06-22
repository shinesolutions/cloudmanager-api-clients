package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Object;
import org.openapitools.client.model.PipelineExecutionStepStateLinks;

    public class PipelineExecutionStepStateList implements ListWrapper {
        // This declaration below of _pipelineExecutionStepState_obj_class is to force flash compiler to include this class
        private var _pipelineExecutionStepState_obj_class: org.openapitools.client.model.PipelineExecutionStepState = null;
        [XmlElements(name="pipelineExecutionStepState", type="org.openapitools.client.model.PipelineExecutionStepState")]
        public var pipelineExecutionStepState: Array = new Array();

        public function getList(): Array{
            return pipelineExecutionStepState;
        }

}

}
