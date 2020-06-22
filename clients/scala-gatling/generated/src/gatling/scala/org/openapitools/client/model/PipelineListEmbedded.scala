
package org.openapitools.client.model


case class PipelineListEmbedded (
    _pipelines: Option[List[Pipeline]]
)
object PipelineListEmbedded {
    def toStringBody(var_pipelines: Object) =
        s"""
        | {
        | "pipelines":$var_pipelines
        | }
        """.stripMargin
}
