# Org.OpenAPITools.Api.BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBranches**](BranchesApi.md#getbranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches



## GetBranches

> BranchList GetBranches (string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey)

List Branches

Returns the list of branches from a repository

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetBranchesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new BranchesApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var repositoryId = repositoryId_example;  // string | Identifier of the repository
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // List Branches
                BranchList result = apiInstance.GetBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling BranchesApi.GetBranches: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program. | 
 **repositoryId** | **string**| Identifier of the repository | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of the list of repository branches |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

