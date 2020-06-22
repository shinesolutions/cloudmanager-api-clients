package org.openapitools.client.model {

import org.openapitools.client.model.ProgramListEmbedded;
import org.openapitools.client.model.ProgramListLinks;

    [XmlRootNode(name="ProgramList")]
    public class ProgramList {
                [XmlElement(name="_totalNumberOfItems")]
        public var totalNumberOfItems: Number = 0;
                [XmlElement(name="_embedded")]
        public var embedded: ProgramListEmbedded = NaN;
                [XmlElement(name="_links")]
        public var links: ProgramListLinks = NaN;

    public function toString(): String {
        var str: String = "ProgramList: ";
        str += " (totalNumberOfItems: " + totalNumberOfItems + ")";
        str += " (embedded: " + embedded + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
