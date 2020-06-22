
package org.openapitools.client.model


case class PipelineStepMetrics (
    /* metrics */
    _metrics: Option[List[Metric]]
)
object PipelineStepMetrics {
    def toStringBody(var_metrics: Object) =
        s"""
        | {
        | "metrics":$var_metrics
        | }
        """.stripMargin
}
