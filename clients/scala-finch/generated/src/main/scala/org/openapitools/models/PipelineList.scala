package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PipelineListEmbedded
import org.openapitools.models.ProgramListLinks

/**
 * 
 * @param UnderscoretotalNumberOfItems 
 * @param Underscoreembedded 
 * @param Underscorelinks 
 */
case class PipelineList(UnderscoretotalNumberOfItems: Option[Int],
                Underscoreembedded: Option[PipelineListEmbedded],
                Underscorelinks: Option[ProgramListLinks]
                )

object PipelineList {
    /**
     * Creates the codec for converting PipelineList from and to JSON.
     */
    implicit val decoder: Decoder[PipelineList] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineList] = deriveEncoder
}
