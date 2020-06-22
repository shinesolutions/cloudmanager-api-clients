package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.PipelineLinks
import org.openapitools.models.PipelinePhase
import scala.collection.immutable.Seq

/**
 * Describes a __CI/CD Pipeline__
 * @param id Identifier of the pipeline. Unique within the program.
 * @param programId Identifier of the program. Unique within the space.
 * @param name Name of the pipeline
 * @param trigger How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
 * @param status Pipeline status
 * @param createdAt Create date
 * @param updatedAt Update date
 * @param lastStartedAt Last pipeline execution start
 * @param lastFinishedAt Last pipeline execution end
 * @param phases Pipeline phases in execution order
 * @param Underscorelinks 
 */
case class Pipeline(id: Option[String],
                programId: Option[String],
                name: String,
                trigger: Option[String],
                status: Option[String],
                createdAt: Option[ZonedDateTime],
                updatedAt: Option[ZonedDateTime],
                lastStartedAt: Option[ZonedDateTime],
                lastFinishedAt: Option[ZonedDateTime],
                phases: Seq[PipelinePhase],
                Underscorelinks: Option[PipelineLinks]
                )

object Pipeline {
    /**
     * Creates the codec for converting Pipeline from and to JSON.
     */
    implicit val decoder: Decoder[Pipeline] = deriveDecoder
    implicit val encoder: ObjectEncoder[Pipeline] = deriveEncoder
}
