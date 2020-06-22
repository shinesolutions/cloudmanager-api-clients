# Pipeline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Identifier of the pipeline. Unique within the program. | [optional] 
**programId** | **string** | Identifier of the program. Unique within the space. | [optional] 
**name** | **string** | Name of the pipeline | 
**trigger** | **string** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] 
**status** | **string** | Pipeline status | [optional] 
**createdAt** | [**\DateTime**](\DateTime.md) | Create date | [optional] [readonly] 
**updatedAt** | [**\DateTime**](\DateTime.md) | Update date | [optional] [readonly] 
**lastStartedAt** | [**\DateTime**](\DateTime.md) | Last pipeline execution start | [optional] [readonly] 
**lastFinishedAt** | [**\DateTime**](\DateTime.md) | Last pipeline execution end | [optional] [readonly] 
**phases** | [**OpenAPI\Server\Model\PipelinePhase**](PipelinePhase.md) | Pipeline phases in execution order | 
**links** | [**OpenAPI\Server\Model\PipelineLinks**](PipelineLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


