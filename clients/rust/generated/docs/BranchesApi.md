# \BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_branches**](BranchesApi.md#get_branches) | **Get** /api/program/{programId}/repository/{repositoryId}/branches | List Branches



## get_branches

> crate::models::BranchList get_branches(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key)
List Branches

Returns the list of branches from a repository

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**repository_id** | **String** | Identifier of the repository | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::BranchList**](branchList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

