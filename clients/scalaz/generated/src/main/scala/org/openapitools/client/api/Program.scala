package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Program._

case class Program (
  /* Identifier of the program. Unique within the space. */
  id: Option[String],
/* Name of the program */
  name: String,
/* Whether this Program has been enabled for Cloud Manager usage */
  enabled: Option[Boolean],
/* Tenant Id */
  tenantId: Option[String],
/* Organisation Id */
  imsOrgId: Option[String],
links: Option[ProgramLinks])

object Program {
  import DateTimeCodecs._

  implicit val ProgramCodecJson: CodecJson[Program] = CodecJson.derive[Program]
  implicit val ProgramDecoder: EntityDecoder[Program] = jsonOf[Program]
  implicit val ProgramEncoder: EntityEncoder[Program] = jsonEncoderOf[Program]
}
