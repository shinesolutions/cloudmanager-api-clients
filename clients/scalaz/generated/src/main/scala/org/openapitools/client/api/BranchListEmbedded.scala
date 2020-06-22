package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BranchListEmbedded._

case class BranchListEmbedded (
  branches: Option[List[RepositoryBranch]])

object BranchListEmbedded {
  import DateTimeCodecs._

  implicit val BranchListEmbeddedCodecJson: CodecJson[BranchListEmbedded] = CodecJson.derive[BranchListEmbedded]
  implicit val BranchListEmbeddedDecoder: EntityDecoder[BranchListEmbedded] = jsonOf[BranchListEmbedded]
  implicit val BranchListEmbeddedEncoder: EntityEncoder[BranchListEmbedded] = jsonEncoderOf[BranchListEmbedded]
}
