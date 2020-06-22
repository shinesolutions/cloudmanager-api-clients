
package org.openapitools.client.model


case class PipelineLinks (
    _httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
    _httpNsAdobeComAdobecloudRelExecution: Option[HalLink],
    _httpNsAdobeComAdobecloudRelExecutions: Option[HalLink],
    _httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: Option[HalLink],
    _self: Option[HalLink]
)
object PipelineLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelProgram: Object, var_httpNsAdobeComAdobecloudRelExecution: Object, var_httpNsAdobeComAdobecloudRelExecutions: Object, var_httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: Object, var_self: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelProgram":$var_httpNsAdobeComAdobecloudRelProgram,"httpNsAdobeComAdobecloudRelExecution":$var_httpNsAdobeComAdobecloudRelExecution,"httpNsAdobeComAdobecloudRelExecutions":$var_httpNsAdobeComAdobecloudRelExecutions,"httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution":$var_httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution,"self":$var_self
        | }
        """.stripMargin
}
