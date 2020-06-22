# NodeAemCloudmanagerApiClient.PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePipeline**](PipelinesApi.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**getPipeline**](PipelinesApi.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**getPipelines**](PipelinesApi.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patchPipeline**](PipelinesApi.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline



## deletePipeline

> deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelinesApi();
let programId = "programId_example"; // String | Identifier of the program
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getPipeline

> Pipeline getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Get Pipeline

Returns a pipeline by its id

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelinesApi();
let programId = "programId_example"; // String | Identifier of the program
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
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
 **pipelineId** | **String**| Identifier of the pipeline | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getPipelines

> PipelineList getPipelines(programId, xGwImsOrgId, authorization, xApiKey)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelinesApi();
let programId = "programId_example"; // String | Identifier of the program
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.getPipelines(programId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
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

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patchPipeline

> Pipeline patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Patches Pipeline

Patches a pipeline within an program.

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelinesApi();
let programId = "programId_example"; // String | Identifier of the program
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example"; // String | Must always be application/json
let body = new NodeAemCloudmanagerApiClient.Pipeline(); // Pipeline | The updated Pipeline
apiInstance.patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body, (error, data, response) => {
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
 **pipelineId** | **String**| Identifier of the pipeline | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String**| Must always be application/json | 
 **body** | [**Pipeline**](Pipeline.md)| The updated Pipeline | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

