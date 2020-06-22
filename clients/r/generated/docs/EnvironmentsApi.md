# EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteEnvironment**](EnvironmentsApi.md#DeleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**DownloadLogs**](EnvironmentsApi.md#DownloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**GetEnvironment**](EnvironmentsApi.md#GetEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**GetEnvironmentLogs**](EnvironmentsApi.md#GetEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**GetEnvironments**](EnvironmentsApi.md#GetEnvironments) | **GET** /api/program/{programId}/environments | List Environments


# **DeleteEnvironment**
> Environment DeleteEnvironment(program.id, environment.id, x.gw.ims.org.id, authorization, x.api.key)

DeleteEnvironment

Delete environment

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the application
var.environment.id <- 'environment.id_example' # character | Identifier of the environment
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#DeleteEnvironment
api.instance <- EnvironmentsApi$new()
result <- api.instance$DeleteEnvironment(var.program.id, var.environment.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the application | 
 **environment.id** | **character**| Identifier of the environment | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Environment deleted |  -  |
| **400** | Environment deletion in progress |  -  |
| **404** | Environment not found |  -  |

# **DownloadLogs**
> DownloadLogs(program.id, environment.id, service, name, date, x.gw.ims.org.id, authorization, x.api.key, accept=var.accept)

Download Logs

Download environment logs

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.environment.id <- 'environment.id_example' # character | Identifier of the environment
var.service <- 'service_example' # character | Name of service
var.name <- 'name_example' # character | Name of log
var.date <- 'date_example' # character | date for which log is required
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.accept <- 'accept_example' # character | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.

#Download Logs
api.instance <- EnvironmentsApi$new()
api.instance$DownloadLogs(var.program.id, var.environment.id, var.service, var.name, var.date, var.x.gw.ims.org.id, var.authorization, var.x.api.key, accept=var.accept)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **environment.id** | **character**| Identifier of the environment | 
 **service** | **character**| Name of service | 
 **name** | **character**| Name of log | 
 **date** | **character**| date for which log is required | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **accept** | **character**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of logs |  -  |
| **400** | invalid parameters |  -  |
| **404** | Environment not found |  -  |

# **GetEnvironment**
> Environment GetEnvironment(program.id, environment.id, x.gw.ims.org.id, authorization, x.api.key)

Get Environment

Returns an environment by its id

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.environment.id <- 'environment.id_example' # character | Identifier of the environment
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Get Environment
api.instance <- EnvironmentsApi$new()
result <- api.instance$GetEnvironment(var.program.id, var.environment.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **environment.id** | **character**| Identifier of the environment | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

# **GetEnvironmentLogs**
> EnvironmentLogs GetEnvironmentLogs(program.id, environment.id, days, x.gw.ims.org.id, authorization, x.api.key, service=var.service, name=var.name)

Get Environment Logs

List all logs available in environment

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.environment.id <- 'environment.id_example' # character | Identifier of the environment
var.days <- 56 # integer | number of days for which logs are required
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.service <- list("inner_example") # array[character] | Names of services
var.name <- list("inner_example") # array[character] | Names of log

#Get Environment Logs
api.instance <- EnvironmentsApi$new()
result <- api.instance$GetEnvironmentLogs(var.program.id, var.environment.id, var.days, var.x.gw.ims.org.id, var.authorization, var.x.api.key, service=var.service, name=var.name)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **environment.id** | **character**| Identifier of the environment | 
 **days** | **integer**| number of days for which logs are required | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **service** | list( **character** )| Names of services | [optional] 
 **name** | list( **character** )| Names of log | [optional] 

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of logs for an environment |  -  |
| **400** | invalid parameters |  -  |
| **404** | Environment not found |  -  |

# **GetEnvironments**
> EnvironmentList GetEnvironments(program.id, x.gw.ims.org.id, authorization, x.api.key, type=var.type)

List Environments

Lists all environments in an program

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.type <- 'type_example' # character | Type of the environment

#List Environments
api.instance <- EnvironmentsApi$new()
result <- api.instance$GetEnvironments(var.program.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key, type=var.type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **type** | Enum [dev, stage, prod] | Type of the environment | [optional] 

### Return type

[**EnvironmentList**](environmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of environment list |  -  |
| **404** | Program not found |  -  |

