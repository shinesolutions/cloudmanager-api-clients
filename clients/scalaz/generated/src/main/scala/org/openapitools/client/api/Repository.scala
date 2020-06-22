package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Repository._

case class Repository (
  /* Repository name */
  repo: Option[String],
/* description */
  description: Option[String],
links: Option[RepositoryLinks])

object Repository {
  import DateTimeCodecs._

  implicit val RepositoryCodecJson: CodecJson[Repository] = CodecJson.derive[Repository]
  implicit val RepositoryDecoder: EntityDecoder[Repository] = jsonOf[Repository]
  implicit val RepositoryEncoder: EntityEncoder[Repository] = jsonEncoderOf[Repository]
}
