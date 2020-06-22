
package org.openapitools.client.model


case class PipelineExecutionLinks (
    _httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
    _httpNsAdobeComAdobecloudRelPipeline: Option[HalLink],
    _self: Option[HalLink]
)
object PipelineExecutionLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelProgram: Object, var_httpNsAdobeComAdobecloudRelPipeline: Object, var_self: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelProgram":$var_httpNsAdobeComAdobecloudRelProgram,"httpNsAdobeComAdobecloudRelPipeline":$var_httpNsAdobeComAdobecloudRelPipeline,"self":$var_self
        | }
        """.stripMargin
}
