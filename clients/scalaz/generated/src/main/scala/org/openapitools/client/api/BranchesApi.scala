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

import org.openapitools.client.api.BranchList

object BranchesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getBranches(host: String, programId: String, repositoryId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[BranchList] = {
    implicit val returnTypeDecoder: EntityDecoder[BranchList] = jsonOf[BranchList]

    val path = "/api/program/{programId}/repository/{repositoryId}/branches".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "repositoryId" + "\\}",escape(repositoryId.toString))
    
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
      resp          <- client.expect[BranchList](req)

    } yield resp
  }
  
}

class HttpServiceBranchesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getBranches(programId: String, repositoryId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[BranchList] = {
    implicit val returnTypeDecoder: EntityDecoder[BranchList] = jsonOf[BranchList]

    val path = "/api/program/{programId}/repository/{repositoryId}/branches".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "repositoryId" + "\\}",escape(repositoryId.toString))
    
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
      resp          <- client.expect[BranchList](req)

    } yield resp
  }
  
}
