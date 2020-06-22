package org.openapitools.client.model {

import org.openapitools.client.model.BranchListEmbedded;
import org.openapitools.client.model.ProgramListLinks;

    [XmlRootNode(name="BranchList")]
    public class BranchList {
                [XmlElement(name="_totalNumberOfItems")]
        public var totalNumberOfItems: Number = 0;
                [XmlElement(name="_embedded")]
        public var embedded: BranchListEmbedded = NaN;
                [XmlElement(name="_links")]
        public var links: ProgramListLinks = NaN;

    public function toString(): String {
        var str: String = "BranchList: ";
        str += " (totalNumberOfItems: " + totalNumberOfItems + ")";
        str += " (embedded: " + embedded + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
