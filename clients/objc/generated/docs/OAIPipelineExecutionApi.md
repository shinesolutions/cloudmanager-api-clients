# OAIPipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancePipelineExecution**](OAIPipelineExecutionApi.md#advancepipelineexecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancelPipelineExecutionStep**](OAIPipelineExecutionApi.md#cancelpipelineexecutionstep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**getCurrentExecution**](OAIPipelineExecutionApi.md#getcurrentexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**getExecution**](OAIPipelineExecutionApi.md#getexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**getExecutions**](OAIPipelineExecutionApi.md#getexecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**getStepLogs**](OAIPipelineExecutionApi.md#getsteplogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**startPipeline**](OAIPipelineExecutionApi.md#startpipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**stepMetric**](OAIPipelineExecutionApi.md#stepmetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**stepState**](OAIPipelineExecutionApi.md#stepstate) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state


# **advancePipelineExecution**
```objc
-(NSURLSessionTask*) advancePipelineExecutionWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    contentType: (NSString*) contentType
    body: (NSObject*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* executionId = @"executionId_example"; // Identifier of the execution
NSString* phaseId = @"phaseId_example"; // Identifier of the phase
NSString* stepId = @"stepId_example"; // Identifier of the step
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* contentType = @"contentType_example"; // Must always be application/json
NSObject* body = NULL; // Input for advance. See documentation for details.

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// Advance
[apiInstance advancePipelineExecutionWithProgramId:programId
              pipelineId:pipelineId
              executionId:executionId
              phaseId:phaseId
              stepId:stepId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              contentType:contentType
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->advancePipelineExecution: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **executionId** | **NSString***| Identifier of the execution | 
 **phaseId** | **NSString***| Identifier of the phase | 
 **stepId** | **NSString***| Identifier of the step | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **NSString***| Must always be application/json | 
 **body** | **NSObject***| Input for advance. See documentation for details. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancelPipelineExecutionStep**
```objc
-(NSURLSessionTask*) cancelPipelineExecutionStepWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    contentType: (NSString*) contentType
    body: (NSObject*) body
        completionHandler: (void (^)(NSError* error)) handler;
```

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* executionId = @"executionId_example"; // Identifier of the execution
NSString* phaseId = @"phaseId_example"; // Identifier of the phase
NSString* stepId = @"stepId_example"; // Identifier of the step
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* contentType = @"contentType_example"; // Must always be application/json
NSObject* body = NULL; // Input for advance. See documentation for details.

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// Cancel
[apiInstance cancelPipelineExecutionStepWithProgramId:programId
              pipelineId:pipelineId
              executionId:executionId
              phaseId:phaseId
              stepId:stepId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              contentType:contentType
              body:body
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->cancelPipelineExecutionStep: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **executionId** | **NSString***| Identifier of the execution | 
 **phaseId** | **NSString***| Identifier of the phase | 
 **stepId** | **NSString***| Identifier of the step | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **NSString***| Must always be application/json | 
 **body** | **NSObject***| Input for advance. See documentation for details. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCurrentExecution**
```objc
-(NSURLSessionTask*) getCurrentExecutionWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIPipelineExecution* output, NSError* error)) handler;
```

Get current pipeline execution

Returns current pipeline execution if any.

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// Get current pipeline execution
[apiInstance getCurrentExecutionWithProgramId:programId
              pipelineId:pipelineId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIPipelineExecution* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->getCurrentExecution: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIPipelineExecution***](OAIPipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getExecution**
```objc
-(NSURLSessionTask*) getExecutionWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIPipelineExecution* output, NSError* error)) handler;
```

Get pipeline execution

Returns a pipeline execution by id

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* executionId = @"executionId_example"; // Identifier of the execution
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// Get pipeline execution
[apiInstance getExecutionWithProgramId:programId
              pipelineId:pipelineId
              executionId:executionId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIPipelineExecution* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->getExecution: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **executionId** | **NSString***| Identifier of the execution | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIPipelineExecution***](OAIPipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getExecutions**
```objc
-(NSURLSessionTask*) getExecutionsWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    start: (NSString*) start
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIPipelineExecutionListRepresentation* output, NSError* error)) handler;
```

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* start = @"start_example"; // Pagination start parameter (optional)
NSNumber* limit = @56; // Pagination limit parameter (optional)

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// List Executions
[apiInstance getExecutionsWithProgramId:programId
              pipelineId:pipelineId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              start:start
              limit:limit
          completionHandler: ^(OAIPipelineExecutionListRepresentation* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->getExecutions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **NSString***| Pagination start parameter | [optional] 
 **limit** | **NSNumber***| Pagination limit parameter | [optional] 

### Return type

[**OAIPipelineExecutionListRepresentation***](OAIPipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStepLogs**
```objc
-(NSURLSessionTask*) getStepLogsWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    file: (NSString*) file
    accept: (NSString*) accept
        completionHandler: (void (^)(NSError* error)) handler;
```

Get logs

Get the logs associated with a step.

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* executionId = @"executionId_example"; // Identifier of the execution
NSString* phaseId = @"phaseId_example"; // Identifier of the phase
NSString* stepId = @"stepId_example"; // Identifier of the step
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* file = @"file_example"; // Identifier of the log file (optional)
NSString* accept = @"accept_example"; // Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// Get logs
[apiInstance getStepLogsWithProgramId:programId
              pipelineId:pipelineId
              executionId:executionId
              phaseId:phaseId
              stepId:stepId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              file:file
              accept:accept
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->getStepLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **executionId** | **NSString***| Identifier of the execution | 
 **phaseId** | **NSString***| Identifier of the phase | 
 **stepId** | **NSString***| Identifier of the step | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **file** | **NSString***| Identifier of the log file | [optional] 
 **accept** | **NSString***| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **startPipeline**
```objc
-(NSURLSessionTask*) startPipelineWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    contentType: (NSString*) contentType
        completionHandler: (void (^)(NSError* error)) handler;
```

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* contentType = @"contentType_example"; // Must always be application/json

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// Start the pipeline
[apiInstance startPipelineWithProgramId:programId
              pipelineId:pipelineId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              contentType:contentType
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->startPipeline: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **NSString***| Must always be application/json | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stepMetric**
```objc
-(NSURLSessionTask*) stepMetricWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIPipelineStepMetrics* output, NSError* error)) handler;
```

Get step metrics

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* executionId = @"executionId_example"; // Identifier of the execution
NSString* phaseId = @"phaseId_example"; // Identifier of the phase
NSString* stepId = @"stepId_example"; // Identifier of the step
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// Get step metrics
[apiInstance stepMetricWithProgramId:programId
              pipelineId:pipelineId
              executionId:executionId
              phaseId:phaseId
              stepId:stepId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIPipelineStepMetrics* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->stepMetric: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **executionId** | **NSString***| Identifier of the execution | 
 **phaseId** | **NSString***| Identifier of the phase | 
 **stepId** | **NSString***| Identifier of the step | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIPipelineStepMetrics***](OAIPipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stepState**
```objc
-(NSURLSessionTask*) stepStateWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    executionId: (NSString*) executionId
    phaseId: (NSString*) phaseId
    stepId: (NSString*) stepId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIPipelineExecutionStepState* output, NSError* error)) handler;
```

Get step state

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* executionId = @"executionId_example"; // Identifier of the execution
NSString* phaseId = @"phaseId_example"; // Identifier of the phase
NSString* stepId = @"stepId_example"; // Identifier of the step
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIPipelineExecutionApi*apiInstance = [[OAIPipelineExecutionApi alloc] init];

// Get step state
[apiInstance stepStateWithProgramId:programId
              pipelineId:pipelineId
              executionId:executionId
              phaseId:phaseId
              stepId:stepId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIPipelineExecutionStepState* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPipelineExecutionApi->stepState: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **executionId** | **NSString***| Identifier of the execution | 
 **phaseId** | **NSString***| Identifier of the phase | 
 **stepId** | **NSString***| Identifier of the step | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIPipelineExecutionStepState***](OAIPipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

