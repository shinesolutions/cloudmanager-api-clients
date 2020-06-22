# PipelineExecution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | Pipeline execution identifier | [optional]
**program_id** | Option<**String**> | Identifier of the program. Unique within the space. | [optional][readonly]
**pipeline_id** | Option<**String**> | Identifier of the pipeline. Unique within the space. | [optional][readonly]
**artifacts_version** | Option<**String**> | Version of the artifacts generated during this execution | [optional]
**user** | Option<**String**> | AdobeID who started the pipeline. Empty for auto triggered builds | [optional]
**status** | Option<**String**> | Status of the execution | [optional]
**trigger** | Option<**String**> | How the execution was triggered. | [optional]
**created_at** | Option<**String**> | Start time | [optional]
**updated_at** | Option<**String**> | Date of last status change | [optional]
**finished_at** | Option<**String**> | Date the execution reached a final state | [optional]
**_embedded** | Option<[**crate::models::PipelineExecutionEmbedded**](pipelineExecution__embedded.md)> |  | [optional]
**_links** | Option<[**crate::models::PipelineExecutionLinks**](pipelineExecution__links.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


