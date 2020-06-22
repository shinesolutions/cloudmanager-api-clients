# \PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeletePipeline**](PipelinesApi.md#DeletePipeline) | **Delete** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**GetPipeline**](PipelinesApi.md#GetPipeline) | **Get** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**GetPipelines**](PipelinesApi.md#GetPipelines) | **Get** /api/program/{programId}/pipelines | List Pipelines
[**PatchPipeline**](PipelinesApi.md#PatchPipeline) | **Patch** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline



## DeletePipeline

> DeletePipeline(ctx, programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**pipelineId** | **string**| Identifier of the pipeline | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPipeline

> Pipeline GetPipeline(ctx, programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Get Pipeline

Returns a pipeline by its id

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**pipelineId** | **string**| Identifier of the pipeline | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPipelines

> PipelineList GetPipelines(ctx, programId, xGwImsOrgId, authorization, xApiKey)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineList**](pipelineList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PatchPipeline

> Pipeline PatchPipeline(ctx, programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Patches Pipeline

Patches a pipeline within an program.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program | 
**pipelineId** | **string**| Identifier of the pipeline | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
**contentType** | **string**| Must always be application/json | 
**body** | [**Pipeline**](Pipeline.md)| The updated Pipeline | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

