
package org.openapitools.client.model


case class EnvironmentLogsLinks (
    _httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
    _self: Option[HalLink]
)
object EnvironmentLogsLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelProgram: Object, var_self: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelProgram":$var_httpNsAdobeComAdobecloudRelProgram,"self":$var_self
        | }
        """.stripMargin
}
