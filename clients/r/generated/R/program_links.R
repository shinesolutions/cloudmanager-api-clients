# Cloud Manager API
#
# This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
#
# The version of the OpenAPI document: 1.0.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title ProgramLinks
#' @description ProgramLinks Class
#' @format An \code{R6Class} generator object
#' @field http://ns.adobe.com/adobecloud/rel/pipelines  \link{HalLink} [optional]
#'
#' @field http://ns.adobe.com/adobecloud/rel/environments  \link{HalLink} [optional]
#'
#' @field http://ns.adobe.com/adobecloud/rel/repositories  \link{HalLink} [optional]
#'
#' @field self  \link{HalLink} [optional]
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProgramLinks <- R6::R6Class(
  'ProgramLinks',
  public = list(
    `http://ns.adobe.com/adobecloud/rel/pipelines` = NULL,
    `http://ns.adobe.com/adobecloud/rel/environments` = NULL,
    `http://ns.adobe.com/adobecloud/rel/repositories` = NULL,
    `self` = NULL,
    initialize = function(`http://ns.adobe.com/adobecloud/rel/pipelines`=NULL, `http://ns.adobe.com/adobecloud/rel/environments`=NULL, `http://ns.adobe.com/adobecloud/rel/repositories`=NULL, `self`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`http://ns.adobe.com/adobecloud/rel/pipelines`)) {
        stopifnot(R6::is.R6(`http://ns.adobe.com/adobecloud/rel/pipelines`))
        self$`http://ns.adobe.com/adobecloud/rel/pipelines` <- `http://ns.adobe.com/adobecloud/rel/pipelines`
      }
      if (!is.null(`http://ns.adobe.com/adobecloud/rel/environments`)) {
        stopifnot(R6::is.R6(`http://ns.adobe.com/adobecloud/rel/environments`))
        self$`http://ns.adobe.com/adobecloud/rel/environments` <- `http://ns.adobe.com/adobecloud/rel/environments`
      }
      if (!is.null(`http://ns.adobe.com/adobecloud/rel/repositories`)) {
        stopifnot(R6::is.R6(`http://ns.adobe.com/adobecloud/rel/repositories`))
        self$`http://ns.adobe.com/adobecloud/rel/repositories` <- `http://ns.adobe.com/adobecloud/rel/repositories`
      }
      if (!is.null(`self`)) {
        stopifnot(R6::is.R6(`self`))
        self$`self` <- `self`
      }
    },
    toJSON = function() {
      ProgramLinksObject <- list()
      if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/pipelines`)) {
        ProgramLinksObject[['http://ns.adobe.com/adobecloud/rel/pipelines']] <-
          self$`http://ns.adobe.com/adobecloud/rel/pipelines`$toJSON()
      }
      if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/environments`)) {
        ProgramLinksObject[['http://ns.adobe.com/adobecloud/rel/environments']] <-
          self$`http://ns.adobe.com/adobecloud/rel/environments`$toJSON()
      }
      if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/repositories`)) {
        ProgramLinksObject[['http://ns.adobe.com/adobecloud/rel/repositories']] <-
          self$`http://ns.adobe.com/adobecloud/rel/repositories`$toJSON()
      }
      if (!is.null(self$`self`)) {
        ProgramLinksObject[['self']] <-
          self$`self`$toJSON()
      }

      ProgramLinksObject
    },
    fromJSON = function(ProgramLinksJson) {
      ProgramLinksObject <- jsonlite::fromJSON(ProgramLinksJson)
      if (!is.null(ProgramLinksObject$`http://ns.adobe.com/adobecloud/rel/pipelines`)) {
        http://ns.adobe.com/adobecloud/rel/pipelinesObject <- HalLink$new()
        http://ns.adobe.com/adobecloud/rel/pipelinesObject$fromJSON(jsonlite::toJSON(ProgramLinksObject$http://ns.adobe.com/adobecloud/rel/pipelines, auto_unbox = TRUE, digits = NA))
        self$`http://ns.adobe.com/adobecloud/rel/pipelines` <- http://ns.adobe.com/adobecloud/rel/pipelinesObject
      }
      if (!is.null(ProgramLinksObject$`http://ns.adobe.com/adobecloud/rel/environments`)) {
        http://ns.adobe.com/adobecloud/rel/environmentsObject <- HalLink$new()
        http://ns.adobe.com/adobecloud/rel/environmentsObject$fromJSON(jsonlite::toJSON(ProgramLinksObject$http://ns.adobe.com/adobecloud/rel/environments, auto_unbox = TRUE, digits = NA))
        self$`http://ns.adobe.com/adobecloud/rel/environments` <- http://ns.adobe.com/adobecloud/rel/environmentsObject
      }
      if (!is.null(ProgramLinksObject$`http://ns.adobe.com/adobecloud/rel/repositories`)) {
        http://ns.adobe.com/adobecloud/rel/repositoriesObject <- HalLink$new()
        http://ns.adobe.com/adobecloud/rel/repositoriesObject$fromJSON(jsonlite::toJSON(ProgramLinksObject$http://ns.adobe.com/adobecloud/rel/repositories, auto_unbox = TRUE, digits = NA))
        self$`http://ns.adobe.com/adobecloud/rel/repositories` <- http://ns.adobe.com/adobecloud/rel/repositoriesObject
      }
      if (!is.null(ProgramLinksObject$`self`)) {
        selfObject <- HalLink$new()
        selfObject$fromJSON(jsonlite::toJSON(ProgramLinksObject$self, auto_unbox = TRUE, digits = NA))
        self$`self` <- selfObject
      }
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/pipelines`)) {
        sprintf(
        '"http://ns.adobe.com/adobecloud/rel/pipelines":
        %s
        ',
        jsonlite::toJSON(self$`http://ns.adobe.com/adobecloud/rel/pipelines`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/environments`)) {
        sprintf(
        '"http://ns.adobe.com/adobecloud/rel/environments":
        %s
        ',
        jsonlite::toJSON(self$`http://ns.adobe.com/adobecloud/rel/environments`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`http://ns.adobe.com/adobecloud/rel/repositories`)) {
        sprintf(
        '"http://ns.adobe.com/adobecloud/rel/repositories":
        %s
        ',
        jsonlite::toJSON(self$`http://ns.adobe.com/adobecloud/rel/repositories`$toJSON(), auto_unbox=TRUE, digits = NA)
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
    fromJSONString = function(ProgramLinksJson) {
      ProgramLinksObject <- jsonlite::fromJSON(ProgramLinksJson)
      self$`http://ns.adobe.com/adobecloud/rel/pipelines` <- HalLink$new()$fromJSON(jsonlite::toJSON(ProgramLinksObject$http://ns.adobe.com/adobecloud/rel/pipelines, auto_unbox = TRUE, digits = NA))
      self$`http://ns.adobe.com/adobecloud/rel/environments` <- HalLink$new()$fromJSON(jsonlite::toJSON(ProgramLinksObject$http://ns.adobe.com/adobecloud/rel/environments, auto_unbox = TRUE, digits = NA))
      self$`http://ns.adobe.com/adobecloud/rel/repositories` <- HalLink$new()$fromJSON(jsonlite::toJSON(ProgramLinksObject$http://ns.adobe.com/adobecloud/rel/repositories, auto_unbox = TRUE, digits = NA))
      self$`self` <- HalLink$new()$fromJSON(jsonlite::toJSON(ProgramLinksObject$self, auto_unbox = TRUE, digits = NA))
      self
    }
  )
)
