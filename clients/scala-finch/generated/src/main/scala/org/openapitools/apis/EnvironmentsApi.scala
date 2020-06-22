package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.BadRequestError
import org.openapitools.models.Environment
import org.openapitools.models.EnvironmentList
import org.openapitools.models.EnvironmentLogs
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

object EnvironmentsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        deleteEnvironment(da) :+:
        downloadLogs(da) :+:
        getEnvironment(da) :+:
        getEnvironmentLogs(da) :+:
        getEnvironments(da)


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
        * @return An endpoint representing a Environment
        */
        private def deleteEnvironment(da: DataAccessor): Endpoint[Environment] =
        delete("api" :: "program" :: string :: "environment" :: string :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.Environments_deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey) match {
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
        private def downloadLogs(da: DataAccessor): Endpoint[Unit] =
        get("api" :: "program" :: string :: "environment" :: string :: "logs" :: "download" :: param("service") :: param("name") :: param("date") :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: headerOption("Accept")) { (programId: String, environmentId: String, service: String, name: String, date: String, xGwImsOrgId: String, authorization: String, xApiKey: String, accept: Option[String]) =>
          da.Environments_downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Environment
        */
        private def getEnvironment(da: DataAccessor): Endpoint[Environment] =
        get("api" :: "program" :: string :: "environment" :: string :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key")) { (programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String) =>
          da.Environments_getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EnvironmentLogs
        */
        private def getEnvironmentLogs(da: DataAccessor): Endpoint[EnvironmentLogs] =
        get("api" :: "program" :: string :: "environment" :: string :: "logs" :: param("days").map(_.toInt) :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: params("service") :: params("name")) { (programId: String, environmentId: String, days: Int, xGwImsOrgId: String, authorization: String, xApiKey: String, service: Seq[String], name: Seq[String]) =>
          da.Environments_getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a EnvironmentList
        */
        private def getEnvironments(da: DataAccessor): Endpoint[EnvironmentList] =
        get("api" :: "program" :: string :: "environments" :: header("x-gw-ims-org-id") :: header("Authorization") :: header("x-api-key") :: paramOption("type")) { (programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, _type: Option[String]) =>
          da.Environments_getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, _type) match {
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
      val file = File.createTempFile("tmpEnvironmentsApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
