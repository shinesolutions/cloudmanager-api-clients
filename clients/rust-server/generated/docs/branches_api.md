# branches_api

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
**getBranches**](branches_api.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


# **getBranches**
> models::BranchList getBranches(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key)
List Branches

Returns the list of branches from a repository

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **repository_id** | **String**| Identifier of the repository | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::BranchList**](branchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

