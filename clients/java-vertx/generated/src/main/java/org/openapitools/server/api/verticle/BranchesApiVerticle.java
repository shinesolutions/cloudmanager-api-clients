package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.BranchList;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class BranchesApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(BranchesApiVerticle.class); 
    
    final static String GETBRANCHES_SERVICE_ID = "getBranches";
    
    final BranchesApi service;

    public BranchesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BranchesApiImpl");
            service = (BranchesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BranchesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getBranches
        vertx.eventBus().<JsonObject> consumer(GETBRANCHES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBranches";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String repositoryIdParam = message.body().getString("repositoryId");
                if(repositoryIdParam == null) {
                    manageError(message, new MainApiException(400, "repositoryId is required"), serviceId);
                    return;
                }
                String repositoryId = repositoryIdParam;
                String xGwImsOrgIdParam = message.body().getString("x-gw-ims-org-id");
                if(xGwImsOrgIdParam == null) {
                    manageError(message, new MainApiException(400, "x-gw-ims-org-id is required"), serviceId);
                    return;
                }
                String xGwImsOrgId = xGwImsOrgIdParam;
                String authorizationParam = message.body().getString("Authorization");
                if(authorizationParam == null) {
                    manageError(message, new MainApiException(400, "Authorization is required"), serviceId);
                    return;
                }
                String authorization = authorizationParam;
                String xApiKeyParam = message.body().getString("x-api-key");
                if(xApiKeyParam == null) {
                    manageError(message, new MainApiException(400, "x-api-key is required"), serviceId);
                    return;
                }
                String xApiKey = xApiKeyParam;
                service.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBranches");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBranches", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
