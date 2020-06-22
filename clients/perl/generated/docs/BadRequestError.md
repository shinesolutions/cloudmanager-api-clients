# WWW::OpenAPIClient::Object::BadRequestError

## Load the model package
```perl
use WWW::OpenAPIClient::Object::BadRequestError;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **int** | HTTP status code of the response. | [optional] 
**type** | **string** | Error type identifier. | [optional] 
**title** | **string** | A short summary of the error. | [optional] 
**missing_params** | [**ARRAY[MissingParameter]**](MissingParameter.md) | Request&#39;s missing parameters. | [optional] 
**invalid_params** | [**ARRAY[InvalidParameter]**](InvalidParameter.md) | Request&#39;s invalid parameters. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


