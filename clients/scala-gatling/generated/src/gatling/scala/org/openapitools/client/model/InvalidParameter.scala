
package org.openapitools.client.model


case class InvalidParameter (
    /* Name of the invalid parameter. */
    _name: Option[String],
    /* Reason of why the parameter's value is not accepted. */
    _reason: Option[String]
)
object InvalidParameter {
    def toStringBody(var_name: Object, var_reason: Object) =
        s"""
        | {
        | "name":$var_name,"reason":$var_reason
        | }
        """.stripMargin
}
