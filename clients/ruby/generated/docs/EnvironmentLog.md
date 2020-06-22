# AemCloudManagerApiClient::EnvironmentLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service** | **String** | Name of the service | [optional] 
**name** | **String** | Name of the Log | [optional] 
**date** | **String** | date of the Log | [optional] 
**program_id** | **Integer** |  | [optional] 
**environment_id** | **Integer** |  | [optional] 
**_links** | [**EnvironmentLogLinks**](EnvironmentLogLinks.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::EnvironmentLog.new(service: author,
                                 name: aemerror,
                                 date: 2019-04-05,
                                 program_id: null,
                                 environment_id: null,
                                 _links: null)
```


