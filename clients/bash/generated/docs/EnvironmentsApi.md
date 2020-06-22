# EnvironmentsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvironment**](EnvironmentsApi.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**downloadLogs**](EnvironmentsApi.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**getEnvironment**](EnvironmentsApi.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**getEnvironmentLogs**](EnvironmentsApi.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**getEnvironments**](EnvironmentsApi.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments



## deleteEnvironment

DeleteEnvironment

Delete environment

### Example

```bash
 deleteEnvironment programId=value environmentId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the application | [default to null]
 **environmentId** | **string** | Identifier of the environment | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## downloadLogs

Download Logs

Download environment logs

### Example

```bash
 downloadLogs programId=value environmentId=value  service=value  name=value  date=value x-gw-ims-org-id:value Authorization:value x-api-key:value Accept:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **environmentId** | **string** | Identifier of the environment | [default to null]
 **service** | **string** | Name of service | [default to null]
 **name** | **string** | Name of log | [default to null]
 **date** | **string** | date for which log is required | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **accept** | **string** | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getEnvironment

Get Environment

Returns an environment by its id

### Example

```bash
 getEnvironment programId=value environmentId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **environmentId** | **string** | Identifier of the environment | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getEnvironmentLogs

Get Environment Logs

List all logs available in environment

### Example

```bash
 getEnvironmentLogs programId=value environmentId=value  days=value x-gw-ims-org-id:value Authorization:value x-api-key:value  Specify as:  service=value1 service=value2 service=...  Specify as:  name=value1 name=value2 name=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **environmentId** | **string** | Identifier of the environment | [default to null]
 **days** | **integer** | number of days for which logs are required | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **service** | [**array[string]**](string.md) | Names of services | [optional] [default to null]
 **name** | [**array[string]**](string.md) | Names of log | [optional] [default to null]

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getEnvironments

List Environments

Lists all environments in an program

### Example

```bash
 getEnvironments programId=value x-gw-ims-org-id:value Authorization:value x-api-key:value  type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **type** | **string** | Type of the environment | [optional] [default to null]

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

