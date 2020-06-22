# PipelinesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeletePipeline**](PipelinesApi.md#DeletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**GetPipeline**](PipelinesApi.md#GetPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**GetPipelines**](PipelinesApi.md#GetPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**PatchPipeline**](PipelinesApi.md#PatchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


# **DeletePipeline**
> DeletePipeline(program.id, pipeline.id, x.gw.ims.org.id, authorization, x.api.key)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Delete a Pipeline
api.instance <- PipelinesApi$new()
api.instance$DeletePipeline(var.program.id, var.pipeline.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

# **GetPipeline**
> Pipeline GetPipeline(program.id, pipeline.id, x.gw.ims.org.id, authorization, x.api.key)

Get Pipeline

Returns a pipeline by its id

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Get Pipeline
api.instance <- PipelinesApi$new()
result <- api.instance$GetPipeline(var.program.id, var.pipeline.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of pipeline |  -  |
| **404** | Pipeline not found |  -  |

# **GetPipelines**
> PipelineList GetPipelines(program.id, x.gw.ims.org.id, authorization, x.api.key)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#List Pipelines
api.instance <- PipelinesApi$new()
result <- api.instance$GetPipelines(var.program.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
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

[**PipelineList**](pipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

# **PatchPipeline**
> Pipeline PatchPipeline(program.id, pipeline.id, x.gw.ims.org.id, authorization, x.api.key, content.type, body)

Patches Pipeline

Patches a pipeline within an program.

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.pipeline.id <- 'pipeline.id_example' # character | Identifier of the pipeline
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
var.content.type <- 'content.type_example' # character | Must always be application/json
var.body <- Pipeline$new("id_example", "programId_example", "name_example", "trigger_example", "status_example", "createdAt_example", "updatedAt_example", "lastStartedAt_example", "lastFinishedAt_example", list(pipelinePhase$new("name_example", "type_example", "repositoryId_example", "branch_example", "environmentId_example")), Pipeline__links$new(HalLink$new("href_example", "templated_example", "type_example", "deprecation_example", "profile_example", "title_example", "hreflang_example", "name_example"), HalLink$new("href_example", "templated_example", "type_example", "deprecation_example", "profile_example", "title_example", "hreflang_example", "name_example"), HalLink$new("href_example", "templated_example", "type_example", "deprecation_example", "profile_example", "title_example", "hreflang_example", "name_example"), HalLink$new("href_example", "templated_example", "type_example", "deprecation_example", "profile_example", "title_example", "hreflang_example", "name_example"), HalLink$new("href_example", "templated_example", "type_example", "deprecation_example", "profile_example", "title_example", "hreflang_example", "name_example"))) # Pipeline | The updated Pipeline

#Patches Pipeline
api.instance <- PipelinesApi$new()
result <- api.instance$PatchPipeline(var.program.id, var.pipeline.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key, var.content.type, var.body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **pipeline.id** | **character**| Identifier of the pipeline | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 
 **content.type** | **character**| Must always be application/json | 
 **body** | [**Pipeline**](Pipeline.md)| The updated Pipeline | 

### Return type

[**Pipeline**](Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

