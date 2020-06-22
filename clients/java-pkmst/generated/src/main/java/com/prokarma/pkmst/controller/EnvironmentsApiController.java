package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.BadRequestError;
import com.prokarma.pkmst.model.Environment;
import com.prokarma.pkmst.model.EnvironmentList;
import com.prokarma.pkmst.model.EnvironmentLogs;

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
public class EnvironmentsApiController implements EnvironmentsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public EnvironmentsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Environment> deleteEnvironment(@ApiParam(value = "Identifier of the application",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the environment",required=true ) @PathVariable("environmentId") String environmentId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Environment>(objectMapper.readValue("", Environment.class), HttpStatus.OK);
        }

        return new ResponseEntity<Environment>(HttpStatus.OK);
    }

    public ResponseEntity<Void> downloadLogs(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the environment",required=true ) @PathVariable("environmentId") String environmentId,
        @ApiParam(value = "Name of service", required = true)  @RequestParam(value = "service", required = true) String service,
        @ApiParam(value = "Name of log", required = true)  @RequestParam(value = "name", required = true) String name,
        @ApiParam(value = "date for which log is required", required = true)  @RequestParam(value = "date", required = true) String date,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header." ) @RequestHeader(value="Accept", required=false) String accept,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Environment> getEnvironment(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the environment",required=true ) @PathVariable("environmentId") String environmentId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Environment>(objectMapper.readValue("", Environment.class), HttpStatus.OK);
        }

        return new ResponseEntity<Environment>(HttpStatus.OK);
    }

    public ResponseEntity<EnvironmentLogs> getEnvironmentLogs(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "Identifier of the environment",required=true ) @PathVariable("environmentId") String environmentId,
        @ApiParam(value = "number of days for which logs are required", required = true)  @RequestParam(value = "days", required = true) Integer days,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Names of services", defaultValue = "new ArrayList<>()")  @RequestParam(value = "service", required = false, defaultValue="new ArrayList<>()") List<String> service,
        @ApiParam(value = "Names of log", defaultValue = "new ArrayList<>()")  @RequestParam(value = "name", required = false, defaultValue="new ArrayList<>()") List<String> name,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EnvironmentLogs>(objectMapper.readValue("", EnvironmentLogs.class), HttpStatus.OK);
        }

        return new ResponseEntity<EnvironmentLogs>(HttpStatus.OK);
    }

    public ResponseEntity<EnvironmentList> getEnvironments(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,
        @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,
        @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,
        @ApiParam(value = "Type of the environment", allowableValues = "dev, stage, prod")  @RequestParam(value = "type", required = false) String type,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EnvironmentList>(objectMapper.readValue("", EnvironmentList.class), HttpStatus.OK);
        }

        return new ResponseEntity<EnvironmentList>(HttpStatus.OK);
    }

}
