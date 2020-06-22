# BadRequestError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **i32** | HTTP status code of the response. | [optional] [default to None]
**_type** | **String** | Error type identifier. | [optional] [default to None]
**title** | **String** | A short summary of the error. | [optional] [default to None]
**missing_params** | [**Vec<models::MissingParameter>**](MissingParameter.md) | Request's missing parameters. | [optional] [default to None]
**invalid_params** | [**Vec<models::InvalidParameter>**](InvalidParameter.md) | Request's invalid parameters. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


