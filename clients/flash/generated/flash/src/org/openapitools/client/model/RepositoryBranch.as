package org.openapitools.client.model {

import org.openapitools.client.model.RepositoryBranchLinks;

    [XmlRootNode(name="RepositoryBranch")]
    public class RepositoryBranch {
        /* Identifier of the program. Unique within the space */
        [XmlElement(name="programId")]
        public var programId: String = null;
        /* Identifier of the repository */
        [XmlElement(name="repositoryId")]
        public var repositoryId: Number = 0;
        /* Name of the branch */
        [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="_links")]
        public var links: RepositoryBranchLinks = NaN;

    public function toString(): String {
        var str: String = "RepositoryBranch: ";
        str += " (programId: " + programId + ")";
        str += " (repositoryId: " + repositoryId + ")";
        str += " (name: " + name + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
