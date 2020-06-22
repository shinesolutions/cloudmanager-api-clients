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
 * @param prev 
 * @param self 
 */
case class ProgramListLinks(next: Option[HalLink],
                prev: Option[HalLink],
                self: Option[HalLink]
                )

object ProgramListLinks {
    /**
     * Creates the codec for converting ProgramListLinks from and to JSON.
     */
    implicit val decoder: Decoder[ProgramListLinks] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProgramListLinks] = deriveEncoder
}
