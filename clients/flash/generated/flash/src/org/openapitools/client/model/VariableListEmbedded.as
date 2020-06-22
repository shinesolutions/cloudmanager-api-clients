package org.openapitools.client.model {

import org.openapitools.client.model.Variable;

    [XmlRootNode(name="VariableListEmbedded")]
    public class VariableListEmbedded {
        /* Variables set on environment */
        // This declaration below of _variables_obj_class is to force flash compiler to include this class
        private var _variables_obj_class: Array = null;
        [XmlElementWrapper(name="variables")]
        [XmlElements(name="variables", type="Array")]
                public var variables: Array = new Array();

    public function toString(): String {
        var str: String = "VariableListEmbedded: ";
        str += " (variables: " + variables + ")";
        return str;
    }

}

}
