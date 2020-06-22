
package org.openapitools.client.model


case class RepositoryBranch (
    /* Identifier of the program. Unique within the space */
    _programId: Option[String],
    /* Identifier of the repository */
    _repositoryId: Option[Long],
    /* Name of the branch */
    _name: Option[String],
    _links: Option[RepositoryBranchLinks]
)
object RepositoryBranch {
    def toStringBody(var_programId: Object, var_repositoryId: Object, var_name: Object, var_links: Object) =
        s"""
        | {
        | "programId":$var_programId,"repositoryId":$var_repositoryId,"name":$var_name,"links":$var_links
        | }
        """.stripMargin
}
