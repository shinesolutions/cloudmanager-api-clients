package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Program;
import org.openapitools.model.ProgramList;

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
public class ProgramsApiServiceImpl implements ProgramsApi {
    /**
     * Delete Program
     *
     * Delete an program
     *
     */
    public Program deleteProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get Program
     *
     * Returns a program by its id
     *
     */
    public Program getProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Lists Programs
     *
     * Returns all programs that the requesting user has access to
     *
     */
    public ProgramList getPrograms(String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
}

