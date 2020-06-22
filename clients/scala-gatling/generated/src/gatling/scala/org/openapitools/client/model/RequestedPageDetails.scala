
package org.openapitools.client.model


case class RequestedPageDetails (
    _start: Option[Integer],
    _limit: Option[Integer],
    _orderBy: Option[String],
    _property: Option[List[String]],
    _type: Option[String],
    _next: Option[Integer],
    _prev: Option[Integer]
)
object RequestedPageDetails {
    def toStringBody(var_start: Object, var_limit: Object, var_orderBy: Object, var_property: Object, var_type: Object, var_next: Object, var_prev: Object) =
        s"""
        | {
        | "start":$var_start,"limit":$var_limit,"orderBy":$var_orderBy,"property":$var_property,"type":$var_type,"next":$var_next,"prev":$var_prev
        | }
        """.stripMargin
}
