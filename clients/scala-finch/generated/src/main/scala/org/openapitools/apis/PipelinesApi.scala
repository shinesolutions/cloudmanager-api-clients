package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.Pipeline
import org.openapitools.models.PipelineList
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

object PipelinesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        deletePipeline(da) :+:
        getPipeline(da) :+:
        getPipelines(da) :+:
        patchPipeline(da)


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
        private def deletePipeline(da: DataAccessor): Endpoint[Unit] =
        delete("api" :: "program" :: string :: "pipeline" :: string :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.Pipelines_deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Pipeline
        */
        private def getPipeline(da: DataAccessor): Endpoint[Pipeline] =
        get("api" :: "program" :: string :: "pipeline" :: string :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.Pipelines_getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a PipelineList
        */
        private def getPipelines(da: DataAccessor): Endpoint[PipelineList] =
        get("api" :: "program" :: string :: "pipelines" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.Pipelines_getPipelines(programId, xGwImsOrgId, authorization, xApiKey) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Pipeline
        */
        private def patchPipeline(da: DataAccessor): Endpoint[Pipeline] =
        patch("api" :: "program" :: string :: "pipeline" :: string :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: header("Content-Type") :: jsonBody[Pipeline]) { (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Pipeline) =>
          da.Pipelines_patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body) match {
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
      val file = File.createTempFile("tmpPipelinesApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
