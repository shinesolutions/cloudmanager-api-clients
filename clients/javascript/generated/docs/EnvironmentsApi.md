# NodeAemCloudmanagerApiClient.EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvironment**](EnvironmentsApi.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**downloadLogs**](EnvironmentsApi.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**getEnvironment**](EnvironmentsApi.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**getEnvironmentLogs**](EnvironmentsApi.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**getEnvironments**](EnvironmentsApi.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments



## deleteEnvironment

> Environment deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey)

DeleteEnvironment

Delete environment

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.EnvironmentsApi();
let programId = "programId_example"; // String | Identifier of the application
let environmentId = "environmentId_example"; // String | Identifier of the environment
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the application | 
 **environmentId** | **String**| Identifier of the environment | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## downloadLogs

> downloadLogs(programId, environmentId, service, name, _date, xGwImsOrgId, authorization, xApiKey, opts)

Download Logs

Download environment logs

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.EnvironmentsApi();
let programId = "programId_example"; // String | Identifier of the program
let environmentId = "environmentId_example"; // String | Identifier of the environment
let service = "service_example"; // String | Name of service
let name = "name_example"; // String | Name of log
let _date = "_date_example"; // String | date for which log is required
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let opts = {
  'accept': "accept_example" // String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
};
apiInstance.downloadLogs(programId, environmentId, service, name, _date, xGwImsOrgId, authorization, xApiKey, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | 
 **environmentId** | **String**| Identifier of the environment | 
 **service** | **String**| Name of service | 
 **name** | **String**| Name of log | 
 **_date** | **String**| date for which log is required | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEnvironment

> Environment getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey)

Get Environment

Returns an environment by its id

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.EnvironmentsApi();
let programId = "programId_example"; // String | Identifier of the program
let environmentId = "environmentId_example"; // String | Identifier of the environment
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | 
 **environmentId** | **String**| Identifier of the environment | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEnvironmentLogs

> EnvironmentLogs getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, opts)

Get Environment Logs

List all logs available in environment

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.EnvironmentsApi();
let programId = "programId_example"; // String | Identifier of the program
let environmentId = "environmentId_example"; // String | Identifier of the environment
let days = 56; // Number | number of days for which logs are required
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let opts = {
  'service': ["null"], // [String] | Names of services
  'name': ["null"] // [String] | Names of log
};
apiInstance.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | 
 **environmentId** | **String**| Identifier of the environment | 
 **days** | **Number**| number of days for which logs are required | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | [**[String]**](String.md)| Names of services | [optional] 
 **name** | [**[String]**](String.md)| Names of log | [optional] 

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEnvironments

> EnvironmentList getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, opts)

List Environments

Lists all environments in an program

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.EnvironmentsApi();
let programId = "programId_example"; // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let opts = {
  'type': "type_example" // String | Type of the environment
};
apiInstance.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **type** | **String**| Type of the environment | [optional] 

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

