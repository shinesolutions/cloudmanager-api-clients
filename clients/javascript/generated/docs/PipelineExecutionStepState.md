# NodeAemCloudmanagerApiClient.PipelineExecutionStepState

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] 
**stepId** | **String** |  | [optional] 
**phaseId** | **String** |  | [optional] 
**action** | **String** | Name of the action | [optional] 
**repository** | **String** | Target repository | [optional] 
**branch** | **String** | Target branch | [optional] 
**environment** | **String** | Target environment | [optional] 
**environmentType** | **String** | Target environment type | [optional] 
**startedAt** | **Date** | Start time | [optional] 
**finishedAt** | **Date** | Date the execution reached a final state | [optional] 
**details** | **{String: Object}** | Information about step result | [optional] 
**status** | **String** | Action status | [optional] 
**links** | [**PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  | [optional] 



## Enum: StatusEnum


* `NOT_STARTED` (value: `"NOT_STARTED"`)

* `RUNNING` (value: `"RUNNING"`)

* `FINISHED` (value: `"FINISHED"`)

* `ERROR` (value: `"ERROR"`)

* `ROLLING_BACK` (value: `"ROLLING_BACK"`)

* `ROLLED_BACK` (value: `"ROLLED_BACK"`)

* `WAITING` (value: `"WAITING"`)

* `CANCELLED` (value: `"CANCELLED"`)

* `FAILED` (value: `"FAILED"`)




