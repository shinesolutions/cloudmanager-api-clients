package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Repository
import scala.collection.immutable.Seq

/**
 * 
 * @param repositories 
 */
case class RepositoryListEmbedded(repositories: Option[Seq[Repository]]
                )

object RepositoryListEmbedded {
    /**
     * Creates the codec for converting RepositoryListEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[RepositoryListEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[RepositoryListEmbedded] = deriveEncoder
}
