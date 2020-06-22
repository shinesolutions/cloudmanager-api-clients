# VariablesAPI

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentVariables**](VariablesAPI.md#getenvironmentvariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patchEnvironmentVariables**](VariablesAPI.md#patchenvironmentvariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


# **getEnvironmentVariables**
```swift
    open class func getEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: VariableList?, _ error: Error?) -> Void)
```

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let environmentId = "environmentId_example" // String | Identifier of the environment
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// List User Environment Variables
VariablesAPI.getEnvironmentVariables(programId: programId, environmentId: environmentId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **environmentId** | **String** | Identifier of the environment | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchEnvironmentVariables**
```swift
    open class func patchEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: [Variable], completion: @escaping (_ data: VariableList?, _ error: Error?) -> Void)
```

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let environmentId = "environmentId_example" // String | Identifier of the environment
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example" // String | Must always be application/json
let body = [Variable(name: "name_example", value: "value_example", type: "type_example")] // [Variable] | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.

// Patch User Environment Variables
VariablesAPI.patchEnvironmentVariables(programId: programId, environmentId: environmentId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, contentType: contentType, body: body) { (response, error) in
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
 **environmentId** | **String** | Identifier of the environment | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String** | Must always be application/json | 
 **body** | [**[Variable]**](Variable.md) | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

