package org.openapitools.client.model {

import org.openapitools.client.model.Environment;

    [XmlRootNode(name="EnvironmentListEmbedded")]
    public class EnvironmentListEmbedded {
                // This declaration below of _environments_obj_class is to force flash compiler to include this class
        private var _environments_obj_class: Array = null;
        [XmlElementWrapper(name="environments")]
        [XmlElements(name="environments", type="Array")]
                public var environments: Array = new Array();

    public function toString(): String {
        var str: String = "EnvironmentListEmbedded: ";
        str += " (environments: " + environments + ")";
        return str;
    }

}

}
