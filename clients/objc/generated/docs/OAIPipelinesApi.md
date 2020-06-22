# OAIPipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePipeline**](OAIPipelinesApi.md#deletepipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**getPipeline**](OAIPipelinesApi.md#getpipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**getPipelines**](OAIPipelinesApi.md#getpipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patchPipeline**](OAIPipelinesApi.md#patchpipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


# **deletePipeline**
```objc
-(NSURLSessionTask*) deletePipelineWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(NSError* error)) handler;
```

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIPipelinesApi*apiInstance = [[OAIPipelinesApi alloc] init];

// Delete a Pipeline
[apiInstance deletePipelineWithProgramId:programId
              pipelineId:pipelineId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIPipelinesApi->deletePipeline: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPipeline**
```objc
-(NSURLSessionTask*) getPipelineWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIPipeline* output, NSError* error)) handler;
```

Get Pipeline

Returns a pipeline by its id

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIPipelinesApi*apiInstance = [[OAIPipelinesApi alloc] init];

// Get Pipeline
[apiInstance getPipelineWithProgramId:programId
              pipelineId:pipelineId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIPipeline* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPipelinesApi->getPipeline: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIPipeline***](OAIPipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPipelines**
```objc
-(NSURLSessionTask*) getPipelinesWithProgramId: (NSString*) programId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIPipelineList* output, NSError* error)) handler;
```

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIPipelinesApi*apiInstance = [[OAIPipelinesApi alloc] init];

// List Pipelines
[apiInstance getPipelinesWithProgramId:programId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIPipelineList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPipelinesApi->getPipelines: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIPipelineList***](OAIPipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchPipeline**
```objc
-(NSURLSessionTask*) patchPipelineWithProgramId: (NSString*) programId
    pipelineId: (NSString*) pipelineId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    contentType: (NSString*) contentType
    body: (OAIPipeline*) body
        completionHandler: (void (^)(OAIPipeline* output, NSError* error)) handler;
```

Patches Pipeline

Patches a pipeline within an program.

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* pipelineId = @"pipelineId_example"; // Identifier of the pipeline
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* contentType = @"contentType_example"; // Must always be application/json
OAIPipeline* body = [[OAIPipeline alloc] init]; // The updated Pipeline

OAIPipelinesApi*apiInstance = [[OAIPipelinesApi alloc] init];

// Patches Pipeline
[apiInstance patchPipelineWithProgramId:programId
              pipelineId:pipelineId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              contentType:contentType
              body:body
          completionHandler: ^(OAIPipeline* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPipelinesApi->patchPipeline: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program | 
 **pipelineId** | **NSString***| Identifier of the pipeline | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **NSString***| Must always be application/json | 
 **body** | [**OAIPipeline***](OAIPipeline.md)| The updated Pipeline | 

### Return type

[**OAIPipeline***](OAIPipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

