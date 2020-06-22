package org.openapitools.client.model {

import org.openapitools.client.model.RepositoryLinks;

    [XmlRootNode(name="Repository")]
    public class Repository {
        /* Repository name */
        [XmlElement(name="repo")]
        public var repo: String = null;
        /* description */
        [XmlElement(name="description")]
        public var description: String = null;
                [XmlElement(name="_links")]
        public var links: RepositoryLinks = NaN;

    public function toString(): String {
        var str: String = "Repository: ";
        str += " (repo: " + repo + ")";
        str += " (description: " + description + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
