
package org.openapitools.client.model


case class EnvironmentLog (
    /* Name of the service */
    _service: Option[String],
    /* Name of the Log */
    _name: Option[String],
    /* date of the Log */
    _date: Option[String],
    _programId: Option[Long],
    _environmentId: Option[Long],
    _links: Option[EnvironmentLogLinks]
)
object EnvironmentLog {
    def toStringBody(var_service: Object, var_name: Object, var_date: Object, var_programId: Object, var_environmentId: Object, var_links: Object) =
        s"""
        | {
        | "service":$var_service,"name":$var_name,"date":$var_date,"programId":$var_programId,"environmentId":$var_environmentId,"links":$var_links
        | }
        """.stripMargin
}
