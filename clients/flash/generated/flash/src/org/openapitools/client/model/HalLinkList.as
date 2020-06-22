package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class HalLinkList implements ListWrapper {
        // This declaration below of _HalLink_obj_class is to force flash compiler to include this class
        private var _halLink_obj_class: org.openapitools.client.model.HalLink = null;
        [XmlElements(name="halLink", type="org.openapitools.client.model.HalLink")]
        public var halLink: Array = new Array();

        public function getList(): Array{
            return halLink;
        }

}

}
