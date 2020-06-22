# PipelineExecution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Pipeline execution identifier | [optional] 
**programId** | **string** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**pipelineId** | **string** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] 
**artifactsVersion** | **string** | Version of the artifacts generated during this execution | [optional] 
**user** | **string** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] 
**status** | **string** | Status of the execution | [optional] 
**trigger** | **string** | How the execution was triggered. | [optional] 
**createdAt** | [**\DateTime**](\DateTime.md) | Start time | [optional] 
**updatedAt** | [**\DateTime**](\DateTime.md) | Date of last status change | [optional] 
**finishedAt** | [**\DateTime**](\DateTime.md) | Date the execution reached a final state | [optional] 
**embedded** | [**OpenAPI\Server\Model\PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  | [optional] 
**links** | [**OpenAPI\Server\Model\PipelineExecutionLinks**](PipelineExecutionLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


