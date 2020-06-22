package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param href 
 * @param templated 
 * @param _type 
 * @param deprecation 
 * @param profile 
 * @param title 
 * @param hreflang 
 * @param name 
 */
case class HalLink(href: Option[String],
                templated: Option[Boolean],
                _type: Option[String],
                deprecation: Option[String],
                profile: Option[String],
                title: Option[String],
                hreflang: Option[String],
                name: Option[String]
                )

object HalLink {
    /**
     * Creates the codec for converting HalLink from and to JSON.
     */
    implicit val decoder: Decoder[HalLink] = deriveDecoder
    implicit val encoder: ObjectEncoder[HalLink] = deriveEncoder
}
