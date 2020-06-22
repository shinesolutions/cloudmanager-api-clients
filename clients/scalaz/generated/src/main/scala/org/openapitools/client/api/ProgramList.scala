package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProgramList._

case class ProgramList (
  totalNumberOfItems: Option[Integer],
embedded: Option[ProgramListEmbedded],
links: Option[ProgramListLinks])

object ProgramList {
  import DateTimeCodecs._

  implicit val ProgramListCodecJson: CodecJson[ProgramList] = CodecJson.derive[ProgramList]
  implicit val ProgramListDecoder: EntityDecoder[ProgramList] = jsonOf[ProgramList]
  implicit val ProgramListEncoder: EntityEncoder[ProgramList] = jsonEncoderOf[ProgramList]
}
