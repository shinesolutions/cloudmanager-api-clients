
package org.openapitools.client.model


case class ProgramListLinks (
    _next: Option[HalLink],
    _prev: Option[HalLink],
    _self: Option[HalLink]
)
object ProgramListLinks {
    def toStringBody(var_next: Object, var_prev: Object, var_self: Object) =
        s"""
        | {
        | "next":$var_next,"prev":$var_prev,"self":$var_self
        | }
        """.stripMargin
}
