package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class EnvironmentLinksList implements ListWrapper {
        // This declaration below of _Environment__links_obj_class is to force flash compiler to include this class
        private var _environmentLinks_obj_class: org.openapitools.client.model.EnvironmentLinks = null;
        [XmlElements(name="environmentLinks", type="org.openapitools.client.model.EnvironmentLinks")]
        public var environmentLinks: Array = new Array();

        public function getList(): Array{
            return environmentLinks;
        }

}

}
