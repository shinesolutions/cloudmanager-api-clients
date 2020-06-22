package org.openapitools.client.model {

import org.openapitools.client.model.HalLink;

    [XmlRootNode(name="PipelineExecutionStepStateLinks")]
    public class PipelineExecutionStepStateLinks {
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/execution")]
        public var http:NsAdobeComAdobecloudRelExecution: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/pipeline")]
        public var http:NsAdobeComAdobecloudRelPipeline: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/pipeline/logs")]
        public var http:NsAdobeComAdobecloudRelPipelineLogs: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/pipeline/metrics")]
        public var http:NsAdobeComAdobecloudRelPipelineMetrics: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/pipeline/advance")]
        public var http:NsAdobeComAdobecloudRelPipelineAdvance: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/pipeline/cancel")]
        public var http:NsAdobeComAdobecloudRelPipelineCancel: HalLink = NaN;
                [XmlElement(name="http://ns.adobe.com/adobecloud/rel/program")]
        public var http:NsAdobeComAdobecloudRelProgram: HalLink = NaN;
                [XmlElement(name="self")]
        public var self: HalLink = NaN;

    public function toString(): String {
        var str: String = "PipelineExecutionStepStateLinks: ";
        str += " (http:NsAdobeComAdobecloudRelExecution: " + http:NsAdobeComAdobecloudRelExecution + ")";
        str += " (http:NsAdobeComAdobecloudRelPipeline: " + http:NsAdobeComAdobecloudRelPipeline + ")";
        str += " (http:NsAdobeComAdobecloudRelPipelineLogs: " + http:NsAdobeComAdobecloudRelPipelineLogs + ")";
        str += " (http:NsAdobeComAdobecloudRelPipelineMetrics: " + http:NsAdobeComAdobecloudRelPipelineMetrics + ")";
        str += " (http:NsAdobeComAdobecloudRelPipelineAdvance: " + http:NsAdobeComAdobecloudRelPipelineAdvance + ")";
        str += " (http:NsAdobeComAdobecloudRelPipelineCancel: " + http:NsAdobeComAdobecloudRelPipelineCancel + ")";
        str += " (http:NsAdobeComAdobecloudRelProgram: " + http:NsAdobeComAdobecloudRelProgram + ")";
        str += " (self: " + self + ")";
        return str;
    }

}

}
