package controllers;

import apimodels.BadRequestError;
import apimodels.Environment;
import apimodels.EnvironmentList;
import apimodels.EnvironmentLogs;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface EnvironmentsApiControllerImpInterface {
    Environment deleteEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    void downloadLogs(String programId, String environmentId,  @NotNull String service,  @NotNull String name,  @NotNull String date, String xGwImsOrgId, String authorization, String xApiKey, String accept) throws Exception;

    Environment getEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    EnvironmentLogs getEnvironmentLogs(String programId, String environmentId,  @NotNull Integer days, String xGwImsOrgId, String authorization, String xApiKey, List<String> service, List<String> name) throws Exception;

    EnvironmentList getEnvironments(String programId, String xGwImsOrgId, String authorization, String xApiKey, String type) throws Exception;

}
