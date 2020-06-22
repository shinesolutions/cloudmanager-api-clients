# PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePipeline**](PipelinesApi.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**getPipeline**](PipelinesApi.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**getPipelines**](PipelinesApi.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patchPipeline**](PipelinesApi.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


<a name="deletePipeline"></a>
# **deletePipeline**
> deletePipeline(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelinesApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    apiInstance.deletePipeline(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
} catch (e: ClientException) {
    println("4xx response calling PipelinesApi#deletePipeline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelinesApi#deletePipeline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPipeline"></a>
# **getPipeline**
> Pipeline getPipeline(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Get Pipeline

Returns a pipeline by its id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelinesApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : Pipeline = apiInstance.getPipeline(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PipelinesApi#getPipeline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelinesApi#getPipeline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPipelines"></a>
# **getPipelines**
> PipelineList getPipelines(programId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelinesApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : PipelineList = apiInstance.getPipelines(programId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PipelinesApi#getPipelines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelinesApi#getPipelines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchPipeline"></a>
# **patchPipeline**
> Pipeline patchPipeline(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType, body)

Patches Pipeline

Patches a pipeline within an program.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PipelinesApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val pipelineId : kotlin.String = pipelineId_example // kotlin.String | Identifier of the pipeline
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | Must always be application/json
val body : Pipeline =  // Pipeline | The updated Pipeline
try {
    val result : Pipeline = apiInstance.patchPipeline(programId, pipelineId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PipelinesApi#patchPipeline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PipelinesApi#patchPipeline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program |
 **pipelineId** | **kotlin.String**| Identifier of the pipeline |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentMinusType** | **kotlin.String**| Must always be application/json |
 **body** | [**Pipeline**](Pipeline.md)| The updated Pipeline |

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

