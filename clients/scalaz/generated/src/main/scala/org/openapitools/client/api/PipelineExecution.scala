package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import PipelineExecution._

case class PipelineExecution (
  /* Pipeline execution identifier */
  id: Option[String],
/* Identifier of the program. Unique within the space. */
  programId: Option[String],
/* Identifier of the pipeline. Unique within the space. */
  pipelineId: Option[String],
/* Version of the artifacts generated during this execution */
  artifactsVersion: Option[String],
/* AdobeID who started the pipeline. Empty for auto triggered builds */
  user: Option[String],
/* Status of the execution */
  status: Option[Status],
/* How the execution was triggered. */
  trigger: Option[Trigger],
/* Start time */
  createdAt: Option[OffsetDateTime],
/* Date of last status change */
  updatedAt: Option[OffsetDateTime],
/* Date the execution reached a final state */
  finishedAt: Option[OffsetDateTime],
embedded: Option[PipelineExecutionEmbedded],
links: Option[PipelineExecutionLinks])

object PipelineExecution {
  import DateTimeCodecs._
  sealed trait Status
  case object NOTSTARTED extends Status
  case object RUNNING extends Status
  case object CANCELLING extends Status
  case object CANCELLED extends Status
  case object FINISHED extends Status
  case object ERROR extends Status
  case object FAILED extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "NOTSTARTED" => Some(NOTSTARTED)
      case "RUNNING" => Some(RUNNING)
      case "CANCELLING" => Some(CANCELLING)
      case "CANCELLED" => Some(CANCELLED)
      case "FINISHED" => Some(FINISHED)
      case "ERROR" => Some(ERROR)
      case "FAILED" => Some(FAILED)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case NOTSTARTED => "NOTSTARTED"
      case RUNNING => "RUNNING"
      case CANCELLING => "CANCELLING"
      case CANCELLED => "CANCELLED"
      case FINISHED => "FINISHED"
      case ERROR => "ERROR"
      case FAILED => "FAILED"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")
  sealed trait Trigger
  case object ONCOMMIT extends Trigger
  case object MANUAL extends Trigger
  case object SCHEDULE extends Trigger
  case object PUSHUPGRADES extends Trigger

  object Trigger {
    def toTrigger(s: String): Option[Trigger] = s match {
      case "ONCOMMIT" => Some(ONCOMMIT)
      case "MANUAL" => Some(MANUAL)
      case "SCHEDULE" => Some(SCHEDULE)
      case "PUSHUPGRADES" => Some(PUSHUPGRADES)
      case _ => None
    }

    def fromTrigger(x: Trigger): String = x match {
      case ONCOMMIT => "ONCOMMIT"
      case MANUAL => "MANUAL"
      case SCHEDULE => "SCHEDULE"
      case PUSHUPGRADES => "PUSHUPGRADES"
    }
  }

  implicit val TriggerEnumEncoder: EncodeJson[Trigger] =
    EncodeJson[Trigger](is => StringEncodeJson(Trigger.fromTrigger(is)))

  implicit val TriggerEnumDecoder: DecodeJson[Trigger] =
    DecodeJson.optionDecoder[Trigger](n => n.string.flatMap(jStr => Trigger.toTrigger(jStr)), "Trigger failed to de-serialize")

  implicit val PipelineExecutionCodecJson: CodecJson[PipelineExecution] = CodecJson.derive[PipelineExecution]
  implicit val PipelineExecutionDecoder: EntityDecoder[PipelineExecution] = jsonOf[PipelineExecution]
  implicit val PipelineExecutionEncoder: EntityEncoder[PipelineExecution] = jsonEncoderOf[PipelineExecution]
}
