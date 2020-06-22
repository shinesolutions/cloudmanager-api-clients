package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="EnvironmentLogLinks")]
    public class EnvironmentLogLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/logs/download")]
        public var http:NsAdobeComAdobecloudRelLogsDownload: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/logs/tail")]
        public var http:NsAdobeComAdobecloudRelLogsTail: HalLink = NaN;

    public function toString(): String {
        var str: String = "EnvironmentLogLinks: ";
        str += " (http:NsAdobeComAdobecloudRelLogsDownload: " + http:NsAdobeComAdobecloudRelLogsDownload + ")";
        str += " (http:NsAdobeComAdobecloudRelLogsTail: " + http:NsAdobeComAdobecloudRelLogsTail + ")";
        return str;
    }

}

}
