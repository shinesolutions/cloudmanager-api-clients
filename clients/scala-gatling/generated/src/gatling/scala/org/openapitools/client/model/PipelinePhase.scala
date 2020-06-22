
package org.openapitools.client.model


case class PipelinePhase (
    /* Name of the phase */
    _name: Option[String],
    /* Type of the phase */
    _type: String,
    /* Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD */
    _repositoryId: Option[String],
    /* Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing. */
    _branch: Option[String],
    /* Identifier of the target environment. Mandatory if type=DEPLOY */
    _environmentId: Option[String]
)
object PipelinePhase {
    def toStringBody(var_name: Object, var_type: Object, var_repositoryId: Object, var_branch: Object, var_environmentId: Object) =
        s"""
        | {
        | "name":$var_name,"type":$var_type,"repositoryId":$var_repositoryId,"branch":$var_branch,"environmentId":$var_environmentId
        | }
        """.stripMargin
}
