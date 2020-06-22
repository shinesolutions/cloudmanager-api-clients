package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EnvironmentListEmbedded
import org.openapitools.models.ProgramListLinks

/**
 * 
 * @param UnderscoretotalNumberOfItems 
 * @param Underscoreembedded 
 * @param Underscorelinks 
 */
case class EnvironmentList(UnderscoretotalNumberOfItems: Option[Int],
                Underscoreembedded: Option[EnvironmentListEmbedded],
                Underscorelinks: Option[ProgramListLinks]
                )

object EnvironmentList {
    /**
     * Creates the codec for converting EnvironmentList from and to JSON.
     */
    implicit val decoder: Decoder[EnvironmentList] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnvironmentList] = deriveEncoder
}
