# pyaem_cloudmanager_api_client.PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_pipeline**](PipelinesApi.md#delete_pipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**get_pipeline**](PipelinesApi.md#get_pipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**get_pipelines**](PipelinesApi.md#get_pipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patch_pipeline**](PipelinesApi.md#patch_pipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


# **delete_pipeline**
> delete_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

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
    api_instance = pyaem_cloudmanager_api_client.PipelinesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Delete a Pipeline
        api_instance.delete_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
    except ApiException as e:
        print("Exception when calling PipelinesApi->delete_pipeline: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

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
**0** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_pipeline**
> Pipeline get_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)

Get Pipeline

Returns a pipeline by its id

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
    api_instance = pyaem_cloudmanager_api_client.PipelinesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Get Pipeline
        api_response = api_instance.get_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PipelinesApi->get_pipeline: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of pipeline |  -  |
**404** | Pipeline not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_pipelines**
> PipelineList get_pipelines(program_id, x_gw_ims_org_id, authorization, x_api_key)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

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
    api_instance = pyaem_cloudmanager_api_client.PipelinesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # List Pipelines
        api_response = api_instance.get_pipelines(program_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PipelinesApi->get_pipelines: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_pipeline**
> Pipeline patch_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)

Patches Pipeline

Patches a pipeline within an program.

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
    api_instance = pyaem_cloudmanager_api_client.PipelinesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
pipeline_id = 'pipeline_id_example' # str | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # str | Must always be application/json
body = pyaem_cloudmanager_api_client.Pipeline() # Pipeline | The updated Pipeline

    try:
        # Patches Pipeline
        api_response = api_instance.patch_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PipelinesApi->patch_pipeline: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **pipeline_id** | **str**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **str**| Must always be application/json | 
 **body** | [**Pipeline**](Pipeline.md)| The updated Pipeline | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

