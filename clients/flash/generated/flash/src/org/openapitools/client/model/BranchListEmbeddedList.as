package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.RepositoryBranch;

    public class BranchListEmbeddedList implements ListWrapper {
        // This declaration below of _branchList__embedded_obj_class is to force flash compiler to include this class
        private var _branchListEmbedded_obj_class: org.openapitools.client.model.BranchListEmbedded = null;
        [XmlElements(name="branchListEmbedded", type="org.openapitools.client.model.BranchListEmbedded")]
        public var branchListEmbedded: Array = new Array();

        public function getList(): Array{
            return branchListEmbedded;
        }

}

}
