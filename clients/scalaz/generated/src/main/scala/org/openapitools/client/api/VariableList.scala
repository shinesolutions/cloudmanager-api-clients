package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VariableList._

case class VariableList (
  totalNumberOfItems: Option[Integer],
embedded: Option[VariableListEmbedded],
links: Option[VariableListLinks])

object VariableList {
  import DateTimeCodecs._

  implicit val VariableListCodecJson: CodecJson[VariableList] = CodecJson.derive[VariableList]
  implicit val VariableListDecoder: EntityDecoder[VariableList] = jsonOf[VariableList]
  implicit val VariableListEncoder: EntityEncoder[VariableList] = jsonEncoderOf[VariableList]
}
