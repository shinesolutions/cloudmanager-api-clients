/*
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


package com.shinesolutions.aemcloudmanager4j.api;

import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.model.Variable;
import com.shinesolutions.aemcloudmanager4j.model.VariableList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VariablesApi
 */
@Ignore
public class VariablesApiTest {

    private final VariablesApi api = new VariablesApi();

    
    /**
     * List User Environment Variables
     *
     * List the user defined variables for an environment (Cloud Service only).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentVariablesTest() throws ApiException {
        String programId = null;
        String environmentId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        VariableList response = api.getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey);

        // TODO: test validations
    }
    
    /**
     * Patch User Environment Variables
     *
     * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchEnvironmentVariablesTest() throws ApiException {
        String programId = null;
        String environmentId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        String contentType = null;
        List<Variable> body = null;
        VariableList response = api.patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);

        // TODO: test validations
    }
    
}
