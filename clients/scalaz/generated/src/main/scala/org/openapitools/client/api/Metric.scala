package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Metric._

case class Metric (
  /* KPI result identifier */
  id: Option[String],
/* Severity of the metric */
  severity: Option[Severity],
/* Whether metric is considered passed */
  passed: Option[Boolean],
/* Whether user override the failed metric */
  `override`: Option[Boolean],
/* Expected value for the metric */
  actualValue: Option[String],
/* Expected value for the metric */
  expectedValue: Option[String],
/* Comparator used for the metric */
  comparator: Option[Comparator],
/* KPI identifier */
  kpi: Option[String])

object Metric {
  import DateTimeCodecs._
  sealed trait Severity
  case object Critical extends Severity
  case object Important extends Severity
  case object Informational extends Severity

  object Severity {
    def toSeverity(s: String): Option[Severity] = s match {
      case "Critical" => Some(Critical)
      case "Important" => Some(Important)
      case "Informational" => Some(Informational)
      case _ => None
    }

    def fromSeverity(x: Severity): String = x match {
      case Critical => "Critical"
      case Important => "Important"
      case Informational => "Informational"
    }
  }

  implicit val SeverityEnumEncoder: EncodeJson[Severity] =
    EncodeJson[Severity](is => StringEncodeJson(Severity.fromSeverity(is)))

  implicit val SeverityEnumDecoder: DecodeJson[Severity] =
    DecodeJson.optionDecoder[Severity](n => n.string.flatMap(jStr => Severity.toSeverity(jStr)), "Severity failed to de-serialize")
  sealed trait Comparator
  case object GT extends Comparator
  case object GTE extends Comparator
  case object LT extends Comparator
  case object LTE extends Comparator
  case object EQ extends Comparator
  case object NEQ extends Comparator

  object Comparator {
    def toComparator(s: String): Option[Comparator] = s match {
      case "GT" => Some(GT)
      case "GTE" => Some(GTE)
      case "LT" => Some(LT)
      case "LTE" => Some(LTE)
      case "EQ" => Some(EQ)
      case "NEQ" => Some(NEQ)
      case _ => None
    }

    def fromComparator(x: Comparator): String = x match {
      case GT => "GT"
      case GTE => "GTE"
      case LT => "LT"
      case LTE => "LTE"
      case EQ => "EQ"
      case NEQ => "NEQ"
    }
  }

  implicit val ComparatorEnumEncoder: EncodeJson[Comparator] =
    EncodeJson[Comparator](is => StringEncodeJson(Comparator.fromComparator(is)))

  implicit val ComparatorEnumDecoder: DecodeJson[Comparator] =
    DecodeJson.optionDecoder[Comparator](n => n.string.flatMap(jStr => Comparator.toComparator(jStr)), "Comparator failed to de-serialize")

  implicit val MetricCodecJson: CodecJson[Metric] = CodecJson.derive[Metric]
  implicit val MetricDecoder: EntityDecoder[Metric] = jsonOf[Metric]
  implicit val MetricEncoder: EntityEncoder[Metric] = jsonEncoderOf[Metric]
}
