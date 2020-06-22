package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.BadRequestError;
import org.openapitools.model.Environment;
import org.openapitools.model.EnvironmentList;
import org.openapitools.model.EnvironmentLogs;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Cloud Manager API
 *
 * <p>This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 */
public class EnvironmentsApiServiceImpl implements EnvironmentsApi {
    /**
     * DeleteEnvironment
     *
     * Delete environment
     *
     */
    public Environment deleteEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Download Logs
     *
     * Download environment logs
     *
     */
    public void downloadLogs(String programId, String environmentId, String service, String name, String date, String xGwImsOrgId, String authorization, String xApiKey, String accept) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get Environment
     *
     * Returns an environment by its id
     *
     */
    public Environment getEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Environment Logs
     *
     * List all logs available in environment
     *
     */
    public EnvironmentLogs getEnvironmentLogs(String programId, String environmentId, Integer days, String xGwImsOrgId, String authorization, String xApiKey, List<String> service, List<String> name) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * List Environments
     *
     * Lists all environments in an program
     *
     */
    public EnvironmentList getEnvironments(String programId, String xGwImsOrgId, String authorization, String xApiKey, String type) {
        // TODO: Implement...
        
        return null;
    }
    
}

