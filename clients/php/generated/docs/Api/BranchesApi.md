# OpenAPI\Client\BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches



## getBranches

> \OpenAPI\Client\Model\BranchList getBranches($program_id, $repository_id, $x_gw_ims_org_id, $authorization, $x_api_key)

List Branches

Returns the list of branches from a repository

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\BranchesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$program_id = 'program_id_example'; // string | Identifier of the program.
$repository_id = 'repository_id_example'; // string | Identifier of the repository
$x_gw_ims_org_id = 'x_gw_ims_org_id_example'; // string | IMS organization ID that the request is being made under.
$authorization = 'authorization_example'; // string | Bearer [token] - An access token for the technical account created through integration with Adobe IO
$x_api_key = 'x_api_key_example'; // string | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io

try {
    $result = $apiInstance->getBranches($program_id, $repository_id, $x_gw_ims_org_id, $authorization, $x_api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BranchesApi->getBranches: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **program_id** | **string**| Identifier of the program. |
 **repository_id** | **string**| Identifier of the repository |
 **x_gw_ims_org_id** | **string**| IMS organization ID that the request is being made under. |
 **authorization** | **string**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **x_api_key** | **string**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**\OpenAPI\Client\Model\BranchList**](../Model/BranchList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

