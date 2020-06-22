package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PipelineExecutionListRepresentationEmbedded
import org.openapitools.models.PipelineExecutionListRepresentationLinks
import org.openapitools.models.RequestedPageDetails

/**
 * List of pipeline executions
 * @param UnderscoretotalNumberOfItems 
 * @param Underscorepage 
 * @param Underscoreembedded 
 * @param Underscorelinks 
 */
case class PipelineExecutionListRepresentation(UnderscoretotalNumberOfItems: Option[Int],
                Underscorepage: Option[RequestedPageDetails],
                Underscoreembedded: Option[PipelineExecutionListRepresentationEmbedded],
                Underscorelinks: Option[PipelineExecutionListRepresentationLinks]
                )

object PipelineExecutionListRepresentation {
    /**
     * Creates the codec for converting PipelineExecutionListRepresentation from and to JSON.
     */
    implicit val decoder: Decoder[PipelineExecutionListRepresentation] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineExecutionListRepresentation] = deriveEncoder
}
