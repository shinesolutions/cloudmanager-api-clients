# Pipeline

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | Identifier of the pipeline. Unique within the program. | [optional]
**program_id** | Option<**String**> | Identifier of the program. Unique within the space. | [optional]
**name** | **String** | Name of the pipeline | 
**trigger** | Option<**String**> | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional]
**status** | Option<**String**> | Pipeline status | [optional]
**created_at** | Option<**String**> | Create date | [optional][readonly]
**updated_at** | Option<**String**> | Update date | [optional][readonly]
**last_started_at** | Option<**String**> | Last pipeline execution start | [optional][readonly]
**last_finished_at** | Option<**String**> | Last pipeline execution end | [optional][readonly]
**phases** | [**Vec<crate::models::PipelinePhase>**](pipelinePhase.md) | Pipeline phases in execution order | 
**_links** | Option<[**crate::models::PipelineLinks**](Pipeline__links.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


