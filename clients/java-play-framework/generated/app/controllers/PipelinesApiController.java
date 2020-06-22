package controllers;

import apimodels.Pipeline;
import apimodels.PipelineList;

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

public class PipelinesApiController extends Controller {

    private final PipelinesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private PipelinesApiController(Configuration configuration, PipelinesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result deletePipeline(String programId,String pipelineId) throws Exception {
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
        imp.deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
        return ok();
    }

    @ApiAction
    public Result getPipeline(String programId,String pipelineId) throws Exception {
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
        Pipeline obj = imp.getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getPipelines(String programId) throws Exception {
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
        PipelineList obj = imp.getPipelines(programId, xGwImsOrgId, authorization, xApiKey);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result patchPipeline(String programId,String pipelineId) throws Exception {
        JsonNode nodebody = request().body().asJson();
        Pipeline body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Pipeline.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
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
        Pipeline obj = imp.patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
