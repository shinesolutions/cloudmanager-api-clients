# Cloud Manager API
#
# This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
#
# The version of the OpenAPI document: 1.0.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech

#' @docType class
#' @title PipelineExecution
#' @description PipelineExecution Class
#' @format An \code{R6Class} generator object
#' @field id  character [optional]
#'
#' @field programId  character [optional]
#'
#' @field pipelineId  character [optional]
#'
#' @field artifactsVersion  character [optional]
#'
#' @field user  character [optional]
#'
#' @field status  character [optional]
#'
#' @field trigger  character [optional]
#'
#' @field createdAt  character [optional]
#'
#' @field updatedAt  character [optional]
#'
#' @field finishedAt  character [optional]
#'
#' @field _embedded  \link{PipelineExecutionEmbedded} [optional]
#'
#' @field _links  \link{PipelineExecutionLinks} [optional]
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PipelineExecution <- R6::R6Class(
  'PipelineExecution',
  public = list(
    `id` = NULL,
    `programId` = NULL,
    `pipelineId` = NULL,
    `artifactsVersion` = NULL,
    `user` = NULL,
    `status` = NULL,
    `trigger` = NULL,
    `createdAt` = NULL,
    `updatedAt` = NULL,
    `finishedAt` = NULL,
    `_embedded` = NULL,
    `_links` = NULL,
    initialize = function(`id`=NULL, `programId`=NULL, `pipelineId`=NULL, `artifactsVersion`=NULL, `user`=NULL, `status`=NULL, `trigger`=NULL, `createdAt`=NULL, `updatedAt`=NULL, `finishedAt`=NULL, `_embedded`=NULL, `_links`=NULL, ...){
      local.optional.var <- list(...)
      if (!is.null(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!is.null(`programId`)) {
        stopifnot(is.character(`programId`), length(`programId`) == 1)
        self$`programId` <- `programId`
      }
      if (!is.null(`pipelineId`)) {
        stopifnot(is.character(`pipelineId`), length(`pipelineId`) == 1)
        self$`pipelineId` <- `pipelineId`
      }
      if (!is.null(`artifactsVersion`)) {
        stopifnot(is.character(`artifactsVersion`), length(`artifactsVersion`) == 1)
        self$`artifactsVersion` <- `artifactsVersion`
      }
      if (!is.null(`user`)) {
        stopifnot(is.character(`user`), length(`user`) == 1)
        self$`user` <- `user`
      }
      if (!is.null(`status`)) {
        stopifnot(is.character(`status`), length(`status`) == 1)
        self$`status` <- `status`
      }
      if (!is.null(`trigger`)) {
        stopifnot(is.character(`trigger`), length(`trigger`) == 1)
        self$`trigger` <- `trigger`
      }
      if (!is.null(`createdAt`)) {
        stopifnot(is.character(`createdAt`), length(`createdAt`) == 1)
        self$`createdAt` <- `createdAt`
      }
      if (!is.null(`updatedAt`)) {
        stopifnot(is.character(`updatedAt`), length(`updatedAt`) == 1)
        self$`updatedAt` <- `updatedAt`
      }
      if (!is.null(`finishedAt`)) {
        stopifnot(is.character(`finishedAt`), length(`finishedAt`) == 1)
        self$`finishedAt` <- `finishedAt`
      }
      if (!is.null(`_embedded`)) {
        stopifnot(R6::is.R6(`_embedded`))
        self$`_embedded` <- `_embedded`
      }
      if (!is.null(`_links`)) {
        stopifnot(R6::is.R6(`_links`))
        self$`_links` <- `_links`
      }
    },
    toJSON = function() {
      PipelineExecutionObject <- list()
      if (!is.null(self$`id`)) {
        PipelineExecutionObject[['id']] <-
          self$`id`
      }
      if (!is.null(self$`programId`)) {
        PipelineExecutionObject[['programId']] <-
          self$`programId`
      }
      if (!is.null(self$`pipelineId`)) {
        PipelineExecutionObject[['pipelineId']] <-
          self$`pipelineId`
      }
      if (!is.null(self$`artifactsVersion`)) {
        PipelineExecutionObject[['artifactsVersion']] <-
          self$`artifactsVersion`
      }
      if (!is.null(self$`user`)) {
        PipelineExecutionObject[['user']] <-
          self$`user`
      }
      if (!is.null(self$`status`)) {
        PipelineExecutionObject[['status']] <-
          self$`status`
      }
      if (!is.null(self$`trigger`)) {
        PipelineExecutionObject[['trigger']] <-
          self$`trigger`
      }
      if (!is.null(self$`createdAt`)) {
        PipelineExecutionObject[['createdAt']] <-
          self$`createdAt`
      }
      if (!is.null(self$`updatedAt`)) {
        PipelineExecutionObject[['updatedAt']] <-
          self$`updatedAt`
      }
      if (!is.null(self$`finishedAt`)) {
        PipelineExecutionObject[['finishedAt']] <-
          self$`finishedAt`
      }
      if (!is.null(self$`_embedded`)) {
        PipelineExecutionObject[['_embedded']] <-
          self$`_embedded`$toJSON()
      }
      if (!is.null(self$`_links`)) {
        PipelineExecutionObject[['_links']] <-
          self$`_links`$toJSON()
      }

      PipelineExecutionObject
    },
    fromJSON = function(PipelineExecutionJson) {
      PipelineExecutionObject <- jsonlite::fromJSON(PipelineExecutionJson)
      if (!is.null(PipelineExecutionObject$`id`)) {
        self$`id` <- PipelineExecutionObject$`id`
      }
      if (!is.null(PipelineExecutionObject$`programId`)) {
        self$`programId` <- PipelineExecutionObject$`programId`
      }
      if (!is.null(PipelineExecutionObject$`pipelineId`)) {
        self$`pipelineId` <- PipelineExecutionObject$`pipelineId`
      }
      if (!is.null(PipelineExecutionObject$`artifactsVersion`)) {
        self$`artifactsVersion` <- PipelineExecutionObject$`artifactsVersion`
      }
      if (!is.null(PipelineExecutionObject$`user`)) {
        self$`user` <- PipelineExecutionObject$`user`
      }
      if (!is.null(PipelineExecutionObject$`status`)) {
        self$`status` <- PipelineExecutionObject$`status`
      }
      if (!is.null(PipelineExecutionObject$`trigger`)) {
        self$`trigger` <- PipelineExecutionObject$`trigger`
      }
      if (!is.null(PipelineExecutionObject$`createdAt`)) {
        self$`createdAt` <- PipelineExecutionObject$`createdAt`
      }
      if (!is.null(PipelineExecutionObject$`updatedAt`)) {
        self$`updatedAt` <- PipelineExecutionObject$`updatedAt`
      }
      if (!is.null(PipelineExecutionObject$`finishedAt`)) {
        self$`finishedAt` <- PipelineExecutionObject$`finishedAt`
      }
      if (!is.null(PipelineExecutionObject$`_embedded`)) {
        _embeddedObject <- PipelineExecutionEmbedded$new()
        _embeddedObject$fromJSON(jsonlite::toJSON(PipelineExecutionObject$_embedded, auto_unbox = TRUE, digits = NA))
        self$`_embedded` <- _embeddedObject
      }
      if (!is.null(PipelineExecutionObject$`_links`)) {
        _linksObject <- PipelineExecutionLinks$new()
        _linksObject$fromJSON(jsonlite::toJSON(PipelineExecutionObject$_links, auto_unbox = TRUE, digits = NA))
        self$`_links` <- _linksObject
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
        if (!is.null(self$`programId`)) {
        sprintf(
        '"programId":
          "%s"
                ',
        self$`programId`
        )},
        if (!is.null(self$`pipelineId`)) {
        sprintf(
        '"pipelineId":
          "%s"
                ',
        self$`pipelineId`
        )},
        if (!is.null(self$`artifactsVersion`)) {
        sprintf(
        '"artifactsVersion":
          "%s"
                ',
        self$`artifactsVersion`
        )},
        if (!is.null(self$`user`)) {
        sprintf(
        '"user":
          "%s"
                ',
        self$`user`
        )},
        if (!is.null(self$`status`)) {
        sprintf(
        '"status":
          "%s"
                ',
        self$`status`
        )},
        if (!is.null(self$`trigger`)) {
        sprintf(
        '"trigger":
          "%s"
                ',
        self$`trigger`
        )},
        if (!is.null(self$`createdAt`)) {
        sprintf(
        '"createdAt":
          "%s"
                ',
        self$`createdAt`
        )},
        if (!is.null(self$`updatedAt`)) {
        sprintf(
        '"updatedAt":
          "%s"
                ',
        self$`updatedAt`
        )},
        if (!is.null(self$`finishedAt`)) {
        sprintf(
        '"finishedAt":
          "%s"
                ',
        self$`finishedAt`
        )},
        if (!is.null(self$`_embedded`)) {
        sprintf(
        '"_embedded":
        %s
        ',
        jsonlite::toJSON(self$`_embedded`$toJSON(), auto_unbox=TRUE, digits = NA)
        )},
        if (!is.null(self$`_links`)) {
        sprintf(
        '"_links":
        %s
        ',
        jsonlite::toJSON(self$`_links`$toJSON(), auto_unbox=TRUE, digits = NA)
        )}
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      paste('{', jsoncontent, '}', sep = "")
    },
    fromJSONString = function(PipelineExecutionJson) {
      PipelineExecutionObject <- jsonlite::fromJSON(PipelineExecutionJson)
      self$`id` <- PipelineExecutionObject$`id`
      self$`programId` <- PipelineExecutionObject$`programId`
      self$`pipelineId` <- PipelineExecutionObject$`pipelineId`
      self$`artifactsVersion` <- PipelineExecutionObject$`artifactsVersion`
      self$`user` <- PipelineExecutionObject$`user`
      self$`status` <- PipelineExecutionObject$`status`
      self$`trigger` <- PipelineExecutionObject$`trigger`
      self$`createdAt` <- PipelineExecutionObject$`createdAt`
      self$`updatedAt` <- PipelineExecutionObject$`updatedAt`
      self$`finishedAt` <- PipelineExecutionObject$`finishedAt`
      self$`_embedded` <- PipelineExecutionEmbedded$new()$fromJSON(jsonlite::toJSON(PipelineExecutionObject$_embedded, auto_unbox = TRUE, digits = NA))
      self$`_links` <- PipelineExecutionLinks$new()$fromJSON(jsonlite::toJSON(PipelineExecutionObject$_links, auto_unbox = TRUE, digits = NA))
      self
    }
  )
)
