package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EnvironmentLogsEmbedded
import org.openapitools.models.EnvironmentLogsLinks
import scala.collection.immutable.Seq

/**
 * Logs of an Environment
 * @param service Name of the service
 * @param name Name of the Log
 * @param days Number of days
 * @param Underscorelinks 
 * @param Underscoreembedded 
 */
case class EnvironmentLogs(service: Option[Seq[String]],
                name: Option[Seq[String]],
                days: Option[Int],
                Underscorelinks: Option[EnvironmentLogsLinks],
                Underscoreembedded: Option[EnvironmentLogsEmbedded]
                )

object EnvironmentLogs {
    /**
     * Creates the codec for converting EnvironmentLogs from and to JSON.
     */
    implicit val decoder: Decoder[EnvironmentLogs] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnvironmentLogs] = deriveEncoder
}
