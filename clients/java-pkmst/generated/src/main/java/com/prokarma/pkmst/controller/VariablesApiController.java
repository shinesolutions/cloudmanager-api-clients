package com.prokarma.pkmst.controller;

import java.util.List;
import com.prokarma.pkmst.model.Variable;
import com.prokarma.pkmst.model.VariableList;

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
public class VariablesApiController implements VariablesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public VariablesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<VariableList> getEnvironmentVariables(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the environment",required=true ) @PathVariable("environmentId") String environmentId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VariableList>(objectMapper.readValue("", VariableList.class), HttpStatus.OK);
        }

        return new ResponseEntity<VariableList>(HttpStatus.OK);
    }

    public ResponseEntity<VariableList> patchEnvironmentVariables(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the environment",required=true ) @PathVariable("environmentId") String environmentId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Must always be application/json" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,
        @ApiParam(value = "The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing." ,required=true )   @RequestBody List<Variable> body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VariableList>(objectMapper.readValue("", VariableList.class), HttpStatus.OK);
        }

        return new ResponseEntity<VariableList>(HttpStatus.OK);
    }

}
