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
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecution 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecutions 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrollbackLastSuccessfulExecution 
 * @param self 
 */
case class PipelineLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecution: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashexecutions: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrollbackLastSuccessfulExecution: Option[HalLink],
                self: Option[HalLink]
                )

object PipelineLinks {
    /**
     * Creates the codec for converting PipelineLinks from and to JSON.
     */
    implicit val decoder: Decoder[PipelineLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineLinks] = deriveEncoder
}
