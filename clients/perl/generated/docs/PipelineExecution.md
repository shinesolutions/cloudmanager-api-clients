# WWW::OpenAPIClient::Object::PipelineExecution

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PipelineExecution;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Pipeline execution identifier | [optional] 
**program_id** | **string** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**pipeline_id** | **string** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] 
**artifacts_version** | **string** | Version of the artifacts generated during this execution | [optional] 
**user** | **string** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] 
**status** | **string** | Status of the execution | [optional] 
**trigger** | **string** | How the execution was triggered. | [optional] 
**created_at** | **DateTime** | Start time | [optional] 
**updated_at** | **DateTime** | Date of last status change | [optional] 
**finished_at** | **DateTime** | Date the execution reached a final state | [optional] 
**_embedded** | [**PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  | [optional] 
**_links** | [**PipelineExecutionLinks**](PipelineExecutionLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


