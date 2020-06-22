package org.openapitools.client.model {

import org.openapitools.client.model.EnvironmentListEmbedded;
import org.openapitools.client.model.ProgramListLinks;

    [XmlRootNode(name="EnvironmentList")]
    public class EnvironmentList {
                [XmlElement(name="_totalNumberOfItems")]
        public var totalNumberOfItems: Number = 0;
                [XmlElement(name="_embedded")]
        public var embedded: EnvironmentListEmbedded = NaN;
                [XmlElement(name="_links")]
        public var links: ProgramListLinks = NaN;

    public function toString(): String {
        var str: String = "EnvironmentList: ";
        str += " (totalNumberOfItems: " + totalNumberOfItems + ")";
        str += " (embedded: " + embedded + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
