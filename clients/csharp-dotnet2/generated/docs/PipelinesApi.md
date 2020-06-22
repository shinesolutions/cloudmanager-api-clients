# Org.OpenAPITools.Api.PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeletePipeline**](PipelinesApi.md#deletepipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**GetPipeline**](PipelinesApi.md#getpipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**GetPipelines**](PipelinesApi.md#getpipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**PatchPipeline**](PipelinesApi.md#patchpipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


<a name="deletepipeline"></a>
# **DeletePipeline**
> void DeletePipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeletePipelineExample
    {
        public void main()
        {
            
            var apiInstance = new PipelinesApi();
            var programId = programId_example;  // string | Identifier of the program
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Delete a Pipeline
                apiInstance.DeletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PipelinesApi.DeletePipeline: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program | 
 **pipelineId** | **string**| Identifier of the pipeline | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpipeline"></a>
# **GetPipeline**
> Pipeline GetPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)

Get Pipeline

Returns a pipeline by its id

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPipelineExample
    {
        public void main()
        {
            
            var apiInstance = new PipelinesApi();
            var programId = programId_example;  // string | Identifier of the program
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Get Pipeline
                Pipeline result = apiInstance.GetPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PipelinesApi.GetPipeline: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program | 
 **pipelineId** | **string**| Identifier of the pipeline | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpipelines"></a>
# **GetPipelines**
> PipelineList GetPipelines (string programId, string xGwImsOrgId, string authorization, string xApiKey)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetPipelinesExample
    {
        public void main()
        {
            
            var apiInstance = new PipelinesApi();
            var programId = programId_example;  // string | Identifier of the program
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // List Pipelines
                PipelineList result = apiInstance.GetPipelines(programId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PipelinesApi.GetPipelines: " + e.Message );
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

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="patchpipeline"></a>
# **PatchPipeline**
> Pipeline PatchPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Pipeline body)

Patches Pipeline

Patches a pipeline within an program.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PatchPipelineExample
    {
        public void main()
        {
            
            var apiInstance = new PipelinesApi();
            var programId = programId_example;  // string | Identifier of the program
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var contentType = contentType_example;  // string | Must always be application/json
            var body = new Pipeline(); // Pipeline | The updated Pipeline

            try
            {
                // Patches Pipeline
                Pipeline result = apiInstance.PatchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PipelinesApi.PatchPipeline: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program | 
 **pipelineId** | **string**| Identifier of the pipeline | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **string**| Must always be application/json | 
 **body** | [**Pipeline**](Pipeline.md)| The updated Pipeline | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

