package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnvironmentLogsLinks._

case class EnvironmentLogsLinks (
  httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
self: Option[HalLink])

object EnvironmentLogsLinks {
  import DateTimeCodecs._

  implicit val EnvironmentLogsLinksCodecJson: CodecJson[EnvironmentLogsLinks] = CodecJson.derive[EnvironmentLogsLinks]
  implicit val EnvironmentLogsLinksDecoder: EntityDecoder[EnvironmentLogsLinks] = jsonOf[EnvironmentLogsLinks]
  implicit val EnvironmentLogsLinksEncoder: EntityEncoder[EnvironmentLogsLinks] = jsonEncoderOf[EnvironmentLogsLinks]
}
