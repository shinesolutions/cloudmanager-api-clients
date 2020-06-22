package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.BadRequestError;
import org.openapitools.server.api.model.Environment;
import org.openapitools.server.api.model.EnvironmentList;
import org.openapitools.server.api.model.EnvironmentLogs;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class EnvironmentsApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(EnvironmentsApiVerticle.class); 
    
    final static String DELETEENVIRONMENT_SERVICE_ID = "deleteEnvironment";
    final static String DOWNLOADLOGS_SERVICE_ID = "downloadLogs";
    final static String GETENVIRONMENT_SERVICE_ID = "getEnvironment";
    final static String GETENVIRONMENTLOGS_SERVICE_ID = "getEnvironmentLogs";
    final static String GETENVIRONMENTS_SERVICE_ID = "getEnvironments";
    
    final EnvironmentsApi service;

    public EnvironmentsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.EnvironmentsApiImpl");
            service = (EnvironmentsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("EnvironmentsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deleteEnvironment
        vertx.eventBus().<JsonObject> consumer(DELETEENVIRONMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteEnvironment";
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
                service.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteEnvironment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteEnvironment", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for downloadLogs
        vertx.eventBus().<JsonObject> consumer(DOWNLOADLOGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "downloadLogs";
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
                String serviceParam = message.body().getString("service");
                if(serviceParam == null) {
                    manageError(message, new MainApiException(400, "service is required"), serviceId);
                    return;
                }
                String service = serviceParam;
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String dateParam = message.body().getString("date");
                if(dateParam == null) {
                    manageError(message, new MainApiException(400, "date is required"), serviceId);
                    return;
                }
                String date = dateParam;
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
                String acceptParam = message.body().getString("Accept");
                String accept = (acceptParam == null) ? null : acceptParam;
                service.downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "downloadLogs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("downloadLogs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getEnvironment
        vertx.eventBus().<JsonObject> consumer(GETENVIRONMENT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getEnvironment";
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
                service.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getEnvironment");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getEnvironment", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getEnvironmentLogs
        vertx.eventBus().<JsonObject> consumer(GETENVIRONMENTLOGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getEnvironmentLogs";
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
                String daysParam = message.body().getString("days");
                if(daysParam == null) {
                    manageError(message, new MainApiException(400, "days is required"), serviceId);
                    return;
                }
                Integer days = Json.mapper.readValue(daysParam, Integer.class);
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
                JsonArray serviceParam = message.body().getJsonArray("service");
                List<String> service = (serviceParam == null) ? new ArrayList&lt;&gt;() : Json.mapper.readValue(serviceParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray nameParam = message.body().getJsonArray("name");
                List<String> name = (nameParam == null) ? new ArrayList&lt;&gt;() : Json.mapper.readValue(nameParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                service.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getEnvironmentLogs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getEnvironmentLogs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getEnvironments
        vertx.eventBus().<JsonObject> consumer(GETENVIRONMENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getEnvironments";
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
                String typeParam = message.body().getString("type");
                String type = (typeParam == null) ? null : typeParam;
                service.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getEnvironments");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getEnvironments", e);
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
