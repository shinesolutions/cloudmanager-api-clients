# OAIPipeline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | Identifier of the pipeline. Unique within the program. | [optional] 
**programId** | **NSString*** | Identifier of the program. Unique within the space. | [optional] 
**name** | **NSString*** | Name of the pipeline | 
**trigger** | **NSString*** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] 
**status** | **NSString*** | Pipeline status | [optional] 
**createdAt** | **NSDate*** | Create date | [optional] [readonly] 
**updatedAt** | **NSDate*** | Update date | [optional] [readonly] 
**lastStartedAt** | **NSDate*** | Last pipeline execution start | [optional] [readonly] 
**lastFinishedAt** | **NSDate*** | Last pipeline execution end | [optional] [readonly] 
**phases** | [**NSArray&lt;OAIPipelinePhase&gt;***](OAIPipelinePhase.md) | Pipeline phases in execution order | 
**links** | [**OAIPipelineLinks***](OAIPipelineLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


