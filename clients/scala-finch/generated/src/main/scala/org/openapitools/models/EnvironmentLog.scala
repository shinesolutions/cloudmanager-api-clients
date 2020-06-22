package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EnvironmentLogLinks

/**
 * Log from Environment
 * @param service Name of the service
 * @param name Name of the Log
 * @param date date of the Log
 * @param programId 
 * @param environmentId 
 * @param Underscorelinks 
 */
case class EnvironmentLog(service: Option[String],
                name: Option[String],
                date: Option[String],
                programId: Option[Long],
                environmentId: Option[Long],
                Underscorelinks: Option[EnvironmentLogLinks]
                )

object EnvironmentLog {
    /**
     * Creates the codec for converting EnvironmentLog from and to JSON.
     */
    implicit val decoder: Decoder[EnvironmentLog] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnvironmentLog] = deriveEncoder
}
