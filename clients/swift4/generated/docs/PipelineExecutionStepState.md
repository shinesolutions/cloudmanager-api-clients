# PipelineExecutionStepState

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
**details** | **[String:Any]** | Information about step result | [optional] 
**status** | **String** | Action status | [optional] 
**links** | [**PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


