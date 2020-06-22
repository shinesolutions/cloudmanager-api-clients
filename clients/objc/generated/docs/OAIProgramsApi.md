# OAIProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProgram**](OAIProgramsApi.md#deleteprogram) | **DELETE** /api/program/{programId} | Delete Program
[**getProgram**](OAIProgramsApi.md#getprogram) | **GET** /api/program/{programId} | Get Program
[**getPrograms**](OAIProgramsApi.md#getprograms) | **GET** /api/programs | Lists Programs


# **deleteProgram**
```objc
-(NSURLSessionTask*) deleteProgramWithProgramId: (NSString*) programId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIProgram* output, NSError* error)) handler;
```

Delete Program

Delete an program

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIProgramsApi*apiInstance = [[OAIProgramsApi alloc] init];

// Delete Program
[apiInstance deleteProgramWithProgramId:programId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIProgram* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProgramsApi->deleteProgram: %@", error);
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

[**OAIProgram***](OAIProgram.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getProgram**
```objc
-(NSURLSessionTask*) getProgramWithProgramId: (NSString*) programId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIProgram* output, NSError* error)) handler;
```

Get Program

Returns a program by its id

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIProgramsApi*apiInstance = [[OAIProgramsApi alloc] init];

// Get Program
[apiInstance getProgramWithProgramId:programId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIProgram* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProgramsApi->getProgram: %@", error);
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

[**OAIProgram***](OAIProgram.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPrograms**
```objc
-(NSURLSessionTask*) getProgramsWithXGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIProgramList* output, NSError* error)) handler;
```

Lists Programs

Returns all programs that the requesting user has access to

### Example 
```objc

NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIProgramsApi*apiInstance = [[OAIProgramsApi alloc] init];

// Lists Programs
[apiInstance getProgramsWithXGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIProgramList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProgramsApi->getPrograms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIProgramList***](OAIProgramList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

