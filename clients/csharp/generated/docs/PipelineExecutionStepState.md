
# Org.OpenAPITools.Model.PipelineExecutionStepState

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
**StartedAt** | **DateTime** | Start time | [optional] 
**FinishedAt** | **DateTime** | Date the execution reached a final state | [optional] 
**Details** | **Dictionary&lt;string, Object&gt;** | Information about step result | [optional] 
**Status** | **string** | Action status | [optional] 
**Links** | [**PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

