

# PipelineExecution

Wraps a pipeline execution
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
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Start time |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date of last status change |  [optional]
**finishedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date the execution reached a final state |  [optional]
**embedded** | [**PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  |  [optional]
**links** | [**PipelineExecutionLinks**](PipelineExecutionLinks.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
NOT_STARTED | &quot;NOT_STARTED&quot;
RUNNING | &quot;RUNNING&quot;
CANCELLING | &quot;CANCELLING&quot;
CANCELLED | &quot;CANCELLED&quot;
FINISHED | &quot;FINISHED&quot;
ERROR | &quot;ERROR&quot;
FAILED | &quot;FAILED&quot;



## Enum: TriggerEnum

Name | Value
---- | -----
ON_COMMIT | &quot;ON_COMMIT&quot;
MANUAL | &quot;MANUAL&quot;
SCHEDULE | &quot;SCHEDULE&quot;
PUSH_UPGRADES | &quot;PUSH_UPGRADES&quot;



