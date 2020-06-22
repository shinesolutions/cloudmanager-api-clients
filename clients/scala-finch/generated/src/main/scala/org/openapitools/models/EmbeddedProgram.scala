package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Describes an __Embedded Program__
 * @param id Identifier of the program. Unique within the space.
 * @param name Name of the program
 * @param enabled Whether this Program has been enabled for Cloud Manager usage
 * @param tenantId Tenant Id
 */
case class EmbeddedProgram(id: Option[String],
                name: Option[String],
                enabled: Option[Boolean],
                tenantId: Option[String]
                )

object EmbeddedProgram {
    /**
     * Creates the codec for converting EmbeddedProgram from and to JSON.
     */
    implicit val decoder: Decoder[EmbeddedProgram] = deriveDecoder
    implicit val encoder: ObjectEncoder[EmbeddedProgram] = deriveEncoder
}
