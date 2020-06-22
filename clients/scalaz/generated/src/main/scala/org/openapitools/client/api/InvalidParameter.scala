package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InvalidParameter._

case class InvalidParameter (
  /* Name of the invalid parameter. */
  name: Option[String],
/* Reason of why the parameter's value is not accepted. */
  reason: Option[String])

object InvalidParameter {
  import DateTimeCodecs._

  implicit val InvalidParameterCodecJson: CodecJson[InvalidParameter] = CodecJson.derive[InvalidParameter]
  implicit val InvalidParameterDecoder: EntityDecoder[InvalidParameter] = jsonOf[InvalidParameter]
  implicit val InvalidParameterEncoder: EntityEncoder[InvalidParameter] = jsonEncoderOf[InvalidParameter]
}
