package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class PipelinePhaseList implements ListWrapper {
        // This declaration below of _pipelinePhase_obj_class is to force flash compiler to include this class
        private var _pipelinePhase_obj_class: org.openapitools.client.model.PipelinePhase = null;
        [XmlElements(name="pipelinePhase", type="org.openapitools.client.model.PipelinePhase")]
        public var pipelinePhase: Array = new Array();

        public function getList(): Array{
            return pipelinePhase;
        }

}

}
