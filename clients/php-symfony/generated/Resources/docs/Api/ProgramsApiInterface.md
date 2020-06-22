# OpenAPI\Server\Api\ProgramsApiInterface

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProgram**](ProgramsApiInterface.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
[**getProgram**](ProgramsApiInterface.md#getProgram) | **GET** /api/program/{programId} | Get Program
[**getPrograms**](ProgramsApiInterface.md#getPrograms) | **GET** /api/programs | Lists Programs


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.programs:
        class: Acme\MyBundle\Api\ProgramsApi
        tags:
            - { name: "open_api_server.api", api: "programs" }
    # ...
```

## **deleteProgram**
> OpenAPI\Server\Model\Program deleteProgram($programId, $xGwImsOrgId, $authorization, $xApiKey)

Delete Program

Delete an program

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProgramsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProgramsApiInterface;

class ProgramsApi implements ProgramsApiInterface
{

    // ...

    /**
     * Implementation of ProgramsApiInterface#deleteProgram
     */
    public function deleteProgram($programId, $xGwImsOrgId, $authorization, $xApiKey)
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

[**OpenAPI\Server\Model\Program**](../Model/Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getProgram**
> OpenAPI\Server\Model\Program getProgram($programId, $xGwImsOrgId, $authorization, $xApiKey)

Get Program

Returns a program by its id

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProgramsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProgramsApiInterface;

class ProgramsApi implements ProgramsApiInterface
{

    // ...

    /**
     * Implementation of ProgramsApiInterface#getProgram
     */
    public function getProgram($programId, $xGwImsOrgId, $authorization, $xApiKey)
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

[**OpenAPI\Server\Model\Program**](../Model/Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getPrograms**
> OpenAPI\Server\Model\ProgramList getPrograms($xGwImsOrgId, $authorization, $xApiKey)

Lists Programs

Returns all programs that the requesting user has access to

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProgramsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProgramsApiInterface;

class ProgramsApi implements ProgramsApiInterface
{

    // ...

    /**
     * Implementation of ProgramsApiInterface#getPrograms
     */
    public function getPrograms($xGwImsOrgId, $authorization, $xApiKey)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\ProgramList**](../Model/ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

