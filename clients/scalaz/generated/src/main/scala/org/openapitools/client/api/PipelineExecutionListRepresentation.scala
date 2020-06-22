package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineExecutionListRepresentation._

case class PipelineExecutionListRepresentation (
  totalNumberOfItems: Option[Integer],
page: Option[RequestedPageDetails],
embedded: Option[PipelineExecutionListRepresentationEmbedded],
links: Option[PipelineExecutionListRepresentationLinks])

object PipelineExecutionListRepresentation {
  import DateTimeCodecs._

  implicit val PipelineExecutionListRepresentationCodecJson: CodecJson[PipelineExecutionListRepresentation] = CodecJson.derive[PipelineExecutionListRepresentation]
  implicit val PipelineExecutionListRepresentationDecoder: EntityDecoder[PipelineExecutionListRepresentation] = jsonOf[PipelineExecutionListRepresentation]
  implicit val PipelineExecutionListRepresentationEncoder: EntityEncoder[PipelineExecutionListRepresentation] = jsonEncoderOf[PipelineExecutionListRepresentation]
}
