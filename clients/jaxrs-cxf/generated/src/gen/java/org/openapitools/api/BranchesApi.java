package org.openapitools.api;

import org.openapitools.model.BranchList;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Cloud Manager API
 *
 * <p>This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface BranchesApi  {

    /**
     * List Branches
     *
     * Returns the list of branches from a repository
     *
     */
    @GET
    @Path("/api/program/{programId}/repository/{repositoryId}/branches")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Branches", tags={ "Branches" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of the list of repository branches", response = BranchList.class) })
    public BranchList getBranches(@PathParam("programId") String programId, @PathParam("repositoryId") String repositoryId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);
}

