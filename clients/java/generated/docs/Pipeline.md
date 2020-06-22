

# Pipeline

Describes a __CI/CD Pipeline__
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the pipeline. Unique within the program. |  [optional]
**programId** | **String** | Identifier of the program. Unique within the space. |  [optional]
**name** | **String** | Name of the pipeline | 
**trigger** | [**TriggerEnum**](#TriggerEnum) | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Pipeline status |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Create date |  [optional] [readonly]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Update date |  [optional] [readonly]
**lastStartedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Last pipeline execution start |  [optional] [readonly]
**lastFinishedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Last pipeline execution end |  [optional] [readonly]
**phases** | [**List&lt;PipelinePhase&gt;**](PipelinePhase.md) | Pipeline phases in execution order | 
**links** | [**PipelineLinks**](PipelineLinks.md) |  |  [optional]



## Enum: TriggerEnum

Name | Value
---- | -----
ON_COMMIT | &quot;ON_COMMIT&quot;
MANUAL | &quot;MANUAL&quot;
SCHEDULE | &quot;SCHEDULE&quot;



## Enum: StatusEnum

Name | Value
---- | -----
IDLE | &quot;IDLE&quot;
BUSY | &quot;BUSY&quot;
WAITING | &quot;WAITING&quot;



