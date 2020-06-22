
package org.openapitools.client.model


case class EnvironmentLinks (
    _httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
    _httpNsAdobeComAdobecloudRelPipeline: Option[HalLink],
    _httpNsAdobeComAdobecloudRelAuthor: Option[HalLink],
    _httpNsAdobeComAdobecloudRelPublish: Option[HalLink],
    _httpNsAdobeComAdobecloudRelDeveloperConsole: Option[HalLink],
    _httpNsAdobeComAdobecloudRelLogs: Option[HalLink],
    _httpNsAdobeComAdobecloudRelVariables: Option[HalLink],
    _self: Option[HalLink]
)
object EnvironmentLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelProgram: Object, var_httpNsAdobeComAdobecloudRelPipeline: Object, var_httpNsAdobeComAdobecloudRelAuthor: Object, var_httpNsAdobeComAdobecloudRelPublish: Object, var_httpNsAdobeComAdobecloudRelDeveloperConsole: Object, var_httpNsAdobeComAdobecloudRelLogs: Object, var_httpNsAdobeComAdobecloudRelVariables: Object, var_self: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelProgram":$var_httpNsAdobeComAdobecloudRelProgram,"httpNsAdobeComAdobecloudRelPipeline":$var_httpNsAdobeComAdobecloudRelPipeline,"httpNsAdobeComAdobecloudRelAuthor":$var_httpNsAdobeComAdobecloudRelAuthor,"httpNsAdobeComAdobecloudRelPublish":$var_httpNsAdobeComAdobecloudRelPublish,"httpNsAdobeComAdobecloudRelDeveloperConsole":$var_httpNsAdobeComAdobecloudRelDeveloperConsole,"httpNsAdobeComAdobecloudRelLogs":$var_httpNsAdobeComAdobecloudRelLogs,"httpNsAdobeComAdobecloudRelVariables":$var_httpNsAdobeComAdobecloudRelVariables,"self":$var_self
        | }
        """.stripMargin
}
