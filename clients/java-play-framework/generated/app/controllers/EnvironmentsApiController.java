package controllers;

import apimodels.BadRequestError;
import apimodels.Environment;
import apimodels.EnvironmentList;
import apimodels.EnvironmentLogs;

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

public class EnvironmentsApiController extends Controller {

    private final EnvironmentsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private EnvironmentsApiController(Configuration configuration, EnvironmentsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result deleteEnvironment(String programId,String environmentId) throws Exception {
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
        Environment obj = imp.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result downloadLogs(String programId,String environmentId) throws Exception {
        String valueservice = request().getQueryString("service");
        String service;
        if (valueservice != null) {
            service = valueservice;
        } else {
            throw new IllegalArgumentException("'service' parameter is required");
        }
        String valuename = request().getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedate = request().getQueryString("date");
        String date;
        if (valuedate != null) {
            date = valuedate;
        } else {
            throw new IllegalArgumentException("'date' parameter is required");
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
        String valueaccept = request().getHeader("Accept");
        String accept;
        if (valueaccept != null) {
            accept = valueaccept;
        } else {
            accept = null;
        }
        imp.downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept);
        return ok();
    }

    @ApiAction
    public Result getEnvironment(String programId,String environmentId) throws Exception {
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
        Environment obj = imp.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getEnvironmentLogs(String programId,String environmentId) throws Exception {
        String[] serviceArray = request().queryString().get("service");
        List<String> serviceList = OpenAPIUtils.parametersToList("multi", serviceArray);
        List<String> service = new ArrayList<String>();
        for (String curParam : serviceList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                service.add(curParam);
            }
        }
        String[] nameArray = request().queryString().get("name");
        List<String> nameList = OpenAPIUtils.parametersToList("multi", nameArray);
        List<String> name = new ArrayList<String>();
        for (String curParam : nameList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                name.add(curParam);
            }
        }
        String valuedays = request().getQueryString("days");
        Integer days;
        if (valuedays != null) {
            days = Integer.parseInt(valuedays);
        } else {
            throw new IllegalArgumentException("'days' parameter is required");
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
        EnvironmentLogs obj = imp.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getEnvironments(String programId) throws Exception {
        String valuetype = request().getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
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
        EnvironmentList obj = imp.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
