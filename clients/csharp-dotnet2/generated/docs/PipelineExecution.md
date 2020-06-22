# Org.OpenAPITools.Model.PipelineExecution
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Pipeline execution identifier | [optional] 
**ProgramId** | **string** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**PipelineId** | **string** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] 
**ArtifactsVersion** | **string** | Version of the artifacts generated during this execution | [optional] 
**User** | **string** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] 
**Status** | **string** | Status of the execution | [optional] 
**Trigger** | **string** | How the execution was triggered. | [optional] 
**CreatedAt** | **DateTime?** | Start time | [optional] 
**UpdatedAt** | **DateTime?** | Date of last status change | [optional] 
**FinishedAt** | **DateTime?** | Date the execution reached a final state | [optional] 
**Embedded** | [**PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  | [optional] 
**Links** | [**PipelineExecutionLinks**](PipelineExecutionLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

