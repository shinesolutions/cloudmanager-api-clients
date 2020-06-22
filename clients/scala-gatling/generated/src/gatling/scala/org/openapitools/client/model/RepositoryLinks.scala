
package org.openapitools.client.model


case class RepositoryLinks (
    _httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
    _httpNsAdobeComAdobecloudRelBranches: Option[HalLink],
    _self: Option[HalLink]
)
object RepositoryLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelProgram: Object, var_httpNsAdobeComAdobecloudRelBranches: Object, var_self: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelProgram":$var_httpNsAdobeComAdobecloudRelProgram,"httpNsAdobeComAdobecloudRelBranches":$var_httpNsAdobeComAdobecloudRelBranches,"self":$var_self
        | }
        """.stripMargin
}
