package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Variable;
import org.openapitools.server.api.model.VariableList;

import java.util.List;
import java.util.Map;

public class VariablesApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(VariablesApiVerticle.class); 
    
    final static String GETENVIRONMENTVARIABLES_SERVICE_ID = "getEnvironmentVariables";
    final static String PATCHENVIRONMENTVARIABLES_SERVICE_ID = "patchEnvironmentVariables";
    
    final VariablesApi service;

    public VariablesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.VariablesApiImpl");
            service = (VariablesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("VariablesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getEnvironmentVariables
        vertx.eventBus().<JsonObject> consumer(GETENVIRONMENTVARIABLES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getEnvironmentVariables";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String environmentIdParam = message.body().getString("environmentId");
                if(environmentIdParam == null) {
                    manageError(message, new MainApiException(400, "environmentId is required"), serviceId);
                    return;
                }
                String environmentId = environmentIdParam;
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
                service.getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getEnvironmentVariables");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getEnvironmentVariables", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for patchEnvironmentVariables
        vertx.eventBus().<JsonObject> consumer(PATCHENVIRONMENTVARIABLES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "patchEnvironmentVariables";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String environmentIdParam = message.body().getString("environmentId");
                if(environmentIdParam == null) {
                    manageError(message, new MainApiException(400, "environmentId is required"), serviceId);
                    return;
                }
                String environmentId = environmentIdParam;
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
                String contentTypeParam = message.body().getString("Content-Type");
                if(contentTypeParam == null) {
                    manageError(message, new MainApiException(400, "Content-Type is required"), serviceId);
                    return;
                }
                String contentType = contentTypeParam;
                JsonArray bodyParam = message.body().getJsonArray("body");
                if(bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                List<Variable> body = Json.mapper.readValue(bodyParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Variable.class));
                service.patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "patchEnvironmentVariables");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("patchEnvironmentVariables", e);
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
