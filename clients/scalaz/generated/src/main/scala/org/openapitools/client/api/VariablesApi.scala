package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.Variable
import org.openapitools.client.api.VariableList

object VariablesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getEnvironmentVariables(host: String, programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[VariableList] = {
    implicit val returnTypeDecoder: EntityDecoder[VariableList] = jsonOf[VariableList]

    val path = "/api/program/{programId}/environment/{environmentId}/variables".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[VariableList](req)

    } yield resp
  }
  
  def patchEnvironmentVariables(host: String, programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String, body: List[Variable]): Task[VariableList] = {
    implicit val returnTypeDecoder: EntityDecoder[VariableList] = jsonOf[VariableList]

    val path = "/api/program/{programId}/environment/{environmentId}/variables".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Content-Type", `contentType`))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[VariableList](req)

    } yield resp
  }
  
}

class HttpServiceVariablesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[VariableList] = {
    implicit val returnTypeDecoder: EntityDecoder[VariableList] = jsonOf[VariableList]

    val path = "/api/program/{programId}/environment/{environmentId}/variables".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[VariableList](req)

    } yield resp
  }
  
  def patchEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String, body: List[Variable]): Task[VariableList] = {
    implicit val returnTypeDecoder: EntityDecoder[VariableList] = jsonOf[VariableList]

    val path = "/api/program/{programId}/environment/{environmentId}/variables".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
    val httpMethod = Method.PATCH
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Content-Type", `contentType`))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[VariableList](req)

    } yield resp
  }
  
}
