package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EmbeddedProgram._

case class EmbeddedProgram (
  /* Identifier of the program. Unique within the space. */
  id: Option[String],
/* Name of the program */
  name: Option[String],
/* Whether this Program has been enabled for Cloud Manager usage */
  enabled: Option[Boolean],
/* Tenant Id */
  tenantId: Option[String])

object EmbeddedProgram {
  import DateTimeCodecs._

  implicit val EmbeddedProgramCodecJson: CodecJson[EmbeddedProgram] = CodecJson.derive[EmbeddedProgram]
  implicit val EmbeddedProgramDecoder: EntityDecoder[EmbeddedProgram] = jsonOf[EmbeddedProgram]
  implicit val EmbeddedProgramEncoder: EntityEncoder[EmbeddedProgram] = jsonEncoderOf[EmbeddedProgram]
}
