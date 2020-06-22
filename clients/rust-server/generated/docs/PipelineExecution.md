# PipelineExecution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Pipeline execution identifier | [optional] [default to None]
**program_id** | **String** | Identifier of the program. Unique within the space. | [optional] [readonly] [default to None]
**pipeline_id** | **String** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] [default to None]
**artifacts_version** | **String** | Version of the artifacts generated during this execution | [optional] [default to None]
**user** | **String** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] [default to None]
**status** | **String** | Status of the execution | [optional] [default to None]
**trigger** | **String** | How the execution was triggered. | [optional] [default to None]
**created_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Start time | [optional] [default to None]
**updated_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Date of last status change | [optional] [default to None]
**finished_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Date the execution reached a final state | [optional] [default to None]
**_embedded** | [***models::PipelineExecutionEmbedded**](pipelineExecution__embedded.md) |  | [optional] [default to None]
**_links** | [***models::PipelineExecutionLinks**](pipelineExecution__links.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


