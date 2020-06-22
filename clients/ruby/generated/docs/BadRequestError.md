# AemCloudManagerApiClient::BadRequestError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **Integer** | HTTP status code of the response. | [optional] 
**type** | **String** | Error type identifier. | [optional] 
**title** | **String** | A short summary of the error. | [optional] 
**missing_params** | [**Array&lt;MissingParameter&gt;**](MissingParameter.md) | Request&#39;s missing parameters. | [optional] 
**invalid_params** | [**Array&lt;InvalidParameter&gt;**](InvalidParameter.md) | Request&#39;s invalid parameters. | [optional] 

## Code Sample

```ruby
require 'AemCloudManagerApiClient'

instance = AemCloudManagerApiClient::BadRequestError.new(status: null,
                                 type: http://ns.adobe.com/adobecloud/error,
                                 title: Validation failed,
                                 missing_params: null,
                                 invalid_params: null)
```


