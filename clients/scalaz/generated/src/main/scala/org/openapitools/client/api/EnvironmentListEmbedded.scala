package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnvironmentListEmbedded._

case class EnvironmentListEmbedded (
  environments: Option[List[Environment]])

object EnvironmentListEmbedded {
  import DateTimeCodecs._

  implicit val EnvironmentListEmbeddedCodecJson: CodecJson[EnvironmentListEmbedded] = CodecJson.derive[EnvironmentListEmbedded]
  implicit val EnvironmentListEmbeddedDecoder: EntityDecoder[EnvironmentListEmbedded] = jsonOf[EnvironmentListEmbedded]
  implicit val EnvironmentListEmbeddedEncoder: EntityEncoder[EnvironmentListEmbedded] = jsonEncoderOf[EnvironmentListEmbedded]
}
