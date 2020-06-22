# \PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advance_pipeline_execution**](PipelineExecutionApi.md#advance_pipeline_execution) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancel_pipeline_execution_step**](PipelineExecutionApi.md#cancel_pipeline_execution_step) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**get_current_execution**](PipelineExecutionApi.md#get_current_execution) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**get_execution**](PipelineExecutionApi.md#get_execution) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**get_executions**](PipelineExecutionApi.md#get_executions) | **Get** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**get_step_logs**](PipelineExecutionApi.md#get_step_logs) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**start_pipeline**](PipelineExecutionApi.md#start_pipeline) | **Put** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**step_metric**](PipelineExecutionApi.md#step_metric) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**step_state**](PipelineExecutionApi.md#step_state) | **Get** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state



## advance_pipeline_execution

> advance_pipeline_execution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**execution_id** | **String** | Identifier of the execution | [required] |
**phase_id** | **String** | Identifier of the phase | [required] |
**step_id** | **String** | Identifier of the step | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**content_type** | **String** | Must always be application/json | [required] |
**body** | **serde_json::Value** | Input for advance. See documentation for details. | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## cancel_pipeline_execution_step

> cancel_pipeline_execution_step(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**execution_id** | **String** | Identifier of the execution | [required] |
**phase_id** | **String** | Identifier of the phase | [required] |
**step_id** | **String** | Identifier of the step | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**content_type** | **String** | Must always be application/json | [required] |
**body** | **serde_json::Value** | Input for advance. See documentation for details. | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_current_execution

> crate::models::PipelineExecution get_current_execution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
Get current pipeline execution

Returns current pipeline execution if any.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::PipelineExecution**](pipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_execution

> crate::models::PipelineExecution get_execution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key)
Get pipeline execution

Returns a pipeline execution by id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**execution_id** | **String** | Identifier of the execution | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::PipelineExecution**](pipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_executions

> crate::models::PipelineExecutionListRepresentation get_executions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, start, limit)
List Executions

Returns the history of pipeline executions in a newest to oldest order

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**start** | Option<**String**> | Pagination start parameter |  |
**limit** | Option<**i32**> | Pagination limit parameter |  |

### Return type

[**crate::models::PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_step_logs

> get_step_logs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, file, accept)
Get logs

Get the logs associated with a step.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**execution_id** | **String** | Identifier of the execution | [required] |
**phase_id** | **String** | Identifier of the phase | [required] |
**step_id** | **String** | Identifier of the step | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**file** | Option<**String**> | Identifier of the log file |  |
**accept** | Option<**String**> | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## start_pipeline

> start_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type)
Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**content_type** | **String** | Must always be application/json | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## step_metric

> crate::models::PipelineStepMetrics step_metric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
Get step metrics

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**execution_id** | **String** | Identifier of the execution | [required] |
**phase_id** | **String** | Identifier of the phase | [required] |
**step_id** | **String** | Identifier of the step | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::PipelineStepMetrics**](pipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## step_state

> crate::models::PipelineExecutionStepState step_state(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
Get step state

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program. | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**execution_id** | **String** | Identifier of the execution | [required] |
**phase_id** | **String** | Identifier of the phase | [required] |
**step_id** | **String** | Identifier of the step | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::PipelineExecutionStepState**](pipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

