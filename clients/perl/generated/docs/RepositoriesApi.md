# WWW::OpenAPIClient::RepositoriesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::RepositoriesApi;
```

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_repositories**](RepositoriesApi.md#get_repositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**get_repository**](RepositoriesApi.md#get_repository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository


# **get_repositories**
> RepositoryList get_repositories(program_id => $program_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Lists Repositories

Lists all Repositories in an program

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::RepositoriesApi;
my $api_instance = WWW::OpenAPIClient::RepositoriesApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_repositories(program_id => $program_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RepositoriesApi->get_repositories: $@\n";
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

[**RepositoryList**](RepositoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_repository**
> Repository get_repository(program_id => $program_id, repository_id => $repository_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

Get Repository

Returns an repository by its id

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::RepositoriesApi;
my $api_instance = WWW::OpenAPIClient::RepositoriesApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program
my $repository_id = "repository_id_example"; # string | Identifier of the repository
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_repository(program_id => $program_id, repository_id => $repository_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RepositoriesApi->get_repository: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program | 
 **repository_id** | **string**| Identifier of the repository | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

