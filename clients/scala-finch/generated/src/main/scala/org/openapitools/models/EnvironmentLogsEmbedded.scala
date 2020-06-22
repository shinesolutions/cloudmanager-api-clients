package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EnvironmentLog
import scala.collection.immutable.Seq

/**
 * 
 * @param downloads Links to logs
 */
case class EnvironmentLogsEmbedded(downloads: Option[Seq[EnvironmentLog]]
                )

object EnvironmentLogsEmbedded {
    /**
     * Creates the codec for converting EnvironmentLogsEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[EnvironmentLogsEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnvironmentLogsEmbedded] = deriveEncoder
}
