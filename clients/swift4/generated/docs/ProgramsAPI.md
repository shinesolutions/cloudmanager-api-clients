# ProgramsAPI

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProgram**](ProgramsAPI.md#deleteprogram) | **DELETE** /api/program/{programId} | Delete Program
[**getProgram**](ProgramsAPI.md#getprogram) | **GET** /api/program/{programId} | Get Program
[**getPrograms**](ProgramsAPI.md#getprograms) | **GET** /api/programs | Lists Programs


# **deleteProgram**
```swift
    open class func deleteProgram(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: Program?, _ error: Error?) -> Void)
```

Delete Program

Delete an program

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Delete Program
ProgramsAPI.deleteProgram(programId: programId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getProgram**
```swift
    open class func getProgram(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: Program?, _ error: Error?) -> Void)
```

Get Program

Returns a program by its id

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Get Program
ProgramsAPI.getProgram(programId: programId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPrograms**
```swift
    open class func getPrograms(xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: ProgramList?, _ error: Error?) -> Void)
```

Lists Programs

Returns all programs that the requesting user has access to

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Lists Programs
ProgramsAPI.getPrograms(xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**ProgramList**](ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

