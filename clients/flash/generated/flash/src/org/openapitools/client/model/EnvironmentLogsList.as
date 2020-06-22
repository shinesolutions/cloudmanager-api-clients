package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.EnvironmentLogsEmbedded;
import org.openapitools.client.model.EnvironmentLogsLinks;

    public class EnvironmentLogsList implements ListWrapper {
        // This declaration below of _EnvironmentLogs_obj_class is to force flash compiler to include this class
        private var _environmentLogs_obj_class: org.openapitools.client.model.EnvironmentLogs = null;
        [XmlElements(name="environmentLogs", type="org.openapitools.client.model.EnvironmentLogs")]
        public var environmentLogs: Array = new Array();

        public function getList(): Array{
            return environmentLogs;
        }

}

}
