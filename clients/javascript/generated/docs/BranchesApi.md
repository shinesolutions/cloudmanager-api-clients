# NodeAemCloudmanagerApiClient.BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches



## getBranches

> BranchList getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey)

List Branches

Returns the list of branches from a repository

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.BranchesApi();
let programId = "programId_example"; // String | Identifier of the program.
let repositoryId = "repositoryId_example"; // String | Identifier of the repository
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. | 
 **repositoryId** | **String**| Identifier of the repository | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

