# \ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteProgram**](ProgramsApi.md#DeleteProgram) | **Delete** /api/program/{programId} | Delete Program
[**GetProgram**](ProgramsApi.md#GetProgram) | **Get** /api/program/{programId} | Get Program
[**GetPrograms**](ProgramsApi.md#GetPrograms) | **Get** /api/programs | Lists Programs



## DeleteProgram

> Program DeleteProgram(ctx, programId, xGwImsOrgId, authorization, xApiKey)

Delete Program

Delete an program

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetProgram

> Program GetProgram(ctx, programId, xGwImsOrgId, authorization, xApiKey)

Get Program

Returns a program by its id

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPrograms

> ProgramList GetPrograms(ctx, xGwImsOrgId, authorization, xApiKey)

Lists Programs

Returns all programs that the requesting user has access to

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**ProgramList**](programList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

