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
 * @param self 
 */
case class EnvironmentLogsLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram: Option[HalLink],
                self: Option[HalLink]
                )

object EnvironmentLogsLinks {
    /**
     * Creates the codec for converting EnvironmentLogsLinks from and to JSON.
     */
    implicit val decoder: Decoder[EnvironmentLogsLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnvironmentLogsLinks] = deriveEncoder
}
