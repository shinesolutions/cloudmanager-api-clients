package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="PipelineLinks")]
    public class PipelineLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/program")]
        public var http:NsAdobeComAdobecloudRelProgram: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/execution")]
        public var http:NsAdobeComAdobecloudRelExecution: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/executions")]
        public var http:NsAdobeComAdobecloudRelExecutions: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")]
        public var http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "PipelineLinks: ";
        str += " (http:NsAdobeComAdobecloudRelProgram: " + http:NsAdobeComAdobecloudRelProgram + ")";
        str += " (http:NsAdobeComAdobecloudRelExecution: " + http:NsAdobeComAdobecloudRelExecution + ")";
        str += " (http:NsAdobeComAdobecloudRelExecutions: " + http:NsAdobeComAdobecloudRelExecutions + ")";
        str += " (http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: " + http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
