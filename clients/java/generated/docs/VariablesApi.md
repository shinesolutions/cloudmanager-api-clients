# VariablesApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnvironmentVariables**](VariablesApi.md#getEnvironmentVariables) | **GET** /api/program/{programId}/environment/{environmentId}/variables | List User Environment Variables
[**patchEnvironmentVariables**](VariablesApi.md#patchEnvironmentVariables) | **PATCH** /api/program/{programId}/environment/{environmentId}/variables | Patch User Environment Variables


<a name="getEnvironmentVariables"></a>
# **getEnvironmentVariables**
> VariableList getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey)

List User Environment Variables

List the user defined variables for an environment (Cloud Service only).

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.VariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    VariablesApi apiInstance = new VariablesApi(defaultClient);
    String programId = 2351; // String | Identifier of the program
    String environmentId = 128; // String | Identifier of the environment
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      VariableList result = apiInstance.getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariablesApi#getEnvironmentVariables");
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
 **environmentId** | **String**| Identifier of the environment |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of environment variables |  -  |
**404** | Environment not found |  -  |

<a name="patchEnvironmentVariables"></a>
# **patchEnvironmentVariables**
> VariableList patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body)

Patch User Environment Variables

Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.VariablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    VariablesApi apiInstance = new VariablesApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String environmentId = "environmentId_example"; // String | Identifier of the environment
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    String contentType = "contentType_example"; // String | Must always be application/json
    List<Variable> body = Arrays.asList(); // List<Variable> | The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.
    try {
      VariableList result = apiInstance.patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VariablesApi#patchEnvironmentVariables");
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
 **environmentId** | **String**| Identifier of the environment |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **contentType** | **String**| Must always be application/json |
 **body** | [**List&lt;Variable&gt;**](Variable.md)| The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. |

### Return type

[**VariableList**](VariableList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful update of environment variables |  -  |
**404** | Environment not found |  -  |

