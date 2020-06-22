package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Repository;

    public class RepositoryListEmbeddedList implements ListWrapper {
        // This declaration below of _repositoryList__embedded_obj_class is to force flash compiler to include this class
        private var _repositoryListEmbedded_obj_class: org.openapitools.client.model.RepositoryListEmbedded = null;
        [XmlElements(name="repositoryListEmbedded", type="org.openapitools.client.model.RepositoryListEmbedded")]
        public var repositoryListEmbedded: Array = new Array();

        public function getList(): Array{
            return repositoryListEmbedded;
        }

}

}
