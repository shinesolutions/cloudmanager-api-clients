# AemCloudManagerApiClient::PipelineExecution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Pipeline execution identifier | [optional] 
**program_id** | **String** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**pipeline_id** | **String** | Identifier of the pipeline. Unique within the space. | [optional] [readonly] 
**artifacts_version** | **String** | Version of the artifacts generated during this execution | [optional] 
**user** | **String** | AdobeID who started the pipeline. Empty for auto triggered builds | [optional] 
**status** | **String** | Status of the execution | [optional] 
**trigger** | **String** | How the execution was triggered. | [optional] 
**created_at** | **DateTime** | Start time | [optional] 
**updated_at** | **DateTime** | Date of last status change | [optional] 
**finished_at** | **DateTime** | Date the execution reached a final state | [optional] 
**_embedded** | [**PipelineExecutionEmbedded**](PipelineExecutionEmbedded.md) |  | [optional] 
**_links** | [**PipelineExecutionLinks**](PipelineExecutionLinks.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::PipelineExecution.new(id: null,
                                 program_id: 14,
                                 pipeline_id: 10,
                                 artifacts_version: null,
                                 user: 0123456789ABCDE@AdobeID,
                                 status: null,
                                 trigger: null,
                                 created_at: null,
                                 updated_at: null,
                                 finished_at: null,
                                 _embedded: null,
                                 _links: null)
```


