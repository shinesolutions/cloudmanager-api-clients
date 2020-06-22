# WWW::OpenAPIClient::EnvironmentsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EnvironmentsApi;
```

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_environment**](EnvironmentsApi.md#delete_environment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**download_logs**](EnvironmentsApi.md#download_logs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**get_environment**](EnvironmentsApi.md#get_environment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**get_environment_logs**](EnvironmentsApi.md#get_environment_logs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**get_environments**](EnvironmentsApi.md#get_environments) | **GET** /api/program/{programId}/environments | List Environments


# **delete_environment**
> Environment delete_environment(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

DeleteEnvironment

Delete environment

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnvironmentsApi;
my $api_instance = WWW::OpenAPIClient::EnvironmentsApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the application
my $environment_id = "environment_id_example"; # string | Identifier of the environment
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->delete_environment(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnvironmentsApi->delete_environment: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the application | 
 **environment_id** | **string**| Identifier of the environment | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_logs**
> download_logs(program_id => $program_id, environment_id => $environment_id, service => $service, name => $name, date => $date, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, accept => $accept)

Download Logs

Download environment logs

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnvironmentsApi;
my $api_instance = WWW::OpenAPIClient::EnvironmentsApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $environment_id = "environment_id_example"; # string | Identifier of the environment
my $service = "service_example"; # string | Name of service
my $name = "name_example"; # string | Name of log
my $date = "date_example"; # string | date for which log is required
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $accept = "accept_example"; # string | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.

eval { 
    $api_instance->download_logs(program_id => $program_id, environment_id => $environment_id, service => $service, name => $name, date => $date, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, accept => $accept);
};
if ($@) {
    warn "Exception when calling EnvironmentsApi->download_logs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **environment_id** | **string**| Identifier of the environment | 
 **service** | **string**| Name of service | 
 **name** | **string**| Name of log | 
 **date** | **string**| date for which log is required | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **string**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_environment**
> Environment get_environment(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Get Environment

Returns an environment by its id

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnvironmentsApi;
my $api_instance = WWW::OpenAPIClient::EnvironmentsApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $environment_id = "environment_id_example"; # string | Identifier of the environment
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_environment(program_id => $program_id, environment_id => $environment_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnvironmentsApi->get_environment: $@\n";
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

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_environment_logs**
> EnvironmentLogs get_environment_logs(program_id => $program_id, environment_id => $environment_id, days => $days, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, service => $service, name => $name)

Get Environment Logs

List all logs available in environment

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnvironmentsApi;
my $api_instance = WWW::OpenAPIClient::EnvironmentsApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $environment_id = "environment_id_example"; # string | Identifier of the environment
my $days = 56; # int | number of days for which logs are required
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $service = [("null")]; # ARRAY[string] | Names of services
my $name = [("null")]; # ARRAY[string] | Names of log

eval { 
    my $result = $api_instance->get_environment_logs(program_id => $program_id, environment_id => $environment_id, days => $days, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, service => $service, name => $name);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnvironmentsApi->get_environment_logs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **environment_id** | **string**| Identifier of the environment | 
 **days** | **int**| number of days for which logs are required | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | [**ARRAY[string]**](string.md)| Names of services | [optional] 
 **name** | [**ARRAY[string]**](string.md)| Names of log | [optional] 

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_environments**
> EnvironmentList get_environments(program_id => $program_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, type => $type)

List Environments

Lists all environments in an program

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnvironmentsApi;
my $api_instance = WWW::OpenAPIClient::EnvironmentsApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
my $type = "type_example"; # string | Type of the environment

eval { 
    my $result = $api_instance->get_environments(program_id => $program_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key, type => $type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnvironmentsApi->get_environments: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **type** | **string**| Type of the environment | [optional] 

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

