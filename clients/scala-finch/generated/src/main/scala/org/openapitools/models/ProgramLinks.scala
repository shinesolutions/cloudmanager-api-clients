package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HalLink

/**
 * 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelines 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashenvironments 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrepositories 
 * @param self 
 */
case class ProgramLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashpipelines: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashenvironments: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrepositories: Option[HalLink],
                self: Option[HalLink]
                )

object ProgramLinks {
    /**
     * Creates the codec for converting ProgramLinks from and to JSON.
     */
    implicit val decoder: Decoder[ProgramLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProgramLinks] = deriveEncoder
}
