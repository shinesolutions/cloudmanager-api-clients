# VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEnvironmentVariables**](VariablesApi.md#GetEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**PatchEnvironmentVariables**](VariablesApi.md#PatchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


# **GetEnvironmentVariables**
> VariableList GetEnvironmentVariables(program.id, environment.id, x.gw.ims.org.id, authorization, x.api.key)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example
```R
library(openapi)

var.program.id <- '2351' # character | Identifier of the program
var.environment.id <- '128' # character | Identifier of the environment
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#List User Environment Variables
api.instance <- VariablesApi$new()
result <- api.instance$GetEnvironmentVariables(var.program.id, var.environment.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
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

[**VariableList**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of environment variables |  -  |
| **404** | Environment not found |  -  |

# **PatchEnvironmentVariables**
> VariableList PatchEnvironmentVariables(program.id, environment.id, x.gw.ims.org.id, authorization, x.api.key, content.type, body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.environment.id <- 'environment.id_example' # character | Identifier of the environment
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.content.type <- 'content.type_example' # character | Must always be application/json
var.body <- list(Variable$new("name_example", "value_example", "type_example")) # array[Variable] | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.

#Patch User Environment Variables
api.instance <- VariablesApi$new()
result <- api.instance$PatchEnvironmentVariables(var.program.id, var.environment.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key, var.content.type, var.body)
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
 **content.type** | **character**| Must always be application/json | 
 **body** | list( [**Variable**](Variable.md) )| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. | 

### Return type

[**VariableList**](variableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful update of environment variables |  -  |
| **404** | Environment not found |  -  |

