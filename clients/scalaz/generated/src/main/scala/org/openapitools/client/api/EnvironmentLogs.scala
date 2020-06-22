package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnvironmentLogs._

case class EnvironmentLogs (
  /* Name of the service */
  service: Option[List[String]],
/* Name of the Log */
  name: Option[List[String]],
/* Number of days */
  days: Option[Integer],
links: Option[EnvironmentLogsLinks],
embedded: Option[EnvironmentLogsEmbedded])

object EnvironmentLogs {
  import DateTimeCodecs._

  implicit val EnvironmentLogsCodecJson: CodecJson[EnvironmentLogs] = CodecJson.derive[EnvironmentLogs]
  implicit val EnvironmentLogsDecoder: EntityDecoder[EnvironmentLogs] = jsonOf[EnvironmentLogs]
  implicit val EnvironmentLogsEncoder: EntityEncoder[EnvironmentLogs] = jsonEncoderOf[EnvironmentLogs]
}
