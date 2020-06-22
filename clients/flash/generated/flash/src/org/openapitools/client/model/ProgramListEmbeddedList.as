package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.EmbeddedProgram;

    public class ProgramListEmbeddedList implements ListWrapper {
        // This declaration below of _programList__embedded_obj_class is to force flash compiler to include this class
        private var _programListEmbedded_obj_class: org.openapitools.client.model.ProgramListEmbedded = null;
        [XmlElements(name="programListEmbedded", type="org.openapitools.client.model.ProgramListEmbedded")]
        public var programListEmbedded: Array = new Array();

        public function getList(): Array{
            return programListEmbedded;
        }

}

}
