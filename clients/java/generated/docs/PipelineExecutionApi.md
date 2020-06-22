# PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancePipelineExecution**](PipelineExecutionApi.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancelPipelineExecutionStep**](PipelineExecutionApi.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**getCurrentExecution**](PipelineExecutionApi.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**getExecution**](PipelineExecutionApi.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**getExecutions**](PipelineExecutionApi.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**getStepLogs**](PipelineExecutionApi.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**startPipeline**](PipelineExecutionApi.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**stepMetric**](PipelineExecutionApi.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**stepState**](PipelineExecutionApi.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state


<a name="advancePipelineExecution"></a>
# **advancePipelineExecution**
> advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String executionId = "executionId_example"; // String | Identifier of the execution
    String phaseId = "phaseId_example"; // String | Identifier of the phase
    String stepId = "stepId_example"; // String | Identifier of the step
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    String contentType = "contentType_example"; // String | Must always be application/json
    Object body = null; // Object | Input for advance. See documentation for details.
    try {
      apiInstance.advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#advancePipelineExecution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **executionId** | **String**| Identifier of the execution |
 **phaseId** | **String**| Identifier of the phase |
 **stepId** | **String**| Identifier of the step |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **String**| Must always be application/json |
 **body** | **Object**| Input for advance. See documentation for details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successful resume of pipeline execution |  -  |
**403** | Missing permission for user to advance the pipeline execution |  -  |
**404** | No pipeline execution exits or unknown pipeline or program |  -  |

<a name="cancelPipelineExecutionStep"></a>
# **cancelPipelineExecutionStep**
> cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String executionId = "executionId_example"; // String | Identifier of the execution
    String phaseId = "phaseId_example"; // String | Identifier of the phase
    String stepId = "stepId_example"; // String | Identifier of the step
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    String contentType = "contentType_example"; // String | Must always be application/json
    Object body = null; // Object | Input for advance. See documentation for details.
    try {
      apiInstance.cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#cancelPipelineExecutionStep");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **executionId** | **String**| Identifier of the execution |
 **phaseId** | **String**| Identifier of the phase |
 **stepId** | **String**| Identifier of the step |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **String**| Must always be application/json |
 **body** | **Object**| Input for advance. See documentation for details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successful cancel of pipeline execution |  -  |
**403** | Missing permission for user to cancel the current pipeline execution |  -  |
**404** | No pipeline execution exits or unknown pipeline or program |  -  |

<a name="getCurrentExecution"></a>
# **getCurrentExecution**
> PipelineExecution getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Get current pipeline execution

Returns current pipeline execution if any.

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      PipelineExecution result = apiInstance.getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#getCurrentExecution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

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
**200** | Successful retrieval of current execution |  -  |
**404** | No pipeline execution exits or unknown pipeline or program |  -  |

<a name="getExecution"></a>
# **getExecution**
> PipelineExecution getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey)

Get pipeline execution

Returns a pipeline execution by id

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String executionId = "executionId_example"; // String | Identifier of the execution
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      PipelineExecution result = apiInstance.getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#getExecution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **executionId** | **String**| Identifier of the execution |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

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
**200** | Successful retrieval of execution |  -  |
**404** | No pipeline execution exits or unknown pipeline or application |  -  |

<a name="getExecutions"></a>
# **getExecutions**
> PipelineExecutionListRepresentation getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    String start = "start_example"; // String | Pagination start parameter
    Integer limit = 56; // Integer | Pagination limit parameter
    try {
      PipelineExecutionListRepresentation result = apiInstance.getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#getExecutions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **start** | **String**| Pagination start parameter | [optional]
 **limit** | **Integer**| Pagination limit parameter | [optional]

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
**200** | Successful retrieval of execution history |  -  |
**403** | Missing permission for user to read executions |  -  |
**404** | Pipeline does not exist |  -  |

<a name="getStepLogs"></a>
# **getStepLogs**
> getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept)

Get logs

Get the logs associated with a step.

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String executionId = "executionId_example"; // String | Identifier of the execution
    String phaseId = "phaseId_example"; // String | Identifier of the phase
    String stepId = "stepId_example"; // String | Identifier of the step
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    String file = "file_example"; // String | Identifier of the log file
    String accept = "accept_example"; // String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
    try {
      apiInstance.getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#getStepLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **executionId** | **String**| Identifier of the execution |
 **phaseId** | **String**| Identifier of the phase |
 **stepId** | **String**| Identifier of the step |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **file** | **String**| Identifier of the log file | [optional]
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of logs |  -  |
**403** | Missing permission for user to read logs |  -  |
**404** | Pipeline execution does not exist |  -  |

<a name="startPipeline"></a>
# **startPipeline**
> startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    String contentType = "contentType_example"; // String | Must always be application/json
    try {
      apiInstance.startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#startPipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **String**| Must always be application/json |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful started pipeline execution |  -  |
**400** | Request conflicts with the expected state of pipeline |  -  |
**404** | No pipeline execution exits or unknown pipeline or application |  -  |
**412** | Cannot start execution: programId&#x3D;{programId}, pipelineId&#x3D;{pipelineId} currentExecutionId&#x3D;{executionId}, reason&#x3D;&#39;Execution already in progress. |  -  |

<a name="stepMetric"></a>
# **stepMetric**
> PipelineStepMetrics stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)

Get step metrics

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String executionId = "executionId_example"; // String | Identifier of the execution
    String phaseId = "phaseId_example"; // String | Identifier of the phase
    String stepId = "stepId_example"; // String | Identifier of the step
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      PipelineStepMetrics result = apiInstance.stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#stepMetric");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **executionId** | **String**| Identifier of the execution |
 **phaseId** | **String**| Identifier of the phase |
 **stepId** | **String**| Identifier of the step |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

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
**200** | Successful retrieval of metrics |  -  |
**403** | Missing permission for user to read metrics |  -  |
**404** | Pipeline execution does not exist |  -  |

<a name="stepState"></a>
# **stepState**
> PipelineExecutionStepState stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)

Get step state

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.PipelineExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    PipelineExecutionApi apiInstance = new PipelineExecutionApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
    String executionId = "executionId_example"; // String | Identifier of the execution
    String phaseId = "phaseId_example"; // String | Identifier of the phase
    String stepId = "stepId_example"; // String | Identifier of the step
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      PipelineExecutionStepState result = apiInstance.stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PipelineExecutionApi#stepState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **pipelineId** | **String**| Identifier of the pipeline |
 **executionId** | **String**| Identifier of the execution |
 **phaseId** | **String**| Identifier of the phase |
 **stepId** | **String**| Identifier of the step |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

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
**200** | Successful retrieval of step state |  -  |
**403** | Missing permission for user to read step |  -  |
**404** | Pipeline execution does not exist |  -  |

