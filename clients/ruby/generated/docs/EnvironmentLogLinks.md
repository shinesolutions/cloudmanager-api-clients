# AemCloudManagerApiClient::EnvironmentLogLinks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http__ns_adobe_com_adobecloud_rel_logs_download** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_logs_tail** | [**HalLink**](HalLink.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::EnvironmentLogLinks.new(http__ns_adobe_com_adobecloud_rel_logs_download: null,
                                 http__ns_adobe_com_adobecloud_rel_logs_tail: null)
```


