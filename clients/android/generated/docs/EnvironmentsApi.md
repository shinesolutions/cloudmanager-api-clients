# EnvironmentsApi

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

```java
// Import classes:
//import org.openapitools.client.api.EnvironmentsApi;

EnvironmentsApi apiInstance = new EnvironmentsApi();
String programId = null; // String | Identifier of the application
String environmentId = null; // String | Identifier of the environment
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    Environment result = apiInstance.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#deleteEnvironment");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the application | [default to null]
 **environmentId** | **String**| Identifier of the environment | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## downloadLogs

> downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept)

Download Logs

Download environment logs

### Example

```java
// Import classes:
//import org.openapitools.client.api.EnvironmentsApi;

EnvironmentsApi apiInstance = new EnvironmentsApi();
String programId = null; // String | Identifier of the program
String environmentId = null; // String | Identifier of the environment
String service = null; // String | Name of service
String name = null; // String | Name of log
String date = null; // String | date for which log is required
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String accept = null; // String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
try {
    apiInstance.downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#downloadLogs");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **environmentId** | **String**| Identifier of the environment | [default to null]
 **service** | **String**| Name of service | [default to null]
 **name** | **String**| Name of log | [default to null]
 **date** | **String**| date for which log is required | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] [default to null]

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

```java
// Import classes:
//import org.openapitools.client.api.EnvironmentsApi;

EnvironmentsApi apiInstance = new EnvironmentsApi();
String programId = null; // String | Identifier of the program
String environmentId = null; // String | Identifier of the environment
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    Environment result = apiInstance.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#getEnvironment");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **environmentId** | **String**| Identifier of the environment | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEnvironmentLogs

> EnvironmentLogs getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name)

Get Environment Logs

List all logs available in environment

### Example

```java
// Import classes:
//import org.openapitools.client.api.EnvironmentsApi;

EnvironmentsApi apiInstance = new EnvironmentsApi();
String programId = null; // String | Identifier of the program
String environmentId = null; // String | Identifier of the environment
Integer days = null; // Integer | number of days for which logs are required
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
List<String> service = null; // List<String> | Names of services
List<String> name = null; // List<String> | Names of log
try {
    EnvironmentLogs result = apiInstance.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#getEnvironmentLogs");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **environmentId** | **String**| Identifier of the environment | [default to null]
 **days** | **Integer**| number of days for which logs are required | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **service** | [**List&lt;String&gt;**](String.md)| Names of services | [optional] [default to null]
 **name** | [**List&lt;String&gt;**](String.md)| Names of log | [optional] [default to null]

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getEnvironments

> EnvironmentList getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type)

List Environments

Lists all environments in an program

### Example

```java
// Import classes:
//import org.openapitools.client.api.EnvironmentsApi;

EnvironmentsApi apiInstance = new EnvironmentsApi();
String programId = null; // String | Identifier of the program
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String type = null; // String | Type of the environment
try {
    EnvironmentList result = apiInstance.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentsApi#getEnvironments");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | [default to null]
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **type** | **String**| Type of the environment | [optional] [default to null] [enum: dev, stage, prod]

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

