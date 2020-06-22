package org.openapitools.client.model {

import org.openapitools.client.model.EnvironmentLog;

    [XmlRootNode(name="EnvironmentLogsEmbedded")]
    public class EnvironmentLogsEmbedded {
        /* Links to logs */
        // This declaration below of _downloads_obj_class is to force flash compiler to include this class
        private var _downloads_obj_class: Array = null;
        [XmlElementWrapper(name="downloads")]
        [XmlElements(name="downloads", type="Array")]
                public var downloads: Array = new Array();

    public function toString(): String {
        var str: String = "EnvironmentLogsEmbedded: ";
        str += " (downloads: " + downloads + ")";
        return str;
    }

}

}
