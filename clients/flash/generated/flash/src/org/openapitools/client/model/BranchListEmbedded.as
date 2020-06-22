package org.openapitools.client.model {

import org.openapitools.client.model.RepositoryBranch;

    [XmlRootNode(name="BranchListEmbedded")]
    public class BranchListEmbedded {
                // This declaration below of _branches_obj_class is to force flash compiler to include this class
        private var _branches_obj_class: Array = null;
        [XmlElementWrapper(name="branches")]
        [XmlElements(name="branches", type="Array")]
                public var branches: Array = new Array();

    public function toString(): String {
        var str: String = "BranchListEmbedded: ";
        str += " (branches: " + branches + ")";
        return str;
    }

}

}
