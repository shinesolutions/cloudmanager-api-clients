package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="RepositoryLinks")]
    public class RepositoryLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/program")]
        public var http:NsAdobeComAdobecloudRelProgram: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/branches")]
        public var http:NsAdobeComAdobecloudRelBranches: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "RepositoryLinks: ";
        str += " (http:NsAdobeComAdobecloudRelProgram: " + http:NsAdobeComAdobecloudRelProgram + ")";
        str += " (http:NsAdobeComAdobecloudRelBranches: " + http:NsAdobeComAdobecloudRelBranches + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
