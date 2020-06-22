package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Metric
import scala.collection.immutable.Seq

/**
 * 
 * @param metrics metrics
 */
case class PipelineStepMetrics(metrics: Option[Seq[Metric]]
                )

object PipelineStepMetrics {
    /**
     * Creates the codec for converting PipelineStepMetrics from and to JSON.
     */
    implicit val decoder: Decoder[PipelineStepMetrics] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineStepMetrics] = deriveEncoder
}
