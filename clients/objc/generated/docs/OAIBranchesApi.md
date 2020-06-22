# OAIBranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](OAIBranchesApi.md#getbranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


# **getBranches**
```objc
-(NSURLSessionTask*) getBranchesWithProgramId: (NSString*) programId
    repositoryId: (NSString*) repositoryId
    xGwImsOrgId: (NSString*) xGwImsOrgId
    authorization: (NSString*) authorization
    xApiKey: (NSString*) xApiKey
        completionHandler: (void (^)(OAIBranchList* output, NSError* error)) handler;
```

List Branches

Returns the list of branches from a repository

### Example 
```objc

NSString* programId = @"programId_example"; // Identifier of the program.
NSString* repositoryId = @"repositoryId_example"; // Identifier of the repository
NSString* xGwImsOrgId = @"xGwImsOrgId_example"; // IMS organization ID that the request is being made under.
NSString* authorization = @"authorization_example"; // Bearer [token] - An access token for the technical account created through integration with Adobe IO
NSString* xApiKey = @"xApiKey_example"; // IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

OAIBranchesApi*apiInstance = [[OAIBranchesApi alloc] init];

// List Branches
[apiInstance getBranchesWithProgramId:programId
              repositoryId:repositoryId
              xGwImsOrgId:xGwImsOrgId
              authorization:authorization
              xApiKey:xApiKey
          completionHandler: ^(OAIBranchList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBranchesApi->getBranches: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **NSString***| Identifier of the program. | 
 **repositoryId** | **NSString***| Identifier of the repository | 
 **xGwImsOrgId** | **NSString***| IMS organization ID that the request is being made under. | 
 **authorization** | **NSString***| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **NSString***| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**OAIBranchList***](OAIBranchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

