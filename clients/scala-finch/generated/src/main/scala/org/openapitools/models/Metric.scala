package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Describes a __Metric__
 * @param id KPI result identifier
 * @param severity Severity of the metric
 * @param passed Whether metric is considered passed
 * @param _override Whether user override the failed metric
 * @param actualValue Expected value for the metric
 * @param expectedValue Expected value for the metric
 * @param comparator Comparator used for the metric
 * @param kpi KPI identifier
 */
case class Metric(id: Option[String],
                severity: Option[String],
                passed: Option[Boolean],
                _override: Option[Boolean],
                actualValue: Option[String],
                expectedValue: Option[String],
                comparator: Option[String],
                kpi: Option[String]
                )

object Metric {
    /**
     * Creates the codec for converting Metric from and to JSON.
     */
    implicit val decoder: Decoder[Metric] = deriveDecoder
    implicit val encoder: ObjectEncoder[Metric] = deriveEncoder
}
