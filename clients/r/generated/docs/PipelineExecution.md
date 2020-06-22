# openapi::PipelineExecution

Wraps a pipeline execution
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Pipeline execution identifier | [optional] 
**programId** | **character** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**pipelineId** | **character** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] 
**artifactsVersion** | **character** | Version of the artifacts generated during this execution | [optional] 
**user** | **character** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] 
**status** | **character** | Status of the execution | [optional] 
**trigger** | **character** | How the execution was triggered. | [optional] 
**createdAt** | **character** | Start time | [optional] 
**updatedAt** | **character** | Date of last status change | [optional] 
**finishedAt** | **character** | Date the execution reached a final state | [optional] 
**_embedded** | [**PipelineExecutionEmbedded**](pipelineExecution__embedded.md) |  | [optional] 
**_links** | [**PipelineExecutionLinks**](pipelineExecution__links.md) |  | [optional] 


