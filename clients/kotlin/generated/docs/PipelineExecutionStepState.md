
# PipelineExecutionStepState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional]
**stepId** | **kotlin.String** |  |  [optional]
**phaseId** | **kotlin.String** |  |  [optional]
**action** | **kotlin.String** | Name of the action |  [optional]
**repository** | **kotlin.String** | Target repository |  [optional]
**branch** | **kotlin.String** | Target branch |  [optional]
**environment** | **kotlin.String** | Target environment |  [optional]
**environmentType** | **kotlin.String** | Target environment type |  [optional]
**startedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Start time |  [optional]
**finishedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date the execution reached a final state |  [optional]
**details** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Information about step result |  [optional]
**status** | [**inline**](#StatusEnum) | Action status |  [optional]
**links** | [**PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | NOT_STARTED, RUNNING, FINISHED, ERROR, ROLLING_BACK, ROLLED_BACK, WAITING, CANCELLED, FAILED



