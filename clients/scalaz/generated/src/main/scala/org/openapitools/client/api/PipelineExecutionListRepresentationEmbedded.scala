package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineExecutionListRepresentationEmbedded._

case class PipelineExecutionListRepresentationEmbedded (
  executions: Option[List[PipelineExecution]])

object PipelineExecutionListRepresentationEmbedded {
  import DateTimeCodecs._

  implicit val PipelineExecutionListRepresentationEmbeddedCodecJson: CodecJson[PipelineExecutionListRepresentationEmbedded] = CodecJson.derive[PipelineExecutionListRepresentationEmbedded]
  implicit val PipelineExecutionListRepresentationEmbeddedDecoder: EntityDecoder[PipelineExecutionListRepresentationEmbedded] = jsonOf[PipelineExecutionListRepresentationEmbedded]
  implicit val PipelineExecutionListRepresentationEmbeddedEncoder: EntityEncoder[PipelineExecutionListRepresentationEmbedded] = jsonEncoderOf[PipelineExecutionListRepresentationEmbedded]
}
