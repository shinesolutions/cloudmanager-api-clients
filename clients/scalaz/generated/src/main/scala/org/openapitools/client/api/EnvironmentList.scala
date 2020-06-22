package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnvironmentList._

case class EnvironmentList (
  totalNumberOfItems: Option[Integer],
embedded: Option[EnvironmentListEmbedded],
links: Option[ProgramListLinks])

object EnvironmentList {
  import DateTimeCodecs._

  implicit val EnvironmentListCodecJson: CodecJson[EnvironmentList] = CodecJson.derive[EnvironmentList]
  implicit val EnvironmentListDecoder: EntityDecoder[EnvironmentList] = jsonOf[EnvironmentList]
  implicit val EnvironmentListEncoder: EntityEncoder[EnvironmentList] = jsonEncoderOf[EnvironmentList]
}
