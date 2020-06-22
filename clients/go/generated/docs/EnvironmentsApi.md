# \EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteEnvironment**](EnvironmentsApi.md#DeleteEnvironment) | **Delete** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**DownloadLogs**](EnvironmentsApi.md#DownloadLogs) | **Get** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**GetEnvironment**](EnvironmentsApi.md#GetEnvironment) | **Get** /api/program/{programId}/environment/{environmentId} | Get Environment
[**GetEnvironmentLogs**](EnvironmentsApi.md#GetEnvironmentLogs) | **Get** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**GetEnvironments**](EnvironmentsApi.md#GetEnvironments) | **Get** /api/program/{programId}/environments | List Environments



## DeleteEnvironment

> Environment DeleteEnvironment(ctx, programId, environmentId, xGwImsOrgId, authorization, xApiKey)

DeleteEnvironment

Delete environment

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the application | 
**environmentId** | **string**| Identifier of the environment | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DownloadLogs

> DownloadLogs(ctx, programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, optional)

Download Logs

Download environment logs

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**environmentId** | **string**| Identifier of the environment | 
**service** | **string**| Name of service | 
**name** | **string**| Name of log | 
**date** | **string**| date for which log is required | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | ***DownloadLogsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a DownloadLogsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------








 **accept** | **optional.String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetEnvironment

> Environment GetEnvironment(ctx, programId, environmentId, xGwImsOrgId, authorization, xApiKey)

Get Environment

Returns an environment by its id

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**environmentId** | **string**| Identifier of the environment | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetEnvironmentLogs

> EnvironmentLogs GetEnvironmentLogs(ctx, programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, optional)

Get Environment Logs

List all logs available in environment

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**environmentId** | **string**| Identifier of the environment | 
**days** | **int32**| number of days for which logs are required | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | ***GetEnvironmentLogsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a GetEnvironmentLogsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------






 **service** | [**optional.Interface of []string**](string.md)| Names of services | 
 **name** | [**optional.Interface of []string**](string.md)| Names of log | 

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetEnvironments

> EnvironmentList GetEnvironments(ctx, programId, xGwImsOrgId, authorization, xApiKey, optional)

List Environments

Lists all environments in an program

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | ***GetEnvironmentsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a GetEnvironmentsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **type_** | **optional.String**| Type of the environment | 

### Return type

[**EnvironmentList**](environmentList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

