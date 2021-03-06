# Cloud Manager API
#
# This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
#
# The version of the OpenAPI document: 1.0.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title EnvironmentLogsLinks
#' @description EnvironmentLogsLinks Class
#' @format An \code{R6Class} generator object
#' @field http://ns.adobe.com/adobecloud/rel/program  \link{HalLink} [optional]
#'
#' @field self  \link{HalLink} [optional]
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
EnvironmentLogsLinks <- R6::R6Class(
  'EnvironmentLogsLinks',
  public = list(
    `http://ns.adobe.com/adobecloud/rel/program` = NULL,
    `self` = NULL,
    initialize = function(`http://ns.adobe.com/adobecloud/rel/program`=NULL, `self`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`http://ns.adobe.com/adobecloud/rel/program`)) {
        stopifnot(R6::is.R6(`http://ns.adobe.com/adobecloud/rel/program`))
        self$`http://ns.adobe.com/adobecloud/rel/program` <- `http://ns.adobe.com/adobecloud/rel/program`
      }
      if (!is.null(`self`)) {
        stopifnot(R6::is.R6(`self`))
        self$`self` <- `self`
      }
    },
    toJSON = function() {
      EnvironmentLogsLinksObject <- list()
      if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/program`)) {
        EnvironmentLogsLinksObject[['http://ns.adobe.com/adobecloud/rel/program']] <-
          self$`http://ns.adobe.com/adobecloud/rel/program`$toJSON()
      }
      if (!is.null(self$`self`)) {
        EnvironmentLogsLinksObject[['self']] <-
          self$`self`$toJSON()
      }

      EnvironmentLogsLinksObject
    },
    fromJSON = function(EnvironmentLogsLinksJson) {
      EnvironmentLogsLinksObject <- jsonlite::fromJSON(EnvironmentLogsLinksJson)
      if (!is.null(EnvironmentLogsLinksObject$`http://ns.adobe.com/adobecloud/rel/program`)) {
        http://ns.adobe.com/adobecloud/rel/programObject <- HalLink$new()
        http://ns.adobe.com/adobecloud/rel/programObject$fromJSON(jsonlite::toJSON(EnvironmentLogsLinksObject$http://ns.adobe.com/adobecloud/rel/program, auto_unbox = TRUE, digits = NA))
        self$`http://ns.adobe.com/adobecloud/rel/program` <- http://ns.adobe.com/adobecloud/rel/programObject
      }
      if (!is.null(EnvironmentLogsLinksObject$`self`)) {
        selfObject <- HalLink$new()
        selfObject$fromJSON(jsonlite::toJSON(EnvironmentLogsLinksObject$self, auto_unbox = TRUE, digits = NA))
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
    fromJSONString = function(EnvironmentLogsLinksJson) {
      EnvironmentLogsLinksObject <- jsonlite::fromJSON(EnvironmentLogsLinksJson)
      self$`http://ns.adobe.com/adobecloud/rel/program` <- HalLink$new()$fromJSON(jsonlite::toJSON(EnvironmentLogsLinksObject$http://ns.adobe.com/adobecloud/rel/program, auto_unbox = TRUE, digits = NA))
      self$`self` <- HalLink$new()$fromJSON(jsonlite::toJSON(EnvironmentLogsLinksObject$self, auto_unbox = TRUE, digits = NA))
      self
    }
  )
)
