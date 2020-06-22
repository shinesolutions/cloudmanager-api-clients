package org.openapitools.client.model {

import org.openapitools.client.model.Repository;

    [XmlRootNode(name="RepositoryListEmbedded")]
    public class RepositoryListEmbedded {
                // This declaration below of _repositories_obj_class is to force flash compiler to include this class
        private var _repositories_obj_class: Array = null;
        [XmlElementWrapper(name="repositories")]
        [XmlElements(name="repositories", type="Array")]
                public var repositories: Array = new Array();

    public function toString(): String {
        var str: String = "RepositoryListEmbedded: ";
        str += " (repositories: " + repositories + ")";
        return str;
    }

}

}
