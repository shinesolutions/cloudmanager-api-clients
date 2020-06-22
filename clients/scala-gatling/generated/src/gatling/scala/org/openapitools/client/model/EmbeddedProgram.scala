
package org.openapitools.client.model


case class EmbeddedProgram (
    /* Identifier of the program. Unique within the space. */
    _id: Option[String],
    /* Name of the program */
    _name: Option[String],
    /* Whether this Program has been enabled for Cloud Manager usage */
    _enabled: Option[Boolean],
    /* Tenant Id */
    _tenantId: Option[String]
)
object EmbeddedProgram {
    def toStringBody(var_id: Object, var_name: Object, var_enabled: Object, var_tenantId: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"enabled":$var_enabled,"tenantId":$var_tenantId
        | }
        """.stripMargin
}
