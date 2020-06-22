package org.openapitools.client.model {

import org.openapitools.client.model.EmbeddedProgram;

    [XmlRootNode(name="ProgramListEmbedded")]
    public class ProgramListEmbedded {
                // This declaration below of _programs_obj_class is to force flash compiler to include this class
        private var _programs_obj_class: Array = null;
        [XmlElementWrapper(name="programs")]
        [XmlElements(name="programs", type="Array")]
                public var programs: Array = new Array();

    public function toString(): String {
        var str: String = "ProgramListEmbedded: ";
        str += " (programs: " + programs + ")";
        return str;
    }

}

}
