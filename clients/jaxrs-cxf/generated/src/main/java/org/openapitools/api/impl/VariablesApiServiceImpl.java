package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.util.List;
import org.openapitools.model.Variable;
import org.openapitools.model.VariableList;

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
public class VariablesApiServiceImpl implements VariablesApi {
    /**
     * List User Environment Variables
     *
     * List the user defined variables for an environment (Cloud Service only).
     *
     */
    public VariableList getEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Patch User Environment Variables
     *
     * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     *
     */
    public VariableList patchEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body) {
        // TODO: Implement...
        
        return null;
    }
    
}

