

# PipelineExecution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Pipeline execution identifier |  [optional]
**programId** | **String** | Identifier of the program. Unique within the space. |  [optional] [readonly]
**pipelineId** | **String** | Identifier of the pipeline. Unique within the space. |  [optional] [readonly]
**artifactsVersion** | **String** | Version of the artifacts generated during this execution |  [optional]
**user** | **String** | AdobeID who started the pipeline. Empty for auto triggered builds |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the execution |  [optional]
**trigger** | [**TriggerEnum**](#TriggerEnum) | How the execution was triggered. |  [optional]
**createdAt** | [**Date**](Date.md) | Start time |  [optional]
**updatedAt** | [**Date**](Date.md) | Date of last status change |  [optional]
**finishedAt** | [**Date**](Date.md) | Date the execution reached a final state |  [optional]
**embedded** | [**PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  |  [optional]
**links** | [**PipelineExecutionLinks**](PipelineExecutionLinks.md) |  |  [optional]


## Enum: StatusEnum

Name | Value
---- | -----


## Enum: TriggerEnum

Name | Value
---- | -----




