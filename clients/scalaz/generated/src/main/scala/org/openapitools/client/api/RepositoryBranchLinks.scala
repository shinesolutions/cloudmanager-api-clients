package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RepositoryBranchLinks._

case class RepositoryBranchLinks (
  httpNsAdobeComAdobecloudRelProgram: Option[HalLink],
httpNsAdobeComAdobecloudRelRepository: Option[HalLink])

object RepositoryBranchLinks {
  import DateTimeCodecs._

  implicit val RepositoryBranchLinksCodecJson: CodecJson[RepositoryBranchLinks] = CodecJson.derive[RepositoryBranchLinks]
  implicit val RepositoryBranchLinksDecoder: EntityDecoder[RepositoryBranchLinks] = jsonOf[RepositoryBranchLinks]
  implicit val RepositoryBranchLinksEncoder: EntityEncoder[RepositoryBranchLinks] = jsonEncoderOf[RepositoryBranchLinks]
}
