# openapi::BadRequestError

A Bad Request response error.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **integer** | HTTP status code of the response. | [optional] 
**type** | **character** | Error type identifier. | [optional] 
**title** | **character** | A short summary of the error. | [optional] 
**missingParams** | [**array[MissingParameter]**](MissingParameter.md) | Request&#39;s missing parameters. | [optional] 
**invalidParams** | [**array[InvalidParameter]**](InvalidParameter.md) | Request&#39;s invalid parameters. | [optional] 


