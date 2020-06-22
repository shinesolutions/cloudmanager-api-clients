# pipelines_api

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
**deletePipeline**](pipelines_api.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
**getPipeline**](pipelines_api.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
**getPipelines**](pipelines_api.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
**patchPipeline**](pipelines_api.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


# **deletePipeline**
> deletePipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPipeline**
> models::Pipeline getPipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
Get Pipeline

Returns a pipeline by its id

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPipelines**
> models::PipelineList getPipelines(program_id, x_gw_ims_org_id, authorization, x_api_key)
List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**models::PipelineList**](pipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patchPipeline**
> models::Pipeline patchPipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
Patches Pipeline

Patches a pipeline within an program.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **program_id** | **String**| Identifier of the program | 
  **pipeline_id** | **String**| Identifier of the pipeline | 
  **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
  **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
  **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
  **content_type** | **String**| Must always be application/json | 
  **body** | [**Pipeline**](Pipeline.md)| The updated Pipeline | 

### Return type

[**models::Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

