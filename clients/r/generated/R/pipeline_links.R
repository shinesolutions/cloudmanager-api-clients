# Cloud Manager API
#
# This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
#
# The version of the OpenAPI document: 1.0.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title PipelineLinks
#' @description PipelineLinks Class
#' @format An \code{R6Class} generator object
#' @field http://ns.adobe.com/adobecloud/rel/program  \link{HalLink} [optional]
#'
#' @field http://ns.adobe.com/adobecloud/rel/execution  \link{HalLink} [optional]
#'
#' @field http://ns.adobe.com/adobecloud/rel/executions  \link{HalLink} [optional]
#'
#' @field http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution  \link{HalLink} [optional]
#'
#' @field self  \link{HalLink} [optional]
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PipelineLinks <- R6::R6Class(
  'PipelineLinks',
  public = list(
    `http://ns.adobe.com/adobecloud/rel/program` = NULL,
    `http://ns.adobe.com/adobecloud/rel/execution` = NULL,
    `http://ns.adobe.com/adobecloud/rel/executions` = NULL,
    `http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution` = NULL,
    `self` = NULL,
    initialize = function(`http://ns.adobe.com/adobecloud/rel/program`=NULL, `http://ns.adobe.com/adobecloud/rel/execution`=NULL, `http://ns.adobe.com/adobecloud/rel/executions`=NULL, `http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`=NULL, `self`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`http://ns.adobe.com/adobecloud/rel/program`)) {
        stopifnot(R6::is.R6(`http://ns.adobe.com/adobecloud/rel/program`))
        self$`http://ns.adobe.com/adobecloud/rel/program` <- `http://ns.adobe.com/adobecloud/rel/program`
      }
      if (!is.null(`http://ns.adobe.com/adobecloud/rel/execution`)) {
        stopifnot(R6::is.R6(`http://ns.adobe.com/adobecloud/rel/execution`))
        self$`http://ns.adobe.com/adobecloud/rel/execution` <- `http://ns.adobe.com/adobecloud/rel/execution`
      }
      if (!is.null(`http://ns.adobe.com/adobecloud/rel/executions`)) {
        stopifnot(R6::is.R6(`http://ns.adobe.com/adobecloud/rel/executions`))
        self$`http://ns.adobe.com/adobecloud/rel/executions` <- `http://ns.adobe.com/adobecloud/rel/executions`
      }
      if (!is.null(`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`)) {
        stopifnot(R6::is.R6(`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`))
        self$`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution` <- `http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`
      }
      if (!is.null(`self`)) {
        stopifnot(R6::is.R6(`self`))
        self$`self` <- `self`
      }
    },
    toJSON = function() {
      PipelineLinksObject <- list()
      if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/program`)) {
        PipelineLinksObject[['http://ns.adobe.com/adobecloud/rel/program']] <-
          self$`http://ns.adobe.com/adobecloud/rel/program`$toJSON()
      }
      if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/execution`)) {
        PipelineLinksObject[['http://ns.adobe.com/adobecloud/rel/execution']] <-
          self$`http://ns.adobe.com/adobecloud/rel/execution`$toJSON()
      }
      if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/executions`)) {
        PipelineLinksObject[['http://ns.adobe.com/adobecloud/rel/executions']] <-
          self$`http://ns.adobe.com/adobecloud/rel/executions`$toJSON()
      }
      if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`)) {
        PipelineLinksObject[['http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution']] <-
          self$`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`$toJSON()
      }
      if (!is.null(self$`self`)) {
        PipelineLinksObject[['self']] <-
          self$`self`$toJSON()
      }

      PipelineLinksObject
    },
    fromJSON = function(PipelineLinksJson) {
      PipelineLinksObject <- jsonlite::fromJSON(PipelineLinksJson)
      if (!is.null(PipelineLinksObject$`http://ns.adobe.com/adobecloud/rel/program`)) {
        http://ns.adobe.com/adobecloud/rel/programObject <- HalLink$new()
        http://ns.adobe.com/adobecloud/rel/programObject$fromJSON(jsonlite::toJSON(PipelineLinksObject$http://ns.adobe.com/adobecloud/rel/program, auto_unbox = TRUE, digits = NA))
        self$`http://ns.adobe.com/adobecloud/rel/program` <- http://ns.adobe.com/adobecloud/rel/programObject
      }
      if (!is.null(PipelineLinksObject$`http://ns.adobe.com/adobecloud/rel/execution`)) {
        http://ns.adobe.com/adobecloud/rel/executionObject <- HalLink$new()
        http://ns.adobe.com/adobecloud/rel/executionObject$fromJSON(jsonlite::toJSON(PipelineLinksObject$http://ns.adobe.com/adobecloud/rel/execution, auto_unbox = TRUE, digits = NA))
        self$`http://ns.adobe.com/adobecloud/rel/execution` <- http://ns.adobe.com/adobecloud/rel/executionObject
      }
      if (!is.null(PipelineLinksObject$`http://ns.adobe.com/adobecloud/rel/executions`)) {
        http://ns.adobe.com/adobecloud/rel/executionsObject <- HalLink$new()
        http://ns.adobe.com/adobecloud/rel/executionsObject$fromJSON(jsonlite::toJSON(PipelineLinksObject$http://ns.adobe.com/adobecloud/rel/executions, auto_unbox = TRUE, digits = NA))
        self$`http://ns.adobe.com/adobecloud/rel/executions` <- http://ns.adobe.com/adobecloud/rel/executionsObject
      }
      if (!is.null(PipelineLinksObject$`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`)) {
        http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecutionObject <- HalLink$new()
        http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecutionObject$fromJSON(jsonlite::toJSON(PipelineLinksObject$http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution, auto_unbox = TRUE, digits = NA))
        self$`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution` <- http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecutionObject
      }
      if (!is.null(PipelineLinksObject$`self`)) {
        selfObject <- HalLink$new()
        selfObject$fromJSON(jsonlite::toJSON(PipelineLinksObject$self, auto_unbox = TRUE, digits = NA))
        self$`self` <- selfObject
      }
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/program`)) {
        sprintf(
        '"http://ns.adobe.com/adobecloud/rel/program":
        %s
        ',
        jsonlite::toJSON(self$`http://ns.adobe.com/adobecloud/rel/program`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/execution`)) {
        sprintf(
        '"http://ns.adobe.com/adobecloud/rel/execution":
        %s
        ',
        jsonlite::toJSON(self$`http://ns.adobe.com/adobecloud/rel/execution`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/executions`)) {
        sprintf(
        '"http://ns.adobe.com/adobecloud/rel/executions":
        %s
        ',
        jsonlite::toJSON(self$`http://ns.adobe.com/adobecloud/rel/executions`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`)) {
        sprintf(
        '"http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution":
        %s
        ',
        jsonlite::toJSON(self$`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`self`)) {
        sprintf(
        '"self":
        %s
        ',
        jsonlite::toJSON(self$`self`$toJSON(), auto_unbox=TRUE, digits = NA)
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(PipelineLinksJson) {
      PipelineLinksObject <- jsonlite::fromJSON(PipelineLinksJson)
      self$`http://ns.adobe.com/adobecloud/rel/program` <- HalLink$new()$fromJSON(jsonlite::toJSON(PipelineLinksObject$http://ns.adobe.com/adobecloud/rel/program, auto_unbox = TRUE, digits = NA))
      self$`http://ns.adobe.com/adobecloud/rel/execution` <- HalLink$new()$fromJSON(jsonlite::toJSON(PipelineLinksObject$http://ns.adobe.com/adobecloud/rel/execution, auto_unbox = TRUE, digits = NA))
      self$`http://ns.adobe.com/adobecloud/rel/executions` <- HalLink$new()$fromJSON(jsonlite::toJSON(PipelineLinksObject$http://ns.adobe.com/adobecloud/rel/executions, auto_unbox = TRUE, digits = NA))
      self$`http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution` <- HalLink$new()$fromJSON(jsonlite::toJSON(PipelineLinksObject$http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution, auto_unbox = TRUE, digits = NA))
      self$`self` <- HalLink$new()$fromJSON(jsonlite::toJSON(PipelineLinksObject$self, auto_unbox = TRUE, digits = NA))
      self
    }
  )
)
