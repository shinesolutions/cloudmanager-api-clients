package controllers;

import apimodels.BranchList;

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

public class BranchesApiController extends Controller {

    private final BranchesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private BranchesApiController(Configuration configuration, BranchesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getBranches(String programId,String repositoryId) throws Exception {
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
        BranchList obj = imp.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
