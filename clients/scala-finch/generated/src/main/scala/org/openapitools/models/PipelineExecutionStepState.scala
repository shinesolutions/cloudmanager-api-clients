package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.PipelineExecutionStepStateLinks
import scala.collection.immutable.Seq

/**
 * Describes the status of a particular pipeline execution step for display purposes
 * @param id 
 * @param stepId 
 * @param phaseId 
 * @param action Name of the action
 * @param repository Target repository
 * @param branch Target branch
 * @param environment Target environment
 * @param environmentType Target environment type
 * @param startedAt Start time
 * @param finishedAt Date the execution reached a final state
 * @param details Information about step result
 * @param status Action status
 * @param Underscorelinks 
 */
case class PipelineExecutionStepState(id: Option[String],
                stepId: Option[String],
                phaseId: Option[String],
                action: Option[String],
                repository: Option[String],
                branch: Option[String],
                environment: Option[String],
                environmentType: Option[String],
                startedAt: Option[ZonedDateTime],
                finishedAt: Option[ZonedDateTime],
                details: Option[Map[String, Object]],
                status: Option[String],
                Underscorelinks: Option[PipelineExecutionStepStateLinks]
                )

object PipelineExecutionStepState {
    /**
     * Creates the codec for converting PipelineExecutionStepState from and to JSON.
     */
    implicit val decoder: Decoder[PipelineExecutionStepState] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineExecutionStepState] = deriveEncoder
}
