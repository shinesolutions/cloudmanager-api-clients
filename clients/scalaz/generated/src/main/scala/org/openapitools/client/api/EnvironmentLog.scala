package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnvironmentLog._

case class EnvironmentLog (
  /* Name of the service */
  service: Option[String],
/* Name of the Log */
  name: Option[String],
/* date of the Log */
  date: Option[String],
programId: Option[Long],
environmentId: Option[Long],
links: Option[EnvironmentLogLinks])

object EnvironmentLog {
  import DateTimeCodecs._

  implicit val EnvironmentLogCodecJson: CodecJson[EnvironmentLog] = CodecJson.derive[EnvironmentLog]
  implicit val EnvironmentLogDecoder: EntityDecoder[EnvironmentLog] = jsonOf[EnvironmentLog]
  implicit val EnvironmentLogEncoder: EntityEncoder[EnvironmentLog] = jsonEncoderOf[EnvironmentLog]
}
