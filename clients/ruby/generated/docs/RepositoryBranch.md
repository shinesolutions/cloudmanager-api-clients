# AemCloudManagerApiClient::RepositoryBranch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. Unique within the space | [optional] 
**repository_id** | **Integer** | Identifier of the repository | [optional] 
**name** | **String** | Name of the branch | [optional] 
**_links** | [**RepositoryBranchLinks**](RepositoryBranchLinks.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::RepositoryBranch.new(program_id: 14,
                                 repository_id: 2,
                                 name: master,
                                 _links: null)
```


