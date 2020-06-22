package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.RepositoryBranchLinks;

    public class RepositoryBranchList implements ListWrapper {
        // This declaration below of _RepositoryBranch_obj_class is to force flash compiler to include this class
        private var _repositoryBranch_obj_class: org.openapitools.client.model.RepositoryBranch = null;
        [XmlElements(name="repositoryBranch", type="org.openapitools.client.model.RepositoryBranch")]
        public var repositoryBranch: Array = new Array();

        public function getList(): Array{
            return repositoryBranch;
        }

}

}
