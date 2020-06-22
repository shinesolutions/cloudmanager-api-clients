package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ProgramListEmbedded;
import org.openapitools.client.model.ProgramListLinks;

    public class ProgramListList implements ListWrapper {
        // This declaration below of _programList_obj_class is to force flash compiler to include this class
        private var _programList_obj_class: org.openapitools.client.model.ProgramList = null;
        [XmlElements(name="programList", type="org.openapitools.client.model.ProgramList")]
        public var programList: Array = new Array();

        public function getList(): Array{
            return programList;
        }

}

}
