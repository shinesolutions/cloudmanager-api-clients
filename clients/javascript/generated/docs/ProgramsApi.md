# NodeAemCloudmanagerApiClient.ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProgram**](ProgramsApi.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
[**getProgram**](ProgramsApi.md#getProgram) | **GET** /api/program/{programId} | Get Program
[**getPrograms**](ProgramsApi.md#getPrograms) | **GET** /api/programs | Lists Programs



## deleteProgram

> Program deleteProgram(programId, xGwImsOrgId, authorization, xApiKey)

Delete Program

Delete an program

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.ProgramsApi();
let programId = "programId_example"; // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.deleteProgram(programId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getProgram

> Program getProgram(programId, xGwImsOrgId, authorization, xApiKey)

Get Program

Returns a program by its id

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.ProgramsApi();
let programId = "programId_example"; // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.getProgram(programId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPrograms

> ProgramList getPrograms(xGwImsOrgId, authorization, xApiKey)

Lists Programs

Returns all programs that the requesting user has access to

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.ProgramsApi();
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.getPrograms(xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**ProgramList**](ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

