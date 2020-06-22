# BranchesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApi.md#getBranches) | **GET** /api/program/{programId}/repository/{repositoryId}/branches | List Branches


<a name="getBranches"></a>
# **getBranches**
> BranchList getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey)

List Branches

Returns the list of branches from a repository

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.BranchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program.
    String repositoryId = "repositoryId_example"; // String | Identifier of the repository
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      BranchList result = apiInstance.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#getBranches");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **programId** | **String**| Identifier of the program. |
 **repositoryId** | **String**| Identifier of the repository |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**BranchList**](BranchList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of the list of repository branches |  -  |

