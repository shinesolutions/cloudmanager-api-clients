
package org.openapitools.client.model


case class PipelineExecutionListRepresentationLinks (
    _next: Option[HalLink],
    _page: Option[HalLink],
    _prev: Option[HalLink],
    _self: Option[HalLink]
)
object PipelineExecutionListRepresentationLinks {
    def toStringBody(var_next: Object, var_page: Object, var_prev: Object, var_self: Object) =
        s"""
        | {
        | "next":$var_next,"page":$var_page,"prev":$var_prev,"self":$var_self
        | }
        """.stripMargin
}
