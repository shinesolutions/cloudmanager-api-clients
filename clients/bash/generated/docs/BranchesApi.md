# BranchesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches



## getBranches

List Branches

Returns the list of branches from a repository

### Example

```bash
 getBranches programId=value repositoryId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program. | [default to null]
 **repositoryId** | **string** | Identifier of the repository | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

