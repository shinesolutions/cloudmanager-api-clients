# pyaemcloudmanagerapi.ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_program**](ProgramsApi.md#delete_program) | **DELETE** /api/program/{programId} | Delete Program
[**get_program**](ProgramsApi.md#get_program) | **GET** /api/program/{programId} | Get Program
[**get_programs**](ProgramsApi.md#get_programs) | **GET** /api/programs | Lists Programs


# **delete_program**
> Program delete_program(program_id, x_gw_ims_org_id, authorization, x_api_key)

Delete Program

Delete an program

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
    api_instance = pyaemcloudmanagerapi.ProgramsApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Delete Program
        api_response = api_instance.delete_program(program_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ProgramsApi->delete_program: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**202** | Delete was successful. |  -  |
**403** | Forbidden. |  -  |
**404** | Program not found. |  -  |
**412** | Deletion not supported |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_program**
> Program get_program(program_id, x_gw_ims_org_id, authorization, x_api_key)

Get Program

Returns a program by its id

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
    api_instance = pyaemcloudmanagerapi.ProgramsApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Get Program
        api_response = api_instance.get_program(program_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ProgramsApi->get_program: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of program |  -  |
**404** | Program not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_programs**
> ProgramList get_programs(x_gw_ims_org_id, authorization, x_api_key)

Lists Programs

Returns all programs that the requesting user has access to

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
    api_instance = pyaemcloudmanagerapi.ProgramsApi(api_client)
    x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Lists Programs
        api_response = api_instance.get_programs(x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ProgramsApi->get_programs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**ProgramList**](ProgramList.md)

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

