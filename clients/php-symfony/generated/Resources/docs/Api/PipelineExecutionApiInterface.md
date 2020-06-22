# OpenAPI\Server\Api\PipelineExecutionApiInterface

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancePipelineExecution**](PipelineExecutionApiInterface.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancelPipelineExecutionStep**](PipelineExecutionApiInterface.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**getCurrentExecution**](PipelineExecutionApiInterface.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**getExecution**](PipelineExecutionApiInterface.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**getExecutions**](PipelineExecutionApiInterface.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**getStepLogs**](PipelineExecutionApiInterface.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**startPipeline**](PipelineExecutionApiInterface.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**stepMetric**](PipelineExecutionApiInterface.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**stepState**](PipelineExecutionApiInterface.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.pipelineExecution:
        class: Acme\MyBundle\Api\PipelineExecutionApi
        tags:
            - { name: "open_api_server.api", api: "pipelineExecution" }
    # ...
```

## **advancePipelineExecution**
> advancePipelineExecution($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey, $contentType, $body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#advancePipelineExecution
     */
    public function advancePipelineExecution($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey, $contentType, array $body)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **executionId** | **string**| Identifier of the execution |
 **phaseId** | **string**| Identifier of the phase |
 **stepId** | **string**| Identifier of the step |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **string**| Must always be application/json |
 **body** | **array**| Input for advance. See documentation for details. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **cancelPipelineExecutionStep**
> cancelPipelineExecutionStep($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey, $contentType, $body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#cancelPipelineExecutionStep
     */
    public function cancelPipelineExecutionStep($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey, $contentType, array $body)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **executionId** | **string**| Identifier of the execution |
 **phaseId** | **string**| Identifier of the phase |
 **stepId** | **string**| Identifier of the step |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **string**| Must always be application/json |
 **body** | **array**| Input for advance. See documentation for details. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCurrentExecution**
> OpenAPI\Server\Model\PipelineExecution getCurrentExecution($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey)

Get current pipeline execution

Returns current pipeline execution if any.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#getCurrentExecution
     */
    public function getCurrentExecution($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\PipelineExecution**](../Model/PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getExecution**
> OpenAPI\Server\Model\PipelineExecution getExecution($programId, $pipelineId, $executionId, $xGwImsOrgId, $authorization, $xApiKey)

Get pipeline execution

Returns a pipeline execution by id

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#getExecution
     */
    public function getExecution($programId, $pipelineId, $executionId, $xGwImsOrgId, $authorization, $xApiKey)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **executionId** | **string**| Identifier of the execution |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\PipelineExecution**](../Model/PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getExecutions**
> OpenAPI\Server\Model\PipelineExecutionListRepresentation getExecutions($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey, $start, $limit)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#getExecutions
     */
    public function getExecutions($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey, $start = null, $limit = null)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **start** | **string**| Pagination start parameter | [optional]
 **limit** | **int**| Pagination limit parameter | [optional]

### Return type

[**OpenAPI\Server\Model\PipelineExecutionListRepresentation**](../Model/PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getStepLogs**
> getStepLogs($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey, $file, $accept)

Get logs

Get the logs associated with a step.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#getStepLogs
     */
    public function getStepLogs($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey, $file = null, $accept = null)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **executionId** | **string**| Identifier of the execution |
 **phaseId** | **string**| Identifier of the phase |
 **stepId** | **string**| Identifier of the step |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **file** | **string**| Identifier of the log file | [optional]
 **accept** | **string**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **startPipeline**
> startPipeline($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey, $contentType)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#startPipeline
     */
    public function startPipeline($programId, $pipelineId, $xGwImsOrgId, $authorization, $xApiKey, $contentType)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **string**| Must always be application/json |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **stepMetric**
> OpenAPI\Server\Model\PipelineStepMetrics stepMetric($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey)

Get step metrics

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#stepMetric
     */
    public function stepMetric($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **executionId** | **string**| Identifier of the execution |
 **phaseId** | **string**| Identifier of the phase |
 **stepId** | **string**| Identifier of the step |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\PipelineStepMetrics**](../Model/PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **stepState**
> OpenAPI\Server\Model\PipelineExecutionStepState stepState($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey)

Get step state

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PipelineExecutionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PipelineExecutionApiInterface;

class PipelineExecutionApi implements PipelineExecutionApiInterface
{

    // ...

    /**
     * Implementation of PipelineExecutionApiInterface#stepState
     */
    public function stepState($programId, $pipelineId, $executionId, $phaseId, $stepId, $xGwImsOrgId, $authorization, $xApiKey)
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
 **pipelineId** | **string**| Identifier of the pipeline |
 **executionId** | **string**| Identifier of the execution |
 **phaseId** | **string**| Identifier of the phase |
 **stepId** | **string**| Identifier of the step |
 **xGwImsOrgId** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**OpenAPI\Server\Model\PipelineExecutionStepState**](../Model/PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

