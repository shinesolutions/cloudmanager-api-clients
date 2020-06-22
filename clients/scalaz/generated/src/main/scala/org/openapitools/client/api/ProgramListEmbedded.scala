package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProgramListEmbedded._

case class ProgramListEmbedded (
  programs: Option[List[EmbeddedProgram]])

object ProgramListEmbedded {
  import DateTimeCodecs._

  implicit val ProgramListEmbeddedCodecJson: CodecJson[ProgramListEmbedded] = CodecJson.derive[ProgramListEmbedded]
  implicit val ProgramListEmbeddedDecoder: EntityDecoder[ProgramListEmbedded] = jsonOf[ProgramListEmbedded]
  implicit val ProgramListEmbeddedEncoder: EntityEncoder[ProgramListEmbedded] = jsonEncoderOf[ProgramListEmbedded]
}
