# ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteProgram**](ProgramsApi.md#DeleteProgram) | **DELETE** /api/program/{programId} | Delete Program
[**GetProgram**](ProgramsApi.md#GetProgram) | **GET** /api/program/{programId} | Get Program
[**GetPrograms**](ProgramsApi.md#GetPrograms) | **GET** /api/programs | Lists Programs


# **DeleteProgram**
> Program DeleteProgram(program.id, x.gw.ims.org.id, authorization, x.api.key)

Delete Program

Delete an program

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Delete Program
api.instance <- ProgramsApi$new()
result <- api.instance$DeleteProgram(var.program.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **202** | Delete was successful. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Program not found. |  -  |
| **412** | Deletion not supported |  -  |

# **GetProgram**
> Program GetProgram(program.id, x.gw.ims.org.id, authorization, x.api.key)

Get Program

Returns a program by its id

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Get Program
api.instance <- ProgramsApi$new()
result <- api.instance$GetProgram(var.program.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of program |  -  |
| **404** | Program not found |  -  |

# **GetPrograms**
> ProgramList GetPrograms(x.gw.ims.org.id, authorization, x.api.key)

Lists Programs

Returns all programs that the requesting user has access to

### Example
```R
library(openapi)

var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Lists Programs
api.instance <- ProgramsApi$new()
result <- api.instance$GetPrograms(var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**ProgramList**](programList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

