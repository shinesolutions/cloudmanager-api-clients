# OAIRepositoriesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRepositories**](OAIRepositoriesApi.md#getrepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**getRepository**](OAIRepositoriesApi.md#getrepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository


# **getRepositories**
```objc
-(NSURLSessionTask*) getRepositoriesWithProgramId: (NSString*) programId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIRepositoryList* output, NSError* error)) handler;
```

Lists Repositories

Lists all Repositories in an program

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIRepositoriesApi*apiInstance = [[OAIRepositoriesApi alloc] init];

// Lists Repositories
[apiInstance getRepositoriesWithProgramId:programId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIRepositoryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRepositoriesApi->getRepositories: %@", error);
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

[**OAIRepositoryList***](OAIRepositoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRepository**
```objc
-(NSURLSessionTask*) getRepositoryWithProgramId: (NSString*) programId
    repositoryId: (NSString*) repositoryId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIRepository* output, NSError* error)) handler;
```

Get Repository

Returns an repository by its id

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program
NSString* repositoryId = @"repositoryId_example"; // Identifier of the repository
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIRepositoriesApi*apiInstance = [[OAIRepositoriesApi alloc] init];

// Get Repository
[apiInstance getRepositoryWithProgramId:programId
              repositoryId:repositoryId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIRepository* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRepositoriesApi->getRepository: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program | 
 **repositoryId** | **NSString***| Identifier of the repository | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIRepository***](OAIRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

