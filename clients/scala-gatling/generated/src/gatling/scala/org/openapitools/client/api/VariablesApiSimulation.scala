package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class VariablesApiSimulation extends Simulation {

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
    val getEnvironmentVariablesPerSecond = config.getDouble("performance.operationsPerSecond.getEnvironmentVariables") * rateMultiplier * instanceMultiplier
    val patchEnvironmentVariablesPerSecond = config.getDouble("performance.operationsPerSecond.patchEnvironmentVariables") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val getEnvironmentVariablesHEADERFeeder = csv(userDataDirectory + File.separator + "getEnvironmentVariables-headerParams.csv").random
    val getEnvironmentVariablesPATHFeeder = csv(userDataDirectory + File.separator + "getEnvironmentVariables-pathParams.csv").random
    val patchEnvironmentVariablesHEADERFeeder = csv(userDataDirectory + File.separator + "patchEnvironmentVariables-headerParams.csv").random
    val patchEnvironmentVariablesPATHFeeder = csv(userDataDirectory + File.separator + "patchEnvironmentVariables-pathParams.csv").random

    // Setup all scenarios

    
    val scngetEnvironmentVariables = scenario("getEnvironmentVariablesSimulation")
        .feed(getEnvironmentVariablesHEADERFeeder)
        .feed(getEnvironmentVariablesPATHFeeder)
        .exec(http("getEnvironmentVariables")
        .httpRequest("GET","/api/program/${programId}/environment/${environmentId}/variables")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetEnvironmentVariables with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetEnvironmentVariables.inject(
        rampUsersPerSec(1) to(getEnvironmentVariablesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getEnvironmentVariablesPerSecond) during(durationSeconds),
        rampUsersPerSec(getEnvironmentVariablesPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpatchEnvironmentVariables = scenario("patchEnvironmentVariablesSimulation")
        .feed(patchEnvironmentVariablesHEADERFeeder)
        .feed(patchEnvironmentVariablesPATHFeeder)
        .exec(http("patchEnvironmentVariables")
        .httpRequest("PATCH","/api/program/${programId}/environment/${environmentId}/variables")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Content-Type","${Content-Type}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scnpatchEnvironmentVariables with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpatchEnvironmentVariables.inject(
        rampUsersPerSec(1) to(patchEnvironmentVariablesPerSecond) during(rampUpSeconds),
        constantUsersPerSec(patchEnvironmentVariablesPerSecond) during(durationSeconds),
        rampUsersPerSec(patchEnvironmentVariablesPerSecond) to(1) during(rampDownSeconds)
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
