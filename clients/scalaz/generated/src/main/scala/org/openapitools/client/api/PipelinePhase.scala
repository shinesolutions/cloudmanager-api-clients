package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PipelinePhase._

case class PipelinePhase (
  /* Name of the phase */
  name: Option[String],
/* Type of the phase */
  `type`: `Type`,
/* Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD */
  repositoryId: Option[String],
/* Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing. */
  branch: Option[String],
/* Identifier of the target environment. Mandatory if type=DEPLOY */
  environmentId: Option[String])

object PipelinePhase {
  import DateTimeCodecs._
  sealed trait `Type`
  case object VALIDATE extends `Type`
  case object BUILD extends `Type`
  case object DEPLOY extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "VALIDATE" => Some(VALIDATE)
      case "BUILD" => Some(BUILD)
      case "DEPLOY" => Some(DEPLOY)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case VALIDATE => "VALIDATE"
      case BUILD => "BUILD"
      case DEPLOY => "DEPLOY"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val PipelinePhaseCodecJson: CodecJson[PipelinePhase] = CodecJson.derive[PipelinePhase]
  implicit val PipelinePhaseDecoder: EntityDecoder[PipelinePhase] = jsonOf[PipelinePhase]
  implicit val PipelinePhaseEncoder: EntityEncoder[PipelinePhase] = jsonEncoderOf[PipelinePhase]
}
