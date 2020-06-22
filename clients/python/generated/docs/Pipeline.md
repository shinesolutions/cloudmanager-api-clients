# Pipeline

Describes a __CI/CD Pipeline__
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the pipeline. Unique within the program. | [optional] 
**program_id** | **str** | Identifier of the program. Unique within the space. | [optional] 
**name** | **str** | Name of the pipeline | 
**trigger** | **str** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] 
**status** | **str** | Pipeline status | [optional] 
**created_at** | **datetime** | Create date | [optional] [readonly] 
**updated_at** | **datetime** | Update date | [optional] [readonly] 
**last_started_at** | **datetime** | Last pipeline execution start | [optional] [readonly] 
**last_finished_at** | **datetime** | Last pipeline execution end | [optional] [readonly] 
**phases** | [**list[PipelinePhase]**](PipelinePhase.md) | Pipeline phases in execution order | 
**links** | [**PipelineLinks**](PipelineLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


