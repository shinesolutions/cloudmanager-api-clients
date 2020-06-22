package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="VariableListLinks")]
    public class VariableListLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/environment")]
        public var http:NsAdobeComAdobecloudRelEnvironment: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/program")]
        public var http:NsAdobeComAdobecloudRelProgram: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "VariableListLinks: ";
        str += " (http:NsAdobeComAdobecloudRelEnvironment: " + http:NsAdobeComAdobecloudRelEnvironment + ")";
        str += " (http:NsAdobeComAdobecloudRelProgram: " + http:NsAdobeComAdobecloudRelProgram + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
