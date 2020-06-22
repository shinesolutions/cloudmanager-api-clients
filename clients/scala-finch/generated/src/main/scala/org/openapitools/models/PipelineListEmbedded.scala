package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Pipeline
import scala.collection.immutable.Seq

/**
 * 
 * @param pipelines 
 */
case class PipelineListEmbedded(pipelines: Option[Seq[Pipeline]]
                )

object PipelineListEmbedded {
    /**
     * Creates the codec for converting PipelineListEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[PipelineListEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineListEmbedded] = deriveEncoder
}
