
package org.openapitools.client.model


case class BranchListEmbedded (
    _branches: Option[List[RepositoryBranch]]
)
object BranchListEmbedded {
    def toStringBody(var_branches: Object) =
        s"""
        | {
        | "branches":$var_branches
        | }
        """.stripMargin
}
