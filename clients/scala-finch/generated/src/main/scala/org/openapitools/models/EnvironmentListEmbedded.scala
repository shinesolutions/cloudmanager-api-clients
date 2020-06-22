package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Environment
import scala.collection.immutable.Seq

/**
 * 
 * @param environments 
 */
case class EnvironmentListEmbedded(environments: Option[Seq[Environment]]
                )

object EnvironmentListEmbedded {
    /**
     * Creates the codec for converting EnvironmentListEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[EnvironmentListEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnvironmentListEmbedded] = deriveEncoder
}
