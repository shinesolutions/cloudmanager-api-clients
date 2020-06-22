package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="ProgramLinks")]
    public class ProgramLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/pipelines")]
        public var http:NsAdobeComAdobecloudRelPipelines: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/environments")]
        public var http:NsAdobeComAdobecloudRelEnvironments: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/repositories")]
        public var http:NsAdobeComAdobecloudRelRepositories: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "ProgramLinks: ";
        str += " (http:NsAdobeComAdobecloudRelPipelines: " + http:NsAdobeComAdobecloudRelPipelines + ")";
        str += " (http:NsAdobeComAdobecloudRelEnvironments: " + http:NsAdobeComAdobecloudRelEnvironments + ")";
        str += " (http:NsAdobeComAdobecloudRelRepositories: " + http:NsAdobeComAdobecloudRelRepositories + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
