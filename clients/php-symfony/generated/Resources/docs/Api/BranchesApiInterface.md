# OpenAPI\Server\Api\BranchesApiInterface

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApiInterface.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.branches:
        class: Acme\MyBundle\Api\BranchesApi
        tags:
            - { name: "open_api_server.api", api: "branches" }
    # ...
```

## **getBranches**
> OpenAPI\Server\Model\BranchList getBranches($programId, $repositoryId, $xGwImsOrgId, $authorization, $xApiKey)

List Branches

Returns the list of branches from a repository

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BranchesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BranchesApiInterface;

class BranchesApi implements BranchesApiInterface
{

    // ...

    /**
     * Implementation of BranchesApiInterface#getBranches
     */
    public function getBranches($programId, $repositoryId, $xGwImsOrgId, $authorization, $xApiKey)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program. |
 **repositoryId** | **string**| Identifier of the repository |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\BranchList**](../Model/BranchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

