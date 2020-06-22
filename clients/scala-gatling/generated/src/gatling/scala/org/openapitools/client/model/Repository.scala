
package org.openapitools.client.model


case class Repository (
    /* Repository name */
    _repo: Option[String],
    /* description */
    _description: Option[String],
    _links: Option[RepositoryLinks]
)
object Repository {
    def toStringBody(var_repo: Object, var_description: Object, var_links: Object) =
        s"""
        | {
        | "repo":$var_repo,"description":$var_description,"links":$var_links
        | }
        """.stripMargin
}
