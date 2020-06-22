package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BadRequestError;
import org.openapitools.server.api.model.Environment;
import org.openapitools.server.api.model.EnvironmentList;
import org.openapitools.server.api.model.EnvironmentLogs;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EnvironmentsApi  {
    //deleteEnvironment
    void deleteEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<Environment>> handler);
    
    //downloadLogs
    void downloadLogs(String programId, String environmentId, String service, String name, String date, String xGwImsOrgId, String authorization, String xApiKey, String accept, Handler<AsyncResult<Void>> handler);
    
    //getEnvironment
    void getEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<Environment>> handler);
    
    //getEnvironmentLogs
    void getEnvironmentLogs(String programId, String environmentId, Integer days, String xGwImsOrgId, String authorization, String xApiKey, List<String> service, List<String> name, Handler<AsyncResult<EnvironmentLogs>> handler);
    
    //getEnvironments
    void getEnvironments(String programId, String xGwImsOrgId, String authorization, String xApiKey, String type, Handler<AsyncResult<EnvironmentList>> handler);
    
}
