package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.PipelineExecution;
import com.prokarma.pkmst.model.PipelineExecutionListRepresentation;
import com.prokarma.pkmst.model.PipelineExecutionStepState;
import com.prokarma.pkmst.model.PipelineStepMetrics;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-22T02:53:26.039Z[GMT]")

@Controller
public class PipelineExecutionApiController implements PipelineExecutionApi {
    private final ObjectMapper objectMapper;
@Autowired
    public PipelineExecutionApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> advancePipelineExecution(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "Identifier of the execution",required=true ) @PathVariable("executionId") String executionId,
        @ApiParam(value = "Identifier of the phase",required=true ) @PathVariable("phaseId") String phaseId,
        @ApiParam(value = "Identifier of the step",required=true ) @PathVariable("stepId") String stepId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Must always be application/json" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,
        @ApiParam(value = "Input for advance. See documentation for details." ,required=true )   @RequestBody Object body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> cancelPipelineExecutionStep(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "Identifier of the execution",required=true ) @PathVariable("executionId") String executionId,
        @ApiParam(value = "Identifier of the phase",required=true ) @PathVariable("phaseId") String phaseId,
        @ApiParam(value = "Identifier of the step",required=true ) @PathVariable("stepId") String stepId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Must always be application/json" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,
        @ApiParam(value = "Input for advance. See documentation for details." ,required=true )   @RequestBody Object body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<PipelineExecution> getCurrentExecution(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PipelineExecution>(objectMapper.readValue("", PipelineExecution.class), HttpStatus.OK);
        }

        return new ResponseEntity<PipelineExecution>(HttpStatus.OK);
    }

    public ResponseEntity<PipelineExecution> getExecution(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "Identifier of the execution",required=true ) @PathVariable("executionId") String executionId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PipelineExecution>(objectMapper.readValue("", PipelineExecution.class), HttpStatus.OK);
        }

        return new ResponseEntity<PipelineExecution>(HttpStatus.OK);
    }

    public ResponseEntity<PipelineExecutionListRepresentation> getExecutions(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Pagination start parameter")  @RequestParam(value = "start", required = false) String start,
        @ApiParam(value = "Pagination limit parameter")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PipelineExecutionListRepresentation>(objectMapper.readValue("", PipelineExecutionListRepresentation.class), HttpStatus.OK);
        }

        return new ResponseEntity<PipelineExecutionListRepresentation>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getStepLogs(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "Identifier of the execution",required=true ) @PathVariable("executionId") String executionId,
        @ApiParam(value = "Identifier of the phase",required=true ) @PathVariable("phaseId") String phaseId,
        @ApiParam(value = "Identifier of the step",required=true ) @PathVariable("stepId") String stepId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Identifier of the log file")  @RequestParam(value = "file", required = false) String file,
        @ApiParam(value = "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header." ) @RequestHeader(value="Accept", required=false) String accept,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> startPipeline(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Must always be application/json" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<PipelineStepMetrics> stepMetric(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "Identifier of the execution",required=true ) @PathVariable("executionId") String executionId,
        @ApiParam(value = "Identifier of the phase",required=true ) @PathVariable("phaseId") String phaseId,
        @ApiParam(value = "Identifier of the step",required=true ) @PathVariable("stepId") String stepId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PipelineStepMetrics>(objectMapper.readValue("", PipelineStepMetrics.class), HttpStatus.OK);
        }

        return new ResponseEntity<PipelineStepMetrics>(HttpStatus.OK);
    }

    public ResponseEntity<PipelineExecutionStepState> stepState(@ApiParam(value = "Identifier of the program.",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "Identifier of the execution",required=true ) @PathVariable("executionId") String executionId,
        @ApiParam(value = "Identifier of the phase",required=true ) @PathVariable("phaseId") String phaseId,
        @ApiParam(value = "Identifier of the step",required=true ) @PathVariable("stepId") String stepId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PipelineExecutionStepState>(objectMapper.readValue("", PipelineExecutionStepState.class), HttpStatus.OK);
        }

        return new ResponseEntity<PipelineExecutionStepState>(HttpStatus.OK);
    }

}
