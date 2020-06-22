# BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches



## getBranches

> BranchList getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey)

List Branches

Returns the list of branches from a repository

### Example

```java
// Import classes:
//import org.openapitools.client.api.BranchesApi;

BranchesApi apiInstance = new BranchesApi();
String programId = null; // String | Identifier of the program.
String repositoryId = null; // String | Identifier of the repository
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    BranchList result = apiInstance.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BranchesApi#getBranches");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | [default to null]
 **repositoryId** | **String**| Identifier of the repository | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

