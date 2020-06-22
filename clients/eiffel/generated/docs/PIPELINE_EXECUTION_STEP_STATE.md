# PIPELINE_EXECUTION_STEP_STATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**step_id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**phase_id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**action** | [**STRING_32**](STRING_32.md) | Name of the action | [optional] [default to null]
**repository** | [**STRING_32**](STRING_32.md) | Target repository | [optional] [default to null]
**branch** | [**STRING_32**](STRING_32.md) | Target branch | [optional] [default to null]
**environment** | [**STRING_32**](STRING_32.md) | Target environment | [optional] [default to null]
**environment_type** | [**STRING_32**](STRING_32.md) | Target environment type | [optional] [default to null]
**started_at** | [**DATE_TIME**](DATE_TIME.md) | Start time | [optional] [default to null]
**finished_at** | [**DATE_TIME**](DATE_TIME.md) | Date the execution reached a final state | [optional] [default to null]
**details** | [**STRING_TABLE[ANY]**](ANY.md) | Information about step result | [optional] [default to null]
**status** | [**STRING_32**](STRING_32.md) | Action status | [optional] [default to null]
**var_links** | [**PIPELINE_EXECUTION_STEP_STATE__LINKS**](pipelineExecutionStepState__links.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


