# OAIEnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvironment**](OAIEnvironmentsApi.md#deleteenvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**downloadLogs**](OAIEnvironmentsApi.md#downloadlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**getEnvironment**](OAIEnvironmentsApi.md#getenvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**getEnvironmentLogs**](OAIEnvironmentsApi.md#getenvironmentlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**getEnvironments**](OAIEnvironmentsApi.md#getenvironments) | **GET** /api/program/{programId}/environments | List Environments


# **deleteEnvironment**
```objc
-(NSURLSessionTask*) deleteEnvironmentWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIEnvironment* output, NSError* error)) handler;
```

DeleteEnvironment

Delete environment

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the application
NSString* environmentId = @"environmentId_example"; // Identifier of the environment
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIEnvironmentsApi*apiInstance = [[OAIEnvironmentsApi alloc] init];

// DeleteEnvironment
[apiInstance deleteEnvironmentWithProgramId:programId
              environmentId:environmentId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIEnvironment* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEnvironmentsApi->deleteEnvironment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the application | 
 **environmentId** | **NSString***| Identifier of the environment | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIEnvironment***](OAIEnvironment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **downloadLogs**
```objc
-(NSURLSessionTask*) downloadLogsWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    service: (NSString*) service
    name: (NSString*) name
    date: (NSString*) date
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    accept: (NSString*) accept
        completionHandler: (void (^)(NSError* error)) handler;
```

Download Logs

Download environment logs

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* environmentId = @"environmentId_example"; // Identifier of the environment
NSString* service = @"service_example"; // Name of service
NSString* name = @"name_example"; // Name of log
NSString* date = @"date_example"; // date for which log is required
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* accept = @"accept_example"; // Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)

OAIEnvironmentsApi*apiInstance = [[OAIEnvironmentsApi alloc] init];

// Download Logs
[apiInstance downloadLogsWithProgramId:programId
              environmentId:environmentId
              service:service
              name:name
              date:date
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              accept:accept
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIEnvironmentsApi->downloadLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program | 
 **environmentId** | **NSString***| Identifier of the environment | 
 **service** | **NSString***| Name of service | 
 **name** | **NSString***| Name of log | 
 **date** | **NSString***| date for which log is required | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **NSString***| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironment**
```objc
-(NSURLSessionTask*) getEnvironmentWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIEnvironment* output, NSError* error)) handler;
```

Get Environment

Returns an environment by its id

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* environmentId = @"environmentId_example"; // Identifier of the environment
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIEnvironmentsApi*apiInstance = [[OAIEnvironmentsApi alloc] init];

// Get Environment
[apiInstance getEnvironmentWithProgramId:programId
              environmentId:environmentId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIEnvironment* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEnvironmentsApi->getEnvironment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program | 
 **environmentId** | **NSString***| Identifier of the environment | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIEnvironment***](OAIEnvironment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironmentLogs**
```objc
-(NSURLSessionTask*) getEnvironmentLogsWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    days: (NSNumber*) days
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    service: (NSArray<NSString*>*) service
    name: (NSArray<NSString*>*) name
        completionHandler: (void (^)(OAIEnvironmentLogs* output, NSError* error)) handler;
```

Get Environment Logs

List all logs available in environment

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* environmentId = @"environmentId_example"; // Identifier of the environment
NSNumber* days = @56; // number of days for which logs are required
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSArray<NSString*>* service = @[@"service_example"]; // Names of services (optional)
NSArray<NSString*>* name = @[@"name_example"]; // Names of log (optional)

OAIEnvironmentsApi*apiInstance = [[OAIEnvironmentsApi alloc] init];

// Get Environment Logs
[apiInstance getEnvironmentLogsWithProgramId:programId
              environmentId:environmentId
              days:days
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              service:service
              name:name
          completionHandler: ^(OAIEnvironmentLogs* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEnvironmentsApi->getEnvironmentLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program | 
 **environmentId** | **NSString***| Identifier of the environment | 
 **days** | **NSNumber***| number of days for which logs are required | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Names of services | [optional] 
 **name** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Names of log | [optional] 

### Return type

[**OAIEnvironmentLogs***](OAIEnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironments**
```objc
-(NSURLSessionTask*) getEnvironmentsWithProgramId: (NSString*) programId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    type: (NSString*) type
        completionHandler: (void (^)(OAIEnvironmentList* output, NSError* error)) handler;
```

List Environments

Lists all environments in an program

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* type = @"type_example"; // Type of the environment (optional)

OAIEnvironmentsApi*apiInstance = [[OAIEnvironmentsApi alloc] init];

// List Environments
[apiInstance getEnvironmentsWithProgramId:programId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              type:type
          completionHandler: ^(OAIEnvironmentList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEnvironmentsApi->getEnvironments: %@", error);
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
 **type** | **NSString***| Type of the environment | [optional] 

### Return type

[**OAIEnvironmentList***](OAIEnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

