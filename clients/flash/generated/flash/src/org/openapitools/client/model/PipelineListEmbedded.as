package org.openapitools.client.model {

import org.openapitools.client.model.Pipeline;

    [XmlRootNode(name="PipelineListEmbedded")]
    public class PipelineListEmbedded {
                // This declaration below of _pipelines_obj_class is to force flash compiler to include this class
        private var _pipelines_obj_class: Array = null;
        [XmlElementWrapper(name="pipelines")]
        [XmlElements(name="pipelines", type="Array")]
                public var pipelines: Array = new Array();

    public function toString(): String {
        var str: String = "PipelineListEmbedded: ";
        str += " (pipelines: " + pipelines + ")";
        return str;
    }

}

}
