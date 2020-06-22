package org.openapitools.api;

import org.openapitools.model.Repository;
import org.openapitools.model.RepositoryList;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Cloud Manager API
 *
 * <p>This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface RepositoriesApi  {

    /**
     * Lists Repositories
     *
     * Lists all Repositories in an program
     *
     */
    @GET
    @Path("/api/program/{programId}/repositories")
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists Repositories", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RepositoryList.class) })
    public RepositoryList getRepositories(@PathParam("programId") String programId, @HeaderParam("x-gw-ims-org-id")  String xGwImsOrgId, @HeaderParam("Authorization")  String authorization, @HeaderParam("x-api-key")  String xApiKey);

    /**
     * Get Repository
     *
     * Returns an repository by its id
     *
     */
    @GET
    @Path("/api/program/{programId}/repository/{repositoryId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Repository", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Repository.class) })
    public Repository getRepository(@PathParam("programId") String programId, @PathParam("repositoryId") String repositoryId, @HeaderParam("x-gw-ims-org-id")  String xGwImsOrgId, @HeaderParam("Authorization")  String authorization, @HeaderParam("x-api-key")  String xApiKey);
}

