package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A BranchList
        */
        def Branches_getBranches(programId: String, repositoryId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,BranchList] = Left(TODO)

        /**
        * 
        * @return A Environment
        */
        def Environments_deleteEnvironment(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,Environment] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Environments_downloadLogs(programId: String, environmentId: String, service: String, name: String, date: String, xGwImsOrgId: String, authorization: String, xApiKey: String, accept: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Environment
        */
        def Environments_getEnvironment(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,Environment] = Left(TODO)

        /**
        * 
        * @return A EnvironmentLogs
        */
        def Environments_getEnvironmentLogs(programId: String, environmentId: String, days: Int, xGwImsOrgId: String, authorization: String, xApiKey: String, service: Seq[String], name: Seq[String]): Either[CommonError,EnvironmentLogs] = Left(TODO)

        /**
        * 
        * @return A EnvironmentList
        */
        def Environments_getEnvironments(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, _type: Option[String]): Either[CommonError,EnvironmentList] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def PipelineExecution_advancePipelineExecution(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Object): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def PipelineExecution_cancelPipelineExecutionStep(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Object): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A PipelineExecution
        */
        def PipelineExecution_getCurrentExecution(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,PipelineExecution] = Left(TODO)

        /**
        * 
        * @return A PipelineExecution
        */
        def PipelineExecution_getExecution(programId: String, pipelineId: String, executionId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,PipelineExecution] = Left(TODO)

        /**
        * 
        * @return A PipelineExecutionListRepresentation
        */
        def PipelineExecution_getExecutions(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, start: Option[String], limit: Option[Int]): Either[CommonError,PipelineExecutionListRepresentation] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def PipelineExecution_getStepLogs(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, file: Option[String], accept: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def PipelineExecution_startPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A PipelineStepMetrics
        */
        def PipelineExecution_stepMetric(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,PipelineStepMetrics] = Left(TODO)

        /**
        * 
        * @return A PipelineExecutionStepState
        */
        def PipelineExecution_stepState(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,PipelineExecutionStepState] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Pipelines_deletePipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Pipeline
        */
        def Pipelines_getPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,Pipeline] = Left(TODO)

        /**
        * 
        * @return A PipelineList
        */
        def Pipelines_getPipelines(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,PipelineList] = Left(TODO)

        /**
        * 
        * @return A Pipeline
        */
        def Pipelines_patchPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Pipeline): Either[CommonError,Pipeline] = Left(TODO)

        /**
        * 
        * @return A Program
        */
        def Programs_deleteProgram(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,Program] = Left(TODO)

        /**
        * 
        * @return A Program
        */
        def Programs_getProgram(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,Program] = Left(TODO)

        /**
        * 
        * @return A ProgramList
        */
        def Programs_getPrograms(xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,ProgramList] = Left(TODO)

        /**
        * 
        * @return A RepositoryList
        */
        def Repositories_getRepositories(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,RepositoryList] = Left(TODO)

        /**
        * 
        * @return A Repository
        */
        def Repositories_getRepository(programId: String, repositoryId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,Repository] = Left(TODO)

        /**
        * 
        * @return A VariableList
        */
        def Variables_getEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): Either[CommonError,VariableList] = Left(TODO)

        /**
        * 
        * @return A VariableList
        */
        def Variables_patchEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Seq[Variable]): Either[CommonError,VariableList] = Left(TODO)

}