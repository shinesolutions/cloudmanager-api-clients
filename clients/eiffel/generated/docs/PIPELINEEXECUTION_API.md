# PIPELINEEXECUTION_API

All URIs are relative to *https://cloudmanager.adobe.io*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**advance_pipeline_execution**](PIPELINEEXECUTION_API.md#advance_pipeline_execution) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancel_pipeline_execution_step**](PIPELINEEXECUTION_API.md#cancel_pipeline_execution_step) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**current_execution**](PIPELINEEXECUTION_API.md#current_execution) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**execution**](PIPELINEEXECUTION_API.md#execution) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**executions**](PIPELINEEXECUTION_API.md#executions) | **Get** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**start_pipeline**](PIPELINEEXECUTION_API.md#start_pipeline) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**step_logs**](PIPELINEEXECUTION_API.md#step_logs) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**step_metric**](PIPELINEEXECUTION_API.md#step_metric) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**step_state**](PIPELINEEXECUTION_API.md#step_state) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state


# **advance_pipeline_execution**
> advance_pipeline_execution (program_id: STRING_32 ; pipeline_id: STRING_32 ; execution_id: STRING_32 ; phase_id: STRING_32 ; step_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; content__type: STRING_32 ; body: ANY )
	

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **execution_id** | **STRING_32**| Identifier of the execution | [default to null]
 **phase_id** | **STRING_32**| Identifier of the phase | [default to null]
 **step_id** | **STRING_32**| Identifier of the step | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **content__type** | **STRING_32**| Must always be application/json | [default to null]
 **body** | **ANY**| Input for advance. See documentation for details. | 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_pipeline_execution_step**
> cancel_pipeline_execution_step (program_id: STRING_32 ; pipeline_id: STRING_32 ; execution_id: STRING_32 ; phase_id: STRING_32 ; step_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; content__type: STRING_32 ; body: ANY )
	

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **execution_id** | **STRING_32**| Identifier of the execution | [default to null]
 **phase_id** | **STRING_32**| Identifier of the phase | [default to null]
 **step_id** | **STRING_32**| Identifier of the step | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **content__type** | **STRING_32**| Must always be application/json | [default to null]
 **body** | **ANY**| Input for advance. See documentation for details. | 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **current_execution**
> current_execution (program_id: STRING_32 ; pipeline_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PIPELINE_EXECUTION
	

Get current pipeline execution

Returns current pipeline execution if any.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PIPELINE_EXECUTION**](pipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **execution**
> execution (program_id: STRING_32 ; pipeline_id: STRING_32 ; execution_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PIPELINE_EXECUTION
	

Get pipeline execution

Returns a pipeline execution by id


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **execution_id** | **STRING_32**| Identifier of the execution | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PIPELINE_EXECUTION**](pipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **executions**
> executions (program_id: STRING_32 ; pipeline_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; start:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable PIPELINE_EXECUTION_LIST_REPRESENTATION
	

List Executions

Returns the history of pipeline executions in a newest to oldest order


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **start** | **STRING_32**| Pagination start parameter | [optional] [default to null]
 **limit** | **INTEGER_32**| Pagination limit parameter | [optional] [default to null]

### Return type

[**PIPELINE_EXECUTION_LIST_REPRESENTATION**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_pipeline**
> start_pipeline (program_id: STRING_32 ; pipeline_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; content__type: STRING_32 )
	

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **content__type** | **STRING_32**| Must always be application/json | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **step_logs**
> step_logs (program_id: STRING_32 ; pipeline_id: STRING_32 ; execution_id: STRING_32 ; phase_id: STRING_32 ; step_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; file:  detachable STRING_32 ; accept:  detachable STRING_32 )
	

Get logs

Get the logs associated with a step.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **execution_id** | **STRING_32**| Identifier of the execution | [default to null]
 **phase_id** | **STRING_32**| Identifier of the phase | [default to null]
 **step_id** | **STRING_32**| Identifier of the step | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **file** | **STRING_32**| Identifier of the log file | [optional] [default to null]
 **accept** | **STRING_32**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **step_metric**
> step_metric (program_id: STRING_32 ; pipeline_id: STRING_32 ; execution_id: STRING_32 ; phase_id: STRING_32 ; step_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PIPELINE_STEP_METRICS
	

Get step metrics


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **execution_id** | **STRING_32**| Identifier of the execution | [default to null]
 **phase_id** | **STRING_32**| Identifier of the phase | [default to null]
 **step_id** | **STRING_32**| Identifier of the step | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PIPELINE_STEP_METRICS**](pipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **step_state**
> step_state (program_id: STRING_32 ; pipeline_id: STRING_32 ; execution_id: STRING_32 ; phase_id: STRING_32 ; step_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PIPELINE_EXECUTION_STEP_STATE
	

Get step state


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program. | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **execution_id** | **STRING_32**| Identifier of the execution | [default to null]
 **phase_id** | **STRING_32**| Identifier of the phase | [default to null]
 **step_id** | **STRING_32**| Identifier of the step | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PIPELINE_EXECUTION_STEP_STATE**](pipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

