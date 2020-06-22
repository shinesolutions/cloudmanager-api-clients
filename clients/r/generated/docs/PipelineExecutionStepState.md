# openapi::PipelineExecutionStepState

Describes the status of a particular pipeline execution step for display purposes
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** |  | [optional] 
**stepId** | **character** |  | [optional] 
**phaseId** | **character** |  | [optional] 
**action** | **character** | Name of the action | [optional] 
**repository** | **character** | Target repository | [optional] 
**branch** | **character** | Target branch | [optional] 
**environment** | **character** | Target environment | [optional] 
**environmentType** | **character** | Target environment type | [optional] 
**startedAt** | **character** | Start time | [optional] 
**finishedAt** | **character** | Date the execution reached a final state | [optional] 
**details** | **map(object)** | Information about step result | [optional] 
**status** | **character** | Action status | [optional] 
**_links** | [**PipelineExecutionStepStateLinks**](pipelineExecutionStepState__links.md) |  | [optional] 


