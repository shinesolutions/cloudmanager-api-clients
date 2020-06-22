# Org.OpenAPITools.Api.RepositoriesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetRepositories**](RepositoriesApi.md#getrepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**GetRepository**](RepositoriesApi.md#getrepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository


<a name="getrepositories"></a>
# **GetRepositories**
> RepositoryList GetRepositories (string programId, string xGwImsOrgId, string authorization, string xApiKey)

Lists Repositories

Lists all Repositories in an program

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetRepositoriesExample
    {
        public void main()
        {
            
            var apiInstance = new RepositoriesApi();
            var programId = programId_example;  // string | Identifier of the program
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Lists Repositories
                RepositoryList result = apiInstance.GetRepositories(programId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RepositoriesApi.GetRepositories: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**RepositoryList**](RepositoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getrepository"></a>
# **GetRepository**
> Repository GetRepository (string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey)

Get Repository

Returns an repository by its id

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetRepositoryExample
    {
        public void main()
        {
            
            var apiInstance = new RepositoriesApi();
            var programId = programId_example;  // string | Identifier of the program
            var repositoryId = repositoryId_example;  // string | Identifier of the repository
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Get Repository
                Repository result = apiInstance.GetRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RepositoriesApi.GetRepository: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program | 
 **repositoryId** | **string**| Identifier of the repository | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

