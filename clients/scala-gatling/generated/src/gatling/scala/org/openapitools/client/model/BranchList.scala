
package org.openapitools.client.model


case class BranchList (
    _totalNumberOfItems: Option[Integer],
    _embedded: Option[BranchListEmbedded],
    _links: Option[ProgramListLinks]
)
object BranchList {
    def toStringBody(var_totalNumberOfItems: Object, var_embedded: Object, var_links: Object) =
        s"""
        | {
        | "totalNumberOfItems":$var_totalNumberOfItems,"embedded":$var_embedded,"links":$var_links
        | }
        """.stripMargin
}
