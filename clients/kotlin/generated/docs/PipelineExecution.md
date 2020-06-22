
# PipelineExecution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Pipeline execution identifier |  [optional]
**programId** | **kotlin.String** | Identifier of the program. Unique within the space. |  [optional] [readonly]
**pipelineId** | **kotlin.String** | Identifier of the pipeline. Unique within the space. |  [optional] [readonly]
**artifactsVersion** | **kotlin.String** | Version of the artifacts generated during this execution |  [optional]
**user** | **kotlin.String** | AdobeID who started the pipeline. Empty for auto triggered builds |  [optional]
**status** | [**inline**](#StatusEnum) | Status of the execution |  [optional]
**trigger** | [**inline**](#TriggerEnum) | How the execution was triggered. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Start time |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date of last status change |  [optional]
**finishedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date the execution reached a final state |  [optional]
**embedded** | [**PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  |  [optional]
**links** | [**PipelineExecutionLinks**](PipelineExecutionLinks.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | NOT_STARTED, RUNNING, CANCELLING, CANCELLED, FINISHED, ERROR, FAILED


<a name="TriggerEnum"></a>
## Enum: trigger
Name | Value
---- | -----
trigger | ON_COMMIT, MANUAL, SCHEDULE, PUSH_UPGRADES



