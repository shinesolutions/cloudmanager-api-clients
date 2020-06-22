package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="PipelineExecutionLinks")]
    public class PipelineExecutionLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/program")]
        public var http:NsAdobeComAdobecloudRelProgram: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/pipeline")]
        public var http:NsAdobeComAdobecloudRelPipeline: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "PipelineExecutionLinks: ";
        str += " (http:NsAdobeComAdobecloudRelProgram: " + http:NsAdobeComAdobecloudRelProgram + ")";
        str += " (http:NsAdobeComAdobecloudRelPipeline: " + http:NsAdobeComAdobecloudRelPipeline + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
