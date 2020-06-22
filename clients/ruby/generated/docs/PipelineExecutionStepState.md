# AemCloudManagerApiClient::PipelineExecutionStepState

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] 
**step_id** | **String** |  | [optional] 
**phase_id** | **String** |  | [optional] 
**action** | **String** | Name of the action | [optional] 
**repository** | **String** | Target repository | [optional] 
**branch** | **String** | Target branch | [optional] 
**environment** | **String** | Target environment | [optional] 
**environment_type** | **String** | Target environment type | [optional] 
**started_at** | **DateTime** | Start time | [optional] 
**finished_at** | **DateTime** | Date the execution reached a final state | [optional] 
**details** | **Hash&lt;String, Object&gt;** | Information about step result | [optional] 
**status** | **String** | Action status | [optional] 
**_links** | [**PipelineExecutionStepStateLinks**](PipelineExecutionStepStateLinks.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::PipelineExecutionStepState.new(id: null,
                                 step_id: null,
                                 phase_id: null,
                                 action: build,
                                 repository: null,
                                 branch: null,
                                 environment: null,
                                 environment_type: null,
                                 started_at: null,
                                 finished_at: null,
                                 details: scheduled time,
                                 status: NOT_STARTED,
                                 _links: null)
```


