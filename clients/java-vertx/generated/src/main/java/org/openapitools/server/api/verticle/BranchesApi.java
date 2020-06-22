package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BranchList;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BranchesApi  {
    //getBranches
    void getBranches(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<BranchList>> handler);
    
}
