package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelineLinks._

case class PipelineLinks (
  httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
httpNsAdobeComAdobecloudRelExecution: Option[HalLink],
httpNsAdobeComAdobecloudRelExecutions: Option[HalLink],
httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: Option[HalLink],
self: Option[HalLink])

object PipelineLinks {
  import DateTimeCodecs._

  implicit val PipelineLinksCodecJson: CodecJson[PipelineLinks] = CodecJson.derive[PipelineLinks]
  implicit val PipelineLinksDecoder: EntityDecoder[PipelineLinks] = jsonOf[PipelineLinks]
  implicit val PipelineLinksEncoder: EntityEncoder[PipelineLinks] = jsonEncoderOf[PipelineLinks]
}
