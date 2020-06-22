# BAD_REQUEST_ERROR

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **INTEGER_32** | HTTP status code of the response. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Error type identifier. | [optional] [default to null]
**title** | [**STRING_32**](STRING_32.md) | A short summary of the error. | [optional] [default to null]
**missing_params** | [**LIST [MISSING_PARAMETER]**](MissingParameter.md) | Request&#39;s missing parameters. | [optional] [default to null]
**invalid_params** | [**LIST [INVALID_PARAMETER]**](InvalidParameter.md) | Request&#39;s invalid parameters. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


