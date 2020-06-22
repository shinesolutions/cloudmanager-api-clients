package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BadRequestError._

case class BadRequestError (
  /* HTTP status code of the response. */
  status: Option[Integer],
/* Error type identifier. */
  `type`: Option[String],
/* A short summary of the error. */
  title: Option[String],
/* Request's missing parameters. */
  missingParams: Option[List[MissingParameter]],
/* Request's invalid parameters. */
  invalidParams: Option[List[InvalidParameter]])

object BadRequestError {
  import DateTimeCodecs._

  implicit val BadRequestErrorCodecJson: CodecJson[BadRequestError] = CodecJson.derive[BadRequestError]
  implicit val BadRequestErrorDecoder: EntityDecoder[BadRequestError] = jsonOf[BadRequestError]
  implicit val BadRequestErrorEncoder: EntityEncoder[BadRequestError] = jsonEncoderOf[BadRequestError]
}
