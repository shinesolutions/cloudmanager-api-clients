# pyaemcloudmanagerapi.RepositoriesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_repositories**](RepositoriesApi.md#get_repositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**get_repository**](RepositoriesApi.md#get_repository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository


# **get_repositories**
> RepositoryList get_repositories(program_id, x_gw_ims_org_id, authorization, x_api_key)

Lists Repositories

Lists all Repositories in an program

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
    api_instance = pyaemcloudmanagerapi.RepositoriesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Lists Repositories
        api_response = api_instance.get_repositories(program_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling RepositoriesApi->get_repositories: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**RepositoryList**](RepositoryList.md)

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

# **get_repository**
> Repository get_repository(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key)

Get Repository

Returns an repository by its id

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
    api_instance = pyaemcloudmanagerapi.RepositoriesApi(api_client)
    program_id = 'program_id_example' # str | Identifier of the program
repository_id = 'repository_id_example' # str | Identifier of the repository
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # str | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # str | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # str | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

    try:
        # Get Repository
        api_response = api_instance.get_repository(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling RepositoriesApi->get_repository: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **str**| Identifier of the program | 
 **repository_id** | **str**| Identifier of the repository | 
 **x_gw_ims_org_id** | **str**| IMS organization ID that the request is being made under. | 
 **authorization** | **str**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **str**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Repository**](Repository.md)

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

