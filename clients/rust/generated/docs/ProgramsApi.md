# \ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_program**](ProgramsApi.md#delete_program) | **Delete** /api/program/{programId} | Delete Program
[**get_program**](ProgramsApi.md#get_program) | **Get** /api/program/{programId} | Get Program
[**get_programs**](ProgramsApi.md#get_programs) | **Get** /api/programs | Lists Programs



## delete_program

> crate::models::Program delete_program(program_id, x_gw_ims_org_id, authorization, x_api_key)
Delete Program

Delete an program

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_program

> crate::models::Program get_program(program_id, x_gw_ims_org_id, authorization, x_api_key)
Get Program

Returns a program by its id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_programs

> crate::models::ProgramList get_programs(x_gw_ims_org_id, authorization, x_api_key)
Lists Programs

Returns all programs that the requesting user has access to

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::ProgramList**](programList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

