package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BranchList._

case class BranchList (
  totalNumberOfItems: Option[Integer],
embedded: Option[BranchListEmbedded],
links: Option[ProgramListLinks])

object BranchList {
  import DateTimeCodecs._

  implicit val BranchListCodecJson: CodecJson[BranchList] = CodecJson.derive[BranchList]
  implicit val BranchListDecoder: EntityDecoder[BranchList] = jsonOf[BranchList]
  implicit val BranchListEncoder: EntityEncoder[BranchList] = jsonEncoderOf[BranchList]
}
