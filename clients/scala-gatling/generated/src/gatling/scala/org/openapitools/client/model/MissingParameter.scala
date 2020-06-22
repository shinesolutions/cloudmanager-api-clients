
package org.openapitools.client.model


case class MissingParameter (
    /* Name of the missing parameter. */
    _name: Option[String],
    /* Type of the missing parameter. */
    _type: Option[String]
)
object MissingParameter {
    def toStringBody(var_name: Object, var_type: Object) =
        s"""
        | {
        | "name":$var_name,"type":$var_type
        | }
        """.stripMargin
}
