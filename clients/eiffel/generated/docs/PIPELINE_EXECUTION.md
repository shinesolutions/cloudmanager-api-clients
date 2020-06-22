# PIPELINE_EXECUTION

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Pipeline execution identifier | [optional] [default to null]
**program_id** | [**STRING_32**](STRING_32.md) | Identifier of the program. Unique within the space. | [optional] [readonly] [default to null]
**pipeline_id** | [**STRING_32**](STRING_32.md) | Identifier of the pipeline. Unique within the space. | [optional] [readonly] [default to null]
**artifacts_version** | [**STRING_32**](STRING_32.md) | Version of the artifacts generated during this execution | [optional] [default to null]
**user** | [**STRING_32**](STRING_32.md) | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] [default to null]
**status** | [**STRING_32**](STRING_32.md) | Status of the execution | [optional] [default to null]
**trigger** | [**STRING_32**](STRING_32.md) | How the execution was triggered. | [optional] [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Start time | [optional] [default to null]
**updated_at** | [**DATE_TIME**](DATE_TIME.md) | Date of last status change | [optional] [default to null]
**finished_at** | [**DATE_TIME**](DATE_TIME.md) | Date the execution reached a final state | [optional] [default to null]
**var_embedded** | [**PIPELINE_EXECUTION__EMBEDDED**](pipelineExecution__embedded.md) |  | [optional] [default to null]
**var_links** | [**PIPELINE_EXECUTION__LINKS**](pipelineExecution__links.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


