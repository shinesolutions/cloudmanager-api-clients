package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class EnvironmentLogLinksList implements ListWrapper {
        // This declaration below of _EnvironmentLog__links_obj_class is to force flash compiler to include this class
        private var _environmentLogLinks_obj_class: org.openapitools.client.model.EnvironmentLogLinks = null;
        [XmlElements(name="environmentLogLinks", type="org.openapitools.client.model.EnvironmentLogLinks")]
        public var environmentLogLinks: Array = new Array();

        public function getList(): Array{
            return environmentLogLinks;
        }

}

}
