package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.HalLink

/**
 * 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashenvironment 
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram 
 * @param self 
 */
case class VariableListLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashenvironment: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram: Option[HalLink],
                self: Option[HalLink]
                )

object VariableListLinks {
    /**
     * Creates the codec for converting VariableListLinks from and to JSON.
     */
    implicit val decoder: Decoder[VariableListLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[VariableListLinks] = deriveEncoder
}
