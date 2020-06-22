
package org.openapitools.client.model


case class EnvironmentLogLinks (
    _httpNsAdobeComAdobecloudRelLogsDownload: Option[HalLink],
    _httpNsAdobeComAdobecloudRelLogsTail: Option[HalLink]
)
object EnvironmentLogLinks {
    def toStringBody(var_httpNsAdobeComAdobecloudRelLogsDownload: Object, var_httpNsAdobeComAdobecloudRelLogsTail: Object) =
        s"""
        | {
        | "httpNsAdobeComAdobecloudRelLogsDownload":$var_httpNsAdobeComAdobecloudRelLogsDownload,"httpNsAdobeComAdobecloudRelLogsTail":$var_httpNsAdobeComAdobecloudRelLogsTail
        | }
        """.stripMargin
}
