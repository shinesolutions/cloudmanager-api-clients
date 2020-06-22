package org.openapitools.client.model {

import org.openapitools.client.model.EnvironmentLogLinks;

    [XmlRootNode(name="EnvironmentLog")]
    public class EnvironmentLog {
        /* Name of the service */
        [XmlElement(name="service")]
        public var service: String = null;
        /* Name of the Log */
        [XmlElement(name="name")]
        public var name: String = null;
        /* date of the Log */
        [XmlElement(name="date")]
        public var date: String = null;
                [XmlElement(name="programId")]
        public var programId: Number = 0;
                [XmlElement(name="environmentId")]
        public var environmentId: Number = 0;
                [XmlElement(name="_links")]
        public var links: EnvironmentLogLinks = NaN;

    public function toString(): String {
        var str: String = "EnvironmentLog: ";
        str += " (service: " + service + ")";
        str += " (name: " + name + ")";
        str += " (date: " + date + ")";
        str += " (programId: " + programId + ")";
        str += " (environmentId: " + environmentId + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
