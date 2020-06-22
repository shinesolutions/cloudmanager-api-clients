package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import Pipeline._

case class Pipeline (
  /* Identifier of the pipeline. Unique within the program. */
  id: Option[String],
/* Identifier of the program. Unique within the space. */
  programId: Option[String],
/* Name of the pipeline */
  name: String,
/* How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} */
  trigger: Option[Trigger],
/* Pipeline status */
  status: Option[Status],
/* Create date */
  createdAt: Option[OffsetDateTime],
/* Update date */
  updatedAt: Option[OffsetDateTime],
/* Last pipeline execution start */
  lastStartedAt: Option[OffsetDateTime],
/* Last pipeline execution end */
  lastFinishedAt: Option[OffsetDateTime],
/* Pipeline phases in execution order */
  phases: List[PipelinePhase],
links: Option[PipelineLinks])

object Pipeline {
  import DateTimeCodecs._
  sealed trait Trigger
  case object ONCOMMIT extends Trigger
  case object MANUAL extends Trigger
  case object SCHEDULE extends Trigger

  object Trigger {
    def toTrigger(s: String): Option[Trigger] = s match {
      case "ONCOMMIT" => Some(ONCOMMIT)
      case "MANUAL" => Some(MANUAL)
      case "SCHEDULE" => Some(SCHEDULE)
      case _ => None
    }

    def fromTrigger(x: Trigger): String = x match {
      case ONCOMMIT => "ONCOMMIT"
      case MANUAL => "MANUAL"
      case SCHEDULE => "SCHEDULE"
    }
  }

  implicit val TriggerEnumEncoder: EncodeJson[Trigger] =
    EncodeJson[Trigger](is => StringEncodeJson(Trigger.fromTrigger(is)))

  implicit val TriggerEnumDecoder: DecodeJson[Trigger] =
    DecodeJson.optionDecoder[Trigger](n => n.string.flatMap(jStr => Trigger.toTrigger(jStr)), "Trigger failed to de-serialize")
  sealed trait Status
  case object IDLE extends Status
  case object BUSY extends Status
  case object WAITING extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "IDLE" => Some(IDLE)
      case "BUSY" => Some(BUSY)
      case "WAITING" => Some(WAITING)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case IDLE => "IDLE"
      case BUSY => "BUSY"
      case WAITING => "WAITING"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val PipelineCodecJson: CodecJson[Pipeline] = CodecJson.derive[Pipeline]
  implicit val PipelineDecoder: EntityDecoder[Pipeline] = jsonOf[Pipeline]
  implicit val PipelineEncoder: EntityEncoder[Pipeline] = jsonEncoderOf[Pipeline]
}
