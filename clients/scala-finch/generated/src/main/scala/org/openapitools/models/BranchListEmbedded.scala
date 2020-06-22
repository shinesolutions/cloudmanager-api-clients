package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RepositoryBranch
import scala.collection.immutable.Seq

/**
 * 
 * @param branches 
 */
case class BranchListEmbedded(branches: Option[Seq[RepositoryBranch]]
                )

object BranchListEmbedded {
    /**
     * Creates the codec for converting BranchListEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[BranchListEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[BranchListEmbedded] = deriveEncoder
}
