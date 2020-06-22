
package org.openapitools.client.model


case class Variable (
    /* Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. */
    _name: Option[String],
    /* Value of the variable. Read-Write for non-secrets, write-only for secrets. */
    _value: Option[String],
    /* Type of the variable. Default `string` if missing. Cannot be changed after creation. */
    _type: Option[String]
)
object Variable {
    def toStringBody(var_name: Object, var_value: Object, var_type: Object) =
        s"""
        | {
        | "name":$var_name,"value":$var_value,"type":$var_type
        | }
        """.stripMargin
}
