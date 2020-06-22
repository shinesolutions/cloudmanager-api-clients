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
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashbranches 
 * @param self 
 */
case class RepositoryLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashbranches: Option[HalLink],
                self: Option[HalLink]
                )

object RepositoryLinks {
    /**
     * Creates the codec for converting RepositoryLinks from and to JSON.
     */
    implicit val decoder: Decoder[RepositoryLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[RepositoryLinks] = deriveEncoder
}
