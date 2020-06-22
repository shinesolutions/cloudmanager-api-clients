package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Metric;

    public class PipelineStepMetricsList implements ListWrapper {
        // This declaration below of _pipelineStepMetrics_obj_class is to force flash compiler to include this class
        private var _pipelineStepMetrics_obj_class: org.openapitools.client.model.PipelineStepMetrics = null;
        [XmlElements(name="pipelineStepMetrics", type="org.openapitools.client.model.PipelineStepMetrics")]
        public var pipelineStepMetrics: Array = new Array();

        public function getList(): Array{
            return pipelineStepMetrics;
        }

}

}
