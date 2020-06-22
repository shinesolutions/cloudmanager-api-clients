# variables_api

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
**getEnvironmentVariables**](variables_api.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
**patchEnvironmentVariables**](variables_api.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


# **getEnvironmentVariables**
> models::VariableList getEnvironmentVariables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **environment_id** | **String**| Identifier of the environment | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::VariableList**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchEnvironmentVariables**
> models::VariableList patchEnvironmentVariables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **environment_id** | **String**| Identifier of the environment | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
  **content_type** | **String**| Must always be application/json | 
  **body** | [**Variable**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**models::VariableList**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

