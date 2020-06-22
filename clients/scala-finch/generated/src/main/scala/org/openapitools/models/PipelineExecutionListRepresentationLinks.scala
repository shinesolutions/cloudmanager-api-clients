package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HalLink

/**
 * 
 * @param next 
 * @param page 
 * @param prev 
 * @param self 
 */
case class PipelineExecutionListRepresentationLinks(next: Option[HalLink],
                page: Option[HalLink],
                prev: Option[HalLink],
                self: Option[HalLink]
                )

object PipelineExecutionListRepresentationLinks {
    /**
     * Creates the codec for converting PipelineExecutionListRepresentationLinks from and to JSON.
     */
    implicit val decoder: Decoder[PipelineExecutionListRepresentationLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineExecutionListRepresentationLinks] = deriveEncoder
}
