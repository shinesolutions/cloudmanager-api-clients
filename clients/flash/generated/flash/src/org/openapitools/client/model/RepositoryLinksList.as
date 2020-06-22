package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.HalLink;

    public class RepositoryLinksList implements ListWrapper {
        // This declaration below of _Repository__links_obj_class is to force flash compiler to include this class
        private var _repositoryLinks_obj_class: org.openapitools.client.model.RepositoryLinks = null;
        [XmlElements(name="repositoryLinks", type="org.openapitools.client.model.RepositoryLinks")]
        public var repositoryLinks: Array = new Array();

        public function getList(): Array{
            return repositoryLinks;
        }

}

}
