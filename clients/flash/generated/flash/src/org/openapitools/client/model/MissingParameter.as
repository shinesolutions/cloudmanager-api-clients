package org.openapitools.client.model {


    [XmlRootNode(name="MissingParameter")]
    public class MissingParameter {
        /* Name of the missing parameter. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Type of the missing parameter. */
        [XmlElement(name="type")]
        public var type: String = null;

    public function toString(): String {
        var str: String = "MissingParameter: ";
        str += " (name: " + name + ")";
        str += " (type: " + type + ")";
        return str;
    }

}

}
