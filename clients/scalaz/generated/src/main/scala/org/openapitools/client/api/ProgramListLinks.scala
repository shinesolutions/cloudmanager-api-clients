package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProgramListLinks._

case class ProgramListLinks (
  next: Option[HalLink],
prev: Option[HalLink],
self: Option[HalLink])

object ProgramListLinks {
  import DateTimeCodecs._

  implicit val ProgramListLinksCodecJson: CodecJson[ProgramListLinks] = CodecJson.derive[ProgramListLinks]
  implicit val ProgramListLinksDecoder: EntityDecoder[ProgramListLinks] = jsonOf[ProgramListLinks]
  implicit val ProgramListLinksEncoder: EntityEncoder[ProgramListLinks] = jsonEncoderOf[ProgramListLinks]
}
