# PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancePipelineExecution**](PipelineExecutionApi.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancelPipelineExecutionStep**](PipelineExecutionApi.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**getCurrentExecution**](PipelineExecutionApi.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**getExecution**](PipelineExecutionApi.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**getExecutions**](PipelineExecutionApi.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**getStepLogs**](PipelineExecutionApi.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**startPipeline**](PipelineExecutionApi.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**stepMetric**](PipelineExecutionApi.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**stepState**](PipelineExecutionApi.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state



## advancePipelineExecution

> advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String executionId = null; // String | Identifier of the execution
String phaseId = null; // String | Identifier of the phase
String stepId = null; // String | Identifier of the step
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String contentType = null; // String | Must always be application/json
Object body = null; // Object | Input for advance. See documentation for details.
try {
    apiInstance.advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#advancePipelineExecution");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **executionId** | **String**| Identifier of the execution | [default to null]
 **phaseId** | **String**| Identifier of the phase | [default to null]
 **stepId** | **String**| Identifier of the step | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **contentType** | **String**| Must always be application/json | [default to null]
 **body** | **Object**| Input for advance. See documentation for details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## cancelPipelineExecutionStep

> cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String executionId = null; // String | Identifier of the execution
String phaseId = null; // String | Identifier of the phase
String stepId = null; // String | Identifier of the step
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String contentType = null; // String | Must always be application/json
Object body = null; // Object | Input for advance. See documentation for details.
try {
    apiInstance.cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#cancelPipelineExecutionStep");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **executionId** | **String**| Identifier of the execution | [default to null]
 **phaseId** | **String**| Identifier of the phase | [default to null]
 **stepId** | **String**| Identifier of the step | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **contentType** | **String**| Must always be application/json | [default to null]
 **body** | **Object**| Input for advance. See documentation for details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## getCurrentExecution

> PipelineExecution getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Get current pipeline execution

Returns current pipeline execution if any.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    PipelineExecution result = apiInstance.getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#getCurrentExecution");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getExecution

> PipelineExecution getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey)

Get pipeline execution

Returns a pipeline execution by id

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String executionId = null; // String | Identifier of the execution
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    PipelineExecution result = apiInstance.getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#getExecution");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **executionId** | **String**| Identifier of the execution | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getExecutions

> PipelineExecutionListRepresentation getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String start = null; // String | Pagination start parameter
Integer limit = null; // Integer | Pagination limit parameter
try {
    PipelineExecutionListRepresentation result = apiInstance.getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#getExecutions");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **start** | **String**| Pagination start parameter | [optional] [default to null]
 **limit** | **Integer**| Pagination limit parameter | [optional] [default to null]

### Return type

[**PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStepLogs

> getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept)

Get logs

Get the logs associated with a step.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String executionId = null; // String | Identifier of the execution
String phaseId = null; // String | Identifier of the phase
String stepId = null; // String | Identifier of the step
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String file = null; // String | Identifier of the log file
String accept = null; // String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
try {
    apiInstance.getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#getStepLogs");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **executionId** | **String**| Identifier of the execution | [default to null]
 **phaseId** | **String**| Identifier of the phase | [default to null]
 **stepId** | **String**| Identifier of the step | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **file** | **String**| Identifier of the log file | [optional] [default to null]
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## startPipeline

> startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String contentType = null; // String | Must always be application/json
try {
    apiInstance.startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#startPipeline");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **contentType** | **String**| Must always be application/json | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## stepMetric

> PipelineStepMetrics stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)

Get step metrics

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String executionId = null; // String | Identifier of the execution
String phaseId = null; // String | Identifier of the phase
String stepId = null; // String | Identifier of the step
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    PipelineStepMetrics result = apiInstance.stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#stepMetric");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **executionId** | **String**| Identifier of the execution | [default to null]
 **phaseId** | **String**| Identifier of the phase | [default to null]
 **stepId** | **String**| Identifier of the step | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PipelineStepMetrics**](PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## stepState

> PipelineExecutionStepState stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)

Get step state

### Example

```java
// Import classes:
//import org.openapitools.client.api.PipelineExecutionApi;

PipelineExecutionApi apiInstance = new PipelineExecutionApi();
String programId = null; // String | Identifier of the program.
String pipelineId = null; // String | Identifier of the pipeline
String executionId = null; // String | Identifier of the execution
String phaseId = null; // String | Identifier of the phase
String stepId = null; // String | Identifier of the step
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    PipelineExecutionStepState result = apiInstance.stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelineExecutionApi#stepState");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **pipelineId** | **String**| Identifier of the pipeline | [default to null]
 **executionId** | **String**| Identifier of the execution | [default to null]
 **phaseId** | **String**| Identifier of the phase | [default to null]
 **stepId** | **String**| Identifier of the step | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PipelineExecutionStepState**](PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

