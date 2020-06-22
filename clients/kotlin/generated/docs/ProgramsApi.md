# ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProgram**](ProgramsApi.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
[**getProgram**](ProgramsApi.md#getProgram) | **GET** /api/program/{programId} | Get Program
[**getPrograms**](ProgramsApi.md#getPrograms) | **GET** /api/programs | Lists Programs


<a name="deleteProgram"></a>
# **deleteProgram**
> Program deleteProgram(programId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Delete Program

Delete an program

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProgramsApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : Program = apiInstance.deleteProgram(programId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProgramsApi#deleteProgram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProgramsApi#deleteProgram")
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

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProgram"></a>
# **getProgram**
> Program getProgram(programId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Get Program

Returns a program by its id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProgramsApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : Program = apiInstance.getProgram(programId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProgramsApi#getProgram")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProgramsApi#getProgram")
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

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPrograms"></a>
# **getPrograms**
> ProgramList getPrograms(xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Lists Programs

Returns all programs that the requesting user has access to

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProgramsApi()
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : ProgramList = apiInstance.getPrograms(xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProgramsApi#getPrograms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProgramsApi#getPrograms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**ProgramList**](ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

