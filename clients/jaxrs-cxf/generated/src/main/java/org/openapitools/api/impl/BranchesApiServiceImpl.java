package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.BranchList;

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
public class BranchesApiServiceImpl implements BranchesApi {
    /**
     * List Branches
     *
     * Returns the list of branches from a repository
     *
     */
    public BranchList getBranches(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
}

