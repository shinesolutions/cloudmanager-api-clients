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

import org.openapitools.client.api.Program
import org.openapitools.client.api.ProgramList

object ProgramsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteProgram(host: String, programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Program] = {
    implicit val returnTypeDecoder: EntityDecoder[Program] = jsonOf[Program]

    val path = "/api/program/{programId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString))
    
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
      resp          <- client.expect[Program](req)

    } yield resp
  }
  
  def getProgram(host: String, programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Program] = {
    implicit val returnTypeDecoder: EntityDecoder[Program] = jsonOf[Program]

    val path = "/api/program/{programId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString))
    
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
      resp          <- client.expect[Program](req)

    } yield resp
  }
  
  def getPrograms(host: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[ProgramList] = {
    implicit val returnTypeDecoder: EntityDecoder[ProgramList] = jsonOf[ProgramList]

    val path = "/api/programs"
    
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
      resp          <- client.expect[ProgramList](req)

    } yield resp
  }
  
}

class HttpServiceProgramsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteProgram(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Program] = {
    implicit val returnTypeDecoder: EntityDecoder[Program] = jsonOf[Program]

    val path = "/api/program/{programId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString))
    
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
      resp          <- client.expect[Program](req)

    } yield resp
  }
  
  def getProgram(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Program] = {
    implicit val returnTypeDecoder: EntityDecoder[Program] = jsonOf[Program]

    val path = "/api/program/{programId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString))
    
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
      resp          <- client.expect[Program](req)

    } yield resp
  }
  
  def getPrograms(xGwImsOrgId: String, authorization: String, xApiKey: String): Task[ProgramList] = {
    implicit val returnTypeDecoder: EntityDecoder[ProgramList] = jsonOf[ProgramList]

    val path = "/api/programs"
    
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
      resp          <- client.expect[ProgramList](req)

    } yield resp
  }
  
}
