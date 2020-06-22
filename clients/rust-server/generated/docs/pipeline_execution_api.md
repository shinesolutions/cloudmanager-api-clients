# pipeline_execution_api

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
**advancePipelineExecution**](pipeline_execution_api.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
**cancelPipelineExecutionStep**](pipeline_execution_api.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
**getCurrentExecution**](pipeline_execution_api.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
**getExecution**](pipeline_execution_api.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
**getExecutions**](pipeline_execution_api.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
**getStepLogs**](pipeline_execution_api.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
**startPipeline**](pipeline_execution_api.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
**stepMetric**](pipeline_execution_api.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
**stepState**](pipeline_execution_api.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state


# **advancePipelineExecution**
> advancePipelineExecution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **execution_id** | **String**| Identifier of the execution | 
  **phase_id** | **String**| Identifier of the phase | 
  **step_id** | **String**| Identifier of the step | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
  **content_type** | **String**| Must always be application/json | 
  **body** | **object**| Input for advance. See documentation for details. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancelPipelineExecutionStep**
> cancelPipelineExecutionStep(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **execution_id** | **String**| Identifier of the execution | 
  **phase_id** | **String**| Identifier of the phase | 
  **step_id** | **String**| Identifier of the step | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
  **content_type** | **String**| Must always be application/json | 
  **body** | **object**| Input for advance. See documentation for details. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCurrentExecution**
> models::PipelineExecution getCurrentExecution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
Get current pipeline execution

Returns current pipeline execution if any.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::PipelineExecution**](pipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getExecution**
> models::PipelineExecution getExecution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key)
Get pipeline execution

Returns a pipeline execution by id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **execution_id** | **String**| Identifier of the execution | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::PipelineExecution**](pipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getExecutions**
> models::PipelineExecutionListRepresentation getExecutions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, optional)
List Executions

Returns the history of pipeline executions in a newest to oldest order

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program. | 
 **pipeline_id** | **String**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **String**| Pagination start parameter | 
 **limit** | **i32**| Pagination limit parameter | 

### Return type

[**models::PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStepLogs**
> getStepLogs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, optional)
Get logs

Get the logs associated with a step.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **execution_id** | **String**| Identifier of the execution | 
  **phase_id** | **String**| Identifier of the phase | 
  **step_id** | **String**| Identifier of the step | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program. | 
 **pipeline_id** | **String**| Identifier of the pipeline | 
 **execution_id** | **String**| Identifier of the execution | 
 **phase_id** | **String**| Identifier of the phase | 
 **step_id** | **String**| Identifier of the step | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **file** | **String**| Identifier of the log file | 
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **startPipeline**
> startPipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type)
Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
  **content_type** | **String**| Must always be application/json | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stepMetric**
> models::PipelineStepMetrics stepMetric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
Get step metrics

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **execution_id** | **String**| Identifier of the execution | 
  **phase_id** | **String**| Identifier of the phase | 
  **step_id** | **String**| Identifier of the step | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::PipelineStepMetrics**](pipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stepState**
> models::PipelineExecutionStepState stepState(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
Get step state

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program. | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **execution_id** | **String**| Identifier of the execution | 
  **phase_id** | **String**| Identifier of the phase | 
  **step_id** | **String**| Identifier of the step | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::PipelineExecutionStepState**](pipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

