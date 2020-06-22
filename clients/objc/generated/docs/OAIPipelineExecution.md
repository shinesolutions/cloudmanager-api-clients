# OAIPipelineExecution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | Pipeline execution identifier | [optional] 
**programId** | **NSString*** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**pipelineId** | **NSString*** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] 
**artifactsVersion** | **NSString*** | Version of the artifacts generated during this execution | [optional] 
**user** | **NSString*** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] 
**status** | **NSString*** | Status of the execution | [optional] 
**trigger** | **NSString*** | How the execution was triggered. | [optional] 
**createdAt** | **NSDate*** | Start time | [optional] 
**updatedAt** | **NSDate*** | Date of last status change | [optional] 
**finishedAt** | **NSDate*** | Date the execution reached a final state | [optional] 
**embedded** | [**OAIPipelineExecutionEmbedded***](OAIPipelineExecutionEmbedded.md) |  | [optional] 
**links** | [**OAIPipelineExecutionLinks***](OAIPipelineExecutionLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


