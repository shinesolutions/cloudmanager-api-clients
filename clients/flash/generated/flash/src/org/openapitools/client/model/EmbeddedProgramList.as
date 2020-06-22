package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class EmbeddedProgramList implements ListWrapper {
        // This declaration below of _embeddedProgram_obj_class is to force flash compiler to include this class
        private var _embeddedProgram_obj_class: org.openapitools.client.model.EmbeddedProgram = null;
        [XmlElements(name="embeddedProgram", type="org.openapitools.client.model.EmbeddedProgram")]
        public var embeddedProgram: Array = new Array();

        public function getList(): Array{
            return embeddedProgram;
        }

}

}
