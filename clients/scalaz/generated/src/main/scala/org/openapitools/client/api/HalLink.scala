package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import HalLink._

case class HalLink (
  href: Option[String],
templated: Option[Boolean],
`type`: Option[String],
deprecation: Option[String],
profile: Option[String],
title: Option[String],
hreflang: Option[String],
name: Option[String])

object HalLink {
  import DateTimeCodecs._

  implicit val HalLinkCodecJson: CodecJson[HalLink] = CodecJson.derive[HalLink]
  implicit val HalLinkDecoder: EntityDecoder[HalLink] = jsonOf[HalLink]
  implicit val HalLinkEncoder: EntityEncoder[HalLink] = jsonEncoderOf[HalLink]
}
