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

import org.openapitools.client.api.BadRequestError
import org.openapitools.client.api.Environment
import org.openapitools.client.api.EnvironmentList
import org.openapitools.client.api.EnvironmentLogs

object EnvironmentsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteEnvironment(host: String, programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Environment] = {
    implicit val returnTypeDecoder: EntityDecoder[Environment] = jsonOf[Environment]

    val path = "/api/program/{programId}/environment/{environmentId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
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
      resp          <- client.expect[Environment](req)

    } yield resp
  }
  
  def downloadLogs(host: String, programId: String, environmentId: String, service: String, name: String, date: String, xGwImsOrgId: String, authorization: String, xApiKey: String, accept: String)(implicit serviceQuery: QueryParam[String], nameQuery: QueryParam[String], dateQuery: QueryParam[String]): Task[Unit] = {
    val path = "/api/program/{programId}/environment/{environmentId}/logs/download".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Accept", accept))
    val queryParams = Query(
      ("service", Some(serviceQuery.toParamString(service))), ("name", Some(nameQuery.toParamString(name))), ("date", Some(dateQuery.toParamString(date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def getEnvironment(host: String, programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Environment] = {
    implicit val returnTypeDecoder: EntityDecoder[Environment] = jsonOf[Environment]

    val path = "/api/program/{programId}/environment/{environmentId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
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
      resp          <- client.expect[Environment](req)

    } yield resp
  }
  
  def getEnvironmentLogs(host: String, programId: String, environmentId: String, days: Integer, xGwImsOrgId: String, authorization: String, xApiKey: String, service: List[String] = List.empty[String] , name: List[String] = List.empty[String] )(implicit serviceQuery: QueryParam[List[String]], nameQuery: QueryParam[List[String]], daysQuery: QueryParam[Integer]): Task[EnvironmentLogs] = {
    implicit val returnTypeDecoder: EntityDecoder[EnvironmentLogs] = jsonOf[EnvironmentLogs]

    val path = "/api/program/{programId}/environment/{environmentId}/logs".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      ("service", Some(serviceQuery.toParamString(service))), ("name", Some(nameQuery.toParamString(name))), ("days", Some(daysQuery.toParamString(days))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EnvironmentLogs](req)

    } yield resp
  }
  
  def getEnvironments(host: String, programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `type`: String)(implicit `type`Query: QueryParam[String]): Task[EnvironmentList] = {
    implicit val returnTypeDecoder: EntityDecoder[EnvironmentList] = jsonOf[EnvironmentList]

    val path = "/api/program/{programId}/environments".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      ("`type`", Some(typeQuery.toParamString(type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EnvironmentList](req)

    } yield resp
  }
  
}

class HttpServiceEnvironmentsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def deleteEnvironment(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Environment] = {
    implicit val returnTypeDecoder: EntityDecoder[Environment] = jsonOf[Environment]

    val path = "/api/program/{programId}/environment/{environmentId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
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
      resp          <- client.expect[Environment](req)

    } yield resp
  }
  
  def downloadLogs(programId: String, environmentId: String, service: String, name: String, date: String, xGwImsOrgId: String, authorization: String, xApiKey: String, accept: String)(implicit serviceQuery: QueryParam[String], nameQuery: QueryParam[String], dateQuery: QueryParam[String]): Task[Unit] = {
    val path = "/api/program/{programId}/environment/{environmentId}/logs/download".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Accept", accept))
    val queryParams = Query(
      ("service", Some(serviceQuery.toParamString(service))), ("name", Some(nameQuery.toParamString(name))), ("date", Some(dateQuery.toParamString(date))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def getEnvironment(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[Environment] = {
    implicit val returnTypeDecoder: EntityDecoder[Environment] = jsonOf[Environment]

    val path = "/api/program/{programId}/environment/{environmentId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
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
      resp          <- client.expect[Environment](req)

    } yield resp
  }
  
  def getEnvironmentLogs(programId: String, environmentId: String, days: Integer, xGwImsOrgId: String, authorization: String, xApiKey: String, service: List[String] = List.empty[String] , name: List[String] = List.empty[String] )(implicit serviceQuery: QueryParam[List[String]], nameQuery: QueryParam[List[String]], daysQuery: QueryParam[Integer]): Task[EnvironmentLogs] = {
    implicit val returnTypeDecoder: EntityDecoder[EnvironmentLogs] = jsonOf[EnvironmentLogs]

    val path = "/api/program/{programId}/environment/{environmentId}/logs".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "environmentId" + "\\}",escape(environmentId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      ("service", Some(serviceQuery.toParamString(service))), ("name", Some(nameQuery.toParamString(name))), ("days", Some(daysQuery.toParamString(days))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EnvironmentLogs](req)

    } yield resp
  }
  
  def getEnvironments(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `type`: String)(implicit `type`Query: QueryParam[String]): Task[EnvironmentList] = {
    implicit val returnTypeDecoder: EntityDecoder[EnvironmentList] = jsonOf[EnvironmentList]

    val path = "/api/program/{programId}/environments".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      ("`type`", Some(typeQuery.toParamString(type))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[EnvironmentList](req)

    } yield resp
  }
  
}
