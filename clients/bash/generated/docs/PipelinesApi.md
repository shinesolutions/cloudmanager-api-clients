# PipelinesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePipeline**](PipelinesApi.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**getPipeline**](PipelinesApi.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**getPipelines**](PipelinesApi.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patchPipeline**](PipelinesApi.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline



## deletePipeline

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example

```bash
 deletePipeline programId=value pipelineId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **pipelineId** | **string** | Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPipeline

Get Pipeline

Returns a pipeline by its id

### Example

```bash
 getPipeline programId=value pipelineId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **pipelineId** | **string** | Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPipelines

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example

```bash
 getPipelines programId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## patchPipeline

Patches Pipeline

Patches a pipeline within an program.

### Example

```bash
 patchPipeline programId=value pipelineId=value x-gw-ims-org-id:value Authorization:value x-api-key:value Content-Type:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **pipelineId** | **string** | Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **contentType** | **string** | Must always be application/json | [default to null]
 **body** | [**Pipeline**](Pipeline.md) | The updated Pipeline |

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

