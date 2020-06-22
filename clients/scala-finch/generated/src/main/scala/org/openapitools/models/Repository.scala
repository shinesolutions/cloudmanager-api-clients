package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RepositoryLinks

/**
 * A sourcecode repository
 * @param repo Repository name
 * @param description description
 * @param Underscorelinks 
 */
case class Repository(repo: Option[String],
                description: Option[String],
                Underscorelinks: Option[RepositoryLinks]
                )

object Repository {
    /**
     * Creates the codec for converting Repository from and to JSON.
     */
    implicit val decoder: Decoder[Repository] = deriveDecoder
    implicit val encoder: ObjectEncoder[Repository] = deriveEncoder
}
