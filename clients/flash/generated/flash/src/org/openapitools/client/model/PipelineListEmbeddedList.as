package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Pipeline;

    public class PipelineListEmbeddedList implements ListWrapper {
        // This declaration below of _pipelineList__embedded_obj_class is to force flash compiler to include this class
        private var _pipelineListEmbedded_obj_class: org.openapitools.client.model.PipelineListEmbedded = null;
        [XmlElements(name="pipelineListEmbedded", type="org.openapitools.client.model.PipelineListEmbedded")]
        public var pipelineListEmbedded: Array = new Array();

        public function getList(): Array{
            return pipelineListEmbedded;
        }

}

}
