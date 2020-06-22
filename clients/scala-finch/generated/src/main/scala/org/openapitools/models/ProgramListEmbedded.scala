package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EmbeddedProgram
import scala.collection.immutable.Seq

/**
 * 
 * @param programs 
 */
case class ProgramListEmbedded(programs: Option[Seq[EmbeddedProgram]]
                )

object ProgramListEmbedded {
    /**
     * Creates the codec for converting ProgramListEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[ProgramListEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProgramListEmbedded] = deriveEncoder
}
