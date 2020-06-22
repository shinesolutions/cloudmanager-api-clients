# PipelineExecutionAPI

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancePipelineExecution**](PipelineExecutionAPI.md#advancepipelineexecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancelPipelineExecutionStep**](PipelineExecutionAPI.md#cancelpipelineexecutionstep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**getCurrentExecution**](PipelineExecutionAPI.md#getcurrentexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**getExecution**](PipelineExecutionAPI.md#getexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**getExecutions**](PipelineExecutionAPI.md#getexecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**getStepLogs**](PipelineExecutionAPI.md#getsteplogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**startPipeline**](PipelineExecutionAPI.md#startpipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**stepMetric**](PipelineExecutionAPI.md#stepmetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**stepState**](PipelineExecutionAPI.md#stepstate) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state


# **advancePipelineExecution**
```swift
    open class func advancePipelineExecution(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Any, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let executionId = "executionId_example" // String | Identifier of the execution
let phaseId = "phaseId_example" // String | Identifier of the phase
let stepId = "stepId_example" // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example" // String | Must always be application/json
let body = 987 // Any | Input for advance. See documentation for details.

// Advance
PipelineExecutionAPI.advancePipelineExecution(programId: programId, pipelineId: pipelineId, executionId: executionId, phaseId: phaseId, stepId: stepId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, contentType: contentType, body: body) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **executionId** | **String** | Identifier of the execution | 
 **phaseId** | **String** | Identifier of the phase | 
 **stepId** | **String** | Identifier of the step | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String** | Must always be application/json | 
 **body** | **Any** | Input for advance. See documentation for details. | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancelPipelineExecutionStep**
```swift
    open class func cancelPipelineExecutionStep(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Any, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let executionId = "executionId_example" // String | Identifier of the execution
let phaseId = "phaseId_example" // String | Identifier of the phase
let stepId = "stepId_example" // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example" // String | Must always be application/json
let body = 987 // Any | Input for advance. See documentation for details.

// Cancel
PipelineExecutionAPI.cancelPipelineExecutionStep(programId: programId, pipelineId: pipelineId, executionId: executionId, phaseId: phaseId, stepId: stepId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, contentType: contentType, body: body) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **executionId** | **String** | Identifier of the execution | 
 **phaseId** | **String** | Identifier of the phase | 
 **stepId** | **String** | Identifier of the step | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String** | Must always be application/json | 
 **body** | **Any** | Input for advance. See documentation for details. | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCurrentExecution**
```swift
    open class func getCurrentExecution(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: PipelineExecution?, _ error: Error?) -> Void)
```

Get current pipeline execution

Returns current pipeline execution if any.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Get current pipeline execution
PipelineExecutionAPI.getCurrentExecution(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getExecution**
```swift
    open class func getExecution(programId: String, pipelineId: String, executionId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: PipelineExecution?, _ error: Error?) -> Void)
```

Get pipeline execution

Returns a pipeline execution by id

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let executionId = "executionId_example" // String | Identifier of the execution
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Get pipeline execution
PipelineExecutionAPI.getExecution(programId: programId, pipelineId: pipelineId, executionId: executionId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **executionId** | **String** | Identifier of the execution | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getExecutions**
```swift
    open class func getExecutions(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, start: String? = nil, limit: Int? = nil, completion: @escaping (_ data: PipelineExecutionListRepresentation?, _ error: Error?) -> Void)
```

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let start = "start_example" // String | Pagination start parameter (optional)
let limit = 987 // Int | Pagination limit parameter (optional)

// List Executions
PipelineExecutionAPI.getExecutions(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, start: start, limit: limit) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **String** | Pagination start parameter | [optional] 
 **limit** | **Int** | Pagination limit parameter | [optional] 

### Return type

[**PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStepLogs**
```swift
    open class func getStepLogs(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, file: String? = nil, accept: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Get logs

Get the logs associated with a step.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let executionId = "executionId_example" // String | Identifier of the execution
let phaseId = "phaseId_example" // String | Identifier of the phase
let stepId = "stepId_example" // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let file = "file_example" // String | Identifier of the log file (optional)
let accept = "accept_example" // String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)

// Get logs
PipelineExecutionAPI.getStepLogs(programId: programId, pipelineId: pipelineId, executionId: executionId, phaseId: phaseId, stepId: stepId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, file: file, accept: accept) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **executionId** | **String** | Identifier of the execution | 
 **phaseId** | **String** | Identifier of the phase | 
 **stepId** | **String** | Identifier of the step | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **file** | **String** | Identifier of the log file | [optional] 
 **accept** | **String** | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **startPipeline**
```swift
    open class func startPipeline(programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example" // String | Must always be application/json

// Start the pipeline
PipelineExecutionAPI.startPipeline(programId: programId, pipelineId: pipelineId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey, contentType: contentType) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String** | Must always be application/json | 

### Return type

Void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stepMetric**
```swift
    open class func stepMetric(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: PipelineStepMetrics?, _ error: Error?) -> Void)
```

Get step metrics

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let executionId = "executionId_example" // String | Identifier of the execution
let phaseId = "phaseId_example" // String | Identifier of the phase
let stepId = "stepId_example" // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Get step metrics
PipelineExecutionAPI.stepMetric(programId: programId, pipelineId: pipelineId, executionId: executionId, phaseId: phaseId, stepId: stepId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **executionId** | **String** | Identifier of the execution | 
 **phaseId** | **String** | Identifier of the phase | 
 **stepId** | **String** | Identifier of the step | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineStepMetrics**](PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stepState**
```swift
    open class func stepState(programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, completion: @escaping (_ data: PipelineExecutionStepState?, _ error: Error?) -> Void)
```

Get step state

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let programId = "programId_example" // String | Identifier of the program.
let pipelineId = "pipelineId_example" // String | Identifier of the pipeline
let executionId = "executionId_example" // String | Identifier of the execution
let phaseId = "phaseId_example" // String | Identifier of the phase
let stepId = "stepId_example" // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example" // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example" // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example" // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

// Get step state
PipelineExecutionAPI.stepState(programId: programId, pipelineId: pipelineId, executionId: executionId, phaseId: phaseId, stepId: stepId, xGwImsOrgId: xGwImsOrgId, authorization: authorization, xApiKey: xApiKey) { (response, error) in
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
 **pipelineId** | **String** | Identifier of the pipeline | 
 **executionId** | **String** | Identifier of the execution | 
 **phaseId** | **String** | Identifier of the phase | 
 **stepId** | **String** | Identifier of the step | 
 **xGwImsOrgId** | **String** | IMS organization ID that the request is being made under. | 
 **authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecutionStepState**](PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

