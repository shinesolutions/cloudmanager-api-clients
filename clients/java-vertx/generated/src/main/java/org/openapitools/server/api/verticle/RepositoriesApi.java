package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Repository;
import org.openapitools.server.api.model.RepositoryList;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface RepositoriesApi  {
    //getRepositories
    void getRepositories(String programId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<RepositoryList>> handler);
    
    //getRepository
    void getRepository(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<Repository>> handler);
    
}
