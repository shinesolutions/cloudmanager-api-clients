# RepositoriesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetRepositories**](RepositoriesApi.md#GetRepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**GetRepository**](RepositoriesApi.md#GetRepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository


# **GetRepositories**
> RepositoryList GetRepositories(program.id, x.gw.ims.org.id, authorization, x.api.key)

Lists Repositories

Lists all Repositories in an program

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Lists Repositories
api.instance <- RepositoriesApi$new()
result <- api.instance$GetRepositories(var.program.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
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

[**RepositoryList**](repositoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

# **GetRepository**
> Repository GetRepository(program.id, repository.id, x.gw.ims.org.id, authorization, x.api.key)

Get Repository

Returns an repository by its id

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program
var.repository.id <- 'repository.id_example' # character | Identifier of the repository
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#Get Repository
api.instance <- RepositoriesApi$new()
result <- api.instance$GetRepository(var.program.id, var.repository.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program | 
 **repository.id** | **character**| Identifier of the repository | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

