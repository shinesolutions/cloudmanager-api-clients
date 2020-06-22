package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="ProgramListLinks")]
    public class ProgramListLinks {
                [XmlElement(name="next")]
        public var next: HalLink = NaN;
                [XmlElement(name="prev")]
        public var prev: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "ProgramListLinks: ";
        str += " (next: " + next + ")";
        str += " (prev: " + prev + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
