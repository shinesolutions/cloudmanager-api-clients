package org.openapitools.server.api;

import java.nio.charset.Charset;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.phiz71.vertx.swagger.router.OperationIdServiceIdResolver;
import com.github.phiz71.vertx.swagger.router.SwaggerRouter;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.file.FileSystem;
import io.vertx.core.json.Json;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(MainApiVerticle.class);

    private int serverPort = 8080;
    protected Router router;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        router = Router.router(vertx);
    }

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Json.mapper.registerModule(new JavaTimeModule());
        FileSystem vertxFileSystem = vertx.fileSystem();
        vertxFileSystem.readFile("openapi.json", readFile -> {
            if (readFile.succeeded()) {
                Swagger swagger = new SwaggerParser().parse(readFile.result().toString(Charset.forName("utf-8")));
                Router swaggerRouter = SwaggerRouter.swaggerRouter(router, swagger, vertx.eventBus(), new OperationIdServiceIdResolver());

                deployVerticles(startFuture);

                vertx.createHttpServer()
                    .requestHandler(swaggerRouter::accept) 
                    .listen(serverPort, h -> {
                        if (h.succeeded()) {
                            startFuture.complete();
                        } else {
                            startFuture.fail(h.cause());
                        }
                    });
            } else {
            	startFuture.fail(readFile.cause());
            }
        });        		        
    }
      
    public void deployVerticles(Future<Void> startFuture) {
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BranchesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BranchesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BranchesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.EnvironmentsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("EnvironmentsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("EnvironmentsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PipelineExecutionApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PipelineExecutionApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PipelineExecutionApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PipelinesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PipelinesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PipelinesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ProgramsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ProgramsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ProgramsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.RepositoriesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("RepositoriesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("RepositoriesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.VariablesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("VariablesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("VariablesApiVerticle : Deployment failed");
            }
        });
        
    }
}