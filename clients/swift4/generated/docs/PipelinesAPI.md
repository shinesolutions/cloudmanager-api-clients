# PipelinesAPI

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePipeline**](PipelinesAPI.md#deletepipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**getPipeline**](PipelinesAPI.md#getpipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**getPipelines**](PipelinesAPI.md#getpipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patchPipeline**](PipelinesAPI.md#patchpipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


# **deletePipeline**
```swift
    open class func deletePipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Delete a Pipeline
PipelinesAPI.deletePipeline(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPipeline**
```swift
    open class func getPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: Pipeline?, _ error: Error?) -> Void)
```

Get Pipeline

Returns a pipeline by its id

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Get Pipeline
PipelinesAPI.getPipeline(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPipelines**
```swift
    open class func getPipelines(programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: PipelineList?, _ error: Error?) -> Void)
```

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// List Pipelines
PipelinesAPI.getPipelines(programId: programId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchPipeline**
```swift
    open class func patchPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Pipeline, completion: @escaping (_ data: Pipeline?, _ error: Error?) -> Void)
```

Patches Pipeline

Patches a pipeline within an program.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example" // String | Must always be application/json
let body = Pipeline(id: "id_example", programId: "programId_example", name: "name_example", trigger: "trigger_example", status: "status_example", createdAt: Date(), updatedAt: Date(), lastStartedAt: Date(), lastFinishedAt: Date(), phases: [pipelinePhase(name: "name_example", type: "type_example", repositoryId: "repositoryId_example", branch: "branch_example", environmentId: "environmentId_example")], links: Pipeline__links(httpNsAdobeComAdobecloudRelProgram: HalLink(href: "href_example", templated: false, type: "type_example", deprecation: "deprecation_example", profile: "profile_example", title: "title_example", hreflang: "hreflang_example", name: "name_example"), httpNsAdobeComAdobecloudRelExecution: HalLink(href: "href_example", templated: false, type: "type_example", deprecation: "deprecation_example", profile: "profile_example", title: "title_example", hreflang: "hreflang_example", name: "name_example"), httpNsAdobeComAdobecloudRelExecutions: HalLink(href: "href_example", templated: false, type: "type_example", deprecation: "deprecation_example", profile: "profile_example", title: "title_example", hreflang: "hreflang_example", name: "name_example"), httpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: HalLink(href: "href_example", templated: false, type: "type_example", deprecation: "deprecation_example", profile: "profile_example", title: "title_example", hreflang: "hreflang_example", name: "name_example"), _self: HalLink(href: "href_example", templated: false, type: "type_example", deprecation: "deprecation_example", profile: "profile_example", title: "title_example", hreflang: "hreflang_example", name: "name_example"))) // Pipeline | The updated Pipeline

// Patches Pipeline
PipelinesAPI.patchPipeline(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, contentType: contentType, body: body) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String** | Must always be application/json | 
 **body** | [**Pipeline**](Pipeline.md) | The updated Pipeline | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

