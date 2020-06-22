/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.Program;
import org.openapitools.client.model.ProgramList;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ProgramsApi {
  String basePath = "https://cloudmanager.adobe.io";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Delete Program
  * Delete an program
   * @param programId Identifier of the program
   * @param xGwImsOrgId IMS organization ID that the request is being made under.
   * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
   * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
   * @return Program
  */
  public Program deleteProgram (String programId, String xGwImsOrgId, String authorization, String xApiKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'programId' is set
    if (programId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'programId' when calling deleteProgram",
        new ApiException(400, "Missing the required parameter 'programId' when calling deleteProgram"));
    }
    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xGwImsOrgId' when calling deleteProgram",
        new ApiException(400, "Missing the required parameter 'xGwImsOrgId' when calling deleteProgram"));
    }
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling deleteProgram",
        new ApiException(400, "Missing the required parameter 'authorization' when calling deleteProgram"));
    }
    // verify the required parameter 'xApiKey' is set
    if (xApiKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xApiKey' when calling deleteProgram",
        new ApiException(400, "Missing the required parameter 'xApiKey' when calling deleteProgram"));
    }

    // create path and map variables
    String path = "/api/program/{programId}".replaceAll("\\{" + "programId" + "\\}", apiInvoker.escapeString(programId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("x-gw-ims-org-id", ApiInvoker.parameterToString(xGwImsOrgId));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("x-api-key", ApiInvoker.parameterToString(xApiKey));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Program) ApiInvoker.deserialize(localVarResponse, "", Program.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Delete Program
   * Delete an program
   * @param programId Identifier of the program   * @param xGwImsOrgId IMS organization ID that the request is being made under.   * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO   * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  */
  public void deleteProgram (String programId, String xGwImsOrgId, String authorization, String xApiKey, final Response.Listener<Program> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'programId' is set
    if (programId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'programId' when calling deleteProgram",
        new ApiException(400, "Missing the required parameter 'programId' when calling deleteProgram"));
    }
    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xGwImsOrgId' when calling deleteProgram",
        new ApiException(400, "Missing the required parameter 'xGwImsOrgId' when calling deleteProgram"));
    }
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling deleteProgram",
        new ApiException(400, "Missing the required parameter 'authorization' when calling deleteProgram"));
    }
    // verify the required parameter 'xApiKey' is set
    if (xApiKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xApiKey' when calling deleteProgram",
        new ApiException(400, "Missing the required parameter 'xApiKey' when calling deleteProgram"));
    }

    // create path and map variables
    String path = "/api/program/{programId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "programId" + "\\}", apiInvoker.escapeString(programId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("x-gw-ims-org-id", ApiInvoker.parameterToString(xGwImsOrgId));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("x-api-key", ApiInvoker.parameterToString(xApiKey));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Program) ApiInvoker.deserialize(localVarResponse,  "", Program.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get Program
  * Returns a program by its id
   * @param programId Identifier of the program
   * @param xGwImsOrgId IMS organization ID that the request is being made under.
   * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
   * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
   * @return Program
  */
  public Program getProgram (String programId, String xGwImsOrgId, String authorization, String xApiKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'programId' is set
    if (programId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'programId' when calling getProgram",
        new ApiException(400, "Missing the required parameter 'programId' when calling getProgram"));
    }
    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xGwImsOrgId' when calling getProgram",
        new ApiException(400, "Missing the required parameter 'xGwImsOrgId' when calling getProgram"));
    }
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling getProgram",
        new ApiException(400, "Missing the required parameter 'authorization' when calling getProgram"));
    }
    // verify the required parameter 'xApiKey' is set
    if (xApiKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xApiKey' when calling getProgram",
        new ApiException(400, "Missing the required parameter 'xApiKey' when calling getProgram"));
    }

    // create path and map variables
    String path = "/api/program/{programId}".replaceAll("\\{" + "programId" + "\\}", apiInvoker.escapeString(programId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("x-gw-ims-org-id", ApiInvoker.parameterToString(xGwImsOrgId));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("x-api-key", ApiInvoker.parameterToString(xApiKey));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Program) ApiInvoker.deserialize(localVarResponse, "", Program.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get Program
   * Returns a program by its id
   * @param programId Identifier of the program   * @param xGwImsOrgId IMS organization ID that the request is being made under.   * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO   * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  */
  public void getProgram (String programId, String xGwImsOrgId, String authorization, String xApiKey, final Response.Listener<Program> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'programId' is set
    if (programId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'programId' when calling getProgram",
        new ApiException(400, "Missing the required parameter 'programId' when calling getProgram"));
    }
    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xGwImsOrgId' when calling getProgram",
        new ApiException(400, "Missing the required parameter 'xGwImsOrgId' when calling getProgram"));
    }
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling getProgram",
        new ApiException(400, "Missing the required parameter 'authorization' when calling getProgram"));
    }
    // verify the required parameter 'xApiKey' is set
    if (xApiKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xApiKey' when calling getProgram",
        new ApiException(400, "Missing the required parameter 'xApiKey' when calling getProgram"));
    }

    // create path and map variables
    String path = "/api/program/{programId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "programId" + "\\}", apiInvoker.escapeString(programId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("x-gw-ims-org-id", ApiInvoker.parameterToString(xGwImsOrgId));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("x-api-key", ApiInvoker.parameterToString(xApiKey));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Program) ApiInvoker.deserialize(localVarResponse,  "", Program.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Lists Programs
  * Returns all programs that the requesting user has access to
   * @param xGwImsOrgId IMS organization ID that the request is being made under.
   * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
   * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
   * @return ProgramList
  */
  public ProgramList getPrograms (String xGwImsOrgId, String authorization, String xApiKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xGwImsOrgId' when calling getPrograms",
        new ApiException(400, "Missing the required parameter 'xGwImsOrgId' when calling getPrograms"));
    }
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling getPrograms",
        new ApiException(400, "Missing the required parameter 'authorization' when calling getPrograms"));
    }
    // verify the required parameter 'xApiKey' is set
    if (xApiKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xApiKey' when calling getPrograms",
        new ApiException(400, "Missing the required parameter 'xApiKey' when calling getPrograms"));
    }

    // create path and map variables
    String path = "/api/programs";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("x-gw-ims-org-id", ApiInvoker.parameterToString(xGwImsOrgId));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("x-api-key", ApiInvoker.parameterToString(xApiKey));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ProgramList) ApiInvoker.deserialize(localVarResponse, "", ProgramList.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Lists Programs
   * Returns all programs that the requesting user has access to
   * @param xGwImsOrgId IMS organization ID that the request is being made under.   * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO   * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
  */
  public void getPrograms (String xGwImsOrgId, String authorization, String xApiKey, final Response.Listener<ProgramList> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'xGwImsOrgId' is set
    if (xGwImsOrgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xGwImsOrgId' when calling getPrograms",
        new ApiException(400, "Missing the required parameter 'xGwImsOrgId' when calling getPrograms"));
    }
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling getPrograms",
        new ApiException(400, "Missing the required parameter 'authorization' when calling getPrograms"));
    }
    // verify the required parameter 'xApiKey' is set
    if (xApiKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'xApiKey' when calling getPrograms",
        new ApiException(400, "Missing the required parameter 'xApiKey' when calling getPrograms"));
    }

    // create path and map variables
    String path = "/api/programs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("x-gw-ims-org-id", ApiInvoker.parameterToString(xGwImsOrgId));
    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("x-api-key", ApiInvoker.parameterToString(xApiKey));

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ProgramList) ApiInvoker.deserialize(localVarResponse,  "", ProgramList.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
