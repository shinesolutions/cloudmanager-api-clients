# BadRequestError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | Option<**i32**> | HTTP status code of the response. | [optional]
**_type** | Option<**String**> | Error type identifier. | [optional]
**title** | Option<**String**> | A short summary of the error. | [optional]
**missing_params** | Option<[**Vec<crate::models::MissingParameter>**](MissingParameter.md)> | Request's missing parameters. | [optional]
**invalid_params** | Option<[**Vec<crate::models::InvalidParameter>**](InvalidParameter.md)> | Request's invalid parameters. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


