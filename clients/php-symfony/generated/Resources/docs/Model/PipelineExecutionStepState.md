# PipelineExecutionStepState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] 
**stepId** | **string** |  | [optional] 
**phaseId** | **string** |  | [optional] 
**action** | **string** | Name of the action | [optional] 
**repository** | **string** | Target repository | [optional] 
**branch** | **string** | Target branch | [optional] 
**environment** | **string** | Target environment | [optional] 
**environmentType** | **string** | Target environment type | [optional] 
**startedAt** | [**\DateTime**](\DateTime.md) | Start time | [optional] 
**finishedAt** | [**\DateTime**](\DateTime.md) | Date the execution reached a final state | [optional] 
**details** | **array** | Information about step result | [optional] 
**status** | **string** | Action status | [optional] 
**links** | [**OpenAPI\Server\Model\PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


