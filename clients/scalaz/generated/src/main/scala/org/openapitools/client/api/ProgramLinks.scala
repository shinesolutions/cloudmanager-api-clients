package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProgramLinks._

case class ProgramLinks (
  httpNsAdobeComAdobecloudRelPipelines: Option[HalLink],
httpNsAdobeComAdobecloudRelEnvironments: Option[HalLink],
httpNsAdobeComAdobecloudRelRepositories: Option[HalLink],
self: Option[HalLink])

object ProgramLinks {
  import DateTimeCodecs._

  implicit val ProgramLinksCodecJson: CodecJson[ProgramLinks] = CodecJson.derive[ProgramLinks]
  implicit val ProgramLinksDecoder: EntityDecoder[ProgramLinks] = jsonOf[ProgramLinks]
  implicit val ProgramLinksEncoder: EntityEncoder[ProgramLinks] = jsonEncoderOf[ProgramLinks]
}
