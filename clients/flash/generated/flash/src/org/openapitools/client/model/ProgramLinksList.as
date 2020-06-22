package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class ProgramLinksList implements ListWrapper {
        // This declaration below of _Program__links_obj_class is to force flash compiler to include this class
        private var _programLinks_obj_class: org.openapitools.client.model.ProgramLinks = null;
        [XmlElements(name="programLinks", type="org.openapitools.client.model.ProgramLinks")]
        public var programLinks: Array = new Array();

        public function getList(): Array{
            return programLinks;
        }

}

}
