# NodeAemCloudmanagerApiClient.PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancePipelineExecution**](PipelineExecutionApi.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancelPipelineExecutionStep**](PipelineExecutionApi.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**getCurrentExecution**](PipelineExecutionApi.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**getExecution**](PipelineExecutionApi.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**getExecutions**](PipelineExecutionApi.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**getStepLogs**](PipelineExecutionApi.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**startPipeline**](PipelineExecutionApi.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**stepMetric**](PipelineExecutionApi.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**stepState**](PipelineExecutionApi.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state



## advancePipelineExecution

> advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let executionId = "executionId_example"; // String | Identifier of the execution
let phaseId = "phaseId_example"; // String | Identifier of the phase
let stepId = "stepId_example"; // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example"; // String | Must always be application/json
let body = null; // Object | Input for advance. See documentation for details.
apiInstance.advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **executionId** | **String**| Identifier of the execution | 
 **phaseId** | **String**| Identifier of the phase | 
 **stepId** | **String**| Identifier of the step | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String**| Must always be application/json | 
 **body** | **Object**| Input for advance. See documentation for details. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## cancelPipelineExecutionStep

> cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let executionId = "executionId_example"; // String | Identifier of the execution
let phaseId = "phaseId_example"; // String | Identifier of the phase
let stepId = "stepId_example"; // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example"; // String | Must always be application/json
let body = null; // Object | Input for advance. See documentation for details.
apiInstance.cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **executionId** | **String**| Identifier of the execution | 
 **phaseId** | **String**| Identifier of the phase | 
 **stepId** | **String**| Identifier of the step | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String**| Must always be application/json | 
 **body** | **Object**| Input for advance. See documentation for details. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## getCurrentExecution

> PipelineExecution getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey)

Get current pipeline execution

Returns current pipeline execution if any.

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getExecution

> PipelineExecution getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey)

Get pipeline execution

Returns a pipeline execution by id

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let executionId = "executionId_example"; // String | Identifier of the execution
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **executionId** | **String**| Identifier of the execution | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecution**](PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getExecutions

> PipelineExecutionListRepresentation getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, opts)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let opts = {
  'start': "start_example", // String | Pagination start parameter
  'limit': 56 // Number | Pagination limit parameter
};
apiInstance.getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, opts, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **start** | **String**| Pagination start parameter | [optional] 
 **limit** | **Number**| Pagination limit parameter | [optional] 

### Return type

[**PipelineExecutionListRepresentation**](PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getStepLogs

> getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, opts)

Get logs

Get the logs associated with a step.

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let executionId = "executionId_example"; // String | Identifier of the execution
let phaseId = "phaseId_example"; // String | Identifier of the phase
let stepId = "stepId_example"; // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let opts = {
  'file': "file_example", // String | Identifier of the log file
  'accept': "accept_example" // String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
};
apiInstance.getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, opts, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **executionId** | **String**| Identifier of the execution | 
 **phaseId** | **String**| Identifier of the phase | 
 **stepId** | **String**| Identifier of the step | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **file** | **String**| Identifier of the log file | [optional] 
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## startPipeline

> startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
let contentType = "contentType_example"; // String | Must always be application/json
apiInstance.startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **contentType** | **String**| Must always be application/json | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## stepMetric

> PipelineStepMetrics stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)

Get step metrics

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let executionId = "executionId_example"; // String | Identifier of the execution
let phaseId = "phaseId_example"; // String | Identifier of the phase
let stepId = "stepId_example"; // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **executionId** | **String**| Identifier of the execution | 
 **phaseId** | **String**| Identifier of the phase | 
 **stepId** | **String**| Identifier of the step | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineStepMetrics**](PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## stepState

> PipelineExecutionStepState stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)

Get step state

### Example

```javascript
import NodeAemCloudmanagerApiClient from 'node-aem-cloudmanager-api-client';

let apiInstance = new NodeAemCloudmanagerApiClient.PipelineExecutionApi();
let programId = "programId_example"; // String | Identifier of the program.
let pipelineId = "pipelineId_example"; // String | Identifier of the pipeline
let executionId = "executionId_example"; // String | Identifier of the execution
let phaseId = "phaseId_example"; // String | Identifier of the phase
let stepId = "stepId_example"; // String | Identifier of the step
let xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
let authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
let xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
apiInstance.stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, (error, data, response) => {
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
 **programId** | **String**| Identifier of the program. | 
 **pipelineId** | **String**| Identifier of the pipeline | 
 **executionId** | **String**| Identifier of the execution | 
 **phaseId** | **String**| Identifier of the phase | 
 **stepId** | **String**| Identifier of the step | 
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineExecutionStepState**](PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

