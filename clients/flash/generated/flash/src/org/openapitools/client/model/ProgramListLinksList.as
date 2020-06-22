package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class ProgramListLinksList implements ListWrapper {
        // This declaration below of _programList__links_obj_class is to force flash compiler to include this class
        private var _programListLinks_obj_class: org.openapitools.client.model.ProgramListLinks = null;
        [XmlElements(name="programListLinks", type="org.openapitools.client.model.ProgramListLinks")]
        public var programListLinks: Array = new Array();

        public function getList(): Array{
            return programListLinks;
        }

}

}
