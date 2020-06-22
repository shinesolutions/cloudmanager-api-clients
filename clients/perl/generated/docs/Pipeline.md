# WWW::OpenAPIClient::Object::Pipeline

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Pipeline;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Identifier of the pipeline. Unique within the program. | [optional] 
**program_id** | **string** | Identifier of the program. Unique within the space. | [optional] 
**name** | **string** | Name of the pipeline | 
**trigger** | **string** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] 
**status** | **string** | Pipeline status | [optional] 
**created_at** | **DateTime** | Create date | [optional] [readonly] 
**updated_at** | **DateTime** | Update date | [optional] [readonly] 
**last_started_at** | **DateTime** | Last pipeline execution start | [optional] [readonly] 
**last_finished_at** | **DateTime** | Last pipeline execution end | [optional] [readonly] 
**phases** | [**ARRAY[PipelinePhase]**](PipelinePhase.md) | Pipeline phases in execution order | 
**_links** | [**PipelineLinks**](PipelineLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


