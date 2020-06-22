package org.openapitools.api;

import org.openapitools.model.Program;
import org.openapitools.model.ProgramList;

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
public interface ProgramsApi  {

    /**
     * Delete Program
     *
     * Delete an program
     *
     */
    @DELETE
    @Path("/api/program/{programId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Program", tags={ "Programs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Program.class),
        @ApiResponse(code = 202, message = "Delete was successful.", response = Program.class),
        @ApiResponse(code = 403, message = "Forbidden."),
        @ApiResponse(code = 404, message = "Program not found."),
        @ApiResponse(code = 412, message = "Deletion not supported") })
    public Program deleteProgram(@PathParam("programId") String programId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Get Program
     *
     * Returns a program by its id
     *
     */
    @GET
    @Path("/api/program/{programId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Program", tags={ "Programs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of program", response = Program.class),
        @ApiResponse(code = 404, message = "Program not found") })
    public Program getProgram(@PathParam("programId") String programId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Lists Programs
     *
     * Returns all programs that the requesting user has access to
     *
     */
    @GET
    @Path("/api/programs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists Programs", tags={ "Programs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProgramList.class) })
    public ProgramList getPrograms(@HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);
}

