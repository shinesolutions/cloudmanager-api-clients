# RepositoriesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRepositories**](RepositoriesApi.md#getRepositories) | **GET** /api/program/{programId}/repositories | Lists Repositories
[**getRepository**](RepositoriesApi.md#getRepository) | **GET** /api/program/{programId}/repository/{repositoryId} | Get Repository


<a name="getRepositories"></a>
# **getRepositories**
> RepositoryList getRepositories(programId, xGwImsOrgId, authorization, xApiKey)

Lists Repositories

Lists all Repositories in an program

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.RepositoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    RepositoriesApi apiInstance = new RepositoriesApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      RepositoryList result = apiInstance.getRepositories(programId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RepositoriesApi#getRepositories");
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
 **programId** | **String**| Identifier of the program |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**RepositoryList**](RepositoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getRepository"></a>
# **getRepository**
> Repository getRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey)

Get Repository

Returns an repository by its id

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.RepositoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    RepositoriesApi apiInstance = new RepositoriesApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String repositoryId = "repositoryId_example"; // String | Identifier of the repository
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      Repository result = apiInstance.getRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RepositoriesApi#getRepository");
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
 **programId** | **String**| Identifier of the program |
 **repositoryId** | **String**| Identifier of the repository |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**Repository**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

