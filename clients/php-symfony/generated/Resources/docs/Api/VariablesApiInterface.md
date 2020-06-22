# OpenAPI\Server\Api\VariablesApiInterface

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentVariables**](VariablesApiInterface.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patchEnvironmentVariables**](VariablesApiInterface.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.variables:
        class: Acme\MyBundle\Api\VariablesApi
        tags:
            - { name: "open_api_server.api", api: "variables" }
    # ...
```

## **getEnvironmentVariables**
> OpenAPI\Server\Model\VariableList getEnvironmentVariables($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VariablesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VariablesApiInterface;

class VariablesApi implements VariablesApiInterface
{

    // ...

    /**
     * Implementation of VariablesApiInterface#getEnvironmentVariables
     */
    public function getEnvironmentVariables($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey)
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
 **environmentId** | **string**| Identifier of the environment |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\VariableList**](../Model/VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **patchEnvironmentVariables**
> OpenAPI\Server\Model\VariableList patchEnvironmentVariables($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey, $contentType, $body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VariablesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VariablesApiInterface;

class VariablesApi implements VariablesApiInterface
{

    // ...

    /**
     * Implementation of VariablesApiInterface#patchEnvironmentVariables
     */
    public function patchEnvironmentVariables($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey, $contentType, array $body)
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
 **environmentId** | **string**| Identifier of the environment |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **string**| Must always be application/json |
 **body** | [**OpenAPI\Server\Model\Variable**](../Model/Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. |

### Return type

[**OpenAPI\Server\Model\VariableList**](../Model/VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

