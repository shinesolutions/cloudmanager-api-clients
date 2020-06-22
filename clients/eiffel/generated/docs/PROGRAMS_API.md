# PROGRAMS_API

All URIs are relative to *https://cloudmanager.adobe.io*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**delete_program**](PROGRAMS_API.md#delete_program) | **Delete** /api/program/{programId} | Delete Program
[**program**](PROGRAMS_API.md#program) | **Get** /api/program/{programId} | Get Program
[**programs**](PROGRAMS_API.md#programs) | **Get** /api/programs | Lists Programs


# **delete_program**
> delete_program (program_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PROGRAM
	

Delete Program

Delete an program


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PROGRAM**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **program**
> program (program_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PROGRAM
	

Get Program

Returns a program by its id


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PROGRAM**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **programs**
> programs (x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PROGRAM_LIST
	

Lists Programs

Returns all programs that the requesting user has access to


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PROGRAM_LIST**](programList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

