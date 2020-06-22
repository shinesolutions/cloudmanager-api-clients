package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InvalidParameter
import org.openapitools.models.MissingParameter
import scala.collection.immutable.Seq

/**
 * A Bad Request response error.
 * @param status HTTP status code of the response.
 * @param _type Error type identifier.
 * @param title A short summary of the error.
 * @param missingParams Request's missing parameters.
 * @param invalidParams Request's invalid parameters.
 */
case class BadRequestError(status: Option[Int],
                _type: Option[String],
                title: Option[String],
                missingParams: Option[Seq[MissingParameter]],
                invalidParams: Option[Seq[InvalidParameter]]
                )

object BadRequestError {
    /**
     * Creates the codec for converting BadRequestError from and to JSON.
     */
    implicit val decoder: Decoder[BadRequestError] = deriveDecoder
    implicit val encoder: ObjectEncoder[BadRequestError] = deriveEncoder
}
