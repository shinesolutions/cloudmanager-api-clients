package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class PipelinesApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://cloudmanager.adobe.io")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val deletePipelinePerSecond = config.getDouble("performance.operationsPerSecond.deletePipeline") * rateMultiplier * instanceMultiplier
    val getPipelinePerSecond = config.getDouble("performance.operationsPerSecond.getPipeline") * rateMultiplier * instanceMultiplier
    val getPipelinesPerSecond = config.getDouble("performance.operationsPerSecond.getPipelines") * rateMultiplier * instanceMultiplier
    val patchPipelinePerSecond = config.getDouble("performance.operationsPerSecond.patchPipeline") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deletePipelineHEADERFeeder = csv(userDataDirectory + File.separator + "deletePipeline-headerParams.csv").random
    val deletePipelinePATHFeeder = csv(userDataDirectory + File.separator + "deletePipeline-pathParams.csv").random
    val getPipelineHEADERFeeder = csv(userDataDirectory + File.separator + "getPipeline-headerParams.csv").random
    val getPipelinePATHFeeder = csv(userDataDirectory + File.separator + "getPipeline-pathParams.csv").random
    val getPipelinesHEADERFeeder = csv(userDataDirectory + File.separator + "getPipelines-headerParams.csv").random
    val getPipelinesPATHFeeder = csv(userDataDirectory + File.separator + "getPipelines-pathParams.csv").random
    val patchPipelineHEADERFeeder = csv(userDataDirectory + File.separator + "patchPipeline-headerParams.csv").random
    val patchPipelinePATHFeeder = csv(userDataDirectory + File.separator + "patchPipeline-pathParams.csv").random

    // Setup all scenarios

    
    val scndeletePipeline = scenario("deletePipelineSimulation")
        .feed(deletePipelineHEADERFeeder)
        .feed(deletePipelinePATHFeeder)
        .exec(http("deletePipeline")
        .httpRequest("DELETE","/api/program/${programId}/pipeline/${pipelineId}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scndeletePipeline with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeletePipeline.inject(
        rampUsersPerSec(1) to(deletePipelinePerSecond) during(rampUpSeconds),
        constantUsersPerSec(deletePipelinePerSecond) during(durationSeconds),
        rampUsersPerSec(deletePipelinePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPipeline = scenario("getPipelineSimulation")
        .feed(getPipelineHEADERFeeder)
        .feed(getPipelinePATHFeeder)
        .exec(http("getPipeline")
        .httpRequest("GET","/api/program/${programId}/pipeline/${pipelineId}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetPipeline with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPipeline.inject(
        rampUsersPerSec(1) to(getPipelinePerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPipelinePerSecond) during(durationSeconds),
        rampUsersPerSec(getPipelinePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetPipelines = scenario("getPipelinesSimulation")
        .feed(getPipelinesHEADERFeeder)
        .feed(getPipelinesPATHFeeder)
        .exec(http("getPipelines")
        .httpRequest("GET","/api/program/${programId}/pipelines")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetPipelines with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetPipelines.inject(
        rampUsersPerSec(1) to(getPipelinesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getPipelinesPerSecond) during(durationSeconds),
        rampUsersPerSec(getPipelinesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpatchPipeline = scenario("patchPipelineSimulation")
        .feed(patchPipelineHEADERFeeder)
        .feed(patchPipelinePATHFeeder)
        .exec(http("patchPipeline")
        .httpRequest("PATCH","/api/program/${programId}/pipeline/${pipelineId}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Content-Type","${Content-Type}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scnpatchPipeline with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpatchPipeline.inject(
        rampUsersPerSec(1) to(patchPipelinePerSecond) during(rampUpSeconds),
        constantUsersPerSec(patchPipelinePerSecond) during(durationSeconds),
        rampUsersPerSec(patchPipelinePerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
