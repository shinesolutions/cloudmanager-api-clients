package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineExecutionStepStateLinks._

case class PipelineExecutionStepStateLinks (
  httpNsAdobeComAdobecloudRelExecution: Option[HalLink],
httpNsAdobeComAdobecloudRelPipeline: Option[HalLink],
httpNsAdobeComAdobecloudRelPipelineLogs: Option[HalLink],
httpNsAdobeComAdobecloudRelPipelineMetrics: Option[HalLink],
httpNsAdobeComAdobecloudRelPipelineAdvance: Option[HalLink],
httpNsAdobeComAdobecloudRelPipelineCancel: Option[HalLink],
httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
self: Option[HalLink])

object PipelineExecutionStepStateLinks {
  import DateTimeCodecs._

  implicit val PipelineExecutionStepStateLinksCodecJson: CodecJson[PipelineExecutionStepStateLinks] = CodecJson.derive[PipelineExecutionStepStateLinks]
  implicit val PipelineExecutionStepStateLinksDecoder: EntityDecoder[PipelineExecutionStepStateLinks] = jsonOf[PipelineExecutionStepStateLinks]
  implicit val PipelineExecutionStepStateLinksEncoder: EntityEncoder[PipelineExecutionStepStateLinks] = jsonEncoderOf[PipelineExecutionStepStateLinks]
}
