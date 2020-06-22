package org.openapitools.client.model {

import org.openapitools.client.model.EnvironmentLogsEmbedded;
import org.openapitools.client.model.EnvironmentLogsLinks;

    [XmlRootNode(name="EnvironmentLogs")]
    public class EnvironmentLogs {
        /* Name of the service */
        // This declaration below of _service_obj_class is to force flash compiler to include this class
        private var _service_obj_class: Array = null;
        [XmlElementWrapper(name="service")]
        [XmlElements(name="service", type="Array")]
                public var service: Array = new Array();
        /* Name of the Log */
        // This declaration below of _name_obj_class is to force flash compiler to include this class
        private var _name_obj_class: Array = null;
        [XmlElementWrapper(name="name")]
        [XmlElements(name="name", type="Array")]
                public var name: Array = new Array();
        /* Number of days */
        [XmlElement(name="days")]
        public var days: Number = 0;
                [XmlElement(name="_links")]
        public var links: EnvironmentLogsLinks = NaN;
                [XmlElement(name="_embedded")]
        public var embedded: EnvironmentLogsEmbedded = NaN;

    public function toString(): String {
        var str: String = "EnvironmentLogs: ";
        str += " (service: " + service + ")";
        str += " (name: " + name + ")";
        str += " (days: " + days + ")";
        str += " (links: " + links + ")";
        str += " (embedded: " + embedded + ")";
        return str;
    }

}

}
