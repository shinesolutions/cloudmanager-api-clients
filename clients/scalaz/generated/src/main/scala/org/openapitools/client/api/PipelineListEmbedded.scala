package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineListEmbedded._

case class PipelineListEmbedded (
  pipelines: Option[List[Pipeline]])

object PipelineListEmbedded {
  import DateTimeCodecs._

  implicit val PipelineListEmbeddedCodecJson: CodecJson[PipelineListEmbedded] = CodecJson.derive[PipelineListEmbedded]
  implicit val PipelineListEmbeddedDecoder: EntityDecoder[PipelineListEmbedded] = jsonOf[PipelineListEmbedded]
  implicit val PipelineListEmbeddedEncoder: EntityEncoder[PipelineListEmbedded] = jsonEncoderOf[PipelineListEmbedded]
}
