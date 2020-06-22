package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.PipelineExecutionEmbedded
import org.openapitools.models.PipelineExecutionLinks

/**
 * Wraps a pipeline execution
 * @param id Pipeline execution identifier
 * @param programId Identifier of the program. Unique within the space.
 * @param pipelineId Identifier of the pipeline. Unique within the space.
 * @param artifactsVersion Version of the artifacts generated during this execution
 * @param user AdobeID who started the pipeline. Empty for auto triggered builds
 * @param status Status of the execution
 * @param trigger How the execution was triggered.
 * @param createdAt Start time
 * @param updatedAt Date of last status change
 * @param finishedAt Date the execution reached a final state
 * @param Underscoreembedded 
 * @param Underscorelinks 
 */
case class PipelineExecution(id: Option[String],
                programId: Option[String],
                pipelineId: Option[String],
                artifactsVersion: Option[String],
                user: Option[String],
                status: Option[String],
                trigger: Option[String],
                createdAt: Option[ZonedDateTime],
                updatedAt: Option[ZonedDateTime],
                finishedAt: Option[ZonedDateTime],
                Underscoreembedded: Option[PipelineExecutionEmbedded],
                Underscorelinks: Option[PipelineExecutionLinks]
                )

object PipelineExecution {
    /**
     * Creates the codec for converting PipelineExecution from and to JSON.
     */
    implicit val decoder: Decoder[PipelineExecution] = deriveDecoder
    implicit val encoder: ObjectEncoder[PipelineExecution] = deriveEncoder
}
