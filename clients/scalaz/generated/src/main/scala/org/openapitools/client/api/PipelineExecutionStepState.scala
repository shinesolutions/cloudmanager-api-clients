package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import PipelineExecutionStepState._

case class PipelineExecutionStepState (
  id: Option[String],
stepId: Option[String],
phaseId: Option[String],
/* Name of the action */
  action: Option[String],
/* Target repository */
  repository: Option[String],
/* Target branch */
  branch: Option[String],
/* Target environment */
  environment: Option[String],
/* Target environment type */
  environmentType: Option[String],
/* Start time */
  startedAt: Option[OffsetDateTime],
/* Date the execution reached a final state */
  finishedAt: Option[OffsetDateTime],
/* Information about step result */
  details: Option[Map[String, Any]],
/* Action status */
  status: Option[Status],
links: Option[PipelineExecutionStepStateLinks])

object PipelineExecutionStepState {
  import DateTimeCodecs._
  sealed trait Status
  case object NOTSTARTED extends Status
  case object RUNNING extends Status
  case object FINISHED extends Status
  case object ERROR extends Status
  case object ROLLINGBACK extends Status
  case object ROLLEDBACK extends Status
  case object WAITING extends Status
  case object CANCELLED extends Status
  case object FAILED extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "NOTSTARTED" => Some(NOTSTARTED)
      case "RUNNING" => Some(RUNNING)
      case "FINISHED" => Some(FINISHED)
      case "ERROR" => Some(ERROR)
      case "ROLLINGBACK" => Some(ROLLINGBACK)
      case "ROLLEDBACK" => Some(ROLLEDBACK)
      case "WAITING" => Some(WAITING)
      case "CANCELLED" => Some(CANCELLED)
      case "FAILED" => Some(FAILED)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case NOTSTARTED => "NOTSTARTED"
      case RUNNING => "RUNNING"
      case FINISHED => "FINISHED"
      case ERROR => "ERROR"
      case ROLLINGBACK => "ROLLINGBACK"
      case ROLLEDBACK => "ROLLEDBACK"
      case WAITING => "WAITING"
      case CANCELLED => "CANCELLED"
      case FAILED => "FAILED"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val PipelineExecutionStepStateCodecJson: CodecJson[PipelineExecutionStepState] = CodecJson.derive[PipelineExecutionStepState]
  implicit val PipelineExecutionStepStateDecoder: EntityDecoder[PipelineExecutionStepState] = jsonOf[PipelineExecutionStepState]
  implicit val PipelineExecutionStepStateEncoder: EntityEncoder[PipelineExecutionStepState] = jsonEncoderOf[PipelineExecutionStepState]
}
