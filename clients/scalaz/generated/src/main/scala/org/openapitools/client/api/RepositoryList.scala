package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RepositoryList._

case class RepositoryList (
  totalNumberOfItems: Option[Integer],
embedded: Option[RepositoryListEmbedded],
links: Option[ProgramListLinks])

object RepositoryList {
  import DateTimeCodecs._

  implicit val RepositoryListCodecJson: CodecJson[RepositoryList] = CodecJson.derive[RepositoryList]
  implicit val RepositoryListDecoder: EntityDecoder[RepositoryList] = jsonOf[RepositoryList]
  implicit val RepositoryListEncoder: EntityEncoder[RepositoryList] = jsonEncoderOf[RepositoryList]
}
