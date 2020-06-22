package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RepositoryLinks._

case class RepositoryLinks (
  httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
httpNsAdobeComAdobecloudRelBranches: Option[HalLink],
self: Option[HalLink])

object RepositoryLinks {
  import DateTimeCodecs._

  implicit val RepositoryLinksCodecJson: CodecJson[RepositoryLinks] = CodecJson.derive[RepositoryLinks]
  implicit val RepositoryLinksDecoder: EntityDecoder[RepositoryLinks] = jsonOf[RepositoryLinks]
  implicit val RepositoryLinksEncoder: EntityEncoder[RepositoryLinks] = jsonEncoderOf[RepositoryLinks]
}
