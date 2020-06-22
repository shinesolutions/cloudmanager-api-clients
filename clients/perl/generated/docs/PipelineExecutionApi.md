# WWW::OpenAPIClient::PipelineExecutionApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PipelineExecutionApi;
```

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


# **advance_pipeline_execution**
> advance_pipeline_execution(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $execution_id = "execution_id_example"; # string | Identifier of the execution
my $phase_id = "phase_id_example"; # string | Identifier of the phase
my $step_id = "step_id_example"; # string | Identifier of the step
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $content_type = "content_type_example"; # string | Must always be application/json
my $body = WWW::OpenAPIClient::Object::object->new(); # object | Input for advance. See documentation for details.

eval { 
    $api_instance->advance_pipeline_execution(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->advance_pipeline_execution: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **execution_id** | **string**| Identifier of the execution | 
 **phase_id** | **string**| Identifier of the phase | 
 **step_id** | **string**| Identifier of the step | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **string**| Must always be application/json | 
 **body** | **object**| Input for advance. See documentation for details. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_pipeline_execution_step**
> cancel_pipeline_execution_step(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $execution_id = "execution_id_example"; # string | Identifier of the execution
my $phase_id = "phase_id_example"; # string | Identifier of the phase
my $step_id = "step_id_example"; # string | Identifier of the step
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $content_type = "content_type_example"; # string | Must always be application/json
my $body = WWW::OpenAPIClient::Object::object->new(); # object | Input for advance. See documentation for details.

eval { 
    $api_instance->cancel_pipeline_execution_step(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->cancel_pipeline_execution_step: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **execution_id** | **string**| Identifier of the execution | 
 **phase_id** | **string**| Identifier of the phase | 
 **step_id** | **string**| Identifier of the step | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **string**| Must always be application/json | 
 **body** | **object**| Input for advance. See documentation for details. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_current_execution**
> PipelineExecution get_current_execution(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Get current pipeline execution

Returns current pipeline execution if any.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_current_execution(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->get_current_execution: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_execution**
> PipelineExecution get_execution(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Get pipeline execution

Returns a pipeline execution by id

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $execution_id = "execution_id_example"; # string | Identifier of the execution
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_execution(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->get_execution: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **execution_id** | **string**| Identifier of the execution | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_executions**
> PipelineExecutionListRepresentation get_executions(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, start => $start, limit => $limit)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $start = "start_example"; # string | Pagination start parameter
my $limit = 56; # int | Pagination limit parameter

eval { 
    my $result = $api_instance->get_executions(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, start => $start, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->get_executions: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **string**| Pagination start parameter | [optional] 
 **limit** | **int**| Pagination limit parameter | [optional] 

### Return type

[**PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_step_logs**
> get_step_logs(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, file => $file, accept => $accept)

Get logs

Get the logs associated with a step.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $execution_id = "execution_id_example"; # string | Identifier of the execution
my $phase_id = "phase_id_example"; # string | Identifier of the phase
my $step_id = "step_id_example"; # string | Identifier of the step
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $file = "file_example"; # string | Identifier of the log file
my $accept = "accept_example"; # string | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.

eval { 
    $api_instance->get_step_logs(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, file => $file, accept => $accept);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->get_step_logs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **execution_id** | **string**| Identifier of the execution | 
 **phase_id** | **string**| Identifier of the phase | 
 **step_id** | **string**| Identifier of the step | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **file** | **string**| Identifier of the log file | [optional] 
 **accept** | **string**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_pipeline**
> start_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $content_type = "content_type_example"; # string | Must always be application/json

eval { 
    $api_instance->start_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->start_pipeline: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **string**| Must always be application/json | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **step_metric**
> PipelineStepMetrics step_metric(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Get step metrics

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $execution_id = "execution_id_example"; # string | Identifier of the execution
my $phase_id = "phase_id_example"; # string | Identifier of the phase
my $step_id = "step_id_example"; # string | Identifier of the step
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->step_metric(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->step_metric: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **execution_id** | **string**| Identifier of the execution | 
 **phase_id** | **string**| Identifier of the phase | 
 **step_id** | **string**| Identifier of the step | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineStepMetrics**](PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **step_state**
> PipelineExecutionStepState step_state(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Get step state

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelineExecutionApi;
my $api_instance = WWW::OpenAPIClient::PipelineExecutionApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $execution_id = "execution_id_example"; # string | Identifier of the execution
my $phase_id = "phase_id_example"; # string | Identifier of the phase
my $step_id = "step_id_example"; # string | Identifier of the step
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->step_state(program_id => $program_id, pipeline_id => $pipeline_id, execution_id => $execution_id, phase_id => $phase_id, step_id => $step_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PipelineExecutionApi->step_state: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **execution_id** | **string**| Identifier of the execution | 
 **phase_id** | **string**| Identifier of the phase | 
 **step_id** | **string**| Identifier of the step | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecutionStepState**](PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

