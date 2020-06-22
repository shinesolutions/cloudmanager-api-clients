# AemCloudManagerApiClient::PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_pipeline**](PipelinesApi.md#delete_pipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**get_pipeline**](PipelinesApi.md#get_pipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**get_pipelines**](PipelinesApi.md#get_pipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patch_pipeline**](PipelinesApi.md#patch_pipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline



## delete_pipeline

> delete_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelinesApi.new
program_id = 'program_id_example' # String | Identifier of the program
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Delete a Pipeline
  api_instance.delete_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelinesApi->delete_pipeline: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **pipeline_id** | **String**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## get_pipeline

> Pipeline get_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)

Get Pipeline

Returns a pipeline by its id

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelinesApi.new
program_id = 'program_id_example' # String | Identifier of the program
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Get Pipeline
  result = api_instance.get_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelinesApi->get_pipeline: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **pipeline_id** | **String**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_pipelines

> PipelineList get_pipelines(program_id, x_gw_ims_org_id, authorization, x_api_key)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelinesApi.new
program_id = 'program_id_example' # String | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #List Pipelines
  result = api_instance.get_pipelines(program_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelinesApi->get_pipelines: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patch_pipeline

> Pipeline patch_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)

Patches Pipeline

Patches a pipeline within an program.

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::PipelinesApi.new
program_id = 'program_id_example' # String | Identifier of the program
pipeline_id = 'pipeline_id_example' # String | Identifier of the pipeline
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # String | Must always be application/json
body = AemCloudManagerApiClient::Pipeline.new # Pipeline | The updated Pipeline

begin
  #Patches Pipeline
  result = api_instance.patch_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling PipelinesApi->patch_pipeline: #{e}"
end
```

### Parameters


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

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

