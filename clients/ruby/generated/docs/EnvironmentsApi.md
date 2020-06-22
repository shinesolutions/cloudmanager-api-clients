# AemCloudManagerApiClient::EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_environment**](EnvironmentsApi.md#delete_environment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**download_logs**](EnvironmentsApi.md#download_logs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**get_environment**](EnvironmentsApi.md#get_environment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**get_environment_logs**](EnvironmentsApi.md#get_environment_logs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**get_environments**](EnvironmentsApi.md#get_environments) | **GET** /api/program/{programId}/environments | List Environments



## delete_environment

> Environment delete_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)

DeleteEnvironment

Delete environment

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::EnvironmentsApi.new
program_id = 'program_id_example' # String | Identifier of the application
environment_id = 'environment_id_example' # String | Identifier of the environment
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #DeleteEnvironment
  result = api_instance.delete_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling EnvironmentsApi->delete_environment: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the application | 
 **environment_id** | **String**| Identifier of the environment | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## download_logs

> download_logs(program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, opts)

Download Logs

Download environment logs

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::EnvironmentsApi.new
program_id = 'program_id_example' # String | Identifier of the program
environment_id = 'environment_id_example' # String | Identifier of the environment
service = 'service_example' # String | Name of service
name = 'name_example' # String | Name of log
date = 'date_example' # String | date for which log is required
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
opts = {
  accept: 'accept_example' # String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
}

begin
  #Download Logs
  api_instance.download_logs(program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, opts)
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling EnvironmentsApi->download_logs: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **environment_id** | **String**| Identifier of the environment | 
 **service** | **String**| Name of service | 
 **name** | **String**| Name of log | 
 **date** | **String**| date for which log is required | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_environment

> Environment get_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)

Get Environment

Returns an environment by its id

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::EnvironmentsApi.new
program_id = 'program_id_example' # String | Identifier of the program
environment_id = 'environment_id_example' # String | Identifier of the environment
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Get Environment
  result = api_instance.get_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling EnvironmentsApi->get_environment: #{e}"
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

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_environment_logs

> EnvironmentLogs get_environment_logs(program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, opts)

Get Environment Logs

List all logs available in environment

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::EnvironmentsApi.new
program_id = 'program_id_example' # String | Identifier of the program
environment_id = 'environment_id_example' # String | Identifier of the environment
days = 56 # Integer | number of days for which logs are required
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
opts = {
  service: ['service_example'], # Array<String> | Names of services
  name: ['name_example'] # Array<String> | Names of log
}

begin
  #Get Environment Logs
  result = api_instance.get_environment_logs(program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, opts)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling EnvironmentsApi->get_environment_logs: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **environment_id** | **String**| Identifier of the environment | 
 **days** | **Integer**| number of days for which logs are required | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | [**Array&lt;String&gt;**](String.md)| Names of services | [optional] 
 **name** | [**Array&lt;String&gt;**](String.md)| Names of log | [optional] 

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_environments

> EnvironmentList get_environments(program_id, x_gw_ims_org_id, authorization, x_api_key, opts)

List Environments

Lists all environments in an program

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::EnvironmentsApi.new
program_id = 'program_id_example' # String | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
opts = {
  type: 'type_example' # String | Type of the environment
}

begin
  #List Environments
  result = api_instance.get_environments(program_id, x_gw_ims_org_id, authorization, x_api_key, opts)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling EnvironmentsApi->get_environments: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **String**| Identifier of the program | 
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **type** | **String**| Type of the environment | [optional] 

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

