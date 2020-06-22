package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PipelineExecution;
import org.openapitools.server.api.model.PipelineExecutionListRepresentation;
import org.openapitools.server.api.model.PipelineExecutionStepState;
import org.openapitools.server.api.model.PipelineStepMetrics;

import java.util.List;
import java.util.Map;

public class PipelineExecutionApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(PipelineExecutionApiVerticle.class); 
    
    final static String ADVANCEPIPELINEEXECUTION_SERVICE_ID = "advancePipelineExecution";
    final static String CANCELPIPELINEEXECUTIONSTEP_SERVICE_ID = "cancelPipelineExecutionStep";
    final static String GETCURRENTEXECUTION_SERVICE_ID = "getCurrentExecution";
    final static String GETEXECUTION_SERVICE_ID = "getExecution";
    final static String GETEXECUTIONS_SERVICE_ID = "getExecutions";
    final static String GETSTEPLOGS_SERVICE_ID = "getStepLogs";
    final static String STARTPIPELINE_SERVICE_ID = "startPipeline";
    final static String STEPMETRIC_SERVICE_ID = "stepMetric";
    final static String STEPSTATE_SERVICE_ID = "stepState";
    
    final PipelineExecutionApi service;

    public PipelineExecutionApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.PipelineExecutionApiImpl");
            service = (PipelineExecutionApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("PipelineExecutionApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for advancePipelineExecution
        vertx.eventBus().<JsonObject> consumer(ADVANCEPIPELINEEXECUTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "advancePipelineExecution";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
                String executionIdParam = message.body().getString("executionId");
                if(executionIdParam == null) {
                    manageError(message, new MainApiException(400, "executionId is required"), serviceId);
                    return;
                }
                String executionId = executionIdParam;
                String phaseIdParam = message.body().getString("phaseId");
                if(phaseIdParam == null) {
                    manageError(message, new MainApiException(400, "phaseId is required"), serviceId);
                    return;
                }
                String phaseId = phaseIdParam;
                String stepIdParam = message.body().getString("stepId");
                if(stepIdParam == null) {
                    manageError(message, new MainApiException(400, "stepId is required"), serviceId);
                    return;
                }
                String stepId = stepIdParam;
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
                String bodyParam = message.body().getString("body");
                if(bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Object body = Json.mapper.readValue(bodyParam, Object.class);
                service.advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "advancePipelineExecution");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("advancePipelineExecution", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for cancelPipelineExecutionStep
        vertx.eventBus().<JsonObject> consumer(CANCELPIPELINEEXECUTIONSTEP_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "cancelPipelineExecutionStep";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
                String executionIdParam = message.body().getString("executionId");
                if(executionIdParam == null) {
                    manageError(message, new MainApiException(400, "executionId is required"), serviceId);
                    return;
                }
                String executionId = executionIdParam;
                String phaseIdParam = message.body().getString("phaseId");
                if(phaseIdParam == null) {
                    manageError(message, new MainApiException(400, "phaseId is required"), serviceId);
                    return;
                }
                String phaseId = phaseIdParam;
                String stepIdParam = message.body().getString("stepId");
                if(stepIdParam == null) {
                    manageError(message, new MainApiException(400, "stepId is required"), serviceId);
                    return;
                }
                String stepId = stepIdParam;
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
                String bodyParam = message.body().getString("body");
                if(bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Object body = Json.mapper.readValue(bodyParam, Object.class);
                service.cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "cancelPipelineExecutionStep");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("cancelPipelineExecutionStep", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getCurrentExecution
        vertx.eventBus().<JsonObject> consumer(GETCURRENTEXECUTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getCurrentExecution";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
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
                service.getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getCurrentExecution");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getCurrentExecution", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getExecution
        vertx.eventBus().<JsonObject> consumer(GETEXECUTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getExecution";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
                String executionIdParam = message.body().getString("executionId");
                if(executionIdParam == null) {
                    manageError(message, new MainApiException(400, "executionId is required"), serviceId);
                    return;
                }
                String executionId = executionIdParam;
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
                service.getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getExecution");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getExecution", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getExecutions
        vertx.eventBus().<JsonObject> consumer(GETEXECUTIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getExecutions";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
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
                String startParam = message.body().getString("start");
                String start = (startParam == null) ? null : startParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                service.getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getExecutions");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getExecutions", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getStepLogs
        vertx.eventBus().<JsonObject> consumer(GETSTEPLOGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getStepLogs";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
                String executionIdParam = message.body().getString("executionId");
                if(executionIdParam == null) {
                    manageError(message, new MainApiException(400, "executionId is required"), serviceId);
                    return;
                }
                String executionId = executionIdParam;
                String phaseIdParam = message.body().getString("phaseId");
                if(phaseIdParam == null) {
                    manageError(message, new MainApiException(400, "phaseId is required"), serviceId);
                    return;
                }
                String phaseId = phaseIdParam;
                String stepIdParam = message.body().getString("stepId");
                if(stepIdParam == null) {
                    manageError(message, new MainApiException(400, "stepId is required"), serviceId);
                    return;
                }
                String stepId = stepIdParam;
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
                String fileParam = message.body().getString("file");
                String file = (fileParam == null) ? null : fileParam;
                String acceptParam = message.body().getString("Accept");
                String accept = (acceptParam == null) ? null : acceptParam;
                service.getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getStepLogs");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getStepLogs", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for startPipeline
        vertx.eventBus().<JsonObject> consumer(STARTPIPELINE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "startPipeline";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
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
                service.startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "startPipeline");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("startPipeline", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for stepMetric
        vertx.eventBus().<JsonObject> consumer(STEPMETRIC_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "stepMetric";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
                String executionIdParam = message.body().getString("executionId");
                if(executionIdParam == null) {
                    manageError(message, new MainApiException(400, "executionId is required"), serviceId);
                    return;
                }
                String executionId = executionIdParam;
                String phaseIdParam = message.body().getString("phaseId");
                if(phaseIdParam == null) {
                    manageError(message, new MainApiException(400, "phaseId is required"), serviceId);
                    return;
                }
                String phaseId = phaseIdParam;
                String stepIdParam = message.body().getString("stepId");
                if(stepIdParam == null) {
                    manageError(message, new MainApiException(400, "stepId is required"), serviceId);
                    return;
                }
                String stepId = stepIdParam;
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
                service.stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "stepMetric");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("stepMetric", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for stepState
        vertx.eventBus().<JsonObject> consumer(STEPSTATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "stepState";
                String programIdParam = message.body().getString("programId");
                if(programIdParam == null) {
                    manageError(message, new MainApiException(400, "programId is required"), serviceId);
                    return;
                }
                String programId = programIdParam;
                String pipelineIdParam = message.body().getString("pipelineId");
                if(pipelineIdParam == null) {
                    manageError(message, new MainApiException(400, "pipelineId is required"), serviceId);
                    return;
                }
                String pipelineId = pipelineIdParam;
                String executionIdParam = message.body().getString("executionId");
                if(executionIdParam == null) {
                    manageError(message, new MainApiException(400, "executionId is required"), serviceId);
                    return;
                }
                String executionId = executionIdParam;
                String phaseIdParam = message.body().getString("phaseId");
                if(phaseIdParam == null) {
                    manageError(message, new MainApiException(400, "phaseId is required"), serviceId);
                    return;
                }
                String phaseId = phaseIdParam;
                String stepIdParam = message.body().getString("stepId");
                if(stepIdParam == null) {
                    manageError(message, new MainApiException(400, "stepId is required"), serviceId);
                    return;
                }
                String stepId = stepIdParam;
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
                service.stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "stepState");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("stepState", e);
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
