
package org.openapitools.client.model


case class PipelineExecutionEmbedded (
    _stepStates: Option[List[PipelineExecutionStepState]]
)
object PipelineExecutionEmbedded {
    def toStringBody(var_stepStates: Object) =
        s"""
        | {
        | "stepStates":$var_stepStates
        | }
        """.stripMargin
}
