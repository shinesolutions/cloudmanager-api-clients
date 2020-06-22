package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class EnvironmentsApiSimulation extends Simulation {

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
    val deleteEnvironmentPerSecond = config.getDouble("performance.operationsPerSecond.deleteEnvironment") * rateMultiplier * instanceMultiplier
    val downloadLogsPerSecond = config.getDouble("performance.operationsPerSecond.downloadLogs") * rateMultiplier * instanceMultiplier
    val getEnvironmentPerSecond = config.getDouble("performance.operationsPerSecond.getEnvironment") * rateMultiplier * instanceMultiplier
    val getEnvironmentLogsPerSecond = config.getDouble("performance.operationsPerSecond.getEnvironmentLogs") * rateMultiplier * instanceMultiplier
    val getEnvironmentsPerSecond = config.getDouble("performance.operationsPerSecond.getEnvironments") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val deleteEnvironmentHEADERFeeder = csv(userDataDirectory + File.separator + "deleteEnvironment-headerParams.csv").random
    val deleteEnvironmentPATHFeeder = csv(userDataDirectory + File.separator + "deleteEnvironment-pathParams.csv").random
    val downloadLogsQUERYFeeder = csv(userDataDirectory + File.separator + "downloadLogs-queryParams.csv").random
    val downloadLogsHEADERFeeder = csv(userDataDirectory + File.separator + "downloadLogs-headerParams.csv").random
    val downloadLogsPATHFeeder = csv(userDataDirectory + File.separator + "downloadLogs-pathParams.csv").random
    val getEnvironmentHEADERFeeder = csv(userDataDirectory + File.separator + "getEnvironment-headerParams.csv").random
    val getEnvironmentPATHFeeder = csv(userDataDirectory + File.separator + "getEnvironment-pathParams.csv").random
    val getEnvironmentLogsQUERYFeeder = csv(userDataDirectory + File.separator + "getEnvironmentLogs-queryParams.csv").random
    val getEnvironmentLogsHEADERFeeder = csv(userDataDirectory + File.separator + "getEnvironmentLogs-headerParams.csv").random
    val getEnvironmentLogsPATHFeeder = csv(userDataDirectory + File.separator + "getEnvironmentLogs-pathParams.csv").random
    val getEnvironmentsQUERYFeeder = csv(userDataDirectory + File.separator + "getEnvironments-queryParams.csv").random
    val getEnvironmentsHEADERFeeder = csv(userDataDirectory + File.separator + "getEnvironments-headerParams.csv").random
    val getEnvironmentsPATHFeeder = csv(userDataDirectory + File.separator + "getEnvironments-pathParams.csv").random

    // Setup all scenarios

    
    val scndeleteEnvironment = scenario("deleteEnvironmentSimulation")
        .feed(deleteEnvironmentHEADERFeeder)
        .feed(deleteEnvironmentPATHFeeder)
        .exec(http("deleteEnvironment")
        .httpRequest("DELETE","/api/program/${programId}/environment/${environmentId}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scndeleteEnvironment with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndeleteEnvironment.inject(
        rampUsersPerSec(1) to(deleteEnvironmentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(deleteEnvironmentPerSecond) during(durationSeconds),
        rampUsersPerSec(deleteEnvironmentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scndownloadLogs = scenario("downloadLogsSimulation")
        .feed(downloadLogsQUERYFeeder)
        .feed(downloadLogsHEADERFeeder)
        .feed(downloadLogsPATHFeeder)
        .exec(http("downloadLogs")
        .httpRequest("GET","/api/program/${programId}/environment/${environmentId}/logs/download")
        .queryParam("service","${service}")
        .queryParam("date","${date}")
        .queryParam("name","${name}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
        .header("Accept","${Accept}")
)

    // Run scndownloadLogs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scndownloadLogs.inject(
        rampUsersPerSec(1) to(downloadLogsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(downloadLogsPerSecond) during(durationSeconds),
        rampUsersPerSec(downloadLogsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetEnvironment = scenario("getEnvironmentSimulation")
        .feed(getEnvironmentHEADERFeeder)
        .feed(getEnvironmentPATHFeeder)
        .exec(http("getEnvironment")
        .httpRequest("GET","/api/program/${programId}/environment/${environmentId}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetEnvironment with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetEnvironment.inject(
        rampUsersPerSec(1) to(getEnvironmentPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getEnvironmentPerSecond) during(durationSeconds),
        rampUsersPerSec(getEnvironmentPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetEnvironmentLogs = scenario("getEnvironmentLogsSimulation")
        .feed(getEnvironmentLogsQUERYFeeder)
        .feed(getEnvironmentLogsHEADERFeeder)
        .feed(getEnvironmentLogsPATHFeeder)
        .exec(http("getEnvironmentLogs")
        .httpRequest("GET","/api/program/${programId}/environment/${environmentId}/logs")
        .queryParam("service","${service}")
        .queryParam("days","${days}")
        .queryParam("name","${name}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetEnvironmentLogs with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetEnvironmentLogs.inject(
        rampUsersPerSec(1) to(getEnvironmentLogsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getEnvironmentLogsPerSecond) during(durationSeconds),
        rampUsersPerSec(getEnvironmentLogsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngetEnvironments = scenario("getEnvironmentsSimulation")
        .feed(getEnvironmentsQUERYFeeder)
        .feed(getEnvironmentsHEADERFeeder)
        .feed(getEnvironmentsPATHFeeder)
        .exec(http("getEnvironments")
        .httpRequest("GET","/api/program/${programId}/environments")
        .queryParam("type","${type}")
        .header("x-gw-ims-org-id","${x-gw-ims-org-id}")
        .header("Authorization","${Authorization}")
        .header("x-api-key","${x-api-key}")
)

    // Run scngetEnvironments with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngetEnvironments.inject(
        rampUsersPerSec(1) to(getEnvironmentsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(getEnvironmentsPerSecond) during(durationSeconds),
        rampUsersPerSec(getEnvironmentsPerSecond) to(1) during(rampDownSeconds)
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
