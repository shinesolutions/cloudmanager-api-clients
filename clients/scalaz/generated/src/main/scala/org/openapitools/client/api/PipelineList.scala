package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineList._

case class PipelineList (
  totalNumberOfItems: Option[Integer],
embedded: Option[PipelineListEmbedded],
links: Option[ProgramListLinks])

object PipelineList {
  import DateTimeCodecs._

  implicit val PipelineListCodecJson: CodecJson[PipelineList] = CodecJson.derive[PipelineList]
  implicit val PipelineListDecoder: EntityDecoder[PipelineList] = jsonOf[PipelineList]
  implicit val PipelineListEncoder: EntityEncoder[PipelineList] = jsonEncoderOf[PipelineList]
}
