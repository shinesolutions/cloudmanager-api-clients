package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.BranchListEmbedded;
import org.openapitools.client.model.ProgramListLinks;

    public class BranchListList implements ListWrapper {
        // This declaration below of _branchList_obj_class is to force flash compiler to include this class
        private var _branchList_obj_class: org.openapitools.client.model.BranchList = null;
        [XmlElements(name="branchList", type="org.openapitools.client.model.BranchList")]
        public var branchList: Array = new Array();

        public function getList(): Array{
            return branchList;
        }

}

}
