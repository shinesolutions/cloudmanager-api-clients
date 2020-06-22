package org.openapitools.client.model {

import org.openapitools.client.model.PipelineExecution;

    [XmlRootNode(name="PipelineExecutionListRepresentationEmbedded")]
    public class PipelineExecutionListRepresentationEmbedded {
                // This declaration below of _executions_obj_class is to force flash compiler to include this class
        private var _executions_obj_class: Array = null;
        [XmlElementWrapper(name="executions")]
        [XmlElements(name="executions", type="Array")]
                public var executions: Array = new Array();

    public function toString(): String {
        var str: String = "PipelineExecutionListRepresentationEmbedded: ";
        str += " (executions: " + executions + ")";
        return str;
    }

}

}
