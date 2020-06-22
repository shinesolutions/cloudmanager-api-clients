# AemCloudManagerApiClient::EmbeddedProgram

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the program. Unique within the space. | [optional] [readonly] 
**name** | **String** | Name of the program | [optional] [readonly] 
**enabled** | **Boolean** | Whether this Program has been enabled for Cloud Manager usage | [optional] [readonly] [default to false]
**tenant_id** | **String** | Tenant Id | [optional] [readonly] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::EmbeddedProgram.new(id: 14,
                                 name: AcmeCorp Main Site,
                                 enabled: null,
                                 tenant_id: acmeCorp)
```


