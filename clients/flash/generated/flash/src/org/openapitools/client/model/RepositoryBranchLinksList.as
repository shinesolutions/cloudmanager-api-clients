package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class RepositoryBranchLinksList implements ListWrapper {
        // This declaration below of _RepositoryBranch__links_obj_class is to force flash compiler to include this class
        private var _repositoryBranchLinks_obj_class: org.openapitools.client.model.RepositoryBranchLinks = null;
        [XmlElements(name="repositoryBranchLinks", type="org.openapitools.client.model.RepositoryBranchLinks")]
        public var repositoryBranchLinks: Array = new Array();

        public function getList(): Array{
            return repositoryBranchLinks;
        }

}

}
