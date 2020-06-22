package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineStepMetrics._

case class PipelineStepMetrics (
  /* metrics */
  metrics: Option[List[Metric]])

object PipelineStepMetrics {
  import DateTimeCodecs._

  implicit val PipelineStepMetricsCodecJson: CodecJson[PipelineStepMetrics] = CodecJson.derive[PipelineStepMetrics]
  implicit val PipelineStepMetricsDecoder: EntityDecoder[PipelineStepMetrics] = jsonOf[PipelineStepMetrics]
  implicit val PipelineStepMetricsEncoder: EntityEncoder[PipelineStepMetrics] = jsonEncoderOf[PipelineStepMetrics]
}
