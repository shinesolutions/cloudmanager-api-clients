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
 * @param httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrepository 
 */
case class RepositoryBranchLinks(httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashprogram: Option[HalLink],
                httpColonSlashSlashnsPeriodadobePeriodcomSlashadobecloudSlashrelSlashrepository: Option[HalLink]
                )

object RepositoryBranchLinks {
    /**
     * Creates the codec for converting RepositoryBranchLinks from and to JSON.
     */
    implicit val decoder: Decoder[RepositoryBranchLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[RepositoryBranchLinks] = deriveEncoder
}
