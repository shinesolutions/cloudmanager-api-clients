# WWW::OpenAPIClient::VariablesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::VariablesApi;
```

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_environment_variables**](VariablesApi.md#get_environment_variables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patch_environment_variables**](VariablesApi.md#patch_environment_variables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


# **get_environment_variables**
> VariableList get_environment_variables(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VariablesApi;
my $api_instance = WWW::OpenAPIClient::VariablesApi->new(
);

my $program_id = 2351; # string | Identifier of the program
my $environment_id = 128; # string | Identifier of the environment
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_environment_variables(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VariablesApi->get_environment_variables: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **environment_id** | **string**| Identifier of the environment | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_environment_variables**
> VariableList patch_environment_variables(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VariablesApi;
my $api_instance = WWW::OpenAPIClient::VariablesApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $environment_id = "environment_id_example"; # string | Identifier of the environment
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $content_type = "content_type_example"; # string | Must always be application/json
my $body = [WWW::OpenAPIClient::Object::ARRAY[Variable]->new()]; # ARRAY[Variable] | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.

eval { 
    my $result = $api_instance->patch_environment_variables(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, content_type => $content_type, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VariablesApi->patch_environment_variables: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **environment_id** | **string**| Identifier of the environment | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **string**| Must always be application/json | 
 **body** | [**ARRAY[Variable]**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

