package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Pipeline;
import com.prokarma.pkmst.model.PipelineList;

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
public class PipelinesApiController implements PipelinesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public PipelinesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> deletePipeline(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Pipeline> getPipeline(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pipeline>(objectMapper.readValue("", Pipeline.class), HttpStatus.OK);
        }

        return new ResponseEntity<Pipeline>(HttpStatus.OK);
    }

    public ResponseEntity<PipelineList> getPipelines(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PipelineList>(objectMapper.readValue("", PipelineList.class), HttpStatus.OK);
        }

        return new ResponseEntity<PipelineList>(HttpStatus.OK);
    }

    public ResponseEntity<Pipeline> patchPipeline(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the pipeline",required=true ) @PathVariable("pipelineId") String pipelineId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Must always be application/json" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,
        @ApiParam(value = "The updated Pipeline" ,required=true )   @RequestBody Pipeline body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Pipeline>(objectMapper.readValue("", Pipeline.class), HttpStatus.OK);
        }

        return new ResponseEntity<Pipeline>(HttpStatus.OK);
    }

}
