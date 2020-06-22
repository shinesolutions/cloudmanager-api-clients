# AemCloudManagerApiClient::VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_environment_variables**](VariablesApi.md#get_environment_variables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patch_environment_variables**](VariablesApi.md#patch_environment_variables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables



## get_environment_variables

> VariableList get_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::VariablesApi.new
program_id = '2351' # String | Identifier of the program
environment_id = '128' # String | Identifier of the environment
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #List User Environment Variables
  result = api_instance.get_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling VariablesApi->get_environment_variables: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **environment_id** | **String**| Identifier of the environment | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## patch_environment_variables

> VariableList patch_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::VariablesApi.new
program_id = 'program_id_example' # String | Identifier of the program
environment_id = 'environment_id_example' # String | Identifier of the environment
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
content_type = 'content_type_example' # String | Must always be application/json
body = [AemCloudManagerApiClient::Variable.new] # Array<Variable> | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.

begin
  #Patch User Environment Variables
  result = api_instance.patch_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling VariablesApi->patch_environment_variables: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **environment_id** | **String**| Identifier of the environment | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content_type** | **String**| Must always be application/json | 
 **body** | [**Array&lt;Variable&gt;**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

