package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Variable;
import org.openapitools.server.api.model.VariableList;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface VariablesApi  {
    //getEnvironmentVariables
    void getEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<VariableList>> handler);
    
    //patchEnvironmentVariables
    void patchEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body, Handler<AsyncResult<VariableList>> handler);
    
}
