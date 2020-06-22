package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VariableListEmbedded
import org.openapitools.models.VariableListLinks

/**
 * 
 * @param UnderscoretotalNumberOfItems 
 * @param Underscoreembedded 
 * @param Underscorelinks 
 */
case class VariableList(UnderscoretotalNumberOfItems: Option[Int],
                Underscoreembedded: Option[VariableListEmbedded],
                Underscorelinks: Option[VariableListLinks]
                )

object VariableList {
    /**
     * Creates the codec for converting VariableList from and to JSON.
     */
    implicit val decoder: Decoder[VariableList] = deriveDecoder
    implicit val encoder: ObjectEncoder[VariableList] = deriveEncoder
}
