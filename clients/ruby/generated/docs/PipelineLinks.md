# AemCloudManagerApiClient::PipelineLinks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http__ns_adobe_com_adobecloud_rel_program** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_execution** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_executions** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_rollback_last_successful_execution** | [**HalLink**](HalLink.md) |  | [optional] 
**_self** | [**HalLink**](HalLink.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::PipelineLinks.new(http__ns_adobe_com_adobecloud_rel_program: null,
                                 http__ns_adobe_com_adobecloud_rel_execution: null,
                                 http__ns_adobe_com_adobecloud_rel_executions: null,
                                 http__ns_adobe_com_adobecloud_rel_rollback_last_successful_execution: null,
                                 _self: null)
```


