

# PipelineExecutionStepState

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
**startedAt** | [**Date**](Date.md) | Start time |  [optional]
**finishedAt** | [**Date**](Date.md) | Date the execution reached a final state |  [optional]
**details** | **Map&lt;String, Object&gt;** | Information about step result |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Action status |  [optional]
**links** | [**PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  |  [optional]


## Enum: StatusEnum

Name | Value
---- | -----




