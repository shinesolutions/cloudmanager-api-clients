package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MissingParameter._

case class MissingParameter (
  /* Name of the missing parameter. */
  name: Option[String],
/* Type of the missing parameter. */
  `type`: Option[String])

object MissingParameter {
  import DateTimeCodecs._

  implicit val MissingParameterCodecJson: CodecJson[MissingParameter] = CodecJson.derive[MissingParameter]
  implicit val MissingParameterDecoder: EntityDecoder[MissingParameter] = jsonOf[MissingParameter]
  implicit val MissingParameterEncoder: EntityEncoder[MissingParameter] = jsonEncoderOf[MissingParameter]
}
