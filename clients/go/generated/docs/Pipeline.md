# Pipeline

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the pipeline. Unique within the program. | [optional] 
**ProgramId** | **string** | Identifier of the program. Unique within the space. | [optional] 
**Name** | **string** | Name of the pipeline | 
**Trigger** | **string** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] 
**Status** | **string** | Pipeline status | [optional] 
**CreatedAt** | [**time.Time**](time.Time.md) | Create date | [optional] [readonly] 
**UpdatedAt** | [**time.Time**](time.Time.md) | Update date | [optional] [readonly] 
**LastStartedAt** | [**time.Time**](time.Time.md) | Last pipeline execution start | [optional] [readonly] 
**LastFinishedAt** | [**time.Time**](time.Time.md) | Last pipeline execution end | [optional] [readonly] 
**Phases** | [**[]PipelinePhase**](pipelinePhase.md) | Pipeline phases in execution order | 
**Links** | [**PipelineLinks**](Pipeline__links.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


