# BadRequestError

A Bad Request response error.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **int** | HTTP status code of the response. | [optional] 
**type** | **str** | Error type identifier. | [optional] 
**title** | **str** | A short summary of the error. | [optional] 
**missing_params** | [**list[MissingParameter]**](MissingParameter.md) | Request&#39;s missing parameters. | [optional] 
**invalid_params** | [**list[InvalidParameter]**](InvalidParameter.md) | Request&#39;s invalid parameters. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


