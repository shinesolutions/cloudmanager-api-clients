# # PipelineExecutionStepState

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] 
**step_id** | **string** |  | [optional] 
**phase_id** | **string** |  | [optional] 
**action** | **string** | Name of the action | [optional] 
**repository** | **string** | Target repository | [optional] 
**branch** | **string** | Target branch | [optional] 
**environment** | **string** | Target environment | [optional] 
**environment_type** | **string** | Target environment type | [optional] 
**started_at** | [**\DateTime**](\DateTime.md) | Start time | [optional] 
**finished_at** | [**\DateTime**](\DateTime.md) | Date the execution reached a final state | [optional] 
**details** | **map[string,object]** | Information about step result | [optional] 
**status** | **string** | Action status | [optional] 
**_links** | [**\OpenAPI\Client\Model\PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


