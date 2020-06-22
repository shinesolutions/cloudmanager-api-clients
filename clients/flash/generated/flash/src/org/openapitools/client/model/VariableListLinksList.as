package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class VariableListLinksList implements ListWrapper {
        // This declaration below of _variableList__links_obj_class is to force flash compiler to include this class
        private var _variableListLinks_obj_class: org.openapitools.client.model.VariableListLinks = null;
        [XmlElements(name="variableListLinks", type="org.openapitools.client.model.VariableListLinks")]
        public var variableListLinks: Array = new Array();

        public function getList(): Array{
            return variableListLinks;
        }

}

}
