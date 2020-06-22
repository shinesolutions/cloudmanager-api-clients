# ProgramsApi

All URIs are relative to *https://cloudmanager.adobe.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProgram**](ProgramsApi.md#deleteProgram) | **DELETE** /api/program/{programId} | Delete Program
[**getProgram**](ProgramsApi.md#getProgram) | **GET** /api/program/{programId} | Get Program
[**getPrograms**](ProgramsApi.md#getPrograms) | **GET** /api/programs | Lists Programs


<a name="deleteProgram"></a>
# **deleteProgram**
> Program deleteProgram(programId, xGwImsOrgId, authorization, xApiKey)

Delete Program

Delete an program

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    ProgramsApi apiInstance = new ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      Program result = apiInstance.deleteProgram(programId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProgramsApi#deleteProgram");
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

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**202** | Delete was successful. |  -  |
**403** | Forbidden. |  -  |
**404** | Program not found. |  -  |
**412** | Deletion not supported |  -  |

<a name="getProgram"></a>
# **getProgram**
> Program getProgram(programId, xGwImsOrgId, authorization, xApiKey)

Get Program

Returns a program by its id

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    ProgramsApi apiInstance = new ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifier of the program
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      Program result = apiInstance.getProgram(programId, xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProgramsApi#getProgram");
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

[**Program**](Program.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful retrieval of program |  -  |
**404** | Program not found |  -  |

<a name="getPrograms"></a>
# **getPrograms**
> ProgramList getPrograms(xGwImsOrgId, authorization, xApiKey)

Lists Programs

Returns all programs that the requesting user has access to

### Example
```java
// Import classes:
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.models.*;
import com.shinesolutions.aemcloudmanager4j.api.ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://cloudmanager.adobe.io");

    ProgramsApi apiInstance = new ProgramsApi(defaultClient);
    String xGwImsOrgId = "xGwImsOrgId_example"; // String | IMS organization ID that the request is being made under.
    String authorization = "authorization_example"; // String | Bearer [token] - An access token for the technical account created through integration with Adobe IO
    String xApiKey = "xApiKey_example"; // String | IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    try {
      ProgramList result = apiInstance.getPrograms(xGwImsOrgId, authorization, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProgramsApi#getPrograms");
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
 **xGwImsOrgId** | **String**| IMS organization ID that the request is being made under. |
 **authorization** | **String**| Bearer [token] - An access token for the technical account created through integration with Adobe IO |
 **xApiKey** | **String**| IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io |

### Return type

[**ProgramList**](ProgramList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

