package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Variable
import scala.collection.immutable.Seq

/**
 * 
 * @param variables Variables set on environment
 */
case class VariableListEmbedded(variables: Option[Seq[Variable]]
                )

object VariableListEmbedded {
    /**
     * Creates the codec for converting VariableListEmbedded from and to JSON.
     */
    implicit val decoder: Decoder[VariableListEmbedded] = deriveDecoder
    implicit val encoder: ObjectEncoder[VariableListEmbedded] = deriveEncoder
}
