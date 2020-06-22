package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RepositoryBranch._

case class RepositoryBranch (
  /* Identifier of the program. Unique within the space */
  programId: Option[String],
/* Identifier of the repository */
  repositoryId: Option[Long],
/* Name of the branch */
  name: Option[String],
links: Option[RepositoryBranchLinks])

object RepositoryBranch {
  import DateTimeCodecs._

  implicit val RepositoryBranchCodecJson: CodecJson[RepositoryBranch] = CodecJson.derive[RepositoryBranch]
  implicit val RepositoryBranchDecoder: EntityDecoder[RepositoryBranch] = jsonOf[RepositoryBranch]
  implicit val RepositoryBranchEncoder: EntityEncoder[RepositoryBranch] = jsonEncoderOf[RepositoryBranch]
}
