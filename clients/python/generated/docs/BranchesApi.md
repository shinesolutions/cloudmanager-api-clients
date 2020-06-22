# pyaem_cloudmanager_api_client.BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_branches**](BranchesApi.md#get_branches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


# **get_branches**
> BranchList get_branches(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key)

List Branches

Returns the list of branches from a repository

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
    api_instance = pyaem_cloudmanager_api_client.BranchesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program.
repository_id = 'repository_id_example' # str | Identifier of the repository
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # List Branches
        api_response = api_instance.get_branches(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling BranchesApi->get_branches: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program. | 
 **repository_id** | **str**| Identifier of the repository | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of the list of repository branches |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

