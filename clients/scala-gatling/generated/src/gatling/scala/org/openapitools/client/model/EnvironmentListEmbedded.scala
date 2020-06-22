
package org.openapitools.client.model


case class EnvironmentListEmbedded (
    _environments: Option[List[Environment]]
)
object EnvironmentListEmbedded {
    def toStringBody(var_environments: Object) =
        s"""
        | {
        | "environments":$var_environments
        | }
        """.stripMargin
}
