# pyaemcloudmanagerapi.EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_environment**](EnvironmentsApi.md#delete_environment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**download_logs**](EnvironmentsApi.md#download_logs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**get_environment**](EnvironmentsApi.md#get_environment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**get_environment_logs**](EnvironmentsApi.md#get_environment_logs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**get_environments**](EnvironmentsApi.md#get_environments) | **GET** /api/program/{programId}/environments | List Environments


# **delete_environment**
> Environment delete_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)

DeleteEnvironment

Delete environment

### Example

```python
from __future__ import print_function
import time
import pyaemcloudmanagerapi
from pyaemcloudmanagerapi.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaemcloudmanagerapi.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaemcloudmanagerapi.EnvironmentsApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the application
environment_id = 'environment_id_example' # str | Identifier of the environment
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # DeleteEnvironment
        api_response = api_instance.delete_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling EnvironmentsApi->delete_environment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the application | 
 **environment_id** | **str**| Identifier of the environment | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Environment deleted |  -  |
**400** | Environment deletion in progress |  -  |
**404** | Environment not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_logs**
> download_logs(program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, accept=accept)

Download Logs

Download environment logs

### Example

```python
from __future__ import print_function
import time
import pyaemcloudmanagerapi
from pyaemcloudmanagerapi.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaemcloudmanagerapi.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaemcloudmanagerapi.EnvironmentsApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
environment_id = 'environment_id_example' # str | Identifier of the environment
service = 'service_example' # str | Name of service
name = 'name_example' # str | Name of log
date = 'date_example' # str | date for which log is required
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
accept = 'accept_example' # str | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)

    try:
        # Download Logs
        api_instance.download_logs(program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, accept=accept)
    except ApiException as e:
        print("Exception when calling EnvironmentsApi->download_logs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **environment_id** | **str**| Identifier of the environment | 
 **service** | **str**| Name of service | 
 **name** | **str**| Name of log | 
 **date** | **str**| date for which log is required | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **str**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of logs |  -  |
**400** | invalid parameters |  -  |
**404** | Environment not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_environment**
> Environment get_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)

Get Environment

Returns an environment by its id

### Example

```python
from __future__ import print_function
import time
import pyaemcloudmanagerapi
from pyaemcloudmanagerapi.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaemcloudmanagerapi.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaemcloudmanagerapi.EnvironmentsApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
environment_id = 'environment_id_example' # str | Identifier of the environment
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Get Environment
        api_response = api_instance.get_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling EnvironmentsApi->get_environment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **environment_id** | **str**| Identifier of the environment | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

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

# **get_environment_logs**
> EnvironmentLogs get_environment_logs(program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, service=service, name=name)

Get Environment Logs

List all logs available in environment

### Example

```python
from __future__ import print_function
import time
import pyaemcloudmanagerapi
from pyaemcloudmanagerapi.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaemcloudmanagerapi.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaemcloudmanagerapi.EnvironmentsApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
environment_id = 'environment_id_example' # str | Identifier of the environment
days = 56 # int | number of days for which logs are required
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
service = ['service_example'] # list[str] | Names of services (optional)
name = ['name_example'] # list[str] | Names of log (optional)

    try:
        # Get Environment Logs
        api_response = api_instance.get_environment_logs(program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, service=service, name=name)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling EnvironmentsApi->get_environment_logs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **environment_id** | **str**| Identifier of the environment | 
 **days** | **int**| number of days for which logs are required | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | [**list[str]**](str.md)| Names of services | [optional] 
 **name** | [**list[str]**](str.md)| Names of log | [optional] 

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of logs for an environment |  -  |
**400** | invalid parameters |  -  |
**404** | Environment not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_environments**
> EnvironmentList get_environments(program_id, x_gw_ims_org_id, authorization, x_api_key, type=type)

List Environments

Lists all environments in an program

### Example

```python
from __future__ import print_function
import time
import pyaemcloudmanagerapi
from pyaemcloudmanagerapi.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with pyaemcloudmanagerapi.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = pyaemcloudmanagerapi.EnvironmentsApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
type = 'type_example' # str | Type of the environment (optional)

    try:
        # List Environments
        api_response = api_instance.get_environments(program_id, x_gw_ims_org_id, authorization, x_api_key, type=type)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling EnvironmentsApi->get_environments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **type** | **str**| Type of the environment | [optional] 

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of environment list |  -  |
**404** | Program not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

