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

import org.openapitools.client.api.PipelineExecution
import org.openapitools.client.api.PipelineExecutionListRepresentation
import org.openapitools.client.api.PipelineExecutionStepState
import org.openapitools.client.api.PipelineStepMetrics

object PipelineExecutionApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def advancePipelineExecution(host: String, programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String, body: Any): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Content-Type", `contentType`))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def cancelPipelineExecutionStep(host: String, programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String, body: Any): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Content-Type", `contentType`))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def getCurrentExecution(host: String, programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineExecution] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineExecution] = jsonOf[PipelineExecution]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
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
      resp          <- client.expect[PipelineExecution](req)

    } yield resp
  }
  
  def getExecution(host: String, programId: String, pipelineId: String, executionId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineExecution] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineExecution] = jsonOf[PipelineExecution]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString))
    
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
      resp          <- client.expect[PipelineExecution](req)

    } yield resp
  }
  
  def getExecutions(host: String, programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, start: String, limit: Integer)(implicit startQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[PipelineExecutionListRepresentation] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineExecutionListRepresentation] = jsonOf[PipelineExecutionListRepresentation]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/executions".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      ("start", Some(startQuery.toParamString(start))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PipelineExecutionListRepresentation](req)

    } yield resp
  }
  
  def getStepLogs(host: String, programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, file: String, accept: String)(implicit fileQuery: QueryParam[String]): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      ("file", Some(fileQuery.toParamString(file))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def startPipeline(host: String, programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Content-Type", `contentType`))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def stepMetric(host: String, programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineStepMetrics] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineStepMetrics] = jsonOf[PipelineStepMetrics]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
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
      resp          <- client.expect[PipelineStepMetrics](req)

    } yield resp
  }
  
  def stepState(host: String, programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineExecutionStepState] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineExecutionStepState] = jsonOf[PipelineExecutionStepState]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
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
      resp          <- client.expect[PipelineExecutionStepState](req)

    } yield resp
  }
  
}

class HttpServicePipelineExecutionApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def advancePipelineExecution(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String, body: Any): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Content-Type", `contentType`))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def cancelPipelineExecutionStep(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String, body: Any): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Content-Type", `contentType`))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def getCurrentExecution(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineExecution] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineExecution] = jsonOf[PipelineExecution]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
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
      resp          <- client.expect[PipelineExecution](req)

    } yield resp
  }
  
  def getExecution(programId: String, pipelineId: String, executionId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineExecution] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineExecution] = jsonOf[PipelineExecution]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString))
    
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
      resp          <- client.expect[PipelineExecution](req)

    } yield resp
  }
  
  def getExecutions(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, start: String, limit: Integer)(implicit startQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[PipelineExecutionListRepresentation] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineExecutionListRepresentation] = jsonOf[PipelineExecutionListRepresentation]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/executions".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      ("start", Some(startQuery.toParamString(start))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PipelineExecutionListRepresentation](req)

    } yield resp
  }
  
  def getStepLogs(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, file: String, accept: String)(implicit fileQuery: QueryParam[String]): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey))
    val queryParams = Query(
      ("file", Some(fileQuery.toParamString(file))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def startPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, `contentType`: String): Task[Unit] = {
    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString))
    
    val httpMethod = Method.PUT
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("x-gw-ims-org-id", xGwImsOrgId), Header("Authorization", authorization), Header("x-api-key", xApiKey), Header("Content-Type", `contentType`))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def stepMetric(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineStepMetrics] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineStepMetrics] = jsonOf[PipelineStepMetrics]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
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
      resp          <- client.expect[PipelineStepMetrics](req)

    } yield resp
  }
  
  def stepState(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Task[PipelineExecutionStepState] = {
    implicit val returnTypeDecoder: EntityDecoder[PipelineExecutionStepState] = jsonOf[PipelineExecutionStepState]

    val path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}".replaceAll("\\{" + "programId" + "\\}",escape(programId.toString)).replaceAll("\\{" + "pipelineId" + "\\}",escape(pipelineId.toString)).replaceAll("\\{" + "executionId" + "\\}",escape(executionId.toString)).replaceAll("\\{" + "phaseId" + "\\}",escape(phaseId.toString)).replaceAll("\\{" + "stepId" + "\\}",escape(stepId.toString))
    
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
      resp          <- client.expect[PipelineExecutionStepState](req)

    } yield resp
  }
  
}
