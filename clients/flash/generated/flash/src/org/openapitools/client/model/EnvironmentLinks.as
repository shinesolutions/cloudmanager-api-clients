package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="EnvironmentLinks")]
    public class EnvironmentLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/program")]
        public var http:NsAdobeComAdobecloudRelProgram: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/pipeline")]
        public var http:NsAdobeComAdobecloudRelPipeline: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/author")]
        public var http:NsAdobeComAdobecloudRelAuthor: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/publish")]
        public var http:NsAdobeComAdobecloudRelPublish: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/developerConsole")]
        public var http:NsAdobeComAdobecloudRelDeveloperConsole: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/logs")]
        public var http:NsAdobeComAdobecloudRelLogs: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/variables")]
        public var http:NsAdobeComAdobecloudRelVariables: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "EnvironmentLinks: ";
        str += " (http:NsAdobeComAdobecloudRelProgram: " + http:NsAdobeComAdobecloudRelProgram + ")";
        str += " (http:NsAdobeComAdobecloudRelPipeline: " + http:NsAdobeComAdobecloudRelPipeline + ")";
        str += " (http:NsAdobeComAdobecloudRelAuthor: " + http:NsAdobeComAdobecloudRelAuthor + ")";
        str += " (http:NsAdobeComAdobecloudRelPublish: " + http:NsAdobeComAdobecloudRelPublish + ")";
        str += " (http:NsAdobeComAdobecloudRelDeveloperConsole: " + http:NsAdobeComAdobecloudRelDeveloperConsole + ")";
        str += " (http:NsAdobeComAdobecloudRelLogs: " + http:NsAdobeComAdobecloudRelLogs + ")";
        str += " (http:NsAdobeComAdobecloudRelVariables: " + http:NsAdobeComAdobecloudRelVariables + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
