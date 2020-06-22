# OpenAPI\Server\Api\EnvironmentsApiInterface

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvironment**](EnvironmentsApiInterface.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**downloadLogs**](EnvironmentsApiInterface.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**getEnvironment**](EnvironmentsApiInterface.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**getEnvironmentLogs**](EnvironmentsApiInterface.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**getEnvironments**](EnvironmentsApiInterface.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.environments:
        class: Acme\MyBundle\Api\EnvironmentsApi
        tags:
            - { name: "open_api_server.api", api: "environments" }
    # ...
```

## **deleteEnvironment**
> OpenAPI\Server\Model\Environment deleteEnvironment($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey)

DeleteEnvironment

Delete environment

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EnvironmentsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EnvironmentsApiInterface;

class EnvironmentsApi implements EnvironmentsApiInterface
{

    // ...

    /**
     * Implementation of EnvironmentsApiInterface#deleteEnvironment
     */
    public function deleteEnvironment($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **string**| Identifier of the application |
 **environmentId** | **string**| Identifier of the environment |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\Environment**](../Model/Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **downloadLogs**
> downloadLogs($programId, $environmentId, $service, $name, $date, $xGwImsOrgId, $authorization, $xApiKey, $accept)

Download Logs

Download environment logs

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EnvironmentsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EnvironmentsApiInterface;

class EnvironmentsApi implements EnvironmentsApiInterface
{

    // ...

    /**
     * Implementation of EnvironmentsApiInterface#downloadLogs
     */
    public function downloadLogs($programId, $environmentId, $service, $name, $date, $xGwImsOrgId, $authorization, $xApiKey, $accept = null)
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
 **service** | **string**| Name of service |
 **name** | **string**| Name of log |
 **date** | **string**| date for which log is required |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **accept** | **string**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getEnvironment**
> OpenAPI\Server\Model\Environment getEnvironment($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey)

Get Environment

Returns an environment by its id

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EnvironmentsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EnvironmentsApiInterface;

class EnvironmentsApi implements EnvironmentsApiInterface
{

    // ...

    /**
     * Implementation of EnvironmentsApiInterface#getEnvironment
     */
    public function getEnvironment($programId, $environmentId, $xGwImsOrgId, $authorization, $xApiKey)
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

[**OpenAPI\Server\Model\Environment**](../Model/Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getEnvironmentLogs**
> OpenAPI\Server\Model\EnvironmentLogs getEnvironmentLogs($programId, $environmentId, $days, $xGwImsOrgId, $authorization, $xApiKey, $service, $name)

Get Environment Logs

List all logs available in environment

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EnvironmentsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EnvironmentsApiInterface;

class EnvironmentsApi implements EnvironmentsApiInterface
{

    // ...

    /**
     * Implementation of EnvironmentsApiInterface#getEnvironmentLogs
     */
    public function getEnvironmentLogs($programId, $environmentId, $days, $xGwImsOrgId, $authorization, $xApiKey, array $service = null, array $name = null)
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
 **days** | **int**| number of days for which logs are required |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **service** | [**string**](../Model/string.md)| Names of services | [optional]
 **name** | [**string**](../Model/string.md)| Names of log | [optional]

### Return type

[**OpenAPI\Server\Model\EnvironmentLogs**](../Model/EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getEnvironments**
> OpenAPI\Server\Model\EnvironmentList getEnvironments($programId, $xGwImsOrgId, $authorization, $xApiKey, $type)

List Environments

Lists all environments in an program

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EnvironmentsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EnvironmentsApiInterface;

class EnvironmentsApi implements EnvironmentsApiInterface
{

    // ...

    /**
     * Implementation of EnvironmentsApiInterface#getEnvironments
     */
    public function getEnvironments($programId, $xGwImsOrgId, $authorization, $xApiKey, $type = null)
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
 **type** | **string**| Type of the environment | [optional]

### Return type

[**OpenAPI\Server\Model\EnvironmentList**](../Model/EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

