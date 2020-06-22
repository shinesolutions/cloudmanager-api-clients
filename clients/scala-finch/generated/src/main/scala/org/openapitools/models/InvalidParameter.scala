package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name Name of the invalid parameter.
 * @param reason Reason of why the parameter's value is not accepted.
 */
case class InvalidParameter(name: Option[String],
                reason: Option[String]
                )

object InvalidParameter {
    /**
     * Creates the codec for converting InvalidParameter from and to JSON.
     */
    implicit val decoder: Decoder[InvalidParameter] = deriveDecoder
    implicit val encoder: ObjectEncoder[InvalidParameter] = deriveEncoder
}
