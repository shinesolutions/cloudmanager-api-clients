# \PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvancePipelineExecution**](PipelineExecutionApi.md#AdvancePipelineExecution) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**CancelPipelineExecutionStep**](PipelineExecutionApi.md#CancelPipelineExecutionStep) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**GetCurrentExecution**](PipelineExecutionApi.md#GetCurrentExecution) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**GetExecution**](PipelineExecutionApi.md#GetExecution) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**GetExecutions**](PipelineExecutionApi.md#GetExecutions) | **Get** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**GetStepLogs**](PipelineExecutionApi.md#GetStepLogs) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**StartPipeline**](PipelineExecutionApi.md#StartPipeline) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**StepMetric**](PipelineExecutionApi.md#StepMetric) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**StepState**](PipelineExecutionApi.md#StepState) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state



## AdvancePipelineExecution

> AdvancePipelineExecution(ctx, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**executionId** | **string**| Identifier of the execution | 
**phaseId** | **string**| Identifier of the phase | 
**stepId** | **string**| Identifier of the step | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
**contentType** | **string**| Must always be application/json | 
**body** | **map[string]interface{}**| Input for advance. See documentation for details. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CancelPipelineExecutionStep

> CancelPipelineExecutionStep(ctx, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**executionId** | **string**| Identifier of the execution | 
**phaseId** | **string**| Identifier of the phase | 
**stepId** | **string**| Identifier of the step | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
**contentType** | **string**| Must always be application/json | 
**body** | **map[string]interface{}**| Input for advance. See documentation for details. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCurrentExecution

> PipelineExecution GetCurrentExecution(ctx, programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Get current pipeline execution

Returns current pipeline execution if any.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](pipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetExecution

> PipelineExecution GetExecution(ctx, programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey)

Get pipeline execution

Returns a pipeline execution by id

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**executionId** | **string**| Identifier of the execution | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](pipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetExecutions

> PipelineExecutionListRepresentation GetExecutions(ctx, programId, pipelineId, xGwImsOrgId, authorization, xApiKey, optional)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | ***GetExecutionsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a GetExecutionsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------





 **start** | **optional.String**| Pagination start parameter | 
 **limit** | **optional.Int32**| Pagination limit parameter | 

### Return type

[**PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetStepLogs

> GetStepLogs(ctx, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, optional)

Get logs

Get the logs associated with a step.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**executionId** | **string**| Identifier of the execution | 
**phaseId** | **string**| Identifier of the phase | 
**stepId** | **string**| Identifier of the step | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | ***GetStepLogsOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a GetStepLogsOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------








 **file** | **optional.String**| Identifier of the log file | 
 **accept** | **optional.String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StartPipeline

> StartPipeline(ctx, programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
**contentType** | **string**| Must always be application/json | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StepMetric

> PipelineStepMetrics StepMetric(ctx, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)

Get step metrics

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**executionId** | **string**| Identifier of the execution | 
**phaseId** | **string**| Identifier of the phase | 
**stepId** | **string**| Identifier of the step | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineStepMetrics**](pipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## StepState

> PipelineExecutionStepState StepState(ctx, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)

Get step state

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**programId** | **string**| Identifier of the program. | 
**pipelineId** | **string**| Identifier of the pipeline | 
**executionId** | **string**| Identifier of the execution | 
**phaseId** | **string**| Identifier of the phase | 
**stepId** | **string**| Identifier of the step | 
**xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. | 
**authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
**xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecutionStepState**](pipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

