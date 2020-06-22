package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HalLink

/**
 * 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecution 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipeline 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashlogs 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashmetrics 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashadvance 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashcancel 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram 
 * @param self 
 */
case class PipelineExecutionStepStateLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecution: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipeline: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashlogs: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashmetrics: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashadvance: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelineSlashcancel: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram: Option[HalLink],
                self: Option[HalLink]
                )

object PipelineExecutionStepStateLinks {
    /**
     * Creates the codec for converting PipelineExecutionStepStateLinks from and to JSON.
     */
    implicit val decoder: Decoder[PipelineExecutionStepStateLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineExecutionStepStateLinks] = deriveEncoder
}
