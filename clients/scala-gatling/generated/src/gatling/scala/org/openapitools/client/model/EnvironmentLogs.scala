
package org.openapitools.client.model


case class EnvironmentLogs (
    /* Name of the service */
    _service: Option[List[String]],
    /* Name of the Log */
    _name: Option[List[String]],
    /* Number of days */
    _days: Option[Integer],
    _links: Option[EnvironmentLogsLinks],
    _embedded: Option[EnvironmentLogsEmbedded]
)
object EnvironmentLogs {
    def toStringBody(var_service: Object, var_name: Object, var_days: Object, var_links: Object, var_embedded: Object) =
        s"""
        | {
        | "service":$var_service,"name":$var_name,"days":$var_days,"links":$var_links,"embedded":$var_embedded
        | }
        """.stripMargin
}
