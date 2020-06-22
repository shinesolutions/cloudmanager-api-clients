# BranchesAPI

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesAPI.md#getbranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


# **getBranches**
```swift
    open class func getBranches(programId: String, repositoryId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: BranchList?, _ error: Error?) -> Void)
```

List Branches

Returns the list of branches from a repository

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let repositoryId = "repositoryId_example" // String | Identifier of the repository
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// List Branches
BranchesAPI.getBranches(programId: programId, repositoryId: repositoryId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **programId** | **String** | Identifier of the program. | 
 **repositoryId** | **String** | Identifier of the repository | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

