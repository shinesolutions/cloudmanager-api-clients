package org.openapitools.client.model {

import org.openapitools.client.model.EnvironmentLinks;

    [XmlRootNode(name="Environment")]
    public class Environment {
        /* id */
        [XmlElement(name="id")]
        public var id: String = null;
        /* Identifier of the program. Unique within the space. */
        [XmlElement(name="programId")]
        public var programId: String = null;
        /* Name of the environment */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Description of the environment */
        [XmlElement(name="description")]
        public var description: String = null;
        /* Type of the environment */
        [XmlElement(name="type")]
        public var type: String = null;
                [XmlElement(name="_links")]
        public var links: EnvironmentLinks = NaN;

    public function toString(): String {
        var str: String = "Environment: ";
        str += " (id: " + id + ")";
        str += " (programId: " + programId + ")";
        str += " (name: " + name + ")";
        str += " (description: " + description + ")";
        str += " (type: " + type + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
