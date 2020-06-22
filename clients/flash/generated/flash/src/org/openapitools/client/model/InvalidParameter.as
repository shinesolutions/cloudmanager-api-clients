package org.openapitools.client.model {


    [XmlRootNode(name="InvalidParameter")]
    public class InvalidParameter {
        /* Name of the invalid parameter. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Reason of why the parameter&#39;s value is not accepted. */
        [XmlElement(name="reason")]
        public var reason: String = null;

    public function toString(): String {
        var str: String = "InvalidParameter: ";
        str += " (name: " + name + ")";
        str += " (reason: " + reason + ")";
        return str;
    }

}

}
