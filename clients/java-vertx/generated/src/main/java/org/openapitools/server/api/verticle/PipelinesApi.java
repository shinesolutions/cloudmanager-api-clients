package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Pipeline;
import org.openapitools.server.api.model.PipelineList;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PipelinesApi  {
    //deletePipeline
    void deletePipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<Void>> handler);
    
    //getPipeline
    void getPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<Pipeline>> handler);
    
    //getPipelines
    void getPipelines(String programId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<PipelineList>> handler);
    
    //patchPipeline
    void patchPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Pipeline body, Handler<AsyncResult<Pipeline>> handler);
    
}
