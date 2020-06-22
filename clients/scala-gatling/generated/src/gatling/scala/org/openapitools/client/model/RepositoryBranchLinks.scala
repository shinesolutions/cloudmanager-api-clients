
package org.openapitools.client.model


case class RepositoryBranchLinks (
    _httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
    _httpNsAdobeComAdobecloudRelRepository: Option[HalLink]
)
object RepositoryBranchLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelProgram: Object, var_httpNsAdobeComAdobecloudRelRepository: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelProgram":$var_httpNsAdobeComAdobecloudRelProgram,"httpNsAdobeComAdobecloudRelRepository":$var_httpNsAdobeComAdobecloudRelRepository
        | }
        """.stripMargin
}
