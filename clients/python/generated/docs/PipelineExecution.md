# PipelineExecution

Wraps a pipeline execution
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Pipeline execution identifier | [optional] 
**program_id** | **str** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**pipeline_id** | **str** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] 
**artifacts_version** | **str** | Version of the artifacts generated during this execution | [optional] 
**user** | **str** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] 
**status** | **str** | Status of the execution | [optional] 
**trigger** | **str** | How the execution was triggered. | [optional] 
**created_at** | **datetime** | Start time | [optional] 
**updated_at** | **datetime** | Date of last status change | [optional] 
**finished_at** | **datetime** | Date the execution reached a final state | [optional] 
**embedded** | [**PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  | [optional] 
**links** | [**PipelineExecutionLinks**](PipelineExecutionLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


