# OAIVariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentVariables**](OAIVariablesApi.md#getenvironmentvariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patchEnvironmentVariables**](OAIVariablesApi.md#patchenvironmentvariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


# **getEnvironmentVariables**
```objc
-(NSURLSessionTask*) getEnvironmentVariablesWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIVariableList* output, NSError* error)) handler;
```

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example 
```objc

NSString* programId = 2351; // Identifier of the program
NSString* environmentId = 128; // Identifier of the environment
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIVariablesApi*apiInstance = [[OAIVariablesApi alloc] init];

// List User Environment Variables
[apiInstance getEnvironmentVariablesWithProgramId:programId
              environmentId:environmentId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIVariableList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVariablesApi->getEnvironmentVariables: %@", error);
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

[**OAIVariableList***](OAIVariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchEnvironmentVariables**
```objc
-(NSURLSessionTask*) patchEnvironmentVariablesWithProgramId: (NSString*) programId
    environmentId: (NSString*) environmentId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
    contentType: (NSString*) contentType
    body: (NSArray<OAIVariable>*) body
        completionHandler: (void (^)(OAIVariableList* output, NSError* error)) handler;
```

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* environmentId = @"environmentId_example"; // Identifier of the environment
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
NSString* contentType = @"contentType_example"; // Must always be application/json
NSArray<OAIVariable>* body = @[[[OAIVariable alloc] init]]; // The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.

OAIVariablesApi*apiInstance = [[OAIVariablesApi alloc] init];

// Patch User Environment Variables
[apiInstance patchEnvironmentVariablesWithProgramId:programId
              environmentId:environmentId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
              contentType:contentType
              body:body
          completionHandler: ^(OAIVariableList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVariablesApi->patchEnvironmentVariables: %@", error);
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
 **contentType** | **NSString***| Must always be application/json | 
 **body** | [**NSArray&lt;OAIVariable&gt;***](OAIVariable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**OAIVariableList***](OAIVariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

