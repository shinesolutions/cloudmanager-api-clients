package org.openapitools.client.model {


    [XmlRootNode(name="Variable")]
    public class Variable {
        /* Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Value of the variable. Read-Write for non-secrets, write-only for secrets. */
        [XmlElement(name="value")]
        public var value: String = null;
        /* Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation. */
        [XmlElement(name="type")]
        public var type: String = null;

    public function toString(): String {
        var str: String = "Variable: ";
        str += " (name: " + name + ")";
        str += " (value: " + value + ")";
        str += " (type: " + type + ")";
        return str;
    }

}

}
