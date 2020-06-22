package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VariableListLinks._

case class VariableListLinks (
  httpNsAdobeComAdobecloudRelEnvironment: Option[HalLink],
httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
self: Option[HalLink])

object VariableListLinks {
  import DateTimeCodecs._

  implicit val VariableListLinksCodecJson: CodecJson[VariableListLinks] = CodecJson.derive[VariableListLinks]
  implicit val VariableListLinksDecoder: EntityDecoder[VariableListLinks] = jsonOf[VariableListLinks]
  implicit val VariableListLinksEncoder: EntityEncoder[VariableListLinks] = jsonEncoderOf[VariableListLinks]
}
