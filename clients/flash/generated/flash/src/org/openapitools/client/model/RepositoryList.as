package org.openapitools.client.model {

import org.openapitools.client.model.ProgramListLinks;
import org.openapitools.client.model.RepositoryListEmbedded;

    [XmlRootNode(name="RepositoryList")]
    public class RepositoryList {
                [XmlElement(name="_totalNumberOfItems")]
        public var totalNumberOfItems: Number = 0;
                [XmlElement(name="_embedded")]
        public var embedded: RepositoryListEmbedded = NaN;
                [XmlElement(name="_links")]
        public var links: ProgramListLinks = NaN;

    public function toString(): String {
        var str: String = "RepositoryList: ";
        str += " (totalNumberOfItems: " + totalNumberOfItems + ")";
        str += " (embedded: " + embedded + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
