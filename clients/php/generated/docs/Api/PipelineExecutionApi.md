# OpenAPI\Client\PipelineExecutionApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancePipelineExecution**](PipelineExecutionApi.md#advancePipelineExecution) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance | Advance
[**cancelPipelineExecutionStep**](PipelineExecutionApi.md#cancelPipelineExecutionStep) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel | Cancel
[**getCurrentExecution**](PipelineExecutionApi.md#getCurrentExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution | Get current pipeline execution
[**getExecution**](PipelineExecutionApi.md#getExecution) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId} | Get pipeline execution
[**getExecutions**](PipelineExecutionApi.md#getExecutions) | **GET** /api/program/{programId}/pipeline/{pipelineId}/executions | List Executions
[**getStepLogs**](PipelineExecutionApi.md#getStepLogs) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs | Get logs
[**startPipeline**](PipelineExecutionApi.md#startPipeline) | **PUT** /api/program/{programId}/pipeline/{pipelineId}/execution | Start the pipeline
[**stepMetric**](PipelineExecutionApi.md#stepMetric) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics | Get step metrics
[**stepState**](PipelineExecutionApi.md#stepState) | **GET** /api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId} | Get step state



## advancePipelineExecution

> advancePipelineExecution($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key, $content_type, $body)

Advance

Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$execution_id = 'execution_id_example'; // string | Identifier of the execution
$phase_id = 'phase_id_example'; // string | Identifier of the phase
$step_id = 'step_id_example'; // string | Identifier of the step
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$content_type = 'content_type_example'; // string | Must always be application/json
$body = new \stdClass; // object | Input for advance. See documentation for details.

try {
    $apiInstance->advancePipelineExecution($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key, $content_type, $body);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->advancePipelineExecution: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **execution_id** | **string**| Identifier of the execution |
 **phase_id** | **string**| Identifier of the phase |
 **step_id** | **string**| Identifier of the step |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **content_type** | **string**| Must always be application/json |
 **body** | **object**| Input for advance. See documentation for details. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## cancelPipelineExecutionStep

> cancelPipelineExecutionStep($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key, $content_type, $body)

Cancel

Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$execution_id = 'execution_id_example'; // string | Identifier of the execution
$phase_id = 'phase_id_example'; // string | Identifier of the phase
$step_id = 'step_id_example'; // string | Identifier of the step
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$content_type = 'content_type_example'; // string | Must always be application/json
$body = new \stdClass; // object | Input for advance. See documentation for details.

try {
    $apiInstance->cancelPipelineExecutionStep($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key, $content_type, $body);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->cancelPipelineExecutionStep: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **execution_id** | **string**| Identifier of the execution |
 **phase_id** | **string**| Identifier of the phase |
 **step_id** | **string**| Identifier of the step |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **content_type** | **string**| Must always be application/json |
 **body** | **object**| Input for advance. See documentation for details. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getCurrentExecution

> \OpenAPI\Client\Model\PipelineExecution getCurrentExecution($program_id, $pipeline_id, $x_gw_ims_org_id, $authorization, $x_api_key)

Get current pipeline execution

Returns current pipeline execution if any.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->getCurrentExecution($program_id, $pipeline_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->getCurrentExecution: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**\OpenAPI\Client\Model\PipelineExecution**](../Model/PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getExecution

> \OpenAPI\Client\Model\PipelineExecution getExecution($program_id, $pipeline_id, $execution_id, $x_gw_ims_org_id, $authorization, $x_api_key)

Get pipeline execution

Returns a pipeline execution by id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$execution_id = 'execution_id_example'; // string | Identifier of the execution
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->getExecution($program_id, $pipeline_id, $execution_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->getExecution: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **execution_id** | **string**| Identifier of the execution |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**\OpenAPI\Client\Model\PipelineExecution**](../Model/PipelineExecution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getExecutions

> \OpenAPI\Client\Model\PipelineExecutionListRepresentation getExecutions($program_id, $pipeline_id, $x_gw_ims_org_id, $authorization, $x_api_key, $start, $limit)

List Executions

Returns the history of pipeline executions in a newest to oldest order

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$start = 'start_example'; // string | Pagination start parameter
$limit = 56; // int | Pagination limit parameter

try {
    $result = $apiInstance->getExecutions($program_id, $pipeline_id, $x_gw_ims_org_id, $authorization, $x_api_key, $start, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->getExecutions: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **start** | **string**| Pagination start parameter | [optional]
 **limit** | **int**| Pagination limit parameter | [optional]

### Return type

[**\OpenAPI\Client\Model\PipelineExecutionListRepresentation**](../Model/PipelineExecutionListRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getStepLogs

> getStepLogs($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key, $file, $accept)

Get logs

Get the logs associated with a step.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$execution_id = 'execution_id_example'; // string | Identifier of the execution
$phase_id = 'phase_id_example'; // string | Identifier of the phase
$step_id = 'step_id_example'; // string | Identifier of the step
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$file = 'file_example'; // string | Identifier of the log file
$accept = 'accept_example'; // string | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.

try {
    $apiInstance->getStepLogs($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key, $file, $accept);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->getStepLogs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **execution_id** | **string**| Identifier of the execution |
 **phase_id** | **string**| Identifier of the phase |
 **step_id** | **string**| Identifier of the step |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **file** | **string**| Identifier of the log file | [optional]
 **accept** | **string**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## startPipeline

> startPipeline($program_id, $pipeline_id, $x_gw_ims_org_id, $authorization, $x_api_key, $content_type)

Start the pipeline

Starts the Pipeline. This works only if the pipeline is not already started.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$content_type = 'content_type_example'; // string | Must always be application/json

try {
    $apiInstance->startPipeline($program_id, $pipeline_id, $x_gw_ims_org_id, $authorization, $x_api_key, $content_type);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->startPipeline: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **content_type** | **string**| Must always be application/json |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## stepMetric

> \OpenAPI\Client\Model\PipelineStepMetrics stepMetric($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key)

Get step metrics

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$execution_id = 'execution_id_example'; // string | Identifier of the execution
$phase_id = 'phase_id_example'; // string | Identifier of the phase
$step_id = 'step_id_example'; // string | Identifier of the step
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->stepMetric($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->stepMetric: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **execution_id** | **string**| Identifier of the execution |
 **phase_id** | **string**| Identifier of the phase |
 **step_id** | **string**| Identifier of the step |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**\OpenAPI\Client\Model\PipelineStepMetrics**](../Model/PipelineStepMetrics.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## stepState

> \OpenAPI\Client\Model\PipelineExecutionStepState stepState($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key)

Get step state

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\PipelineExecutionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$pipeline_id = 'pipeline_id_example'; // string | Identifier of the pipeline
$execution_id = 'execution_id_example'; // string | Identifier of the execution
$phase_id = 'phase_id_example'; // string | Identifier of the phase
$step_id = 'step_id_example'; // string | Identifier of the step
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->stepState($program_id, $pipeline_id, $execution_id, $phase_id, $step_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PipelineExecutionApi->stepState: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **pipeline_id** | **string**| Identifier of the pipeline |
 **execution_id** | **string**| Identifier of the execution |
 **phase_id** | **string**| Identifier of the phase |
 **step_id** | **string**| Identifier of the step |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**\OpenAPI\Client\Model\PipelineExecutionStepState**](../Model/PipelineExecutionStepState.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

