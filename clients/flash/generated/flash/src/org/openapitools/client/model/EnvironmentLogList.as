package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.EnvironmentLogLinks;

    public class EnvironmentLogList implements ListWrapper {
        // This declaration below of _EnvironmentLog_obj_class is to force flash compiler to include this class
        private var _environmentLog_obj_class: org.openapitools.client.model.EnvironmentLog = null;
        [XmlElements(name="environmentLog", type="org.openapitools.client.model.EnvironmentLog")]
        public var environmentLog: Array = new Array();

        public function getList(): Array{
            return environmentLog;
        }

}

}
