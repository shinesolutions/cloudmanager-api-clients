# pyaem_cloudmanager_api_client.PipelineExecutionApi

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
> advance_pipeline_execution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
execution_id = 'execution_id_example' # str | Identifier of the execution
phase_id = 'phase_id_example' # str | Identifier of the phase
step_id = 'step_id_example' # str | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # str | Must always be application/json
body = None # object | Input for advance. See documentation for details.

    try:
        # Advance
        api_instance.advance_pipeline_execution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->advance_pipeline_execution: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **execution_id** | **str**| Identifier of the execution | 
 **phase_id** | **str**| Identifier of the phase | 
 **step_id** | **str**| Identifier of the step | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **str**| Must always be application/json | 
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
**202** | Successful resume of pipeline execution |  -  |
**403** | Missing permission for user to advance the pipeline execution |  -  |
**404** | No pipeline execution exits or unknown pipeline or program |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_pipeline_execution_step**
> cancel_pipeline_execution_step(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
execution_id = 'execution_id_example' # str | Identifier of the execution
phase_id = 'phase_id_example' # str | Identifier of the phase
step_id = 'step_id_example' # str | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # str | Must always be application/json
body = None # object | Input for advance. See documentation for details.

    try:
        # Cancel
        api_instance.cancel_pipeline_execution_step(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->cancel_pipeline_execution_step: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **execution_id** | **str**| Identifier of the execution | 
 **phase_id** | **str**| Identifier of the phase | 
 **step_id** | **str**| Identifier of the step | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **str**| Must always be application/json | 
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
**202** | Successful cancel of pipeline execution |  -  |
**403** | Missing permission for user to cancel the current pipeline execution |  -  |
**404** | No pipeline execution exits or unknown pipeline or program |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_current_execution**
> PipelineExecution get_current_execution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)

Get current pipeline execution

Returns current pipeline execution if any.

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Get current pipeline execution
        api_response = api_instance.get_current_execution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->get_current_execution: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_execution**
> PipelineExecution get_execution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key)

Get pipeline execution

Returns a pipeline execution by id

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
execution_id = 'execution_id_example' # str | Identifier of the execution
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Get pipeline execution
        api_response = api_instance.get_execution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->get_execution: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **execution_id** | **str**| Identifier of the execution | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_executions**
> PipelineExecutionListRepresentation get_executions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, start=start, limit=limit)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
start = 'start_example' # str | Pagination start parameter (optional)
limit = 56 # int | Pagination limit parameter (optional)

    try:
        # List Executions
        api_response = api_instance.get_executions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, start=start, limit=limit)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->get_executions: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **str**| Pagination start parameter | [optional] 
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
**200** | Successful retrieval of execution history |  -  |
**403** | Missing permission for user to read executions |  -  |
**404** | Pipeline does not exist |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_step_logs**
> get_step_logs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, file=file, accept=accept)

Get logs

Get the logs associated with a step.

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
execution_id = 'execution_id_example' # str | Identifier of the execution
phase_id = 'phase_id_example' # str | Identifier of the phase
step_id = 'step_id_example' # str | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
file = 'file_example' # str | Identifier of the log file (optional)
accept = 'accept_example' # str | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)

    try:
        # Get logs
        api_instance.get_step_logs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, file=file, accept=accept)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->get_step_logs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **execution_id** | **str**| Identifier of the execution | 
 **phase_id** | **str**| Identifier of the phase | 
 **step_id** | **str**| Identifier of the step | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **file** | **str**| Identifier of the log file | [optional] 
 **accept** | **str**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

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
**200** | Successful retrieval of logs |  -  |
**403** | Missing permission for user to read logs |  -  |
**404** | Pipeline execution does not exist |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_pipeline**
> start_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # str | Must always be application/json

    try:
        # Start the pipeline
        api_instance.start_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->start_pipeline: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **str**| Must always be application/json | 

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
**201** | Successful started pipeline execution |  -  |
**400** | Request conflicts with the expected state of pipeline |  -  |
**404** | No pipeline execution exits or unknown pipeline or application |  -  |
**412** | Cannot start execution: programId&#x3D;{programId}, pipelineId&#x3D;{pipelineId} currentExecutionId&#x3D;{executionId}, reason&#x3D;&#39;Execution already in progress. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **step_metric**
> PipelineStepMetrics step_metric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)

Get step metrics

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
execution_id = 'execution_id_example' # str | Identifier of the execution
phase_id = 'phase_id_example' # str | Identifier of the phase
step_id = 'step_id_example' # str | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Get step metrics
        api_response = api_instance.step_metric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->step_metric: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **execution_id** | **str**| Identifier of the execution | 
 **phase_id** | **str**| Identifier of the phase | 
 **step_id** | **str**| Identifier of the step | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **step_state**
> PipelineExecutionStepState step_state(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)

Get step state

### Example

```python
from __future__ import print_function
import time
import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaem_cloudmanager_api_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaem_cloudmanager_api_client.PipelineExecutionApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
execution_id = 'execution_id_example' # str | Identifier of the execution
phase_id = 'phase_id_example' # str | Identifier of the phase
step_id = 'step_id_example' # str | Identifier of the step
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Get step state
        api_response = api_instance.step_state(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PipelineExecutionApi->step_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **execution_id** | **str**| Identifier of the execution | 
 **phase_id** | **str**| Identifier of the phase | 
 **step_id** | **str**| Identifier of the step | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

