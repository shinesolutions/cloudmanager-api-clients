package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class PipelineExecutionApiSimulation extends Simulation {

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
    val advancePipelineExecutionPerSecond = config.getDouble("performance.operationsPerSecond.advancePipelineExecution") * rateMultiplier * instanceMultiplier
    val cancelPipelineExecutionStepPerSecond = config.getDouble("performance.operationsPerSecond.cancelPipelineExecutionStep") * rateMultiplier * instanceMultiplier
    val getCurrentExecutionPerSecond = config.getDouble("performance.operationsPerSecond.getCurrentExecution") * rateMultiplier * instanceMultiplier
    val getExecutionPerSecond = config.getDouble("performance.operationsPerSecond.getExecution") * rateMultiplier * instanceMultiplier
    val getExecutionsPerSecond = config.getDouble("performance.operationsPerSecond.getExecutions") * rateMultiplier * instanceMultiplier
    val getStepLogsPerSecond = config.getDouble("performance.operationsPerSecond.getStepLogs") * rateMultiplier * instanceMultiplier
    val startPipelinePerSecond = config.getDouble("performance.operationsPerSecond.startPipeline") * rateMultiplier * instanceMultiplier
    val stepMetricPerSecond = config.getDouble("performance.operationsPerSecond.stepMetric") * rateMultiplier * instanceMultiplier
    val stepStatePerSecond = config.getDouble("performance.operationsPerSecond.stepState") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val advancePipelineExecutionHEADERFeeder = csv(userDataDirectory + File.separator + "advancePipelineExecution-headerParams.csv").random
    val advancePipelineExecutionPATHFeeder = csv(userDataDirectory + File.separator + "advancePipelineExecution-pathParams.csv").random
    val cancelPipelineExecutionStepHEADERFeeder = csv(userDataDirectory + File.separator + "cancelPipelineExecutionStep-headerParams.csv").random
    val cancelPipelineExecutionStepPATHFeeder = csv(userDataDirectory + File.separator + "cancelPipelineExecutionStep-pathParams.csv").random
    val getCurrentExecutionHEADERFeeder = csv(userDataDirectory + File.separator + "getCurrentExecution-headerParams.csv").random
    val getCurrentExecutionPATHFeeder = csv(userDataDirectory + File.separator + "getCurrentExecution-pathParams.csv").random
    val getExecutionHEADERFeeder = csv(userDataDirectory + File.separator + "getExecution-headerParams.csv").random
    val getExecutionPATHFeeder = csv(userDataDirectory + File.separator + "getExecution-pathParams.csv").random
    val getExecutionsQUERYFeeder = csv(userDataDirectory + File.separator + "getExecutions-queryParams.csv").random
    val getExecutionsHEADERFeeder = csv(userDataDirectory + File.separator + "getExecutions-headerParams.csv").random
    val getExecutionsPATHFeeder = csv(userDataDirectory + File.separator + "getExecutions-pathParams.csv").random
    val getStepLogsQUERYFeeder = csv(userDataDirectory + File.separator + "getStepLogs-queryParams.csv").random
    val getStepLogsHEADERFeeder = csv(userDataDirectory + File.separator + "getStepLogs-headerParams.csv").random
    val getStepLogsPATHFeeder = csv(userDataDirectory + File.separator + "getStepLogs-pathParams.csv").random
    val startPipelineHEADERFeeder = csv(userDataDirectory + File.separator + "startPipeline-headerParams.csv").random
    val startPipelinePATHFeeder = csv(userDataDirectory + File.separator + "startPipeline-pathParams.csv").random
    val stepMetricHEADERFeeder = csv(userDataDirectory + File.separator + "stepMetric-headerParams.csv").random
    val stepMetricPATHFeeder = csv(userDataDirectory + File.separator + "stepMetric-pathParams.csv").random
    val stepStateHEADERFeeder = csv(userDataDirectory + File.separator + "stepState-headerParams.csv").random
    val stepStatePATHFeeder = csv(userDataDirectory + File.separator + "stepState-pathParams.csv").random

    // Setup all scenarios

    
    val scnadvancePipelineExecution = scenario("advancePipelineExecutionSimulation")
        .feed(advancePipelineExecutionHEADERFeeder)
        .feed(advancePipelineExecutionPATHFeeder)
        .exec(http("advancePipelineExecution")
        .httpRequest("PUT","/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}/advance")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Content-Type","${Content-Type}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scnadvancePipelineExecution with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnadvancePipelineExecution.inject(
        rampUsersPerSec(1) to(advancePipelineExecutionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(advancePipelineExecutionPerSecond) during(durationSeconds),
        rampUsersPerSec(advancePipelineExecutionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncancelPipelineExecutionStep = scenario("cancelPipelineExecutionStepSimulation")
        .feed(cancelPipelineExecutionStepHEADERFeeder)
        .feed(cancelPipelineExecutionStepPATHFeeder)
        .exec(http("cancelPipelineExecutionStep")
        .httpRequest("PUT","/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}/cancel")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Content-Type","${Content-Type}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scncancelPipelineExecutionStep with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncancelPipelineExecutionStep.inject(
        rampUsersPerSec(1) to(cancelPipelineExecutionStepPerSecond) during(rampUpSeconds),
        constantUsersPerSec(cancelPipelineExecutionStepPerSecond) during(durationSeconds),
        rampUsersPerSec(cancelPipelineExecutionStepPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetCurrentExecution = scenario("getCurrentExecutionSimulation")
        .feed(getCurrentExecutionHEADERFeeder)
        .feed(getCurrentExecutionPATHFeeder)
        .exec(http("getCurrentExecution")
        .httpRequest("GET","/api/program/${programId}/pipeline/${pipelineId}/execution")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetCurrentExecution with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetCurrentExecution.inject(
        rampUsersPerSec(1) to(getCurrentExecutionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getCurrentExecutionPerSecond) during(durationSeconds),
        rampUsersPerSec(getCurrentExecutionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetExecution = scenario("getExecutionSimulation")
        .feed(getExecutionHEADERFeeder)
        .feed(getExecutionPATHFeeder)
        .exec(http("getExecution")
        .httpRequest("GET","/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetExecution with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetExecution.inject(
        rampUsersPerSec(1) to(getExecutionPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getExecutionPerSecond) during(durationSeconds),
        rampUsersPerSec(getExecutionPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetExecutions = scenario("getExecutionsSimulation")
        .feed(getExecutionsQUERYFeeder)
        .feed(getExecutionsHEADERFeeder)
        .feed(getExecutionsPATHFeeder)
        .exec(http("getExecutions")
        .httpRequest("GET","/api/program/${programId}/pipeline/${pipelineId}/executions")
        .queryParam("limit","${limit}")
        .queryParam("start","${start}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetExecutions with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetExecutions.inject(
        rampUsersPerSec(1) to(getExecutionsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getExecutionsPerSecond) during(durationSeconds),
        rampUsersPerSec(getExecutionsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetStepLogs = scenario("getStepLogsSimulation")
        .feed(getStepLogsQUERYFeeder)
        .feed(getStepLogsHEADERFeeder)
        .feed(getStepLogsPATHFeeder)
        .exec(http("getStepLogs")
        .httpRequest("GET","/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}/logs")
        .queryParam("file","${file}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
        .header("Accept","${Accept}")
)

    // Run scngetStepLogs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetStepLogs.inject(
        rampUsersPerSec(1) to(getStepLogsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getStepLogsPerSecond) during(durationSeconds),
        rampUsersPerSec(getStepLogsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnstartPipeline = scenario("startPipelineSimulation")
        .feed(startPipelineHEADERFeeder)
        .feed(startPipelinePATHFeeder)
        .exec(http("startPipeline")
        .httpRequest("PUT","/api/program/${programId}/pipeline/${pipelineId}/execution")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Content-Type","${Content-Type}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scnstartPipeline with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnstartPipeline.inject(
        rampUsersPerSec(1) to(startPipelinePerSecond) during(rampUpSeconds),
        constantUsersPerSec(startPipelinePerSecond) during(durationSeconds),
        rampUsersPerSec(startPipelinePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnstepMetric = scenario("stepMetricSimulation")
        .feed(stepMetricHEADERFeeder)
        .feed(stepMetricPATHFeeder)
        .exec(http("stepMetric")
        .httpRequest("GET","/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}/metrics")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scnstepMetric with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnstepMetric.inject(
        rampUsersPerSec(1) to(stepMetricPerSecond) during(rampUpSeconds),
        constantUsersPerSec(stepMetricPerSecond) during(durationSeconds),
        rampUsersPerSec(stepMetricPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnstepState = scenario("stepStateSimulation")
        .feed(stepStateHEADERFeeder)
        .feed(stepStatePATHFeeder)
        .exec(http("stepState")
        .httpRequest("GET","/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scnstepState with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnstepState.inject(
        rampUsersPerSec(1) to(stepStatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(stepStatePerSecond) during(durationSeconds),
        rampUsersPerSec(stepStatePerSecond) to(1) during(rampDownSeconds)
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
