# PipelineExecutionStepState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] [default to None]
**step_id** | **String** |  | [optional] [default to None]
**phase_id** | **String** |  | [optional] [default to None]
**action** | **String** | Name of the action | [optional] [default to None]
**repository** | **String** | Target repository | [optional] [default to None]
**branch** | **String** | Target branch | [optional] [default to None]
**environment** | **String** | Target environment | [optional] [default to None]
**environment_type** | **String** | Target environment type | [optional] [default to None]
**started_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Start time | [optional] [default to None]
**finished_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Date the execution reached a final state | [optional] [default to None]
**details** | [**HashMap<String, object>**](object.md) | Information about step result | [optional] [default to None]
**status** | **String** | Action status | [optional] [default to None]
**_links** | [***models::PipelineExecutionStepStateLinks**](pipelineExecutionStepState__links.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


