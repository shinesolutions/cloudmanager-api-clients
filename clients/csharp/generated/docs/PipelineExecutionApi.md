# Org.OpenAPITools.Api.PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvancePipelineExecution**](PipelineExecutionApi.md#advancepipelineexecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**CancelPipelineExecutionStep**](PipelineExecutionApi.md#cancelpipelineexecutionstep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**GetCurrentExecution**](PipelineExecutionApi.md#getcurrentexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**GetExecution**](PipelineExecutionApi.md#getexecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**GetExecutions**](PipelineExecutionApi.md#getexecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**GetStepLogs**](PipelineExecutionApi.md#getsteplogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**StartPipeline**](PipelineExecutionApi.md#startpipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**StepMetric**](PipelineExecutionApi.md#stepmetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**StepState**](PipelineExecutionApi.md#stepstate) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state



## AdvancePipelineExecution

> void AdvancePipelineExecution (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdvancePipelineExecutionExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var executionId = executionId_example;  // string | Identifier of the execution
            var phaseId = phaseId_example;  // string | Identifier of the phase
            var stepId = stepId_example;  // string | Identifier of the step
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var contentType = contentType_example;  // string | Must always be application/json
            var body = ;  // Object | Input for advance. See documentation for details.

            try
            {
                // Advance
                apiInstance.AdvancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.AdvancePipelineExecution: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **executionId** | **string**| Identifier of the execution | 
 **phaseId** | **string**| Identifier of the phase | 
 **stepId** | **string**| Identifier of the step | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **string**| Must always be application/json | 
 **body** | **Object**| Input for advance. See documentation for details. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful resume of pipeline execution |  -  |
| **403** | Missing permission for user to advance the pipeline execution |  -  |
| **404** | No pipeline execution exits or unknown pipeline or program |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CancelPipelineExecutionStep

> void CancelPipelineExecutionStep (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CancelPipelineExecutionStepExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var executionId = executionId_example;  // string | Identifier of the execution
            var phaseId = phaseId_example;  // string | Identifier of the phase
            var stepId = stepId_example;  // string | Identifier of the step
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var contentType = contentType_example;  // string | Must always be application/json
            var body = ;  // Object | Input for advance. See documentation for details.

            try
            {
                // Cancel
                apiInstance.CancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.CancelPipelineExecutionStep: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **executionId** | **string**| Identifier of the execution | 
 **phaseId** | **string**| Identifier of the phase | 
 **stepId** | **string**| Identifier of the step | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **string**| Must always be application/json | 
 **body** | **Object**| Input for advance. See documentation for details. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful cancel of pipeline execution |  -  |
| **403** | Missing permission for user to cancel the current pipeline execution |  -  |
| **404** | No pipeline execution exits or unknown pipeline or program |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCurrentExecution

> PipelineExecution GetCurrentExecution (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)

Get current pipeline execution

Returns current pipeline execution if any.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetCurrentExecutionExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Get current pipeline execution
                PipelineExecution result = apiInstance.GetCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.GetCurrentExecution: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of current execution |  -  |
| **404** | No pipeline execution exits or unknown pipeline or program |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetExecution

> PipelineExecution GetExecution (string programId, string pipelineId, string executionId, string xGwImsOrgId, string authorization, string xApiKey)

Get pipeline execution

Returns a pipeline execution by id

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetExecutionExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var executionId = executionId_example;  // string | Identifier of the execution
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Get pipeline execution
                PipelineExecution result = apiInstance.GetExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.GetExecution: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **executionId** | **string**| Identifier of the execution | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of execution |  -  |
| **404** | No pipeline execution exits or unknown pipeline or application |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetExecutions

> PipelineExecutionListRepresentation GetExecutions (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string start = null, int limit = null)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetExecutionsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var start = start_example;  // string | Pagination start parameter (optional) 
            var limit = 56;  // int | Pagination limit parameter (optional) 

            try
            {
                // List Executions
                PipelineExecutionListRepresentation result = apiInstance.GetExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.GetExecutions: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **string**| Pagination start parameter | [optional] 
 **limit** | **int**| Pagination limit parameter | [optional] 

### Return type

[**PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of execution history |  -  |
| **403** | Missing permission for user to read executions |  -  |
| **404** | Pipeline does not exist |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetStepLogs

> void GetStepLogs (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string file = null, string accept = null)

Get logs

Get the logs associated with a step.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetStepLogsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var executionId = executionId_example;  // string | Identifier of the execution
            var phaseId = phaseId_example;  // string | Identifier of the phase
            var stepId = stepId_example;  // string | Identifier of the step
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var file = file_example;  // string | Identifier of the log file (optional) 
            var accept = accept_example;  // string | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional) 

            try
            {
                // Get logs
                apiInstance.GetStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.GetStepLogs: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **executionId** | **string**| Identifier of the execution | 
 **phaseId** | **string**| Identifier of the phase | 
 **stepId** | **string**| Identifier of the step | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **file** | **string**| Identifier of the log file | [optional] 
 **accept** | **string**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of logs |  -  |
| **403** | Missing permission for user to read logs |  -  |
| **404** | Pipeline execution does not exist |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StartPipeline

> void StartPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class StartPipelineExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
            var contentType = contentType_example;  // string | Must always be application/json

            try
            {
                // Start the pipeline
                apiInstance.StartPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.StartPipeline: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **string**| Must always be application/json | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful started pipeline execution |  -  |
| **400** | Request conflicts with the expected state of pipeline |  -  |
| **404** | No pipeline execution exits or unknown pipeline or application |  -  |
| **412** | Cannot start execution: programId&#x3D;{programId}, pipelineId&#x3D;{pipelineId} currentExecutionId&#x3D;{executionId}, reason&#x3D;&#39;Execution already in progress. |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StepMetric

> PipelineStepMetrics StepMetric (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey)

Get step metrics

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class StepMetricExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var executionId = executionId_example;  // string | Identifier of the execution
            var phaseId = phaseId_example;  // string | Identifier of the phase
            var stepId = stepId_example;  // string | Identifier of the step
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Get step metrics
                PipelineStepMetrics result = apiInstance.StepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.StepMetric: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **executionId** | **string**| Identifier of the execution | 
 **phaseId** | **string**| Identifier of the phase | 
 **stepId** | **string**| Identifier of the step | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineStepMetrics**](PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of metrics |  -  |
| **403** | Missing permission for user to read metrics |  -  |
| **404** | Pipeline execution does not exist |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StepState

> PipelineExecutionStepState StepState (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey)

Get step state

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class StepStateExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://cloudmanager.adobe.io";
            var apiInstance = new PipelineExecutionApi(Configuration.Default);
            var programId = programId_example;  // string | Identifier of the program.
            var pipelineId = pipelineId_example;  // string | Identifier of the pipeline
            var executionId = executionId_example;  // string | Identifier of the execution
            var phaseId = phaseId_example;  // string | Identifier of the phase
            var stepId = stepId_example;  // string | Identifier of the step
            var xGwImsOrgId = xGwImsOrgId_example;  // string | IMS organization ID that the request is being made under.
            var authorization = authorization_example;  // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
            var xApiKey = xApiKey_example;  // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

            try
            {
                // Get step state
                PipelineExecutionStepState result = apiInstance.StepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PipelineExecutionApi.StepState: " + e.Message );
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
 **pipelineId** | **string**| Identifier of the pipeline | 
 **executionId** | **string**| Identifier of the execution | 
 **phaseId** | **string**| Identifier of the phase | 
 **stepId** | **string**| Identifier of the step | 
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecutionStepState**](PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of step state |  -  |
| **403** | Missing permission for user to read step |  -  |
| **404** | Pipeline execution does not exist |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

