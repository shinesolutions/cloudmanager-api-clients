# RepositoriesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRepositories**](RepositoriesApi.md#getRepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**getRepository**](RepositoriesApi.md#getRepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository



## getRepositories

> RepositoryList getRepositories(programId, xGwImsOrgId, authorization, xApiKey)

Lists Repositories

Lists all Repositories in an program

### Example

```java
// Import classes:
//import org.openapitools.client.api.RepositoriesApi;

RepositoriesApi apiInstance = new RepositoriesApi();
String programId = null; // String | Identifier of the program
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    RepositoryList result = apiInstance.getRepositories(programId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#getRepositories");
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

[**RepositoryList**](RepositoryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRepository

> Repository getRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey)

Get Repository

Returns an repository by its id

### Example

```java
// Import classes:
//import org.openapitools.client.api.RepositoriesApi;

RepositoriesApi apiInstance = new RepositoriesApi();
String programId = null; // String | Identifier of the program
String repositoryId = null; // String | Identifier of the repository
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    Repository result = apiInstance.getRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoriesApi#getRepository");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **repositoryId** | **String**| Identifier of the repository | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

