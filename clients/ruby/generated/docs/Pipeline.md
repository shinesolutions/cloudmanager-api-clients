# AemCloudManagerApiClient::Pipeline

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the pipeline. Unique within the program. | [optional] 
**program_id** | **String** | Identifier of the program. Unique within the space. | [optional] 
**name** | **String** | Name of the pipeline | 
**trigger** | **String** | How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} | [optional] 
**status** | **String** | Pipeline status | [optional] 
**created_at** | **DateTime** | Create date | [optional] [readonly] 
**updated_at** | **DateTime** | Update date | [optional] [readonly] 
**last_started_at** | **DateTime** | Last pipeline execution start | [optional] [readonly] 
**last_finished_at** | **DateTime** | Last pipeline execution end | [optional] [readonly] 
**phases** | [**Array&lt;PipelinePhase&gt;**](PipelinePhase.md) | Pipeline phases in execution order | 
**_links** | [**PipelineLinks**](PipelineLinks.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::Pipeline.new(id: 29,
                                 program_id: 14,
                                 name: AcmeCorp Main Pipeline,
                                 trigger: MANUAL,
                                 status: RUNNING,FAILED,
                                 created_at: null,
                                 updated_at: null,
                                 last_started_at: null,
                                 last_finished_at: null,
                                 phases: null,
                                 _links: null)
```


