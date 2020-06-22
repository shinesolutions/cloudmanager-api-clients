# OpenAPI\Server\Api\RepositoriesApiInterface

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRepositories**](RepositoriesApiInterface.md#getRepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**getRepository**](RepositoriesApiInterface.md#getRepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.repositories:
        class: Acme\MyBundle\Api\RepositoriesApi
        tags:
            - { name: "open_api_server.api", api: "repositories" }
    # ...
```

## **getRepositories**
> OpenAPI\Server\Model\RepositoryList getRepositories($programId, $xGwImsOrgId, $authorization, $xApiKey)

Lists Repositories

Lists all Repositories in an program

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RepositoriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RepositoriesApiInterface;

class RepositoriesApi implements RepositoriesApiInterface
{

    // ...

    /**
     * Implementation of RepositoriesApiInterface#getRepositories
     */
    public function getRepositories($programId, $xGwImsOrgId, $authorization, $xApiKey)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\RepositoryList**](../Model/RepositoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getRepository**
> OpenAPI\Server\Model\Repository getRepository($programId, $repositoryId, $xGwImsOrgId, $authorization, $xApiKey)

Get Repository

Returns an repository by its id

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RepositoriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RepositoriesApiInterface;

class RepositoriesApi implements RepositoriesApiInterface
{

    // ...

    /**
     * Implementation of RepositoriesApiInterface#getRepository
     */
    public function getRepository($programId, $repositoryId, $xGwImsOrgId, $authorization, $xApiKey)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the program |
 **repositoryId** | **string**| Identifier of the repository |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\Repository**](../Model/Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

