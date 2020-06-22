package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Describes a phase of a pipeline
 * @param name Name of the phase
 * @param _type Type of the phase
 * @param repositoryId Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
 * @param branch Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
 * @param environmentId Identifier of the target environment. Mandatory if type=DEPLOY
 */
case class PipelinePhase(name: Option[String],
                _type: String,
                repositoryId: Option[String],
                branch: Option[String],
                environmentId: Option[String]
                )

object PipelinePhase {
    /**
     * Creates the codec for converting PipelinePhase from and to JSON.
     */
    implicit val decoder: Decoder[PipelinePhase] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelinePhase] = deriveEncoder
}
