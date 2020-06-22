# VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentVariables**](VariablesApi.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patchEnvironmentVariables**](VariablesApi.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables



## getEnvironmentVariables

> VariableList getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariablesApi;

VariablesApi apiInstance = new VariablesApi();
String programId = 2351; // String | Identifier of the program
String environmentId = 128; // String | Identifier of the environment
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
try {
    VariableList result = apiInstance.getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariablesApi#getEnvironmentVariables");
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

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patchEnvironmentVariables

> VariableList patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VariablesApi;

VariablesApi apiInstance = new VariablesApi();
String programId = null; // String | Identifier of the program
String environmentId = null; // String | Identifier of the environment
String xGwImsOrgId = null; // String | IMS organization ID that the request is being made under.
String authorization = null; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
String xApiKey = null; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
String contentType = null; // String | Must always be application/json
List<Variable> body = Arrays.asList(new Variable()); // List<Variable> | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.
try {
    VariableList result = apiInstance.patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VariablesApi#patchEnvironmentVariables");
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
 **contentType** | **String**| Must always be application/json | [default to null]
 **body** | [**List&lt;Variable&gt;**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. |

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

