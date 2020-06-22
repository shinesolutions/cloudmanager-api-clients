package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.PipelineExecution
import org.openapitools.models.PipelineExecutionListRepresentation
import org.openapitools.models.PipelineExecutionStepState
import org.openapitools.models.PipelineStepMetrics
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.time._

object PipelineExecutionApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        advancePipelineExecution(da) :+:
        cancelPipelineExecutionStep(da) :+:
        getCurrentExecution(da) :+:
        getExecution(da) :+:
        getExecutions(da) :+:
        getStepLogs(da) :+:
        startPipeline(da) :+:
        stepMetric(da) :+:
        stepState(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def advancePipelineExecution(da: DataAccessor): Endpoint[Unit] =
        put("api" :: "program" :: string :: "pipeline" :: string :: "execution" :: string :: "phase" :: string :: "step" :: string :: "advance" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: header("Content-Type") :: jsonBody[Object]) { (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Object) =>
          da.PipelineExecution_advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def cancelPipelineExecutionStep(da: DataAccessor): Endpoint[Unit] =
        put("api" :: "program" :: string :: "pipeline" :: string :: "execution" :: string :: "phase" :: string :: "step" :: string :: "cancel" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: header("Content-Type") :: jsonBody[Object]) { (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Object) =>
          da.PipelineExecution_cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PipelineExecution
        */
        private def getCurrentExecution(da: DataAccessor): Endpoint[PipelineExecution] =
        get("api" :: "program" :: string :: "pipeline" :: string :: "execution" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.PipelineExecution_getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PipelineExecution
        */
        private def getExecution(da: DataAccessor): Endpoint[PipelineExecution] =
        get("api" :: "program" :: string :: "pipeline" :: string :: "execution" :: string :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, pipelineId: String, executionId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.PipelineExecution_getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PipelineExecutionListRepresentation
        */
        private def getExecutions(da: DataAccessor): Endpoint[PipelineExecutionListRepresentation] =
        get("api" :: "program" :: string :: "pipeline" :: string :: "executions" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: paramOption("start") :: paramOption("limit").map(_.map(_.toInt))) { (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, start: Option[String], limit: Option[Int]) =>
          da.PipelineExecution_getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def getStepLogs(da: DataAccessor): Endpoint[Unit] =
        get("api" :: "program" :: string :: "pipeline" :: string :: "execution" :: string :: "phase" :: string :: "step" :: string :: "logs" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: paramOption("file") :: headerOption("Accept")) { (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, file: Option[String], accept: Option[String]) =>
          da.PipelineExecution_getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def startPipeline(da: DataAccessor): Endpoint[Unit] =
        put("api" :: "program" :: string :: "pipeline" :: string :: "execution" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: header("Content-Type")) { (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String) =>
          da.PipelineExecution_startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PipelineStepMetrics
        */
        private def stepMetric(da: DataAccessor): Endpoint[PipelineStepMetrics] =
        get("api" :: "program" :: string :: "pipeline" :: string :: "execution" :: string :: "phase" :: string :: "step" :: string :: "metrics" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.PipelineExecution_stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PipelineExecutionStepState
        */
        private def stepState(da: DataAccessor): Endpoint[PipelineExecutionStepState] =
        get("api" :: "program" :: string :: "pipeline" :: string :: "execution" :: string :: "phase" :: string :: "step" :: string :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.PipelineExecution_stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = File.createTempFile("tmpPipelineExecutionApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
