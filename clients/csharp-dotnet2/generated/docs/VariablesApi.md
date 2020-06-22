# Org.OpenAPITools.Api.VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEnvironmentVariables**](VariablesApi.md#getenvironmentvariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**PatchEnvironmentVariables**](VariablesApi.md#patchenvironmentvariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


<a name="getenvironmentvariables"></a>
# **GetEnvironmentVariables**
> VariableList GetEnvironmentVariables (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetEnvironmentVariablesExample
    {
        public void main()
        {
            
            var apiInstance = new VariablesApi();
            var programId = 2351;  // string | Identifier of the program
            var environmentId = 128;  // string | Identifier of the environment
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // List User Environment Variables
                VariableList result = apiInstance.GetEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VariablesApi.GetEnvironmentVariables: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program | 
 **environmentId** | **string**| Identifier of the environment | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="patchenvironmentvariables"></a>
# **PatchEnvironmentVariables**
> VariableList PatchEnvironmentVariables (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, List<Variable> body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PatchEnvironmentVariablesExample
    {
        public void main()
        {
            
            var apiInstance = new VariablesApi();
            var programId = programId_example;  // string | Identifier of the program
            var environmentId = environmentId_example;  // string | Identifier of the environment
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var contentType = contentType_example;  // string | Must always be application/json
            var body = new List<Variable>(); // List<Variable> | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.

            try
            {
                // Patch User Environment Variables
                VariableList result = apiInstance.PatchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling VariablesApi.PatchEnvironmentVariables: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program | 
 **environmentId** | **string**| Identifier of the environment | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **string**| Must always be application/json | 
 **body** | [**List<Variable>**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

