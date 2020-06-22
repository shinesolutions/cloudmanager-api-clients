# PIPELINES_API

All URIs are relative to *https://cloudmanager.adobe.io*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**delete_pipeline**](PIPELINES_API.md#delete_pipeline) | **Delete** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**patch_pipeline**](PIPELINES_API.md#patch_pipeline) | **Patch** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline
[**pipeline**](PIPELINES_API.md#pipeline) | **Get** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**pipelines**](PIPELINES_API.md#pipelines) | **Get** /api/program/{programId}/pipelines | List Pipelines


# **delete_pipeline**
> delete_pipeline (program_id: STRING_32 ; pipeline_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 )
	

Delete a Pipeline

Delete a pipeline. All the data is wiped.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_pipeline**
> patch_pipeline (program_id: STRING_32 ; pipeline_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ; content__type: STRING_32 ; body: PIPELINE ): detachable PIPELINE
	

Patches Pipeline

Patches a pipeline within an program.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]
 **content__type** | **STRING_32**| Must always be application/json | [default to null]
 **body** | [**PIPELINE**](PIPELINE.md)| The updated Pipeline | 

### Return type

[**PIPELINE**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipeline**
> pipeline (program_id: STRING_32 ; pipeline_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PIPELINE
	

Get Pipeline

Returns a pipeline by its id


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **pipeline_id** | **STRING_32**| Identifier of the pipeline | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PIPELINE**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pipelines**
> pipelines (program_id: STRING_32 ; x_gw_ims_org_id: STRING_32 ; authorization: STRING_32 ; x_api_key: STRING_32 ): detachable PIPELINE_LIST
	

List Pipelines

Returns all the pipelines that the requesting user has access to in an program


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **STRING_32**| Identifier of the program | [default to null]
 **x_gw_ims_org_id** | **STRING_32**| IMS organization ID that the request is being made under. | [default to null]
 **authorization** | **STRING_32**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | [default to null]
 **x_api_key** | **STRING_32**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [default to null]

### Return type

[**PIPELINE_LIST**](pipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

