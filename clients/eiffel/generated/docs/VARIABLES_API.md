# VARIABLES_API

All URIs are relative to *https://cloudmanager.adobe.io*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**environment_variables**](VARIABLES_API.md#environment_variables) | **Get** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patch_environment_variables**](VARIABLES_API.md#patch_environment_variables) | **Patch** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


# **environment_variables**
> environment_variables (program_id: STRING_32 ; environment_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable VARIABLE_LIST
	

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **environment_id** | **STRING_32**| Identifier of the environment | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**VARIABLE_LIST**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_environment_variables**
> patch_environment_variables (program_id: STRING_32 ; environment_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; content__type: STRING_32 ; body: LIST [VARIABLE] ): detachable VARIABLE_LIST
	

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **environment_id** | **STRING_32**| Identifier of the environment | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **content__type** | **STRING_32**| Must always be application/json | [default to null]
 **body** | [**LIST [VARIABLE]**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**VARIABLE_LIST**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

