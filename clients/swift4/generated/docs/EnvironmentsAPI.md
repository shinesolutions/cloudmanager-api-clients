# EnvironmentsAPI

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvironment**](EnvironmentsAPI.md#deleteenvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**downloadLogs**](EnvironmentsAPI.md#downloadlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**getEnvironment**](EnvironmentsAPI.md#getenvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**getEnvironmentLogs**](EnvironmentsAPI.md#getenvironmentlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**getEnvironments**](EnvironmentsAPI.md#getenvironments) | **GET** /api/program/{programId}/environments | List Environments


# **deleteEnvironment**
```swift
    open class func deleteEnvironment(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: Environment?, _ error: Error?) -> Void)
```

DeleteEnvironment

Delete environment

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the application
let environmentId = "environmentId_example" // String | Identifier of the environment
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// DeleteEnvironment
EnvironmentsAPI.deleteEnvironment(programId: programId, environmentId: environmentId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **programId** | **String** | Identifier of the application | 
 **environmentId** | **String** | Identifier of the environment | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **downloadLogs**
```swift
    open class func downloadLogs(programId: String, environmentId: String, service: String, name: String, date: String, xGwImsOrgId: String, authorization: String, xApiKey: String, accept: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Download Logs

Download environment logs

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let environmentId = "environmentId_example" // String | Identifier of the environment
let service = "service_example" // String | Name of service
let name = "name_example" // String | Name of log
let date = "date_example" // String | date for which log is required
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let accept = "accept_example" // String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)

// Download Logs
EnvironmentsAPI.downloadLogs(programId: programId, environmentId: environmentId, service: service, name: name, date: date, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, accept: accept) { (response, error) in
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
 **service** | **String** | Name of service | 
 **name** | **String** | Name of log | 
 **date** | **String** | date for which log is required | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **String** | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironment**
```swift
    open class func getEnvironment(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: Environment?, _ error: Error?) -> Void)
```

Get Environment

Returns an environment by its id

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let environmentId = "environmentId_example" // String | Identifier of the environment
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Get Environment
EnvironmentsAPI.getEnvironment(programId: programId, environmentId: environmentId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironmentLogs**
```swift
    open class func getEnvironmentLogs(programId: String, environmentId: String, days: Int, xGwImsOrgId: String, authorization: String, xApiKey: String, service: [String]? = nil, name: [String]? = nil, completion: @escaping (_ data: EnvironmentLogs?, _ error: Error?) -> Void)
```

Get Environment Logs

List all logs available in environment

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let environmentId = "environmentId_example" // String | Identifier of the environment
let days = 987 // Int | number of days for which logs are required
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let service = ["inner_example"] // [String] | Names of services (optional)
let name = ["inner_example"] // [String] | Names of log (optional)

// Get Environment Logs
EnvironmentsAPI.getEnvironmentLogs(programId: programId, environmentId: environmentId, days: days, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, service: service, name: name) { (response, error) in
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
 **days** | **Int** | number of days for which logs are required | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | [**[String]**](String.md) | Names of services | [optional] 
 **name** | [**[String]**](String.md) | Names of log | [optional] 

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironments**
```swift
    open class func getEnvironments(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, type: ModelType_getEnvironments? = nil, completion: @escaping (_ data: EnvironmentList?, _ error: Error?) -> Void)
```

List Environments

Lists all environments in an program

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let type = "type_example" // String | Type of the environment (optional)

// List Environments
EnvironmentsAPI.getEnvironments(programId: programId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, type: type) { (response, error) in
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
 **type** | **String** | Type of the environment | [optional] 

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

