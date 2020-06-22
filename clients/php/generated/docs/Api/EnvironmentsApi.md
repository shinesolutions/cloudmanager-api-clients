# OpenAPI\Client\EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvironment**](EnvironmentsApi.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**downloadLogs**](EnvironmentsApi.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**getEnvironment**](EnvironmentsApi.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**getEnvironmentLogs**](EnvironmentsApi.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**getEnvironments**](EnvironmentsApi.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments



## deleteEnvironment

> \OpenAPI\Client\Model\Environment deleteEnvironment($program_id, $environment_id, $x_gw_ims_org_id, $authorization, $x_api_key)

DeleteEnvironment

Delete environment

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\EnvironmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the application
$environment_id = 'environment_id_example'; // string | Identifier of the environment
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->deleteEnvironment($program_id, $environment_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnvironmentsApi->deleteEnvironment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the application |
 **environment_id** | **string**| Identifier of the environment |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**\OpenAPI\Client\Model\Environment**](../Model/Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## downloadLogs

> downloadLogs($program_id, $environment_id, $service, $name, $date, $x_gw_ims_org_id, $authorization, $x_api_key, $accept)

Download Logs

Download environment logs

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\EnvironmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program
$environment_id = 'environment_id_example'; // string | Identifier of the environment
$service = 'service_example'; // string | Name of service
$name = 'name_example'; // string | Name of log
$date = 'date_example'; // string | date for which log is required
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$accept = 'accept_example'; // string | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.

try {
    $apiInstance->downloadLogs($program_id, $environment_id, $service, $name, $date, $x_gw_ims_org_id, $authorization, $x_api_key, $accept);
} catch (Exception $e) {
    echo 'Exception when calling EnvironmentsApi->downloadLogs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program |
 **environment_id** | **string**| Identifier of the environment |
 **service** | **string**| Name of service |
 **name** | **string**| Name of log |
 **date** | **string**| date for which log is required |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **accept** | **string**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getEnvironment

> \OpenAPI\Client\Model\Environment getEnvironment($program_id, $environment_id, $x_gw_ims_org_id, $authorization, $x_api_key)

Get Environment

Returns an environment by its id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\EnvironmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program
$environment_id = 'environment_id_example'; // string | Identifier of the environment
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->getEnvironment($program_id, $environment_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnvironmentsApi->getEnvironment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program |
 **environment_id** | **string**| Identifier of the environment |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**\OpenAPI\Client\Model\Environment**](../Model/Environment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getEnvironmentLogs

> \OpenAPI\Client\Model\EnvironmentLogs getEnvironmentLogs($program_id, $environment_id, $days, $x_gw_ims_org_id, $authorization, $x_api_key, $service, $name)

Get Environment Logs

List all logs available in environment

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\EnvironmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program
$environment_id = 'environment_id_example'; // string | Identifier of the environment
$days = 56; // int | number of days for which logs are required
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$service = array('service_example'); // string[] | Names of services
$name = array('name_example'); // string[] | Names of log

try {
    $result = $apiInstance->getEnvironmentLogs($program_id, $environment_id, $days, $x_gw_ims_org_id, $authorization, $x_api_key, $service, $name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnvironmentsApi->getEnvironmentLogs: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program |
 **environment_id** | **string**| Identifier of the environment |
 **days** | **int**| number of days for which logs are required |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **service** | [**string[]**](../Model/string.md)| Names of services | [optional]
 **name** | [**string[]**](../Model/string.md)| Names of log | [optional]

### Return type

[**\OpenAPI\Client\Model\EnvironmentLogs**](../Model/EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getEnvironments

> \OpenAPI\Client\Model\EnvironmentList getEnvironments($program_id, $x_gw_ims_org_id, $authorization, $x_api_key, $type)

List Environments

Lists all environments in an program

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\EnvironmentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$type = 'type_example'; // string | Type of the environment

try {
    $result = $apiInstance->getEnvironments($program_id, $x_gw_ims_org_id, $authorization, $x_api_key, $type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EnvironmentsApi->getEnvironments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **type** | **string**| Type of the environment | [optional]

### Return type

[**\OpenAPI\Client\Model\EnvironmentList**](../Model/EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

