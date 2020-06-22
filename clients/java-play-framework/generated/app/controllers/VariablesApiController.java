package controllers;

import java.util.List;
import apimodels.Variable;
import apimodels.VariableList;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

public class VariablesApiController extends Controller {

    private final VariablesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private VariablesApiController(Configuration configuration, VariablesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getEnvironmentVariables(String programId,String environmentId) throws Exception {
        String valuexGwImsOrgId = request().getHeader("x-gw-ims-org-id");
        String xGwImsOrgId;
        if (valuexGwImsOrgId != null) {
            xGwImsOrgId = valuexGwImsOrgId;
        } else {
            throw new IllegalArgumentException("'x-gw-ims-org-id' parameter is required");
        }
        String valueauthorization = request().getHeader("Authorization");
        String authorization;
        if (valueauthorization != null) {
            authorization = valueauthorization;
        } else {
            throw new IllegalArgumentException("'Authorization' parameter is required");
        }
        String valuexApiKey = request().getHeader("x-api-key");
        String xApiKey;
        if (valuexApiKey != null) {
            xApiKey = valuexApiKey;
        } else {
            throw new IllegalArgumentException("'x-api-key' parameter is required");
        }
        VariableList obj = imp.getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result patchEnvironmentVariables(String programId,String environmentId) throws Exception {
        JsonNode nodebody = request().body().asJson();
        List<Variable> body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), new TypeReference<List<Variable>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (Variable curItem : body) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'body' parameter is required");
        }
        String valuexGwImsOrgId = request().getHeader("x-gw-ims-org-id");
        String xGwImsOrgId;
        if (valuexGwImsOrgId != null) {
            xGwImsOrgId = valuexGwImsOrgId;
        } else {
            throw new IllegalArgumentException("'x-gw-ims-org-id' parameter is required");
        }
        String valueauthorization = request().getHeader("Authorization");
        String authorization;
        if (valueauthorization != null) {
            authorization = valueauthorization;
        } else {
            throw new IllegalArgumentException("'Authorization' parameter is required");
        }
        String valuexApiKey = request().getHeader("x-api-key");
        String xApiKey;
        if (valuexApiKey != null) {
            xApiKey = valuexApiKey;
        } else {
            throw new IllegalArgumentException("'x-api-key' parameter is required");
        }
        String valuecontentType = request().getHeader("Content-Type");
        String contentType;
        if (valuecontentType != null) {
            contentType = valuecontentType;
        } else {
            throw new IllegalArgumentException("'Content-Type' parameter is required");
        }
        VariableList obj = imp.patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
