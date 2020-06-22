

# PipelineExecutionStepState

Describes the status of a particular pipeline execution step for display purposes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**stepId** | **String** |  |  [optional]
**phaseId** | **String** |  |  [optional]
**action** | **String** | Name of the action |  [optional]
**repository** | **String** | Target repository |  [optional]
**branch** | **String** | Target branch |  [optional]
**environment** | **String** | Target environment |  [optional]
**environmentType** | **String** | Target environment type |  [optional]
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Start time |  [optional]
**finishedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date the execution reached a final state |  [optional]
**details** | **Map&lt;String, Object&gt;** | Information about step result |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Action status |  [optional]
**links** | [**PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
NOT_STARTED | &quot;NOT_STARTED&quot;
RUNNING | &quot;RUNNING&quot;
FINISHED | &quot;FINISHED&quot;
ERROR | &quot;ERROR&quot;
ROLLING_BACK | &quot;ROLLING_BACK&quot;
ROLLED_BACK | &quot;ROLLED_BACK&quot;
WAITING | &quot;WAITING&quot;
CANCELLED | &quot;CANCELLED&quot;
FAILED | &quot;FAILED&quot;



