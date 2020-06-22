# PipelineExecutionStepState

Describes the status of a particular pipeline execution step for display purposes
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**step_id** | **str** |  | [optional] 
**phase_id** | **str** |  | [optional] 
**action** | **str** | Name of the action | [optional] 
**repository** | **str** | Target repository | [optional] 
**branch** | **str** | Target branch | [optional] 
**environment** | **str** | Target environment | [optional] 
**environment_type** | **str** | Target environment type | [optional] 
**started_at** | **datetime** | Start time | [optional] 
**finished_at** | **datetime** | Date the execution reached a final state | [optional] 
**details** | **dict(str, object)** | Information about step result | [optional] 
**status** | **str** | Action status | [optional] 
**links** | [**PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


