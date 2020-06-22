package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="PipelineExecutionListRepresentationLinks")]
    public class PipelineExecutionListRepresentationLinks {
                [XmlElement(name="next")]
        public var next: HalLink = NaN;
                [XmlElement(name="page")]
        public var page: HalLink = NaN;
                [XmlElement(name="prev")]
        public var prev: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "PipelineExecutionListRepresentationLinks: ";
        str += " (next: " + next + ")";
        str += " (page: " + page + ")";
        str += " (prev: " + prev + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
