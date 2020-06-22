package org.openapitools.api;

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
public interface EnvironmentsApi  {

    /**
     * DeleteEnvironment
     *
     * Delete environment
     *
     */
    @DELETE
    @Path("/api/program/{programId}/environment/{environmentId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "DeleteEnvironment", tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Environment deleted", response = Environment.class),
        @ApiResponse(code = 400, message = "Environment deletion in progress", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found") })
    public Environment deleteEnvironment(@PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Download Logs
     *
     * Download environment logs
     *
     */
    @GET
    @Path("/api/program/{programId}/environment/{environmentId}/logs/download")
    @Produces({ "application/json" })
    @ApiOperation(value = "Download Logs", tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs"),
        @ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found") })
    public void downloadLogs(@PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @QueryParam("service") @NotNull  String service, @QueryParam("name") @NotNull  String name, @QueryParam("date") @NotNull  String date, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @HeaderParam("Accept")   String accept);

    /**
     * Get Environment
     *
     * Returns an environment by its id
     *
     */
    @GET
    @Path("/api/program/{programId}/environment/{environmentId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Environment", tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Environment.class) })
    public Environment getEnvironment(@PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Get Environment Logs
     *
     * List all logs available in environment
     *
     */
    @GET
    @Path("/api/program/{programId}/environment/{environmentId}/logs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Environment Logs", tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs for an environment", response = EnvironmentLogs.class),
        @ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found") })
    public EnvironmentLogs getEnvironmentLogs(@PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @QueryParam("days") @NotNull  Integer days, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @QueryParam("service")  List<String> service, @QueryParam("name")  List<String> name);

    /**
     * List Environments
     *
     * Lists all environments in an program
     *
     */
    @GET
    @Path("/api/program/{programId}/environments")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Environments", tags={ "Environments" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of environment list", response = EnvironmentList.class),
        @ApiResponse(code = 404, message = "Program not found") })
    public EnvironmentList getEnvironments(@PathParam("programId") String programId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @QueryParam("type")  String type);
}

