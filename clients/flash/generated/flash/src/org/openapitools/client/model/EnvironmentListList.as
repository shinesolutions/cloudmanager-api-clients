package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.EnvironmentListEmbedded;
import org.openapitools.client.model.ProgramListLinks;

    public class EnvironmentListList implements ListWrapper {
        // This declaration below of _environmentList_obj_class is to force flash compiler to include this class
        private var _environmentList_obj_class: org.openapitools.client.model.EnvironmentList = null;
        [XmlElements(name="environmentList", type="org.openapitools.client.model.EnvironmentList")]
        public var environmentList: Array = new Array();

        public function getList(): Array{
            return environmentList;
        }

}

}
