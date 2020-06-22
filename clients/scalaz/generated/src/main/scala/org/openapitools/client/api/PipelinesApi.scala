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

import org.openapitools.client.api.Pipeline
import org.openapitools.client.api.PipelineList

object PipelinesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deletePipeline(host: String, programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def getPipeline(host: String, programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Pipeline] = {
    implicit val returnTypeDecoder: EntityDecoder[Pipeline] = jsonOf[Pipeline]

    val path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
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
      resp          <- client.expect[Pipeline](req)

    } yield resp
  }
  
  def getPipelines(host: String, programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineList] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineList] = jsonOf[PipelineList]

    val path = "/api/program/{programId}/pipelines".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString))
    
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
      resp          <- client.expect[PipelineList](req)

    } yield resp
  }
  
  def patchPipeline(host: String, programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String, body: Pipeline): Task[Pipeline] = {
    implicit val returnTypeDecoder: EntityDecoder[Pipeline] = jsonOf[Pipeline]

    val path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
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
      resp          <- client.expect[Pipeline](req)

    } yield resp
  }
  
}

class HttpServicePipelinesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deletePipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def getPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Pipeline] = {
    implicit val returnTypeDecoder: EntityDecoder[Pipeline] = jsonOf[Pipeline]

    val path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
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
      resp          <- client.expect[Pipeline](req)

    } yield resp
  }
  
  def getPipelines(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineList] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineList] = jsonOf[PipelineList]

    val path = "/api/program/{programId}/pipelines".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString))
    
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
      resp          <- client.expect[PipelineList](req)

    } yield resp
  }
  
  def patchPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String, body: Pipeline): Task[Pipeline] = {
    implicit val returnTypeDecoder: EntityDecoder[Pipeline] = jsonOf[Pipeline]

    val path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
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
      resp          <- client.expect[Pipeline](req)

    } yield resp
  }
  
}
