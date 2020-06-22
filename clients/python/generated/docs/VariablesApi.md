# pyaem_cloudmanager_api_client.VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_environment_variables**](VariablesApi.md#get_environment_variables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patch_environment_variables**](VariablesApi.md#patch_environment_variables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


# **get_environment_variables**
> VariableList get_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

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
    api_instance = pyaem_cloudmanager_api_client.VariablesApi(api_client)
    program_id = '2351' # str | Identifier of the program
environment_id = '128' # str | Identifier of the environment
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # List User Environment Variables
        api_response = api_instance.get_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling VariablesApi->get_environment_variables: %s\n" % e)
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

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of environment variables |  -  |
**404** | Environment not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_environment_variables**
> VariableList patch_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

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
    api_instance = pyaem_cloudmanager_api_client.VariablesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
environment_id = 'environment_id_example' # str | Identifier of the environment
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # str | Must always be application/json
body = [pyaem_cloudmanager_api_client.Variable()] # list[Variable] | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.

    try:
        # Patch User Environment Variables
        api_response = api_instance.patch_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling VariablesApi->patch_environment_variables: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **environment_id** | **str**| Identifier of the environment | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **str**| Must always be application/json | 
 **body** | [**list[Variable]**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful update of environment variables |  -  |
**404** | Environment not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

