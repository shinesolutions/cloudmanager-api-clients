package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class MetricList implements ListWrapper {
        // This declaration below of _Metric_obj_class is to force flash compiler to include this class
        private var _metric_obj_class: org.openapitools.client.model.Metric = null;
        [XmlElements(name="metric", type="org.openapitools.client.model.Metric")]
        public var metric: Array = new Array();

        public function getList(): Array{
            return metric;
        }

}

}
