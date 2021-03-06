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


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.BadRequestError;
import com.prokarma.pkmst.model.Environment;
import com.prokarma.pkmst.model.EnvironmentList;
import com.prokarma.pkmst.model.EnvironmentLogs;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for EnvironmentsApi
 */
@Ignore
public class EnvironmentsApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final EnvironmentsApi api = new EnvironmentsApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * DeleteEnvironment
     *
     * Delete environment
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteEnvironmentTest() throws Exception {
        String programId = null;
        String environmentId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
    ResponseEntity<Environment> response = api.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey , accept);

        // TODO: test validations
    }
    
    /**
     * Download Logs
     *
     * Download environment logs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadLogsTest() throws Exception {
        String programId = null;
        String environmentId = null;
        String service = null;
        String name = null;
        String date = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        String accept = null;
    ResponseEntity<Void> response = api.downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept , accept);

        // TODO: test validations
    }
    
    /**
     * Get Environment
     *
     * Returns an environment by its id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentTest() throws Exception {
        String programId = null;
        String environmentId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
    ResponseEntity<Environment> response = api.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey , accept);

        // TODO: test validations
    }
    
    /**
     * Get Environment Logs
     *
     * List all logs available in environment
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentLogsTest() throws Exception {
        String programId = null;
        String environmentId = null;
        Integer days = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        List<String> service = null;
        List<String> name = null;
    ResponseEntity<EnvironmentLogs> response = api.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name , accept);

        // TODO: test validations
    }
    
    /**
     * List Environments
     *
     * Lists all environments in an program
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEnvironmentsTest() throws Exception {
        String programId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        String type = null;
    ResponseEntity<EnvironmentList> response = api.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type , accept);

        // TODO: test validations
    }
    
}
