package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Variable._

case class Variable (
  /* Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. */
  name: Option[String],
/* Value of the variable. Read-Write for non-secrets, write-only for secrets. */
  value: Option[String],
/* Type of the variable. Default `string` if missing. Cannot be changed after creation. */
  `type`: Option[`Type`])

object Variable {
  import DateTimeCodecs._
  sealed trait `Type`
  case object String extends `Type`
  case object SecretString extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "String" => Some(String)
      case "SecretString" => Some(SecretString)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case String => "String"
      case SecretString => "SecretString"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val VariableCodecJson: CodecJson[Variable] = CodecJson.derive[Variable]
  implicit val VariableDecoder: EntityDecoder[Variable] = jsonOf[Variable]
  implicit val VariableEncoder: EntityEncoder[Variable] = jsonEncoderOf[Variable]
}
