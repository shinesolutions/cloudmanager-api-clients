# \VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEnvironmentVariables**](VariablesApi.md#GetEnvironmentVariables) | **Get** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**PatchEnvironmentVariables**](VariablesApi.md#PatchEnvironmentVariables) | **Patch** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables



## GetEnvironmentVariables

> VariableList GetEnvironmentVariables(ctx, programId, environmentId, xGwImsOrgId, authorization, xApiKey)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

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

[**VariableList**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PatchEnvironmentVariables

> VariableList PatchEnvironmentVariables(ctx, programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**environmentId** | **string**| Identifier of the environment | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
**contentType** | **string**| Must always be application/json | 
**body** | [**[]Variable**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**VariableList**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

