package org.openapitools.client.model {

import org.openapitools.client.model.Metric;

    [XmlRootNode(name="PipelineStepMetrics")]
    public class PipelineStepMetrics {
        /* metrics */
        // This declaration below of _metrics_obj_class is to force flash compiler to include this class
        private var _metrics_obj_class: Array = null;
        [XmlElementWrapper(name="metrics")]
        [XmlElements(name="metrics", type="Array")]
                public var metrics: Array = new Array();

    public function toString(): String {
        var str: String = "PipelineStepMetrics: ";
        str += " (metrics: " + metrics + ")";
        return str;
    }

}

}
