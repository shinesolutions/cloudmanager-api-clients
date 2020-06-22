package org.openapitools.handler;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

public class PathHandlerProvider implements HandlerProvider {

    public HttpHandler getHandler() {
        HttpHandler handler = Handlers.routing()


            .add(Methods.GET, "/api/program/{programId}/repository/{repositoryId}/branches", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getBranches");
                        }
                    })


            .add(Methods.DELETE, "/api/program/{programId}/environment/{environmentId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteEnvironment");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/environment/{environmentId}/logs/download", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("downloadLogs");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/environment/{environmentId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getEnvironment");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/environment/{environmentId}/logs", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getEnvironmentLogs");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/environments", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getEnvironments");
                        }
                    })


            .add(Methods.PUT, "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("advancePipelineExecution");
                        }
                    })


            .add(Methods.PUT, "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("cancelPipelineExecutionStep");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/pipeline/{pipelineId}/execution", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getCurrentExecution");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getExecution");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/pipeline/{pipelineId}/executions", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getExecutions");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getStepLogs");
                        }
                    })


            .add(Methods.PUT, "/api/program/{programId}/pipeline/{pipelineId}/execution", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("startPipeline");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("stepMetric");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("stepState");
                        }
                    })


            .add(Methods.DELETE, "/api/program/{programId}/pipeline/{pipelineId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deletePipeline");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/pipeline/{pipelineId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getPipeline");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/pipelines", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getPipelines");
                        }
                    })


            .add(Methods.PATCH, "/api/program/{programId}/pipeline/{pipelineId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("patchPipeline");
                        }
                    })


            .add(Methods.DELETE, "/api/program/{programId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("deleteProgram");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getProgram");
                        }
                    })


            .add(Methods.GET, "/api/programs", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getPrograms");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/repositories", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getRepositories");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/repository/{repositoryId}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getRepository");
                        }
                    })


            .add(Methods.GET, "/api/program/{programId}/environment/{environmentId}/variables", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getEnvironmentVariables");
                        }
                    })


            .add(Methods.PATCH, "/api/program/{programId}/environment/{environmentId}/variables", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("patchEnvironmentVariables");
                        }
                    })

        ;
        return handler;
    }
}

