package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ProgramListLinks;
import org.openapitools.client.model.RepositoryListEmbedded;

    public class RepositoryListList implements ListWrapper {
        // This declaration below of _repositoryList_obj_class is to force flash compiler to include this class
        private var _repositoryList_obj_class: org.openapitools.client.model.RepositoryList = null;
        [XmlElements(name="repositoryList", type="org.openapitools.client.model.RepositoryList")]
        public var repositoryList: Array = new Array();

        public function getList(): Array{
            return repositoryList;
        }

}

}
