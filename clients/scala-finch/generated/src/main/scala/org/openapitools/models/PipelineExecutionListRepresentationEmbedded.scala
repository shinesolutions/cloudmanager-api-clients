package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PipelineExecution
import scala.collection.immutable.Seq

/**
 * 
 * @param executions 
 */
case class PipelineExecutionListRepresentationEmbedded(executions: Option[Seq[PipelineExecution]]
                )

object PipelineExecutionListRepresentationEmbedded {
    /**
     * Creates the codec for converting PipelineExecutionListRepresentationEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[PipelineExecutionListRepresentationEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineExecutionListRepresentationEmbedded] = deriveEncoder
}
