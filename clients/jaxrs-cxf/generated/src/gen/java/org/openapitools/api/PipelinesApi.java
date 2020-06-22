package org.openapitools.api;

import org.openapitools.model.Pipeline;
import org.openapitools.model.PipelineList;

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
public interface PipelinesApi  {

    /**
     * Delete a Pipeline
     *
     * Delete a pipeline. All the data is wiped.
     *
     */
    @DELETE
    @Path("/api/program/{programId}/pipeline/{pipelineId}")
    @ApiOperation(value = "Delete a Pipeline", tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deletePipeline(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Get Pipeline
     *
     * Returns a pipeline by its id
     *
     */
    @GET
    @Path("/api/program/{programId}/pipeline/{pipelineId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Pipeline", tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of pipeline", response = Pipeline.class),
        @ApiResponse(code = 404, message = "Pipeline not found") })
    public Pipeline getPipeline(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * List Pipelines
     *
     * Returns all the pipelines that the requesting user has access to in an program
     *
     */
    @GET
    @Path("/api/program/{programId}/pipelines")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pipelines", tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PipelineList.class) })
    public PipelineList getPipelines(@PathParam("programId") String programId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Patches Pipeline
     *
     * Patches a pipeline within an program.
     *
     */
    @PATCH
    @Path("/api/program/{programId}/pipeline/{pipelineId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Patches Pipeline", tags={ "Pipelines" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pipeline.class) })
    public Pipeline patchPipeline(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @HeaderParam("Content-Type")  @NotNull  String contentType, @Valid Pipeline body);
}

