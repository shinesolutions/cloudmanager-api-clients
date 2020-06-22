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
import com.shinesolutions.aemcloudmanager4j.model.Program;
import com.shinesolutions.aemcloudmanager4j.model.ProgramList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProgramsApi
 */
@Ignore
public class ProgramsApiTest {

    private final ProgramsApi api = new ProgramsApi();

    
    /**
     * Delete Program
     *
     * Delete an program
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProgramTest() throws ApiException {
        String programId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        Program response = api.deleteProgram(programId, xGwImsOrgId, authorization, xApiKey);

        // TODO: test validations
    }
    
    /**
     * Get Program
     *
     * Returns a program by its id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProgramTest() throws ApiException {
        String programId = null;
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        Program response = api.getProgram(programId, xGwImsOrgId, authorization, xApiKey);

        // TODO: test validations
    }
    
    /**
     * Lists Programs
     *
     * Returns all programs that the requesting user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProgramsTest() throws ApiException {
        String xGwImsOrgId = null;
        String authorization = null;
        String xApiKey = null;
        ProgramList response = api.getPrograms(xGwImsOrgId, authorization, xApiKey);

        // TODO: test validations
    }
    
}
