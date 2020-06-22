package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PipelineExecutionStepState
import scala.collection.immutable.Seq

/**
 * 
 * @param stepStates 
 */
case class PipelineExecutionEmbedded(stepStates: Option[Seq[PipelineExecutionStepState]]
                )

object PipelineExecutionEmbedded {
    /**
     * Creates the codec for converting PipelineExecutionEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[PipelineExecutionEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineExecutionEmbedded] = deriveEncoder
}
