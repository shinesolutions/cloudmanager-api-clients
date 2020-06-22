package org.openapitools.client.model {

import org.openapitools.client.model.PipelineExecutionStepState;

    [XmlRootNode(name="PipelineExecutionEmbedded")]
    public class PipelineExecutionEmbedded {
                // This declaration below of _stepStates_obj_class is to force flash compiler to include this class
        private var _stepStates_obj_class: Array = null;
        [XmlElementWrapper(name="stepStates")]
        [XmlElements(name="stepStates", type="Array")]
                public var stepStates: Array = new Array();

    public function toString(): String {
        var str: String = "PipelineExecutionEmbedded: ";
        str += " (stepStates: " + stepStates + ")";
        return str;
    }

}

}
