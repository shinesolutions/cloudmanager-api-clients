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
import com.shinesolutions.aemcloudmanager4j.model.BadRequestError;
import com.shinesolutions.aemcloudmanager4j.model.Environment;
import com.shinesolutions.aemcloudmanager4j.model.EnvironmentList;
import com.shinesolutions.aemcloudmanager4j.model.EnvironmentLogs;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnvironmentsApi
 */
@Ignore
public class EnvironmentsApiTest {

    private final EnvironmentsApi api = new EnvironmentsApi();

    
    /**
     * DeleteEnvironment
     *
     * Delete environment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEnvironmentTest() throws ApiException {
        String programId = null;
        String environmentId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        Environment response = api.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);

        // TODO: test validations
    }
    
    /**
     * Download Logs
     *
     * Download environment logs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadLogsTest() throws ApiException {
        String programId = null;
        String environmentId = null;
        String service = null;
        String name = null;
        String date = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        String accept = null;
        api.downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept);

        // TODO: test validations
    }
    
    /**
     * Get Environment
     *
     * Returns an environment by its id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentTest() throws ApiException {
        String programId = null;
        String environmentId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        Environment response = api.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);

        // TODO: test validations
    }
    
    /**
     * Get Environment Logs
     *
     * List all logs available in environment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentLogsTest() throws ApiException {
        String programId = null;
        String environmentId = null;
        Integer days = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        List<String> service = null;
        List<String> name = null;
        EnvironmentLogs response = api.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name);

        // TODO: test validations
    }
    
    /**
     * List Environments
     *
     * Lists all environments in an program
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentsTest() throws ApiException {
        String programId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        String type = null;
        EnvironmentList response = api.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type);

        // TODO: test validations
    }
    
}
