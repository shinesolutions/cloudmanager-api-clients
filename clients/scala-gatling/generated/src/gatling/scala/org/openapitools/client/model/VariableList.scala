
package org.openapitools.client.model


case class VariableList (
    _totalNumberOfItems: Option[Integer],
    _embedded: Option[VariableListEmbedded],
    _links: Option[VariableListLinks]
)
object VariableList {
    def toStringBody(var_totalNumberOfItems: Object, var_embedded: Object, var_links: Object) =
        s"""
        | {
        | "totalNumberOfItems":$var_totalNumberOfItems,"embedded":$var_embedded,"links":$var_links
        | }
        """.stripMargin
}
