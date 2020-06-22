package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A named value than can be set on an Environment
 * @param name Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
 * @param value Value of the variable. Read-Write for non-secrets, write-only for secrets.
 * @param _type Type of the variable. Default `string` if missing. Cannot be changed after creation.
 */
case class Variable(name: Option[String],
                value: Option[String],
                _type: Option[String]
                )

object Variable {
    /**
     * Creates the codec for converting Variable from and to JSON.
     */
    implicit val decoder: Decoder[Variable] = deriveDecoder
    implicit val encoder: ObjectEncoder[Variable] = deriveEncoder
}
