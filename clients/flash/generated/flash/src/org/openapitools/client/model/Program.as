package org.openapitools.client.model {

import org.openapitools.client.model.ProgramLinks;

    [XmlRootNode(name="Program")]
    public class Program {
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
        /* Organisation Id */
        [XmlElement(name="imsOrgId")]
        public var imsOrgId: String = null;
                [XmlElement(name="_links")]
        public var links: ProgramLinks = NaN;

    public function toString(): String {
        var str: String = "Program: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (enabled: " + enabled + ")";
        str += " (tenantId: " + tenantId + ")";
        str += " (imsOrgId: " + imsOrgId + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
