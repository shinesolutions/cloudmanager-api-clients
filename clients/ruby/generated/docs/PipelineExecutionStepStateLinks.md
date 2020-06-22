# AemCloudManagerApiClient::PipelineExecutionStepStateLinks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http__ns_adobe_com_adobecloud_rel_execution** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_pipeline** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_pipeline_logs** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_pipeline_metrics** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_pipeline_advance** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_pipeline_cancel** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_program** | [**HalLink**](HalLink.md) |  | [optional] 
**_self** | [**HalLink**](HalLink.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::PipelineExecutionStepStateLinks.new(http__ns_adobe_com_adobecloud_rel_execution: null,
                                 http__ns_adobe_com_adobecloud_rel_pipeline: null,
                                 http__ns_adobe_com_adobecloud_rel_pipeline_logs: null,
                                 http__ns_adobe_com_adobecloud_rel_pipeline_metrics: null,
                                 http__ns_adobe_com_adobecloud_rel_pipeline_advance: null,
                                 http__ns_adobe_com_adobecloud_rel_pipeline_cancel: null,
                                 http__ns_adobe_com_adobecloud_rel_program: null,
                                 _self: null)
```


