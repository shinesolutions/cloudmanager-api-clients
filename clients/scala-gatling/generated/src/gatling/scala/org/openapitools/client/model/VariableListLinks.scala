
package org.openapitools.client.model


case class VariableListLinks (
    _httpNsAdobeComAdobecloudRelEnvironment: Option[HalLink],
    _httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
    _self: Option[HalLink]
)
object VariableListLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelEnvironment: Object, var_httpNsAdobeComAdobecloudRelProgram: Object, var_self: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelEnvironment":$var_httpNsAdobeComAdobecloudRelEnvironment,"httpNsAdobeComAdobecloudRelProgram":$var_httpNsAdobeComAdobecloudRelProgram,"self":$var_self
        | }
        """.stripMargin
}
