package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="EnvironmentLogsLinks")]
    public class EnvironmentLogsLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/program")]
        public var http:NsAdobeComAdobecloudRelProgram: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "EnvironmentLogsLinks: ";
        str += " (http:NsAdobeComAdobecloudRelProgram: " + http:NsAdobeComAdobecloudRelProgram + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
