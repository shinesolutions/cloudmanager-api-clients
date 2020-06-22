# \VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_environment_variables**](VariablesApi.md#get_environment_variables) | **Get** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patch_environment_variables**](VariablesApi.md#patch_environment_variables) | **Patch** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables



## get_environment_variables

> crate::models::VariableList get_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**environment_id** | **String** | Identifier of the environment | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::VariableList**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## patch_environment_variables

> crate::models::VariableList patch_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**environment_id** | **String** | Identifier of the environment | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**content_type** | **String** | Must always be application/json | [required] |
**body** | [**Vec<crate::models::Variable>**](Variable.md) | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | [required] |

### Return type

[**crate::models::VariableList**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

