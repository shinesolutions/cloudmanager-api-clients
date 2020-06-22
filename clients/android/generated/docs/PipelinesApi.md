# PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePipeline**](PipelinesApi.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**getPipeline**](PipelinesApi.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**getPipelines**](PipelinesApi.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patchPipeline**](PipelinesApi.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline



## deletePipeline

> deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelinesApi;

PipelinesApi apiInstance = new PipelinesApi();
String programId = null; // String | Identifier of the program
String pipelineId = null; // String | Identifier of the pipeline
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    apiInstance.deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#deletePipeline");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getPipeline

> Pipeline getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Get Pipeline

Returns a pipeline by its id

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelinesApi;

PipelinesApi apiInstance = new PipelinesApi();
String programId = null; // String | Identifier of the program
String pipelineId = null; // String | Identifier of the pipeline
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    Pipeline result = apiInstance.getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipeline");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPipelines

> PipelineList getPipelines(programId, xGwImsOrgId, authorization, xApiKey)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelinesApi;

PipelinesApi apiInstance = new PipelinesApi();
String programId = null; // String | Identifier of the program
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    PipelineList result = apiInstance.getPipelines(programId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#getPipelines");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patchPipeline

> Pipeline patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Patches Pipeline

Patches a pipeline within an program.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelinesApi;

PipelinesApi apiInstance = new PipelinesApi();
String programId = null; // String | Identifier of the program
String pipelineId = null; // String | Identifier of the pipeline
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String contentType = null; // String | Must always be application/json
Pipeline body = new Pipeline(); // Pipeline | The updated Pipeline
try {
    Pipeline result = apiInstance.patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#patchPipeline");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **contentType** | **String**| Must always be application/json | [default to null]
 **body** | [**Pipeline**](Pipeline.md)| The updated Pipeline |

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

