# \EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_environment**](EnvironmentsApi.md#delete_environment) | **Delete** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**download_logs**](EnvironmentsApi.md#download_logs) | **Get** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**get_environment**](EnvironmentsApi.md#get_environment) | **Get** /api/program/{programId}/environment/{environmentId} | Get Environment
[**get_environment_logs**](EnvironmentsApi.md#get_environment_logs) | **Get** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**get_environments**](EnvironmentsApi.md#get_environments) | **Get** /api/program/{programId}/environments | List Environments



## delete_environment

> crate::models::Environment delete_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
DeleteEnvironment

Delete environment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the application | [required] |
**environment_id** | **String** | Identifier of the environment | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## download_logs

> download_logs(program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, accept)
Download Logs

Download environment logs

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**environment_id** | **String** | Identifier of the environment | [required] |
**service** | **String** | Name of service | [required] |
**name** | **String** | Name of log | [required] |
**date** | **String** | date for which log is required | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**accept** | Option<**String**> | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. |  |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_environment

> crate::models::Environment get_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
Get Environment

Returns an environment by its id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**environment_id** | **String** | Identifier of the environment | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_environment_logs

> crate::models::EnvironmentLogs get_environment_logs(program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, service, name)
Get Environment Logs

List all logs available in environment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**environment_id** | **String** | Identifier of the environment | [required] |
**days** | **i32** | number of days for which logs are required | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**service** | Option<[**Vec<String>**](String.md)> | Names of services |  |
**name** | Option<[**Vec<String>**](String.md)> | Names of log |  |

### Return type

[**crate::models::EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_environments

> crate::models::EnvironmentList get_environments(program_id, x_gw_ims_org_id, authorization, x_api_key, _type)
List Environments

Lists all environments in an program

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**_type** | Option<**String**> | Type of the environment |  |

### Return type

[**crate::models::EnvironmentList**](environmentList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

