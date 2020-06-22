# AemCloudManagerApiClient::EnvironmentLogs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service** | **Array&lt;String&gt;** | Name of the service | [optional] 
**name** | **Array&lt;String&gt;** | Name of the Log | [optional] 
**days** | **Integer** | Number of days | [optional] 
**_links** | [**EnvironmentLogsLinks**](EnvironmentLogsLinks.md) |  | [optional] 
**_embedded** | [**EnvironmentLogsEmbedded**](EnvironmentLogsEmbedded.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::EnvironmentLogs.new(service: author,
                                 name: aemerror,
                                 days: 2,
                                 _links: null,
                                 _embedded: null)
```


