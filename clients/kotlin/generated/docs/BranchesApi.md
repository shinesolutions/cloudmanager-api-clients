# BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


<a name="getBranches"></a>
# **getBranches**
> BranchList getBranches(programId, repositoryId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)

List Branches

Returns the list of branches from a repository

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BranchesApi()
val programId : kotlin.String = programId_example // kotlin.String | Identifier of the program.
val repositoryId : kotlin.String = repositoryId_example // kotlin.String | Identifier of the repository
val xMinusGwMinusImsMinusOrgMinusId : kotlin.String = xMinusGwMinusImsMinusOrgMinusId_example // kotlin.String | IMS organization ID that the request is being made under.
val authorization : kotlin.String = authorization_example // kotlin.String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
val xMinusApiMinusKey : kotlin.String = xMinusApiMinusKey_example // kotlin.String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    val result : BranchList = apiInstance.getBranches(programId, repositoryId, xMinusGwMinusImsMinusOrgMinusId, authorization, xMinusApiMinusKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#getBranches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#getBranches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **kotlin.String**| Identifier of the program. |
 **repositoryId** | **kotlin.String**| Identifier of the repository |
 **xMinusGwMinusImsMinusOrgMinusId** | **kotlin.String**| IMS organization ID that the request is being made under. |
 **authorization** | **kotlin.String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xMinusApiMinusKey** | **kotlin.String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

