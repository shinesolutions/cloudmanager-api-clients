
package org.openapitools.client.model


case class ProgramLinks (
    _httpNsAdobeComAdobecloudRelPipelines: Option[HalLink],
    _httpNsAdobeComAdobecloudRelEnvironments: Option[HalLink],
    _httpNsAdobeComAdobecloudRelRepositories: Option[HalLink],
    _self: Option[HalLink]
)
object ProgramLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelPipelines: Object, var_httpNsAdobeComAdobecloudRelEnvironments: Object, var_httpNsAdobeComAdobecloudRelRepositories: Object, var_self: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelPipelines":$var_httpNsAdobeComAdobecloudRelPipelines,"httpNsAdobeComAdobecloudRelEnvironments":$var_httpNsAdobeComAdobecloudRelEnvironments,"httpNsAdobeComAdobecloudRelRepositories":$var_httpNsAdobeComAdobecloudRelRepositories,"self":$var_self
        | }
        """.stripMargin
}
