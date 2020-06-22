package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineExecutionEmbedded._

case class PipelineExecutionEmbedded (
  stepStates: Option[List[PipelineExecutionStepState]])

object PipelineExecutionEmbedded {
  import DateTimeCodecs._

  implicit val PipelineExecutionEmbeddedCodecJson: CodecJson[PipelineExecutionEmbedded] = CodecJson.derive[PipelineExecutionEmbedded]
  implicit val PipelineExecutionEmbeddedDecoder: EntityDecoder[PipelineExecutionEmbedded] = jsonOf[PipelineExecutionEmbedded]
  implicit val PipelineExecutionEmbeddedEncoder: EntityEncoder[PipelineExecutionEmbedded] = jsonEncoderOf[PipelineExecutionEmbedded]
}
