
package org.openapitools.client.model


case class Environment (
    /* id */
    _id: Option[String],
    /* Identifier of the program. Unique within the space. */
    _programId: Option[String],
    /* Name of the environment */
    _name: Option[String],
    /* Description of the environment */
    _description: Option[String],
    /* Type of the environment */
    _type: Option[String],
    _links: Option[EnvironmentLinks]
)
object Environment {
    def toStringBody(var_id: Object, var_programId: Object, var_name: Object, var_description: Object, var_type: Object, var_links: Object) =
        s"""
        | {
        | "id":$var_id,"programId":$var_programId,"name":$var_name,"description":$var_description,"type":$var_type,"links":$var_links
        | }
        """.stripMargin
}
