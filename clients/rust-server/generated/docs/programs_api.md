# programs_api

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
**deleteProgram**](programs_api.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
**getProgram**](programs_api.md#getProgram) | **GET** /api/program/{programId} | Get Program
**getPrograms**](programs_api.md#getPrograms) | **GET** /api/programs | Lists Programs


# **deleteProgram**
> models::Program deleteProgram(program_id, x_gw_ims_org_id, authorization, x_api_key)
Delete Program

Delete an program

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getProgram**
> models::Program getProgram(program_id, x_gw_ims_org_id, authorization, x_api_key)
Get Program

Returns a program by its id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPrograms**
> models::ProgramList getPrograms(x_gw_ims_org_id, authorization, x_api_key)
Lists Programs

Returns all programs that the requesting user has access to

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::ProgramList**](programList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

