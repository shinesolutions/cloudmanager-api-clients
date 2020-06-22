# \BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBranches**](BranchesApi.md#GetBranches) | **Get** /api/program/{programId}/repository/{repositoryId}/branches | List Branches



## GetBranches

> BranchList GetBranches(ctx, programId, repositoryId, xGwImsOrgId, authorization, xApiKey)

List Branches

Returns the list of branches from a repository

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**repositoryId** | **string**| Identifier of the repository | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**BranchList**](branchList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

