package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Environment._

case class Environment (
  /* id */
  id: Option[String],
/* Identifier of the program. Unique within the space. */
  programId: Option[String],
/* Name of the environment */
  name: Option[String],
/* Description of the environment */
  description: Option[String],
/* Type of the environment */
  `type`: Option[`Type`],
links: Option[EnvironmentLinks])

object Environment {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Dev extends `Type`
  case object Stage extends `Type`
  case object Prod extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Dev" => Some(Dev)
      case "Stage" => Some(Stage)
      case "Prod" => Some(Prod)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Dev => "Dev"
      case Stage => "Stage"
      case Prod => "Prod"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val EnvironmentCodecJson: CodecJson[Environment] = CodecJson.derive[Environment]
  implicit val EnvironmentDecoder: EntityDecoder[Environment] = jsonOf[Environment]
  implicit val EnvironmentEncoder: EntityEncoder[Environment] = jsonEncoderOf[Environment]
}
