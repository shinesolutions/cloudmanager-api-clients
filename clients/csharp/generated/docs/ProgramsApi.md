# Org.OpenAPITools.Api.ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteProgram**](ProgramsApi.md#deleteprogram) | **DELETE** /api/program/{programId} | Delete Program
[**GetProgram**](ProgramsApi.md#getprogram) | **GET** /api/program/{programId} | Get Program
[**GetPrograms**](ProgramsApi.md#getprograms) | **GET** /api/programs | Lists Programs



## DeleteProgram

> Program DeleteProgram (string programId, string xGwImsOrgId, string authorization, string xApiKey)

Delete Program

Delete an program

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteProgramExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new ProgramsApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Delete Program
                Program result = apiInstance.DeleteProgram(programId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ProgramsApi.DeleteProgram: " + e.Message );
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
 **programId** | **string**| Identifier of the program | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | Delete was successful. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Program not found. |  -  |
| **412** | Deletion not supported |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetProgram

> Program GetProgram (string programId, string xGwImsOrgId, string authorization, string xApiKey)

Get Program

Returns a program by its id

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetProgramExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new ProgramsApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Get Program
                Program result = apiInstance.GetProgram(programId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ProgramsApi.GetProgram: " + e.Message );
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
 **programId** | **string**| Identifier of the program | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of program |  -  |
| **404** | Program not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPrograms

> ProgramList GetPrograms (string xGwImsOrgId, string authorization, string xApiKey)

Lists Programs

Returns all programs that the requesting user has access to

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetProgramsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new ProgramsApi(Configuration.Default);
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Lists Programs
                ProgramList result = apiInstance.GetPrograms(xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ProgramsApi.GetPrograms: " + e.Message );
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
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**ProgramList**](ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

