# EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvironment**](EnvironmentsApi.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**downloadLogs**](EnvironmentsApi.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**getEnvironment**](EnvironmentsApi.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**getEnvironmentLogs**](EnvironmentsApi.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**getEnvironments**](EnvironmentsApi.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments


<a name="deleteEnvironment"></a>
# **deleteEnvironment**
> Environment deleteEnvironment(programId, environmentId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

DeleteEnvironment

Delete environment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the application
val environmentId : kotlin.String = environmentId_example // kotlin.String | Identifier of the environment
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : Environment = apiInstance.deleteEnvironment(programId, environmentId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#deleteEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#deleteEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the application |
 **environmentId** | **kotlin.String**| Identifier of the environment |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadLogs"></a>
# **downloadLogs**
> downloadLogs(programId, environmentId, service, name, date, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, accept)

Download Logs

Download environment logs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val environmentId : kotlin.String = environmentId_example // kotlin.String | Identifier of the environment
val service : kotlin.String = service_example // kotlin.String | Name of service
val name : kotlin.String = name_example // kotlin.String | Name of log
val date : kotlin.String = date_example // kotlin.String | date for which log is required
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val accept : kotlin.String = accept_example // kotlin.String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
try {
    apiInstance.downloadLogs(programId, environmentId, service, name, date, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, accept)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#downloadLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#downloadLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program |
 **environmentId** | **kotlin.String**| Identifier of the environment |
 **service** | **kotlin.String**| Name of service |
 **name** | **kotlin.String**| Name of log |
 **date** | **kotlin.String**| date for which log is required |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **accept** | **kotlin.String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironment"></a>
# **getEnvironment**
> Environment getEnvironment(programId, environmentId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

Get Environment

Returns an environment by its id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val environmentId : kotlin.String = environmentId_example // kotlin.String | Identifier of the environment
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : Environment = apiInstance.getEnvironment(programId, environmentId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#getEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#getEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program |
 **environmentId** | **kotlin.String**| Identifier of the environment |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironmentLogs"></a>
# **getEnvironmentLogs**
> EnvironmentLogs getEnvironmentLogs(programId, environmentId, days, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, service, name)

Get Environment Logs

List all logs available in environment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val environmentId : kotlin.String = environmentId_example // kotlin.String | Identifier of the environment
val days : kotlin.Int = 56 // kotlin.Int | number of days for which logs are required
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val service : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Names of services
val name : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Names of log
try {
    val result : EnvironmentLogs = apiInstance.getEnvironmentLogs(programId, environmentId, days, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, service, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#getEnvironmentLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#getEnvironmentLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program |
 **environmentId** | **kotlin.String**| Identifier of the environment |
 **days** | **kotlin.Int**| number of days for which logs are required |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **service** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Names of services | [optional]
 **name** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Names of log | [optional]

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironments"></a>
# **getEnvironments**
> EnvironmentList getEnvironments(programId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, type)

List Environments

Lists all environments in an program

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val type : kotlin.String = type_example // kotlin.String | Type of the environment
try {
    val result : EnvironmentList = apiInstance.getEnvironments(programId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#getEnvironments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#getEnvironments")
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
 **type** | **kotlin.String**| Type of the environment | [optional] [enum: dev, stage, prod]

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

