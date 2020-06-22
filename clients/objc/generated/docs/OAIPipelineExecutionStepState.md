# OAIPipelineExecutionStepState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** |  | [optional] 
**stepId** | **NSString*** |  | [optional] 
**phaseId** | **NSString*** |  | [optional] 
**action** | **NSString*** | Name of the action | [optional] 
**repository** | **NSString*** | Target repository | [optional] 
**branch** | **NSString*** | Target branch | [optional] 
**environment** | **NSString*** | Target environment | [optional] 
**environmentType** | **NSString*** | Target environment type | [optional] 
**startedAt** | **NSDate*** | Start time | [optional] 
**finishedAt** | **NSDate*** | Date the execution reached a final state | [optional] 
**details** | **NSDictionary&lt;NSString*, NSObject*&gt;*** | Information about step result | [optional] 
**status** | **NSString*** | Action status | [optional] 
**links** | [**OAIPipelineExecutionStepStateLinks***](OAIPipelineExecutionStepStateLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


