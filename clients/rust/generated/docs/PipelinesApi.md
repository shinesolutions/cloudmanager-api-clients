# \PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_pipeline**](PipelinesApi.md#delete_pipeline) | **Delete** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**get_pipeline**](PipelinesApi.md#get_pipeline) | **Get** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**get_pipelines**](PipelinesApi.md#get_pipelines) | **Get** /api/program/{programId}/pipelines | List Pipelines
[**patch_pipeline**](PipelinesApi.md#patch_pipeline) | **Patch** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline



## delete_pipeline

> delete_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_pipeline

> crate::models::Pipeline get_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
Get Pipeline

Returns a pipeline by its id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_pipelines

> crate::models::PipelineList get_pipelines(program_id, x_gw_ims_org_id, authorization, x_api_key)
List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |

### Return type

[**crate::models::PipelineList**](pipelineList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## patch_pipeline

> crate::models::Pipeline patch_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
Patches Pipeline

Patches a pipeline within an program.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**program_id** | **String** | Identifier of the program | [required] |
**pipeline_id** | **String** | Identifier of the pipeline | [required] |
**x_gw_ims_org_id** | **String** | IMS organization ID that the request is being made under. | [required] |
**authorization** | **String** | Bearer [token] - An access token for the technical account created through integration with Adobe IO | [required] |
**x_api_key** | **String** | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | [required] |
**content_type** | **String** | Must always be application/json | [required] |
**body** | [**Pipeline**](Pipeline.md) | The updated Pipeline | [required] |

### Return type

[**crate::models::Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

