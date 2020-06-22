# WWW::OpenAPIClient::PipelinesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::PipelinesApi;
```

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_pipeline**](PipelinesApi.md#delete_pipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**get_pipeline**](PipelinesApi.md#get_pipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**get_pipelines**](PipelinesApi.md#get_pipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patch_pipeline**](PipelinesApi.md#patch_pipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


# **delete_pipeline**
> delete_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelinesApi;
my $api_instance = WWW::OpenAPIClient::PipelinesApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    $api_instance->delete_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
};
if ($@) {
    warn "Exception when calling PipelinesApi->delete_pipeline: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_pipeline**
> Pipeline get_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Get Pipeline

Returns a pipeline by its id

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelinesApi;
my $api_instance = WWW::OpenAPIClient::PipelinesApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PipelinesApi->get_pipeline: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_pipelines**
> PipelineList get_pipelines(program_id => $program_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelinesApi;
my $api_instance = WWW::OpenAPIClient::PipelinesApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_pipelines(program_id => $program_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PipelinesApi->get_pipelines: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**PipelineList**](PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_pipeline**
> Pipeline patch_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body)

Patches Pipeline

Patches a pipeline within an program.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::PipelinesApi;
my $api_instance = WWW::OpenAPIClient::PipelinesApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $pipeline_id = "pipeline_id_example"; # string | Identifier of the pipeline
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $content_type = "content_type_example"; # string | Must always be application/json
my $body = WWW::OpenAPIClient::Object::Pipeline->new(); # Pipeline | The updated Pipeline

eval { 
    my $result = $api_instance->patch_pipeline(program_id => $program_id, pipeline_id => $pipeline_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling PipelinesApi->patch_pipeline: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **pipeline_id** | **string**| Identifier of the pipeline | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **string**| Must always be application/json | 
 **body** | [**Pipeline**](Pipeline.md)| The updated Pipeline | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

