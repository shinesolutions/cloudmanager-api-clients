# VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentVariables**](VariablesApi.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patchEnvironmentVariables**](VariablesApi.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


<a name="getEnvironmentVariables"></a>
# **getEnvironmentVariables**
> VariableList getEnvironmentVariables(programId, environmentId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VariablesApi()
val programId : kotlin.String = 2351 // kotlin.String | Identifier of the program
val environmentId : kotlin.String = 128 // kotlin.String | Identifier of the environment
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : VariableList = apiInstance.getEnvironmentVariables(programId, environmentId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VariablesApi#getEnvironmentVariables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VariablesApi#getEnvironmentVariables")
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

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchEnvironmentVariables"></a>
# **patchEnvironmentVariables**
> VariableList patchEnvironmentVariables(programId, environmentId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType, body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VariablesApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program
val environmentId : kotlin.String = environmentId_example // kotlin.String | Identifier of the environment
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
val contentMinusType : kotlin.String = contentMinusType_example // kotlin.String | Must always be application/json
val body : kotlin.Array<Variable> =  // kotlin.Array<Variable> | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.
try {
    val result : VariableList = apiInstance.patchEnvironmentVariables(programId, environmentId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey, contentMinusType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VariablesApi#patchEnvironmentVariables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VariablesApi#patchEnvironmentVariables")
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
 **contentMinusType** | **kotlin.String**| Must always be application/json |
 **body** | [**kotlin.Array&lt;Variable&gt;**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. |

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

