package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EnvironmentLinks

/**
 * An Environment that 
 * @param id id
 * @param programId Identifier of the program. Unique within the space.
 * @param name Name of the environment
 * @param description Description of the environment
 * @param _type Type of the environment
 * @param Underscorelinks 
 */
case class Environment(id: Option[String],
                programId: Option[String],
                name: Option[String],
                description: Option[String],
                _type: Option[String],
                Underscorelinks: Option[EnvironmentLinks]
                )

object Environment {
    /**
     * Creates the codec for converting Environment from and to JSON.
     */
    implicit val decoder: Decoder[Environment] = deriveDecoder
    implicit val encoder: ObjectEncoder[Environment] = deriveEncoder
}
