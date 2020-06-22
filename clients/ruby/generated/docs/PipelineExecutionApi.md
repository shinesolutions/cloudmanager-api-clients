# AemCloudManagerApiClient::PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advance_pipeline_execution**](PipelineExecutionApi.md#advance_pipeline_execution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancel_pipeline_execution_step**](PipelineExecutionApi.md#cancel_pipeline_execution_step) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**get_current_execution**](PipelineExecutionApi.md#get_current_execution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**get_execution**](PipelineExecutionApi.md#get_execution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**get_executions**](PipelineExecutionApi.md#get_executions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**get_step_logs**](PipelineExecutionApi.md#get_step_logs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**start_pipeline**](PipelineExecutionApi.md#start_pipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**step_metric**](PipelineExecutionApi.md#step_metric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**step_state**](PipelineExecutionApi.md#step_state) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state



## advance_pipeline_execution

> advance_pipeline_execution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
execution_id = 'execution_id_example' # String | Identifier of the execution
phase_id = 'phase_id_example' # String | Identifier of the phase
step_id = 'step_id_example' # String | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # String | Must always be application/json
body = nil # Object | Input for advance. See documentation for details.

begin
  #Advance
  api_instance.advance_pipeline_execution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->advance_pipeline_execution: #{e}"
end
```

### Parameters


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
 **body** | **Object**| Input for advance. See documentation for details. | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## cancel_pipeline_execution_step

> cancel_pipeline_execution_step(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
execution_id = 'execution_id_example' # String | Identifier of the execution
phase_id = 'phase_id_example' # String | Identifier of the phase
step_id = 'step_id_example' # String | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # String | Must always be application/json
body = nil # Object | Input for advance. See documentation for details.

begin
  #Cancel
  api_instance.cancel_pipeline_execution_step(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->cancel_pipeline_execution_step: #{e}"
end
```

### Parameters


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
 **body** | **Object**| Input for advance. See documentation for details. | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## get_current_execution

> PipelineExecution get_current_execution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)

Get current pipeline execution

Returns current pipeline execution if any.

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Get current pipeline execution
  result = api_instance.get_current_execution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->get_current_execution: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program. | 
 **pipeline_id** | **String**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_execution

> PipelineExecution get_execution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key)

Get pipeline execution

Returns a pipeline execution by id

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
execution_id = 'execution_id_example' # String | Identifier of the execution
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Get pipeline execution
  result = api_instance.get_execution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->get_execution: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program. | 
 **pipeline_id** | **String**| Identifier of the pipeline | 
 **execution_id** | **String**| Identifier of the execution | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_executions

> PipelineExecutionListRepresentation get_executions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, opts)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
opts = {
  start: 'start_example', # String | Pagination start parameter
  limit: 56 # Integer | Pagination limit parameter
}

begin
  #List Executions
  result = api_instance.get_executions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, opts)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->get_executions: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program. | 
 **pipeline_id** | **String**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **String**| Pagination start parameter | [optional] 
 **limit** | **Integer**| Pagination limit parameter | [optional] 

### Return type

[**PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_step_logs

> get_step_logs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, opts)

Get logs

Get the logs associated with a step.

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
execution_id = 'execution_id_example' # String | Identifier of the execution
phase_id = 'phase_id_example' # String | Identifier of the phase
step_id = 'step_id_example' # String | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
opts = {
  file: 'file_example', # String | Identifier of the log file
  accept: 'accept_example' # String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
}

begin
  #Get logs
  api_instance.get_step_logs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, opts)
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->get_step_logs: #{e}"
end
```

### Parameters


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
 **file** | **String**| Identifier of the log file | [optional] 
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## start_pipeline

> start_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # String | Must always be application/json

begin
  #Start the pipeline
  api_instance.start_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type)
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->start_pipeline: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program. | 
 **pipeline_id** | **String**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **String**| Must always be application/json | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## step_metric

> PipelineStepMetrics step_metric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)

Get step metrics

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
execution_id = 'execution_id_example' # String | Identifier of the execution
phase_id = 'phase_id_example' # String | Identifier of the phase
step_id = 'step_id_example' # String | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Get step metrics
  result = api_instance.step_metric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->step_metric: #{e}"
end
```

### Parameters


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

[**PipelineStepMetrics**](PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## step_state

> PipelineExecutionStepState step_state(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)

Get step state

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelineExecutionApi.new
program_id = 'program_id_example' # String | Identifier of the program.
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
execution_id = 'execution_id_example' # String | Identifier of the execution
phase_id = 'phase_id_example' # String | Identifier of the phase
step_id = 'step_id_example' # String | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Get step state
  result = api_instance.step_state(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelineExecutionApi->step_state: #{e}"
end
```

### Parameters


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

[**PipelineExecutionStepState**](PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

