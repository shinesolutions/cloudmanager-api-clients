
package org.openapitools.client.model


case class RepositoryList (
    _totalNumberOfItems: Option[Integer],
    _embedded: Option[RepositoryListEmbedded],
    _links: Option[ProgramListLinks]
)
object RepositoryList {
    def toStringBody(var_totalNumberOfItems: Object, var_embedded: Object, var_links: Object) =
        s"""
        | {
        | "totalNumberOfItems":$var_totalNumberOfItems,"embedded":$var_embedded,"links":$var_links
        | }
        """.stripMargin
}
