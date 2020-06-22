package org.openapitools.api;

import java.util.List;
import org.openapitools.model.Variable;
import org.openapitools.model.VariableList;

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
public interface VariablesApi  {

    /**
     * List User Environment Variables
     *
     * List the user defined variables for an environment (Cloud Service only).
     *
     */
    @GET
    @Path("/api/program/{programId}/environment/{environmentId}/variables")
    @Produces({ "application/json" })
    @ApiOperation(value = "List User Environment Variables", tags={ "Variables",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of environment variables", response = VariableList.class),
        @ApiResponse(code = 404, message = "Environment not found") })
    public VariableList getEnvironmentVariables(@PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Patch User Environment Variables
     *
     * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     *
     */
    @PATCH
    @Path("/api/program/{programId}/environment/{environmentId}/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Patch User Environment Variables", tags={ "Variables" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful update of environment variables", response = VariableList.class),
        @ApiResponse(code = 404, message = "Environment not found") })
    public VariableList patchEnvironmentVariables(@PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @HeaderParam("Content-Type")  @NotNull  String contentType, @Valid List<Variable> body);
}

