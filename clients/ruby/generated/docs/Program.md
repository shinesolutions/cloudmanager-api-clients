# AemCloudManagerApiClient::Program

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the program. Unique within the space. | [optional] 
**name** | **String** | Name of the program | 
**enabled** | **Boolean** | Whether this Program has been enabled for Cloud Manager usage | [optional] [default to false]
**tenant_id** | **String** | Tenant Id | [optional] 
**ims_org_id** | **String** | Organisation Id | [optional] 
**_links** | [**ProgramLinks**](ProgramLinks.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::Program.new(id: 14,
                                 name: AcmeCorp Main Site,
                                 enabled: null,
                                 tenant_id: acmeCorp,
                                 ims_org_id: 6522A55453334E247F120101@AdobeOrg,
                                 _links: null)
```


