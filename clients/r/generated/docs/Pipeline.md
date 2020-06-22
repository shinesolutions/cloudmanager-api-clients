# openapi::Pipeline

Describes a __CI/CD Pipeline__
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Identifier of the pipeline. Unique within the program. | [optional] 
**programId** | **character** | Identifier of the program. Unique within the space. | [optional] 
**name** | **character** | Name of the pipeline | 
**trigger** | **character** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] 
**status** | **character** | Pipeline status | [optional] 
**createdAt** | **character** | Create date | [optional] [readonly] 
**updatedAt** | **character** | Update date | [optional] [readonly] 
**lastStartedAt** | **character** | Last pipeline execution start | [optional] [readonly] 
**lastFinishedAt** | **character** | Last pipeline execution end | [optional] [readonly] 
**phases** | [**array[PipelinePhase]**](pipelinePhase.md) | Pipeline phases in execution order | 
**_links** | [**PipelineLinks**](Pipeline__links.md) |  | [optional] 


