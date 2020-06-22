# ProgramsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProgram**](ProgramsApi.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
[**getProgram**](ProgramsApi.md#getProgram) | **GET** /api/program/{programId} | Get Program
[**getPrograms**](ProgramsApi.md#getPrograms) | **GET** /api/programs | Lists Programs



## deleteProgram

Delete Program

Delete an program

### Example

```bash
 deleteProgram programId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getProgram

Get Program

Returns a program by its id

### Example

```bash
 getProgram programId=value x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string** | Identifier of the program | [default to null]
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPrograms

Lists Programs

Returns all programs that the requesting user has access to

### Example

```bash
 getPrograms x-gw-ims-org-id:value Authorization:value x-api-key:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGwImsOrgId** | **string** | IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **string** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **xApiKey** | **string** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**ProgramList**](ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

