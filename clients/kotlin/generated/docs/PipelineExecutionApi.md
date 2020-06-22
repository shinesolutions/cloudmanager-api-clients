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


<a name="advancePipelineExecution"></a>
# **advancePipelineExecution**
> advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType, body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val executionId : kotlin.String = executionId_example // kotlin.String | Identifier of the execution
val phaseId : kotlin.String = phaseId_example // kotlin.String | Identifier of the phase
val stepId : kotlin.String = stepId_example // kotlin.String | Identifier of the step
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | Must always be application/json
val body : kotlin.Any = Object // kotlin.Any | Input for advance. See documentation for details.
try {
    apiInstance.advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType, body)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#advancePipelineExecution")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#advancePipelineExecution")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **executionId** | **kotlin.String**| Identifier of the execution |
 **phaseId** | **kotlin.String**| Identifier of the phase |
 **stepId** | **kotlin.String**| Identifier of the step |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentMinusType** | **kotlin.String**| Must always be application/json |
 **body** | **kotlin.Any**| Input for advance. See documentation for details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="cancelPipelineExecutionStep"></a>
# **cancelPipelineExecutionStep**
> cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType, body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val executionId : kotlin.String = executionId_example // kotlin.String | Identifier of the execution
val phaseId : kotlin.String = phaseId_example // kotlin.String | Identifier of the phase
val stepId : kotlin.String = stepId_example // kotlin.String | Identifier of the step
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | Must always be application/json
val body : kotlin.Any = Object // kotlin.Any | Input for advance. See documentation for details.
try {
    apiInstance.cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType, body)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#cancelPipelineExecutionStep")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#cancelPipelineExecutionStep")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **executionId** | **kotlin.String**| Identifier of the execution |
 **phaseId** | **kotlin.String**| Identifier of the phase |
 **stepId** | **kotlin.String**| Identifier of the step |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentMinusType** | **kotlin.String**| Must always be application/json |
 **body** | **kotlin.Any**| Input for advance. See documentation for details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getCurrentExecution"></a>
# **getCurrentExecution**
> PipelineExecution getCurrentExecution(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Get current pipeline execution

Returns current pipeline execution if any.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : PipelineExecution = apiInstance.getCurrentExecution(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#getCurrentExecution")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#getCurrentExecution")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExecution"></a>
# **getExecution**
> PipelineExecution getExecution(programId, pipelineId, executionId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Get pipeline execution

Returns a pipeline execution by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val executionId : kotlin.String = executionId_example // kotlin.String | Identifier of the execution
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : PipelineExecution = apiInstance.getExecution(programId, pipelineId, executionId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#getExecution")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#getExecution")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **executionId** | **kotlin.String**| Identifier of the execution |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExecutions"></a>
# **getExecutions**
> PipelineExecutionListRepresentation getExecutions(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, start, limit)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val start : kotlin.String = start_example // kotlin.String | Pagination start parameter
val limit : kotlin.Int = 56 // kotlin.Int | Pagination limit parameter
try {
    val result : PipelineExecutionListRepresentation = apiInstance.getExecutions(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, start, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#getExecutions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#getExecutions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **start** | **kotlin.String**| Pagination start parameter | [optional]
 **limit** | **kotlin.Int**| Pagination limit parameter | [optional]

### Return type

[**PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStepLogs"></a>
# **getStepLogs**
> getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, file, accept)

Get logs

Get the logs associated with a step.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val executionId : kotlin.String = executionId_example // kotlin.String | Identifier of the execution
val phaseId : kotlin.String = phaseId_example // kotlin.String | Identifier of the phase
val stepId : kotlin.String = stepId_example // kotlin.String | Identifier of the step
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val file : kotlin.String = file_example // kotlin.String | Identifier of the log file
val accept : kotlin.String = accept_example // kotlin.String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
try {
    apiInstance.getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, file, accept)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#getStepLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#getStepLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **executionId** | **kotlin.String**| Identifier of the execution |
 **phaseId** | **kotlin.String**| Identifier of the phase |
 **stepId** | **kotlin.String**| Identifier of the step |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **file** | **kotlin.String**| Identifier of the log file | [optional]
 **accept** | **kotlin.String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="startPipeline"></a>
# **startPipeline**
> startPipeline(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | Must always be application/json
try {
    apiInstance.startPipeline(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#startPipeline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#startPipeline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentMinusType** | **kotlin.String**| Must always be application/json |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="stepMetric"></a>
# **stepMetric**
> PipelineStepMetrics stepMetric(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Get step metrics

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val executionId : kotlin.String = executionId_example // kotlin.String | Identifier of the execution
val phaseId : kotlin.String = phaseId_example // kotlin.String | Identifier of the phase
val stepId : kotlin.String = stepId_example // kotlin.String | Identifier of the step
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : PipelineStepMetrics = apiInstance.stepMetric(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#stepMetric")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#stepMetric")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **executionId** | **kotlin.String**| Identifier of the execution |
 **phaseId** | **kotlin.String**| Identifier of the phase |
 **stepId** | **kotlin.String**| Identifier of the step |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**PipelineStepMetrics**](PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stepState"></a>
# **stepState**
> PipelineExecutionStepState stepState(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Get step state

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelineExecutionApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val executionId : kotlin.String = executionId_example // kotlin.String | Identifier of the execution
val phaseId : kotlin.String = phaseId_example // kotlin.String | Identifier of the phase
val stepId : kotlin.String = stepId_example // kotlin.String | Identifier of the step
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : PipelineExecutionStepState = apiInstance.stepState(programId, pipelineId, executionId, phaseId, stepId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PipelineExecutionApi#stepState")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelineExecutionApi#stepState")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **executionId** | **kotlin.String**| Identifier of the execution |
 **phaseId** | **kotlin.String**| Identifier of the phase |
 **stepId** | **kotlin.String**| Identifier of the step |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**PipelineExecutionStepState**](PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

