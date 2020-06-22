# AemCloudManagerApiClient::PipelineExecutionLinks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http__ns_adobe_com_adobecloud_rel_program** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_pipeline** | [**HalLink**](HalLink.md) |  | [optional] 
**_self** | [**HalLink**](HalLink.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::PipelineExecutionLinks.new(http__ns_adobe_com_adobecloud_rel_program: null,
                                 http__ns_adobe_com_adobecloud_rel_pipeline: null,
                                 _self: null)
```


