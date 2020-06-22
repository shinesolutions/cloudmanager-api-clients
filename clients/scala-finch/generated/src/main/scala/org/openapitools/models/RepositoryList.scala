package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProgramListLinks
import org.openapitools.models.RepositoryListEmbedded

/**
 * 
 * @param UnderscoretotalNumberOfItems 
 * @param Underscoreembedded 
 * @param Underscorelinks 
 */
case class RepositoryList(UnderscoretotalNumberOfItems: Option[Int],
                Underscoreembedded: Option[RepositoryListEmbedded],
                Underscorelinks: Option[ProgramListLinks]
                )

object RepositoryList {
    /**
     * Creates the codec for converting RepositoryList from and to JSON.
     */
    implicit val decoder: Decoder[RepositoryList] = deriveDecoder
    implicit val encoder: ObjectEncoder[RepositoryList] = deriveEncoder
}
