/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import java.util.List;
import com.prokarma.pkmst.model.Variable;
import com.prokarma.pkmst.model.VariableList;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-22T02:53:26.039Z[GMT]")

@Api(value = "Variables", description = "the Variables API")
public interface VariablesApi {

    @ApiOperation(value = "List User Environment Variables", notes = "List the user defined variables for an environment (Cloud Service only).", response = VariableList.class, tags={ "Variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of environment variables", response = VariableList.class),
        @ApiResponse(code = 404, message = "Environment not found") })
    @RequestMapping(value = "/api/program/{programId}/environment/{environmentId}/variables",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VariableList> getEnvironmentVariables(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,@ApiParam(value = "Identifier of the environment",required=true ) @PathVariable("environmentId") String environmentId,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Patch User Environment Variables", notes = "Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.", response = VariableList.class, tags={ "Variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful update of environment variables", response = VariableList.class),
        @ApiResponse(code = 404, message = "Environment not found") })
    @RequestMapping(value = "/api/program/{programId}/environment/{environmentId}/variables",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<VariableList> patchEnvironmentVariables(@ApiParam(value = "Identifier of the program",required=true ) @PathVariable("programId") String programId,@ApiParam(value = "Identifier of the environment",required=true ) @PathVariable("environmentId") String environmentId,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @RequestHeader(value="x-gw-ims-org-id", required=true) String xGwImsOrgId,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @RequestHeader(value="x-api-key", required=true) String xApiKey,@ApiParam(value = "Must always be application/json" ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,@ApiParam(value = "The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing." ,required=true )   @RequestBody List<Variable> body, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
