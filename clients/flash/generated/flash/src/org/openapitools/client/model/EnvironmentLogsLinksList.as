package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class EnvironmentLogsLinksList implements ListWrapper {
        // This declaration below of _EnvironmentLogs__links_obj_class is to force flash compiler to include this class
        private var _environmentLogsLinks_obj_class: org.openapitools.client.model.EnvironmentLogsLinks = null;
        [XmlElements(name="environmentLogsLinks", type="org.openapitools.client.model.EnvironmentLogsLinks")]
        public var environmentLogsLinks: Array = new Array();

        public function getList(): Array{
            return environmentLogsLinks;
        }

}

}
