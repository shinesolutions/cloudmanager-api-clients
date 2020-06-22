package controllers;

import apimodels.BadRequestError;
import apimodels.Environment;
import apimodels.EnvironmentList;
import apimodels.EnvironmentLogs;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

public class EnvironmentsApiControllerImp implements EnvironmentsApiControllerImpInterface {
    @Override
    public Environment deleteEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new Environment();
    }

    @Override
    public void downloadLogs(String programId, String environmentId,  @NotNull String service,  @NotNull String name,  @NotNull String date, String xGwImsOrgId, String authorization, String xApiKey, String accept) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Environment getEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new Environment();
    }

    @Override
    public EnvironmentLogs getEnvironmentLogs(String programId, String environmentId,  @NotNull Integer days, String xGwImsOrgId, String authorization, String xApiKey, List<String> service, List<String> name) throws Exception {
        //Do your magic!!!
        return new EnvironmentLogs();
    }

    @Override
    public EnvironmentList getEnvironments(String programId, String xGwImsOrgId, String authorization, String xApiKey, String type) throws Exception {
        //Do your magic!!!
        return new EnvironmentList();
    }

}
