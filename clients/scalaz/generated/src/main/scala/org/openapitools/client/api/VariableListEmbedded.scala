package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VariableListEmbedded._

case class VariableListEmbedded (
  /* Variables set on environment */
  variables: Option[List[Variable]])

object VariableListEmbedded {
  import DateTimeCodecs._

  implicit val VariableListEmbeddedCodecJson: CodecJson[VariableListEmbedded] = CodecJson.derive[VariableListEmbedded]
  implicit val VariableListEmbeddedDecoder: EntityDecoder[VariableListEmbedded] = jsonOf[VariableListEmbedded]
  implicit val VariableListEmbeddedEncoder: EntityEncoder[VariableListEmbedded] = jsonEncoderOf[VariableListEmbedded]
}
