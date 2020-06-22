
package org.openapitools.client.model


case class EnvironmentLogsEmbedded (
    /* Links to logs */
    _downloads: Option[List[EnvironmentLog]]
)
object EnvironmentLogsEmbedded {
    def toStringBody(var_downloads: Object) =
        s"""
        | {
        | "downloads":$var_downloads
        | }
        """.stripMargin
}
