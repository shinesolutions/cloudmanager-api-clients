
package org.openapitools.client.model


case class PipelineExecutionStepStateLinks (
    _httpNsAdobeComAdobecloudRelExecution: Option[HalLink],
    _httpNsAdobeComAdobecloudRelPipeline: Option[HalLink],
    _httpNsAdobeComAdobecloudRelPipelineLogs: Option[HalLink],
    _httpNsAdobeComAdobecloudRelPipelineMetrics: Option[HalLink],
    _httpNsAdobeComAdobecloudRelPipelineAdvance: Option[HalLink],
    _httpNsAdobeComAdobecloudRelPipelineCancel: Option[HalLink],
    _httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
    _self: Option[HalLink]
)
object PipelineExecutionStepStateLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelExecution: Object, var_httpNsAdobeComAdobecloudRelPipeline: Object, var_httpNsAdobeComAdobecloudRelPipelineLogs: Object, var_httpNsAdobeComAdobecloudRelPipelineMetrics: Object, var_httpNsAdobeComAdobecloudRelPipelineAdvance: Object, var_httpNsAdobeComAdobecloudRelPipelineCancel: Object, var_httpNsAdobeComAdobecloudRelProgram: Object, var_self: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelExecution":$var_httpNsAdobeComAdobecloudRelExecution,"httpNsAdobeComAdobecloudRelPipeline":$var_httpNsAdobeComAdobecloudRelPipeline,"httpNsAdobeComAdobecloudRelPipelineLogs":$var_httpNsAdobeComAdobecloudRelPipelineLogs,"httpNsAdobeComAdobecloudRelPipelineMetrics":$var_httpNsAdobeComAdobecloudRelPipelineMetrics,"httpNsAdobeComAdobecloudRelPipelineAdvance":$var_httpNsAdobeComAdobecloudRelPipelineAdvance,"httpNsAdobeComAdobecloudRelPipelineCancel":$var_httpNsAdobeComAdobecloudRelPipelineCancel,"httpNsAdobeComAdobecloudRelProgram":$var_httpNsAdobeComAdobecloudRelProgram,"self":$var_self
        | }
        """.stripMargin
}
