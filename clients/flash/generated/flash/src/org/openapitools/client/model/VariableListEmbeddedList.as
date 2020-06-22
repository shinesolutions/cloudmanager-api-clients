package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Variable;

    public class VariableListEmbeddedList implements ListWrapper {
        // This declaration below of _variableList__embedded_obj_class is to force flash compiler to include this class
        private var _variableListEmbedded_obj_class: org.openapitools.client.model.VariableListEmbedded = null;
        [XmlElements(name="variableListEmbedded", type="org.openapitools.client.model.VariableListEmbedded")]
        public var variableListEmbedded: Array = new Array();

        public function getList(): Array{
            return variableListEmbedded;
        }

}

}
