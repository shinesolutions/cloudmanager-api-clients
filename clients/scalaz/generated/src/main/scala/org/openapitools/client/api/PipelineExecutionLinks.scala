package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineExecutionLinks._

case class PipelineExecutionLinks (
  httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
httpNsAdobeComAdobecloudRelPipeline: Option[HalLink],
self: Option[HalLink])

object PipelineExecutionLinks {
  import DateTimeCodecs._

  implicit val PipelineExecutionLinksCodecJson: CodecJson[PipelineExecutionLinks] = CodecJson.derive[PipelineExecutionLinks]
  implicit val PipelineExecutionLinksDecoder: EntityDecoder[PipelineExecutionLinks] = jsonOf[PipelineExecutionLinks]
  implicit val PipelineExecutionLinksEncoder: EntityEncoder[PipelineExecutionLinks] = jsonEncoderOf[PipelineExecutionLinks]
}
