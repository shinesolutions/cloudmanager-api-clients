package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="RepositoryBranchLinks")]
    public class RepositoryBranchLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/program")]
        public var http:NsAdobeComAdobecloudRelProgram: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/repository")]
        public var http:NsAdobeComAdobecloudRelRepository: HalLink = NaN;

    public function toString(): String {
        var str: String = "RepositoryBranchLinks: ";
        str += " (http:NsAdobeComAdobecloudRelProgram: " + http:NsAdobeComAdobecloudRelProgram + ")";
        str += " (http:NsAdobeComAdobecloudRelRepository: " + http:NsAdobeComAdobecloudRelRepository + ")";
        return str;
    }

}

}
