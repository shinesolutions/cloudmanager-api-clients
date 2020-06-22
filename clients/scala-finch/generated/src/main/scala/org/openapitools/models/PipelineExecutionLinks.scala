package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HalLink

/**
 * 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipeline 
 * @param self 
 */
case class PipelineExecutionLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipeline: Option[HalLink],
                self: Option[HalLink]
                )

object PipelineExecutionLinks {
    /**
     * Creates the codec for converting PipelineExecutionLinks from and to JSON.
     */
    implicit val decoder: Decoder[PipelineExecutionLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineExecutionLinks] = deriveEncoder
}
