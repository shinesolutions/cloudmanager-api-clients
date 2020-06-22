package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProgramListEmbedded
import org.openapitools.models.ProgramListLinks

/**
 * 
 * @param UnderscoretotalNumberOfItems 
 * @param Underscoreembedded 
 * @param Underscorelinks 
 */
case class ProgramList(UnderscoretotalNumberOfItems: Option[Int],
                Underscoreembedded: Option[ProgramListEmbedded],
                Underscorelinks: Option[ProgramListLinks]
                )

object ProgramList {
    /**
     * Creates the codec for converting ProgramList from and to JSON.
     */
    implicit val decoder: Decoder[ProgramList] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProgramList] = deriveEncoder
}
