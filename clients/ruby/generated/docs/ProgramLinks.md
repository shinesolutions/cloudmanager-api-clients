# AemCloudManagerApiClient::ProgramLinks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http__ns_adobe_com_adobecloud_rel_pipelines** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_environments** | [**HalLink**](HalLink.md) |  | [optional] 
**http__ns_adobe_com_adobecloud_rel_repositories** | [**HalLink**](HalLink.md) |  | [optional] 
**_self** | [**HalLink**](HalLink.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::ProgramLinks.new(http__ns_adobe_com_adobecloud_rel_pipelines: null,
                                 http__ns_adobe_com_adobecloud_rel_environments: null,
                                 http__ns_adobe_com_adobecloud_rel_repositories: null,
                                 _self: null)
```


