# VariablesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentVariables**](VariablesApi.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patchEnvironmentVariables**](VariablesApi.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables



## getEnvironmentVariables

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example

```bash
 getEnvironmentVariables programId=value environmentId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
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

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## patchEnvironmentVariables

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example

```bash
 patchEnvironmentVariables programId=value environmentId=value x-gw-ims-org-id:value Authorization:value x-api-key:value Content-Type:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **environmentId** | **string** | Identifier of the environment | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **contentType** | **string** | Must always be application/json | [default to null]
 **body** | [**array[Variable]**](Variable.md) | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. |

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

