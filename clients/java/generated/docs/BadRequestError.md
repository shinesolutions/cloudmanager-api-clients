

# BadRequestError

A Bad Request response error.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **Integer** | HTTP status code of the response. |  [optional]
**type** | **String** | Error type identifier. |  [optional]
**title** | **String** | A short summary of the error. |  [optional]
**missingParams** | [**List&lt;MissingParameter&gt;**](MissingParameter.md) | Request&#39;s missing parameters. |  [optional]
**invalidParams** | [**List&lt;InvalidParameter&gt;**](InvalidParameter.md) | Request&#39;s invalid parameters. |  [optional]



