
# Pipeline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Name of the pipeline | 
**phases** | [**kotlin.Array&lt;PipelinePhase&gt;**](PipelinePhase.md) | Pipeline phases in execution order | 
**id** | **kotlin.String** | Identifier of the pipeline. Unique within the program. |  [optional]
**programId** | **kotlin.String** | Identifier of the program. Unique within the space. |  [optional]
**trigger** | [**inline**](#TriggerEnum) | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} |  [optional]
**status** | [**inline**](#StatusEnum) | Pipeline status |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Create date |  [optional] [readonly]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Update date |  [optional] [readonly]
**lastStartedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Last pipeline execution start |  [optional] [readonly]
**lastFinishedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Last pipeline execution end |  [optional] [readonly]
**links** | [**PipelineLinks**](PipelineLinks.md) |  |  [optional]


<a name="TriggerEnum"></a>
## Enum: trigger
Name | Value
---- | -----
trigger | ON_COMMIT, MANUAL, SCHEDULE


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | IDLE, BUSY, WAITING



