package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RepositoryListEmbedded._

case class RepositoryListEmbedded (
  repositories: Option[List[Repository]])

object RepositoryListEmbedded {
  import DateTimeCodecs._

  implicit val RepositoryListEmbeddedCodecJson: CodecJson[RepositoryListEmbedded] = CodecJson.derive[RepositoryListEmbedded]
  implicit val RepositoryListEmbeddedDecoder: EntityDecoder[RepositoryListEmbedded] = jsonOf[RepositoryListEmbedded]
  implicit val RepositoryListEmbeddedEncoder: EntityEncoder[RepositoryListEmbedded] = jsonEncoderOf[RepositoryListEmbedded]
}
