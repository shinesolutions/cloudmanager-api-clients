
package org.openapitools.client.model


case class Program (
    /* Identifier of the program. Unique within the space. */
    _id: Option[String],
    /* Name of the program */
    _name: String,
    /* Whether this Program has been enabled for Cloud Manager usage */
    _enabled: Option[Boolean],
    /* Tenant Id */
    _tenantId: Option[String],
    /* Organisation Id */
    _imsOrgId: Option[String],
    _links: Option[ProgramLinks]
)
object Program {
    def toStringBody(var_id: Object, var_name: Object, var_enabled: Object, var_tenantId: Object, var_imsOrgId: Object, var_links: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"enabled":$var_enabled,"tenantId":$var_tenantId,"imsOrgId":$var_imsOrgId,"links":$var_links
        | }
        """.stripMargin
}
