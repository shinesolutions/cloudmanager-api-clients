# Org.OpenAPITools.Api.EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteEnvironment**](EnvironmentsApi.md#deleteenvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**DownloadLogs**](EnvironmentsApi.md#downloadlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**GetEnvironment**](EnvironmentsApi.md#getenvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**GetEnvironmentLogs**](EnvironmentsApi.md#getenvironmentlogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**GetEnvironments**](EnvironmentsApi.md#getenvironments) | **GET** /api/program/{programId}/environments | List Environments


<a name="deleteenvironment"></a>
# **DeleteEnvironment**
> Environment DeleteEnvironment (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)

DeleteEnvironment

Delete environment

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteEnvironmentExample
    {
        public void main()
        {
            
            var apiInstance = new EnvironmentsApi();
            var programId = programId_example;  // string | Identifier of the application
            var environmentId = environmentId_example;  // string | Identifier of the environment
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // DeleteEnvironment
                Environment result = apiInstance.DeleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EnvironmentsApi.DeleteEnvironment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the application | 
 **environmentId** | **string**| Identifier of the environment | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="downloadlogs"></a>
# **DownloadLogs**
> void DownloadLogs (string programId, string environmentId, string service, string name, string date, string xGwImsOrgId, string authorization, string xApiKey, string accept)

Download Logs

Download environment logs

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DownloadLogsExample
    {
        public void main()
        {
            
            var apiInstance = new EnvironmentsApi();
            var programId = programId_example;  // string | Identifier of the program
            var environmentId = environmentId_example;  // string | Identifier of the environment
            var service = service_example;  // string | Name of service
            var name = name_example;  // string | Name of log
            var date = date_example;  // string | date for which log is required
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var accept = accept_example;  // string | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional) 

            try
            {
                // Download Logs
                apiInstance.DownloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EnvironmentsApi.DownloadLogs: " + e.Message );
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
 **service** | **string**| Name of service | 
 **name** | **string**| Name of log | 
 **date** | **string**| date for which log is required | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **string**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getenvironment"></a>
# **GetEnvironment**
> Environment GetEnvironment (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)

Get Environment

Returns an environment by its id

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetEnvironmentExample
    {
        public void main()
        {
            
            var apiInstance = new EnvironmentsApi();
            var programId = programId_example;  // string | Identifier of the program
            var environmentId = environmentId_example;  // string | Identifier of the environment
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Get Environment
                Environment result = apiInstance.GetEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EnvironmentsApi.GetEnvironment: " + e.Message );
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

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getenvironmentlogs"></a>
# **GetEnvironmentLogs**
> EnvironmentLogs GetEnvironmentLogs (string programId, string environmentId, int? days, string xGwImsOrgId, string authorization, string xApiKey, List<string> service, List<string> name)

Get Environment Logs

List all logs available in environment

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetEnvironmentLogsExample
    {
        public void main()
        {
            
            var apiInstance = new EnvironmentsApi();
            var programId = programId_example;  // string | Identifier of the program
            var environmentId = environmentId_example;  // string | Identifier of the environment
            var days = 56;  // int? | number of days for which logs are required
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var service = new List<string>(); // List<string> | Names of services (optional) 
            var name = new List<string>(); // List<string> | Names of log (optional) 

            try
            {
                // Get Environment Logs
                EnvironmentLogs result = apiInstance.GetEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EnvironmentsApi.GetEnvironmentLogs: " + e.Message );
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
 **days** | **int?**| number of days for which logs are required | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | [**List<string>**](string.md)| Names of services | [optional] 
 **name** | [**List<string>**](string.md)| Names of log | [optional] 

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getenvironments"></a>
# **GetEnvironments**
> EnvironmentList GetEnvironments (string programId, string xGwImsOrgId, string authorization, string xApiKey, string type)

List Environments

Lists all environments in an program

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetEnvironmentsExample
    {
        public void main()
        {
            
            var apiInstance = new EnvironmentsApi();
            var programId = programId_example;  // string | Identifier of the program
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var type = type_example;  // string | Type of the environment (optional) 

            try
            {
                // List Environments
                EnvironmentList result = apiInstance.GetEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EnvironmentsApi.GetEnvironments: " + e.Message );
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
 **type** | **string**| Type of the environment | [optional] 

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

