# Pipeline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the pipeline. Unique within the program. | [optional] 
**programId** | **String** | Identifier of the program. Unique within the space. | [optional] 
**name** | **String** | Name of the pipeline | 
**trigger** | **String** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] 
**status** | **String** | Pipeline status | [optional] 
**createdAt** | **Date** | Create date | [optional] [readonly] 
**updatedAt** | **Date** | Update date | [optional] [readonly] 
**lastStartedAt** | **Date** | Last pipeline execution start | [optional] [readonly] 
**lastFinishedAt** | **Date** | Last pipeline execution end | [optional] [readonly] 
**phases** | [PipelinePhase] | Pipeline phases in execution order | 
**links** | [**PipelineLinks**](PipelineLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


