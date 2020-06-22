package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PipelineListEmbedded;
import org.openapitools.client.model.ProgramListLinks;

    public class PipelineListList implements ListWrapper {
        // This declaration below of _pipelineList_obj_class is to force flash compiler to include this class
        private var _pipelineList_obj_class: org.openapitools.client.model.PipelineList = null;
        [XmlElements(name="pipelineList", type="org.openapitools.client.model.PipelineList")]
        public var pipelineList: Array = new Array();

        public function getList(): Array{
            return pipelineList;
        }

}

}
