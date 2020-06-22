package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProgramLinks

/**
 * Describes a __Program__
 * @param id Identifier of the program. Unique within the space.
 * @param name Name of the program
 * @param enabled Whether this Program has been enabled for Cloud Manager usage
 * @param tenantId Tenant Id
 * @param imsOrgId Organisation Id
 * @param Underscorelinks 
 */
case class Program(id: Option[String],
                name: String,
                enabled: Option[Boolean],
                tenantId: Option[String],
                imsOrgId: Option[String],
                Underscorelinks: Option[ProgramLinks]
                )

object Program {
    /**
     * Creates the codec for converting Program from and to JSON.
     */
    implicit val decoder: Decoder[Program] = deriveDecoder
    implicit val encoder: ObjectEncoder[Program] = deriveEncoder
}
