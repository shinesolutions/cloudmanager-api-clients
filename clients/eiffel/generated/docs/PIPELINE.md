# PIPELINE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Identifier of the pipeline. Unique within the program. | [optional] [default to null]
**program_id** | [**STRING_32**](STRING_32.md) | Identifier of the program. Unique within the space. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Name of the pipeline | [default to null]
**trigger** | [**STRING_32**](STRING_32.md) | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] [default to null]
**status** | [**STRING_32**](STRING_32.md) | Pipeline status | [optional] [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Create date | [optional] [readonly] [default to null]
**updated_at** | [**DATE_TIME**](DATE_TIME.md) | Update date | [optional] [readonly] [default to null]
**last_started_at** | [**DATE_TIME**](DATE_TIME.md) | Last pipeline execution start | [optional] [readonly] [default to null]
**last_finished_at** | [**DATE_TIME**](DATE_TIME.md) | Last pipeline execution end | [optional] [readonly] [default to null]
**phases** | [**LIST [PIPELINE_PHASE]**](pipelinePhase.md) | Pipeline phases in execution order | [default to null]
**var_links** | [**PIPELINE__LINKS**](Pipeline__links.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


