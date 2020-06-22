package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.EnvironmentLog;

    public class EnvironmentLogsEmbeddedList implements ListWrapper {
        // This declaration below of _EnvironmentLogs__embedded_obj_class is to force flash compiler to include this class
        private var _environmentLogsEmbedded_obj_class: org.openapitools.client.model.EnvironmentLogsEmbedded = null;
        [XmlElements(name="environmentLogsEmbedded", type="org.openapitools.client.model.EnvironmentLogsEmbedded")]
        public var environmentLogsEmbedded: Array = new Array();

        public function getList(): Array{
            return environmentLogsEmbedded;
        }

}

}
