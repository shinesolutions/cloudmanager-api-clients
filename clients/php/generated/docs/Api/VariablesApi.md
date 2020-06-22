# OpenAPI\Client\VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentVariables**](VariablesApi.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patchEnvironmentVariables**](VariablesApi.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables



## getEnvironmentVariables

> \OpenAPI\Client\Model\VariableList getEnvironmentVariables($program_id, $environment_id, $x_gw_ims_org_id, $authorization, $x_api_key)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\VariablesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 2351; // string | Identifier of the program
$environment_id = 128; // string | Identifier of the environment
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->getEnvironmentVariables($program_id, $environment_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VariablesApi->getEnvironmentVariables: ', $e->getMessage(), PHP_EOL;
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

[**\OpenAPI\Client\Model\VariableList**](../Model/VariableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## patchEnvironmentVariables

> \OpenAPI\Client\Model\VariableList patchEnvironmentVariables($program_id, $environment_id, $x_gw_ims_org_id, $authorization, $x_api_key, $content_type, $body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\VariablesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program
$environment_id = 'environment_id_example'; // string | Identifier of the environment
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
$content_type = 'content_type_example'; // string | Must always be application/json
$body = array(new \OpenAPI\Client\Model\Variable()); // \OpenAPI\Client\Model\Variable[] | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.

try {
    $result = $apiInstance->patchEnvironmentVariables($program_id, $environment_id, $x_gw_ims_org_id, $authorization, $x_api_key, $content_type, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling VariablesApi->patchEnvironmentVariables: ', $e->getMessage(), PHP_EOL;
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
 **content_type** | **string**| Must always be application/json |
 **body** | [**\OpenAPI\Client\Model\Variable[]**](../Model/Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. |

### Return type

[**\OpenAPI\Client\Model\VariableList**](../Model/VariableList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

