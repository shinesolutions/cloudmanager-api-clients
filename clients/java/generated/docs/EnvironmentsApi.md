# EnvironmentsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnvironment**](EnvironmentsApi.md#deleteEnvironment) | **DELETE** /api/program/{programId}/environment/{environmentId} | DeleteEnvironment
[**downloadLogs**](EnvironmentsApi.md#downloadLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs/download | Download Logs
[**getEnvironment**](EnvironmentsApi.md#getEnvironment) | **GET** /api/program/{programId}/environment/{environmentId} | Get Environment
[**getEnvironmentLogs**](EnvironmentsApi.md#getEnvironmentLogs) | **GET** /api/program/{programId}/environment/{environmentId}/logs | Get Environment Logs
[**getEnvironments**](EnvironmentsApi.md#getEnvironments) | **GET** /api/program/{programId}/environments | List Environments


<a name="deleteEnvironment"></a>
# **deleteEnvironment**
> Environment deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey)

DeleteEnvironment

Delete environment

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the application
    String environmentId = "environmentId_example"; // String | Identifier of the environment
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      Environment result = apiInstance.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#deleteEnvironment");
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
 **programId** | **String**| Identifier of the application |
 **environmentId** | **String**| Identifier of the environment |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Environment deleted |  -  |
**400** | Environment deletion in progress |  -  |
**404** | Environment not found |  -  |

<a name="downloadLogs"></a>
# **downloadLogs**
> downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept)

Download Logs

Download environment logs

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String environmentId = "environmentId_example"; // String | Identifier of the environment
    String service = "service_example"; // String | Name of service
    String name = "name_example"; // String | Name of log
    String date = "date_example"; // String | date for which log is required
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    String accept = "accept_example"; // String | Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
    try {
      apiInstance.downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#downloadLogs");
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
 **service** | **String**| Name of service |
 **name** | **String**| Name of log |
 **date** | **String**| date for which log is required |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **accept** | **String**| Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of logs |  -  |
**400** | invalid parameters |  -  |
**404** | Environment not found |  -  |

<a name="getEnvironment"></a>
# **getEnvironment**
> Environment getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey)

Get Environment

Returns an environment by its id

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String environmentId = "environmentId_example"; // String | Identifier of the environment
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      Environment result = apiInstance.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getEnvironment");
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

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getEnvironmentLogs"></a>
# **getEnvironmentLogs**
> EnvironmentLogs getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name)

Get Environment Logs

List all logs available in environment

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String environmentId = "environmentId_example"; // String | Identifier of the environment
    Integer days = 56; // Integer | number of days for which logs are required
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    List<String> service = Arrays.asList(); // List<String> | Names of services
    List<String> name = Arrays.asList(); // List<String> | Names of log
    try {
      EnvironmentLogs result = apiInstance.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getEnvironmentLogs");
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
 **days** | **Integer**| number of days for which logs are required |
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |
 **service** | [**List&lt;String&gt;**](String.md)| Names of services | [optional]
 **name** | [**List&lt;String&gt;**](String.md)| Names of log | [optional]

### Return type

[**EnvironmentLogs**](EnvironmentLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of logs for an environment |  -  |
**400** | invalid parameters |  -  |
**404** | Environment not found |  -  |

<a name="getEnvironments"></a>
# **getEnvironments**
> EnvironmentList getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type)

List Environments

Lists all environments in an program

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.EnvironmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    EnvironmentsApi apiInstance = new EnvironmentsApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    String type = "type_example"; // String | Type of the environment
    try {
      EnvironmentList result = apiInstance.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentsApi#getEnvironments");
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
 **type** | **String**| Type of the environment | [optional] [enum: dev, stage, prod]

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of environment list |  -  |
**404** | Program not found |  -  |

