package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RequestedPageDetails._

case class RequestedPageDetails (
  start: Option[Integer],
limit: Option[Integer],
orderBy: Option[String],
property: Option[List[String]],
`type`: Option[String],
next: Option[Integer],
prev: Option[Integer])

object RequestedPageDetails {
  import DateTimeCodecs._

  implicit val RequestedPageDetailsCodecJson: CodecJson[RequestedPageDetails] = CodecJson.derive[RequestedPageDetails]
  implicit val RequestedPageDetailsDecoder: EntityDecoder[RequestedPageDetails] = jsonOf[RequestedPageDetails]
  implicit val RequestedPageDetailsEncoder: EntityEncoder[RequestedPageDetails] = jsonEncoderOf[RequestedPageDetails]
}
