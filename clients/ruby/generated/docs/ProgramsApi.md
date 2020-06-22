# AemCloudManagerApiClient::ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_program**](ProgramsApi.md#delete_program) | **DELETE** /api/program/{programId} | Delete Program
[**get_program**](ProgramsApi.md#get_program) | **GET** /api/program/{programId} | Get Program
[**get_programs**](ProgramsApi.md#get_programs) | **GET** /api/programs | Lists Programs



## delete_program

> Program delete_program(program_id, x_gw_ims_org_id, authorization, x_api_key)

Delete Program

Delete an program

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::ProgramsApi.new
program_id = 'program_id_example' # String | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Delete Program
  result = api_instance.delete_program(program_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling ProgramsApi->delete_program: #{e}"
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

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_program

> Program get_program(program_id, x_gw_ims_org_id, authorization, x_api_key)

Get Program

Returns a program by its id

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::ProgramsApi.new
program_id = 'program_id_example' # String | Identifier of the program
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Get Program
  result = api_instance.get_program(program_id, x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling ProgramsApi->get_program: #{e}"
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

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_programs

> ProgramList get_programs(x_gw_ims_org_id, authorization, x_api_key)

Lists Programs

Returns all programs that the requesting user has access to

### Example

```ruby
# load the gem
require 'ruby_aem_cloudmanager_api_client'

api_instance = AemCloudManagerApiClient::ProgramsApi.new
x_gw_ims_org_id = 'x_gw_ims_org_id_example' # String | IMS organization ID that the request is being made under.
authorization = 'authorization_example' # String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
x_api_key = 'x_api_key_example' # String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

begin
  #Lists Programs
  result = api_instance.get_programs(x_gw_ims_org_id, authorization, x_api_key)
  p result
rescue AemCloudManagerApiClient::ApiError => e
  puts "Exception when calling ProgramsApi->get_programs: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_gw_ims_org_id** | **String**| IMS organization ID that the request is being made under. | 
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x_api_key** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**ProgramList**](ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

