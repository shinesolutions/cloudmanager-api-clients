package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Program;
import org.openapitools.server.api.model.ProgramList;

import java.util.List;
import java.util.Map;

public class ProgramsApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(ProgramsApiVerticle.class); 
    
    final static String DELETEPROGRAM_SERVICE_ID = "deleteProgram";
    final static String GETPROGRAM_SERVICE_ID = "getProgram";
    final static String GETPROGRAMS_SERVICE_ID = "getPrograms";
    
    final ProgramsApi service;

    public ProgramsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ProgramsApiImpl");
            service = (ProgramsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ProgramsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deleteProgram
        vertx.eventBus().<JsonObject> consumer(DELETEPROGRAM_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteProgram";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
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
                service.deleteProgram(programId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteProgram");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteProgram", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getProgram
        vertx.eventBus().<JsonObject> consumer(GETPROGRAM_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getProgram";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
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
                service.getProgram(programId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getProgram");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getProgram", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getPrograms
        vertx.eventBus().<JsonObject> consumer(GETPROGRAMS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPrograms";
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
                service.getPrograms(xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPrograms");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPrograms", e);
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
