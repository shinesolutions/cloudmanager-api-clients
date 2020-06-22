
package org.openapitools.client.model


case class RepositoryListEmbedded (
    _repositories: Option[List[Repository]]
)
object RepositoryListEmbedded {
    def toStringBody(var_repositories: Object) =
        s"""
        | {
        | "repositories":$var_repositories
        | }
        """.stripMargin
}
