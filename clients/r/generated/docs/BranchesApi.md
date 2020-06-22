# BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBranches**](BranchesApi.md#GetBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


# **GetBranches**
> BranchList GetBranches(program.id, repository.id, x.gw.ims.org.id, authorization, x.api.key)

List Branches

Returns the list of branches from a repository

### Example
```R
library(openapi)

var.program.id <- 'program.id_example' # character | Identifier of the program.
var.repository.id <- 'repository.id_example' # character | Identifier of the repository
var.x.gw.ims.org.id <- 'x.gw.ims.org.id_example' # character | IMS organization ID that the request is being made under.
var.authorization <- 'authorization_example' # character | Bearer [token] - An access token for the technical account created through integration with Adobe IO
var.x.api.key <- 'x.api.key_example' # character | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

#List Branches
api.instance <- BranchesApi$new()
result <- api.instance$GetBranches(var.program.id, var.repository.id, var.x.gw.ims.org.id, var.authorization, var.x.api.key)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program.id** | **character**| Identifier of the program. | 
 **repository.id** | **character**| Identifier of the repository | 
 **x.gw.ims.org.id** | **character**| IMS organization ID that the request is being made under. | 
 **authorization** | **character**| Bearer [token] - An access token for the technical account created through integration with Adobe IO | 
 **x.api.key** | **character**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io | 

### Return type

[**BranchList**](branchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful retrieval of the list of repository branches |  -  |

