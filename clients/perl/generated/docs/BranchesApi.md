# WWW::OpenAPIClient::BranchesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BranchesApi;
```

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_branches**](BranchesApi.md#get_branches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


# **get_branches**
> BranchList get_branches(program_id => $program_id, repository_id => $repository_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key)

List Branches

Returns the list of branches from a repository

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BranchesApi;
my $api_instance = WWW::OpenAPIClient::BranchesApi->new(
);

my $program_id = "program_id_example"; # string | Identifier of the program.
my $repository_id = "repository_id_example"; # string | Identifier of the repository
my $x_gw_ims_org_id = "x_gw_ims_org_id_example"; # string | IMS organization ID that the request is being made under.
my $authorization = "authorization_example"; # string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
my $x_api_key = "x_api_key_example"; # string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

eval { 
    my $result = $api_instance->get_branches(program_id => $program_id, repository_id => $repository_id, x_gw_ims_org_id => $x_gw_ims_org_id, authorization => $authorization, x_api_key => $x_api_key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BranchesApi->get_branches: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. | 
 **repository_id** | **string**| Identifier of the repository | 
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. | 
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

