# OpenAPI\Client\ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProgram**](ProgramsApi.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
[**getProgram**](ProgramsApi.md#getProgram) | **GET** /api/program/{programId} | Get Program
[**getPrograms**](ProgramsApi.md#getPrograms) | **GET** /api/programs | Lists Programs



## deleteProgram

> \OpenAPI\Client\Model\Program deleteProgram($program_id, $x_gw_ims_org_id, $authorization, $x_api_key)

Delete Program

Delete an program

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\ProgramsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->deleteProgram($program_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProgramsApi->deleteProgram: ', $e->getMessage(), PHP_EOL;
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

### Return type

[**\OpenAPI\Client\Model\Program**](../Model/Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getProgram

> \OpenAPI\Client\Model\Program getProgram($program_id, $x_gw_ims_org_id, $authorization, $x_api_key)

Get Program

Returns a program by its id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\ProgramsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->getProgram($program_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProgramsApi->getProgram: ', $e->getMessage(), PHP_EOL;
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

### Return type

[**\OpenAPI\Client\Model\Program**](../Model/Program.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## getPrograms

> \OpenAPI\Client\Model\ProgramList getPrograms($x_gw_ims_org_id, $authorization, $x_api_key)

Lists Programs

Returns all programs that the requesting user has access to

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\ProgramsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->getPrograms($x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProgramsApi->getPrograms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**\OpenAPI\Client\Model\ProgramList**](../Model/ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

