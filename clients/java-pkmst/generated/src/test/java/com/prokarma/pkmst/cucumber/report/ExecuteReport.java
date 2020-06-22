package com.prokarma.pkmst.cucumber.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ExecuteReport {

  public static void main(String[] args) {
    generateReport();
  }

  private static void generateReport() {
    String buildNumber = "1";
    String projectName = "Spring-micro-sample";
    boolean runWithJenkins = false;
    boolean parallelTesting = false;

    File reportOutputDirectory = null;
    List<String> jsonFiles = null;
    Configuration configuration = null;
    ReportBuilder reportBuilder = null;
    reportOutputDirectory = new File("./report/Programs-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Programs-report-json/Programs.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Repositories-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Repositories-report-json/Repositories.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Branches-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Branches-report-json/Branches.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Pipelines-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Pipelines-report-json/Pipelines.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Pipeline Execution-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Pipeline Execution-report-json/Pipeline Execution.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Environments-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Environments-report-json/Environments.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();
    reportOutputDirectory = new File("./report/Variables-report-html/");
    jsonFiles = new ArrayList();
    jsonFiles.add("./report/Variables-report-json/Variables.json");

    configuration = new Configuration(reportOutputDirectory,projectName);
    // optionally only if you need
    configuration.setParallelTesting(parallelTesting);
    configuration.setRunWithJenkins(runWithJenkins);
    configuration.setBuildNumber(buildNumber);

    reportBuilder = new ReportBuilder(jsonFiles, configuration);
    reportBuilder.generateReports();

  }
}