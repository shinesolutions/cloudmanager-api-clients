package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HalLink

/**
 * 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashdownload 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashtail 
 */
case class EnvironmentLogLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashdownload: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashlogsSlashtail: Option[HalLink]
                )

object EnvironmentLogLinks {
    /**
     * Creates the codec for converting EnvironmentLogLinks from and to JSON.
     */
    implicit val decoder: Decoder[EnvironmentLogLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnvironmentLogLinks] = deriveEncoder
}
