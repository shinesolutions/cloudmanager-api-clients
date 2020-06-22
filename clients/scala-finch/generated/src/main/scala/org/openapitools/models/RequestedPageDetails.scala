package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Filtering and sorting page details
 * @param start 
 * @param limit 
 * @param orderBy 
 * @param property 
 * @param _type 
 * @param next 
 * @param prev 
 */
case class RequestedPageDetails(start: Option[Int],
                limit: Option[Int],
                orderBy: Option[String],
                property: Option[Seq[String]],
                _type: Option[String],
                next: Option[Int],
                prev: Option[Int]
                )

object RequestedPageDetails {
    /**
     * Creates the codec for converting RequestedPageDetails from and to JSON.
     */
    implicit val decoder: Decoder[RequestedPageDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[RequestedPageDetails] = deriveEncoder
}
