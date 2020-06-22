package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineExecutionListRepresentationLinks._

case class PipelineExecutionListRepresentationLinks (
  next: Option[HalLink],
page: Option[HalLink],
prev: Option[HalLink],
self: Option[HalLink])

object PipelineExecutionListRepresentationLinks {
  import DateTimeCodecs._

  implicit val PipelineExecutionListRepresentationLinksCodecJson: CodecJson[PipelineExecutionListRepresentationLinks] = CodecJson.derive[PipelineExecutionListRepresentationLinks]
  implicit val PipelineExecutionListRepresentationLinksDecoder: EntityDecoder[PipelineExecutionListRepresentationLinks] = jsonOf[PipelineExecutionListRepresentationLinks]
  implicit val PipelineExecutionListRepresentationLinksEncoder: EntityEncoder[PipelineExecutionListRepresentationLinks] = jsonEncoderOf[PipelineExecutionListRepresentationLinks]
}
