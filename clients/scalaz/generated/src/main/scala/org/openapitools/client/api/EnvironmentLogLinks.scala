package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnvironmentLogLinks._

case class EnvironmentLogLinks (
  httpNsAdobeComAdobecloudRelLogsDownload: Option[HalLink],
httpNsAdobeComAdobecloudRelLogsTail: Option[HalLink])

object EnvironmentLogLinks {
  import DateTimeCodecs._

  implicit val EnvironmentLogLinksCodecJson: CodecJson[EnvironmentLogLinks] = CodecJson.derive[EnvironmentLogLinks]
  implicit val EnvironmentLogLinksDecoder: EntityDecoder[EnvironmentLogLinks] = jsonOf[EnvironmentLogLinks]
  implicit val EnvironmentLogLinksEncoder: EntityEncoder[EnvironmentLogLinks] = jsonEncoderOf[EnvironmentLogLinks]
}
