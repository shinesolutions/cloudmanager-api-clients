# Cloud Manager API
#
# This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
#
# The version of the OpenAPI document: 1.0.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title Metric
#' @description Metric Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#'
#' @field severity  character [optional]
#'
#' @field passed  character [optional]
#'
#' @field override  character [optional]
#'
#' @field actualValue  character [optional]
#'
#' @field expectedValue  character [optional]
#'
#' @field comparator  character [optional]
#'
#' @field kpi  character [optional]
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Metric <- R6::R6Class(
  'Metric',
  public = list(
    `id` = NULL,
    `severity` = NULL,
    `passed` = NULL,
    `override` = NULL,
    `actualValue` = NULL,
    `expectedValue` = NULL,
    `comparator` = NULL,
    `kpi` = NULL,
    initialize = function(`id`=NULL, `severity`=NULL, `passed`=FALSE, `override`=FALSE, `actualValue`=NULL, `expectedValue`=NULL, `comparator`=NULL, `kpi`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!is.null(`severity`)) {
        stopifnot(is.character(`severity`), length(`severity`) == 1)
        self$`severity` <- `severity`
      }
      if (!is.null(`passed`)) {
        self$`passed` <- `passed`
      }
      if (!is.null(`override`)) {
        self$`override` <- `override`
      }
      if (!is.null(`actualValue`)) {
        stopifnot(is.character(`actualValue`), length(`actualValue`) == 1)
        self$`actualValue` <- `actualValue`
      }
      if (!is.null(`expectedValue`)) {
        stopifnot(is.character(`expectedValue`), length(`expectedValue`) == 1)
        self$`expectedValue` <- `expectedValue`
      }
      if (!is.null(`comparator`)) {
        stopifnot(is.character(`comparator`), length(`comparator`) == 1)
        self$`comparator` <- `comparator`
      }
      if (!is.null(`kpi`)) {
        stopifnot(is.character(`kpi`), length(`kpi`) == 1)
        self$`kpi` <- `kpi`
      }
    },
    toJSON = function() {
      MetricObject <- list()
      if (!is.null(self$`id`)) {
        MetricObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`severity`)) {
        MetricObject[['severity']] <-
          self$`severity`
      }
      if (!is.null(self$`passed`)) {
        MetricObject[['passed']] <-
          self$`passed`
      }
      if (!is.null(self$`override`)) {
        MetricObject[['override']] <-
          self$`override`
      }
      if (!is.null(self$`actualValue`)) {
        MetricObject[['actualValue']] <-
          self$`actualValue`
      }
      if (!is.null(self$`expectedValue`)) {
        MetricObject[['expectedValue']] <-
          self$`expectedValue`
      }
      if (!is.null(self$`comparator`)) {
        MetricObject[['comparator']] <-
          self$`comparator`
      }
      if (!is.null(self$`kpi`)) {
        MetricObject[['kpi']] <-
          self$`kpi`
      }

      MetricObject
    },
    fromJSON = function(MetricJson) {
      MetricObject <- jsonlite::fromJSON(MetricJson)
      if (!is.null(MetricObject$`id`)) {
        self$`id` <- MetricObject$`id`
      }
      if (!is.null(MetricObject$`severity`)) {
        self$`severity` <- MetricObject$`severity`
      }
      if (!is.null(MetricObject$`passed`)) {
        self$`passed` <- MetricObject$`passed`
      }
      if (!is.null(MetricObject$`override`)) {
        self$`override` <- MetricObject$`override`
      }
      if (!is.null(MetricObject$`actualValue`)) {
        self$`actualValue` <- MetricObject$`actualValue`
      }
      if (!is.null(MetricObject$`expectedValue`)) {
        self$`expectedValue` <- MetricObject$`expectedValue`
      }
      if (!is.null(MetricObject$`comparator`)) {
        self$`comparator` <- MetricObject$`comparator`
      }
      if (!is.null(MetricObject$`kpi`)) {
        self$`kpi` <- MetricObject$`kpi`
      }
    },
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
        sprintf(
        '"id":
          "%s"
                ',
        self$`id`
        )},
        if (!is.null(self$`severity`)) {
        sprintf(
        '"severity":
          "%s"
                ',
        self$`severity`
        )},
        if (!is.null(self$`passed`)) {
        sprintf(
        '"passed":
          "%s"
                ',
        self$`passed`
        )},
        if (!is.null(self$`override`)) {
        sprintf(
        '"override":
          "%s"
                ',
        self$`override`
        )},
        if (!is.null(self$`actualValue`)) {
        sprintf(
        '"actualValue":
          "%s"
                ',
        self$`actualValue`
        )},
        if (!is.null(self$`expectedValue`)) {
        sprintf(
        '"expectedValue":
          "%s"
                ',
        self$`expectedValue`
        )},
        if (!is.null(self$`comparator`)) {
        sprintf(
        '"comparator":
          "%s"
                ',
        self$`comparator`
        )},
        if (!is.null(self$`kpi`)) {
        sprintf(
        '"kpi":
          "%s"
                ',
        self$`kpi`
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(MetricJson) {
      MetricObject <- jsonlite::fromJSON(MetricJson)
      self$`id` <- MetricObject$`id`
      self$`severity` <- MetricObject$`severity`
      self$`passed` <- MetricObject$`passed`
      self$`override` <- MetricObject$`override`
      self$`actualValue` <- MetricObject$`actualValue`
      self$`expectedValue` <- MetricObject$`expectedValue`
      self$`comparator` <- MetricObject$`comparator`
      self$`kpi` <- MetricObject$`kpi`
      self
    }
  )
)
