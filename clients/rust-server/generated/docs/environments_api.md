# environments_api

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
**deleteEnvironment**](environments_api.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
**downloadLogs**](environments_api.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
**getEnvironment**](environments_api.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
**getEnvironmentLogs**](environments_api.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
**getEnvironments**](environments_api.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments


# **deleteEnvironment**
> models::Environment deleteEnvironment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
DeleteEnvironment

Delete environment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the application | 
  **environment_id** | **String**| Identifier of the environment | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **downloadLogs**
> downloadLogs(program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, optional)
Download Logs

Download environment logs

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **environment_id** | **String**| Identifier of the environment | 
  **service** | **String**| Name of service | 
  **name** | **String**| Name of log | 
  **date** | **String**| date for which log is required | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **environment_id** | **String**| Identifier of the environment | 
 **service** | **String**| Name of service | 
 **name** | **String**| Name of log | 
 **date** | **String**| date for which log is required | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironment**
> models::Environment getEnvironment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
Get Environment

Returns an environment by its id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **environment_id** | **String**| Identifier of the environment | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironmentLogs**
> models::EnvironmentLogs getEnvironmentLogs(program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, optional)
Get Environment Logs

List all logs available in environment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **environment_id** | **String**| Identifier of the environment | 
  **days** | **i32**| number of days for which logs are required | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **environment_id** | **String**| Identifier of the environment | 
 **days** | **i32**| number of days for which logs are required | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | [**String**](String.md)| Names of services | 
 **name** | [**String**](String.md)| Names of log | 

### Return type

[**models::EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getEnvironments**
> models::EnvironmentList getEnvironments(program_id, x_gw_ims_org_id, authorization, x_api_key, optional)
List Environments

Lists all environments in an program

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **_type** | **String**| Type of the environment | 

### Return type

[**models::EnvironmentList**](environmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

