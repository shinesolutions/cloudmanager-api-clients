package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name Name of the missing parameter.
 * @param _type Type of the missing parameter.
 */
case class MissingParameter(name: Option[String],
                _type: Option[String]
                )

object MissingParameter {
    /**
     * Creates the codec for converting MissingParameter from and to JSON.
     */
    implicit val decoder: Decoder[MissingParameter] = deriveDecoder
    implicit val encoder: ObjectEncoder[MissingParameter] = deriveEncoder
}
