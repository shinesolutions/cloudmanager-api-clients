# PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvancePipelineExecution**](PipelineExecutionApi.md#AdvancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**CancelPipelineExecutionStep**](PipelineExecutionApi.md#CancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**GetCurrentExecution**](PipelineExecutionApi.md#GetCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**GetExecution**](PipelineExecutionApi.md#GetExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**GetExecutions**](PipelineExecutionApi.md#GetExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**GetStepLogs**](PipelineExecutionApi.md#GetStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**StartPipeline**](PipelineExecutionApi.md#StartPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**StepMetric**](PipelineExecutionApi.md#StepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**StepState**](PipelineExecutionApi.md#StepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state


# **AdvancePipelineExecution**
> AdvancePipelineExecution(program.id, pipeline.id, execution.id, phase.id, step.id, x.gw.ims.org.id, authorization, x.api.key, content.type, body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.execution.id <- 'execution.id_example' # character | Identifier of the execution
var.phase.id <- 'phase.id_example' # character | Identifier of the phase
var.step.id <- 'step.id_example' # character | Identifier of the step
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.content.type <- 'content.type_example' # character | Must always be application/json
var.body <- NULL # object | Input for advance. See documentation for details.

#Advance
api.instance <- PipelineExecutionApi$new()
api.instance$AdvancePipelineExecution(var.program.id, var.pipeline.id, var.execution.id, var.phase.id, var.step.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key, var.content.type, var.body)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **execution.id** | **character**| Identifier of the execution | 
 **phase.id** | **character**| Identifier of the phase | 
 **step.id** | **character**| Identifier of the step | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content.type** | **character**| Must always be application/json | 
 **body** | **object**| Input for advance. See documentation for details. | 

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

# **CancelPipelineExecutionStep**
> CancelPipelineExecutionStep(program.id, pipeline.id, execution.id, phase.id, step.id, x.gw.ims.org.id, authorization, x.api.key, content.type, body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.execution.id <- 'execution.id_example' # character | Identifier of the execution
var.phase.id <- 'phase.id_example' # character | Identifier of the phase
var.step.id <- 'step.id_example' # character | Identifier of the step
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.content.type <- 'content.type_example' # character | Must always be application/json
var.body <- NULL # object | Input for advance. See documentation for details.

#Cancel
api.instance <- PipelineExecutionApi$new()
api.instance$CancelPipelineExecutionStep(var.program.id, var.pipeline.id, var.execution.id, var.phase.id, var.step.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key, var.content.type, var.body)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **execution.id** | **character**| Identifier of the execution | 
 **phase.id** | **character**| Identifier of the phase | 
 **step.id** | **character**| Identifier of the step | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content.type** | **character**| Must always be application/json | 
 **body** | **object**| Input for advance. See documentation for details. | 

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

# **GetCurrentExecution**
> PipelineExecution GetCurrentExecution(program.id, pipeline.id, x.gw.ims.org.id, authorization, x.api.key)

Get current pipeline execution

Returns current pipeline execution if any.

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Get current pipeline execution
api.instance <- PipelineExecutionApi$new()
result <- api.instance$GetCurrentExecution(var.program.id, var.pipeline.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](pipelineExecution.md)

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

# **GetExecution**
> PipelineExecution GetExecution(program.id, pipeline.id, execution.id, x.gw.ims.org.id, authorization, x.api.key)

Get pipeline execution

Returns a pipeline execution by id

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.execution.id <- 'execution.id_example' # character | Identifier of the execution
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Get pipeline execution
api.instance <- PipelineExecutionApi$new()
result <- api.instance$GetExecution(var.program.id, var.pipeline.id, var.execution.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **execution.id** | **character**| Identifier of the execution | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](pipelineExecution.md)

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

# **GetExecutions**
> PipelineExecutionListRepresentation GetExecutions(program.id, pipeline.id, x.gw.ims.org.id, authorization, x.api.key, start=var.start, limit=var.limit)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.start <- 'start_example' # character | Pagination start parameter
var.limit <- 56 # integer | Pagination limit parameter

#List Executions
api.instance <- PipelineExecutionApi$new()
result <- api.instance$GetExecutions(var.program.id, var.pipeline.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key, start=var.start, limit=var.limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **character**| Pagination start parameter | [optional] 
 **limit** | **integer**| Pagination limit parameter | [optional] 

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

# **GetStepLogs**
> GetStepLogs(program.id, pipeline.id, execution.id, phase.id, step.id, x.gw.ims.org.id, authorization, x.api.key, file=var.file, accept=var.accept)

Get logs

Get the logs associated with a step.

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.execution.id <- 'execution.id_example' # character | Identifier of the execution
var.phase.id <- 'phase.id_example' # character | Identifier of the phase
var.step.id <- 'step.id_example' # character | Identifier of the step
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.file <- 'file_example' # character | Identifier of the log file
var.accept <- 'accept_example' # character | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.

#Get logs
api.instance <- PipelineExecutionApi$new()
api.instance$GetStepLogs(var.program.id, var.pipeline.id, var.execution.id, var.phase.id, var.step.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key, file=var.file, accept=var.accept)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **execution.id** | **character**| Identifier of the execution | 
 **phase.id** | **character**| Identifier of the phase | 
 **step.id** | **character**| Identifier of the step | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **file** | **character**| Identifier of the log file | [optional] 
 **accept** | **character**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

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

# **StartPipeline**
> StartPipeline(program.id, pipeline.id, x.gw.ims.org.id, authorization, x.api.key, content.type)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.content.type <- 'content.type_example' # character | Must always be application/json

#Start the pipeline
api.instance <- PipelineExecutionApi$new()
api.instance$StartPipeline(var.program.id, var.pipeline.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key, var.content.type)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content.type** | **character**| Must always be application/json | 

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

# **StepMetric**
> PipelineStepMetrics StepMetric(program.id, pipeline.id, execution.id, phase.id, step.id, x.gw.ims.org.id, authorization, x.api.key)

Get step metrics

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.execution.id <- 'execution.id_example' # character | Identifier of the execution
var.phase.id <- 'phase.id_example' # character | Identifier of the phase
var.step.id <- 'step.id_example' # character | Identifier of the step
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Get step metrics
api.instance <- PipelineExecutionApi$new()
result <- api.instance$StepMetric(var.program.id, var.pipeline.id, var.execution.id, var.phase.id, var.step.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **execution.id** | **character**| Identifier of the execution | 
 **phase.id** | **character**| Identifier of the phase | 
 **step.id** | **character**| Identifier of the step | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineStepMetrics**](pipelineStepMetrics.md)

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

# **StepState**
> PipelineExecutionStepState StepState(program.id, pipeline.id, execution.id, phase.id, step.id, x.gw.ims.org.id, authorization, x.api.key)

Get step state

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.execution.id <- 'execution.id_example' # character | Identifier of the execution
var.phase.id <- 'phase.id_example' # character | Identifier of the phase
var.step.id <- 'step.id_example' # character | Identifier of the step
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Get step state
api.instance <- PipelineExecutionApi$new()
result <- api.instance$StepState(var.program.id, var.pipeline.id, var.execution.id, var.phase.id, var.step.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **execution.id** | **character**| Identifier of the execution | 
 **phase.id** | **character**| Identifier of the phase | 
 **step.id** | **character**| Identifier of the step | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecutionStepState**](pipelineExecutionStepState.md)

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

