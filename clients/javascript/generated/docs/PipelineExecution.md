# NodeAemCloudmanagerApiClient.PipelineExecution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Pipeline execution identifier | [optional] 
**programId** | **String** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**pipelineId** | **String** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] 
**artifactsVersion** | **String** | Version of the artifacts generated during this execution | [optional] 
**user** | **String** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] 
**status** | **String** | Status of the execution | [optional] 
**trigger** | **String** | How the execution was triggered. | [optional] 
**createdAt** | **Date** | Start time | [optional] 
**updatedAt** | **Date** | Date of last status change | [optional] 
**finishedAt** | **Date** | Date the execution reached a final state | [optional] 
**embedded** | [**PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  | [optional] 
**links** | [**PipelineExecutionLinks**](PipelineExecutionLinks.md) |  | [optional] 



## Enum: StatusEnum


* `NOT_STARTED` (value: `"NOT_STARTED"`)

* `RUNNING` (value: `"RUNNING"`)

* `CANCELLING` (value: `"CANCELLING"`)

* `CANCELLED` (value: `"CANCELLED"`)

* `FINISHED` (value: `"FINISHED"`)

* `ERROR` (value: `"ERROR"`)

* `FAILED` (value: `"FAILED"`)





## Enum: TriggerEnum


* `ON_COMMIT` (value: `"ON_COMMIT"`)

* `MANUAL` (value: `"MANUAL"`)

* `SCHEDULE` (value: `"SCHEDULE"`)

* `PUSH_UPGRADES` (value: `"PUSH_UPGRADES"`)




