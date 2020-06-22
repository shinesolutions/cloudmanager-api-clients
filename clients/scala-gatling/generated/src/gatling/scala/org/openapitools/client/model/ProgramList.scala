
package org.openapitools.client.model


case class ProgramList (
    _totalNumberOfItems: Option[Integer],
    _embedded: Option[ProgramListEmbedded],
    _links: Option[ProgramListLinks]
)
object ProgramList {
    def toStringBody(var_totalNumberOfItems: Object, var_embedded: Object, var_links: Object) =
        s"""
        | {
        | "totalNumberOfItems":$var_totalNumberOfItems,"embedded":$var_embedded,"links":$var_links
        | }
        """.stripMargin
}
