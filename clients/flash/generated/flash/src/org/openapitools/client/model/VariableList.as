package org.openapitools.client.model {

import org.openapitools.client.model.VariableListEmbedded;
import org.openapitools.client.model.VariableListLinks;

    [XmlRootNode(name="VariableList")]
    public class VariableList {
                [XmlElement(name="_totalNumberOfItems")]
        public var totalNumberOfItems: Number = 0;
                [XmlElement(name="_embedded")]
        public var embedded: VariableListEmbedded = NaN;
                [XmlElement(name="_links")]
        public var links: VariableListLinks = NaN;

    public function toString(): String {
        var str: String = "VariableList: ";
        str += " (totalNumberOfItems: " + totalNumberOfItems + ")";
        str += " (embedded: " + embedded + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
