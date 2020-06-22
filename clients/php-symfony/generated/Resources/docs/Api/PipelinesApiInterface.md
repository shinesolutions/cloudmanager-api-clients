# OpenAPI\Server\Api\PipelinesApiInterface

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePipeline**](PipelinesApiInterface.md#deletePipeline) | **DELETE** /api/program/{programId}/pipeline/{pipelineId} | Delete a Pipeline
[**getPipeline**](PipelinesApiInterface.md#getPipeline) | **GET** /api/program/{programId}/pipeline/{pipelineId} | Get Pipeline
[**getPipelines**](PipelinesApiInterface.md#getPipelines) | **GET** /api/program/{programId}/pipelines | List Pipelines
[**patchPipeline**](PipelinesApiInterface.md#patchPipeline) | **PATCH** /api/program/{programId}/pipeline/{pipelineId} | Patches Pipeline


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pipelines:
        class: Acme\MyBundle\Api\PipelinesApi
        tags:
            - { name: "open_api_server.api", api: "pipelines" }
    # ...
```

## **deletePipeline**
> deletePipeline($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey)

Delete a Pipeline

Delete a pipeline. All the data is wiped.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelinesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelinesApiInterface;

class PipelinesApi implements PipelinesApiInterface
{

    // ...

    /**
     * Implementation of PipelinesApiInterface#deletePipeline
     */
    public function deletePipeline($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getPipeline**
> OpenAPI\Server\Model\Pipeline getPipeline($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey)

Get Pipeline

Returns a pipeline by its id

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelinesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelinesApiInterface;

class PipelinesApi implements PipelinesApiInterface
{

    // ...

    /**
     * Implementation of PipelinesApiInterface#getPipeline
     */
    public function getPipeline($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\Pipeline**](../Model/Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getPipelines**
> OpenAPI\Server\Model\PipelineList getPipelines($programId, $xGwImsOrgId, $authorization, $xApiKey)

List Pipelines

Returns all the pipelines that the requesting user has access to in an program

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelinesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelinesApiInterface;

class PipelinesApi implements PipelinesApiInterface
{

    // ...

    /**
     * Implementation of PipelinesApiInterface#getPipelines
     */
    public function getPipelines($programId, $xGwImsOrgId, $authorization, $xApiKey)
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

[**OpenAPI\Server\Model\PipelineList**](../Model/PipelineList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **patchPipeline**
> OpenAPI\Server\Model\Pipeline patchPipeline($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey, $contentType, $body)

Patches Pipeline

Patches a pipeline within an program.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelinesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelinesApiInterface;

class PipelinesApi implements PipelinesApiInterface
{

    // ...

    /**
     * Implementation of PipelinesApiInterface#patchPipeline
     */
    public function patchPipeline($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey, $contentType, Pipeline $body)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **string**| Must always be application/json |
 **body** | [**OpenAPI\Server\Model\Pipeline**](../Model/Pipeline.md)| The updated Pipeline |

### Return type

[**OpenAPI\Server\Model\Pipeline**](../Model/Pipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

