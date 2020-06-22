# RepositoriesAPI

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRepositories**](RepositoriesAPI.md#getrepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**getRepository**](RepositoriesAPI.md#getrepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository


# **getRepositories**
```swift
    open class func getRepositories(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: RepositoryList?, _ error: Error?) -> Void)
```

Lists Repositories

Lists all Repositories in an program

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Lists Repositories
RepositoriesAPI.getRepositories(programId: programId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String** | Identifier of the program | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**RepositoryList**](RepositoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRepository**
```swift
    open class func getRepository(programId: String, repositoryId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: Repository?, _ error: Error?) -> Void)
```

Get Repository

Returns an repository by its id

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let repositoryId = "repositoryId_example" // String | Identifier of the repository
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Get Repository
RepositoriesAPI.getRepository(programId: programId, repositoryId: repositoryId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String** | Identifier of the program | 
 **repositoryId** | **String** | Identifier of the repository | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

