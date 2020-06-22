package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BranchListEmbedded
import org.openapitools.models.ProgramListLinks

/**
 * 
 * @param UnderscoretotalNumberOfItems 
 * @param Underscoreembedded 
 * @param Underscorelinks 
 */
case class BranchList(UnderscoretotalNumberOfItems: Option[Int],
                Underscoreembedded: Option[BranchListEmbedded],
                Underscorelinks: Option[ProgramListLinks]
                )

object BranchList {
    /**
     * Creates the codec for converting BranchList from and to JSON.
     */
    implicit val decoder: Decoder[BranchList] = deriveDecoder
    implicit val encoder: ObjectEncoder[BranchList] = deriveEncoder
}
