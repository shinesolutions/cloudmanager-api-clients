# PipelineExecutionStepState

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | [optional] 
**StepId** | **string** |  | [optional] 
**PhaseId** | **string** |  | [optional] 
**Action** | **string** | Name of the action | [optional] 
**Repository** | **string** | Target repository | [optional] 
**Branch** | **string** | Target branch | [optional] 
**Environment** | **string** | Target environment | [optional] 
**EnvironmentType** | **string** | Target environment type | [optional] 
**StartedAt** | [**time.Time**](time.Time.md) | Start time | [optional] 
**FinishedAt** | [**time.Time**](time.Time.md) | Date the execution reached a final state | [optional] 
**Details** | **map[string]map[string]interface{}** | Information about step result | [optional] 
**Status** | **string** | Action status | [optional] 
**Links** | [**PipelineExecutionStepStateLinks**](pipelineExecutionStepState__links.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


