package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnvironmentLinks._

case class EnvironmentLinks (
  httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
httpNsAdobeComAdobecloudRelPipeline: Option[HalLink],
httpNsAdobeComAdobecloudRelAuthor: Option[HalLink],
httpNsAdobeComAdobecloudRelPublish: Option[HalLink],
httpNsAdobeComAdobecloudRelDeveloperConsole: Option[HalLink],
httpNsAdobeComAdobecloudRelLogs: Option[HalLink],
httpNsAdobeComAdobecloudRelVariables: Option[HalLink],
self: Option[HalLink])

object EnvironmentLinks {
  import DateTimeCodecs._

  implicit val EnvironmentLinksCodecJson: CodecJson[EnvironmentLinks] = CodecJson.derive[EnvironmentLinks]
  implicit val EnvironmentLinksDecoder: EntityDecoder[EnvironmentLinks] = jsonOf[EnvironmentLinks]
  implicit val EnvironmentLinksEncoder: EntityEncoder[EnvironmentLinks] = jsonEncoderOf[EnvironmentLinks]
}
