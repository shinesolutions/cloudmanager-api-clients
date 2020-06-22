
package org.openapitools.client.model


case class PipelineExecutionListRepresentationEmbedded (
    _executions: Option[List[PipelineExecution]]
)
object PipelineExecutionListRepresentationEmbedded {
    def toStringBody(var_executions: Object) =
        s"""
        | {
        | "executions":$var_executions
        | }
        """.stripMargin
}
