# Pipeline

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the pipeline. Unique within the program. | [optional] [default to None]
**program_id** | **String** | Identifier of the program. Unique within the space. | [optional] [default to None]
**name** | **String** | Name of the pipeline | 
**trigger** | **String** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] [default to None]
**status** | **String** | Pipeline status | [optional] [default to None]
**created_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Create date | [optional] [readonly] [default to None]
**updated_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Update date | [optional] [readonly] [default to None]
**last_started_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Last pipeline execution start | [optional] [readonly] [default to None]
**last_finished_at** | [**chrono::DateTime<chrono::Utc>**](DateTime.md) | Last pipeline execution end | [optional] [readonly] [default to None]
**phases** | [**Vec<models::PipelinePhase>**](pipelinePhase.md) | Pipeline phases in execution order | 
**_links** | [***models::PipelineLinks**](Pipeline__links.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


