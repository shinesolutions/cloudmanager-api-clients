package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RepositoryBranchLinks

/**
 * Represents a Git Branch
 * @param programId Identifier of the program. Unique within the space
 * @param repositoryId Identifier of the repository
 * @param name Name of the branch
 * @param Underscorelinks 
 */
case class RepositoryBranch(programId: Option[String],
                repositoryId: Option[Long],
                name: Option[String],
                Underscorelinks: Option[RepositoryBranchLinks]
                )

object RepositoryBranch {
    /**
     * Creates the codec for converting RepositoryBranch from and to JSON.
     */
    implicit val decoder: Decoder[RepositoryBranch] = deriveDecoder
    implicit val encoder: ObjectEncoder[RepositoryBranch] = deriveEncoder
}
