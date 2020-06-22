package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Program;
import org.openapitools.server.api.model.ProgramList;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ProgramsApi  {
    //deleteProgram
    void deleteProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<Program>> handler);
    
    //getProgram
    void getProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<Program>> handler);
    
    //getPrograms
    void getPrograms(String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<ProgramList>> handler);
    
}
