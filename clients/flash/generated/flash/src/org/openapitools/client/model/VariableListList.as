package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.VariableListEmbedded;
import org.openapitools.client.model.VariableListLinks;

    public class VariableListList implements ListWrapper {
        // This declaration below of _variableList_obj_class is to force flash compiler to include this class
        private var _variableList_obj_class: org.openapitools.client.model.VariableList = null;
        [XmlElements(name="variableList", type="org.openapitools.client.model.VariableList")]
        public var variableList: Array = new Array();

        public function getList(): Array{
            return variableList;
        }

}

}
