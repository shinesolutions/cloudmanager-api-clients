# ENVIRONMENTS_API

All URIs are relative to *https://cloudmanager.adobe.io*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**delete_environment**](ENVIRONMENTS_API.md#delete_environment) | **Delete** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**download_logs**](ENVIRONMENTS_API.md#download_logs) | **Get** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**environment**](ENVIRONMENTS_API.md#environment) | **Get** /api/program/{programId}/environment/{environmentId} | Get Environment
[**environment_logs**](ENVIRONMENTS_API.md#environment_logs) | **Get** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**environments**](ENVIRONMENTS_API.md#environments) | **Get** /api/program/{programId}/environments | List Environments


# **delete_environment**
> delete_environment (program_id: STRING_32 ; environment_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable ENVIRONMENT
	

DeleteEnvironment

Delete environment


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the application | [default to null]
 **environment_id** | **STRING_32**| Identifier of the environment | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**ENVIRONMENT**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_logs**
> download_logs (program_id: STRING_32 ; environment_id: STRING_32 ; service: STRING_32 ; name: STRING_32 ; date: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; accept:  detachable STRING_32 )
	

Download Logs

Download environment logs


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **environment_id** | **STRING_32**| Identifier of the environment | [default to null]
 **service** | **STRING_32**| Name of service | [default to null]
 **name** | **STRING_32**| Name of log | [default to null]
 **date** | **STRING_32**| date for which log is required | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **accept** | **STRING_32**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **environment**
> environment (program_id: STRING_32 ; environment_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable ENVIRONMENT
	

Get Environment

Returns an environment by its id


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **environment_id** | **STRING_32**| Identifier of the environment | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**ENVIRONMENT**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **environment_logs**
> environment_logs (program_id: STRING_32 ; environment_id: STRING_32 ; days: INTEGER_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; service:  detachable LIST [STRING_32] ; name:  detachable LIST [STRING_32] ): detachable ENVIRONMENT_LOGS
	

Get Environment Logs

List all logs available in environment


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **environment_id** | **STRING_32**| Identifier of the environment | [default to null]
 **days** | **INTEGER_32**| number of days for which logs are required | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **service** | [**LIST [STRING_32]**](STRING_32.md)| Names of services | [optional] [default to null]
 **name** | [**LIST [STRING_32]**](STRING_32.md)| Names of log | [optional] [default to null]

### Return type

[**ENVIRONMENT_LOGS**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **environments**
> environments (program_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; type:  detachable STRING_32 ): detachable ENVIRONMENT_LIST
	

List Environments

Lists all environments in an program


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **type** | **STRING_32**| Type of the environment | [optional] [default to null]

### Return type

[**ENVIRONMENT_LIST**](environmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

