package org.openapitools.client.model {


    [XmlRootNode(name="EmbeddedProgram")]
    public class EmbeddedProgram {
        /* Identifier of the program. Unique within the space. */
        [XmlElement(name="id")]
        public var id: String = null;
        /* Name of the program */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Whether this Program has been enabled for Cloud Manager usage */
        [XmlElement(name="enabled")]
        public var enabled: Boolean = false;
        /* Tenant Id */
        [XmlElement(name="tenantId")]
        public var tenantId: String = null;

    public function toString(): String {
        var str: String = "EmbeddedProgram: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (enabled: " + enabled + ")";
        str += " (tenantId: " + tenantId + ")";
        return str;
    }

}

}
