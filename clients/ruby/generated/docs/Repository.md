# AemCloudManagerApiClient::Repository

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repo** | **String** | Repository name | [optional] 
**description** | **String** | description | [optional] 
**_links** | [**RepositoryLinks**](RepositoryLinks.md) |  | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::Repository.new(repo: Adobe-Marketing-Cloud,
                                 description: Description,
                                 _links: null)
```


