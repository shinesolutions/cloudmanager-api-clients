# PipelineExecutionStepState

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> |  | [optional]
**step_id** | Option<**String**> |  | [optional]
**phase_id** | Option<**String**> |  | [optional]
**action** | Option<**String**> | Name of the action | [optional]
**repository** | Option<**String**> | Target repository | [optional]
**branch** | Option<**String**> | Target branch | [optional]
**environment** | Option<**String**> | Target environment | [optional]
**environment_type** | Option<**String**> | Target environment type | [optional]
**started_at** | Option<**String**> | Start time | [optional]
**finished_at** | Option<**String**> | Date the execution reached a final state | [optional]
**details** | Option<[**::std::collections::HashMap<String, serde_json::Value>**](serde_json::Value.md)> | Information about step result | [optional]
**status** | Option<**String**> | Action status | [optional]
**_links** | Option<[**crate::models::PipelineExecutionStepStateLinks**](pipelineExecutionStepState__links.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


