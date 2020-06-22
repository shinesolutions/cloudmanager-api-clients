
package org.openapitools.client.model


case class VariableListEmbedded (
    /* Variables set on environment */
    _variables: Option[List[Variable]]
)
object VariableListEmbedded {
    def toStringBody(var_variables: Object) =
        s"""
        | {
        | "variables":$var_variables
        | }
        """.stripMargin
}
