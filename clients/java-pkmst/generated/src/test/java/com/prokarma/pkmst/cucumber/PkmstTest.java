package com.prokarma.pkmst.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report",
 "json:./report/Programs-report-json/Programs.json",
 "json:./report/Repositories-report-json/Repositories.json",
 "json:./report/Branches-report-json/Branches.json",
 "json:./report/Pipelines-report-json/Pipelines.json",
 "json:./report/Pipeline Execution-report-json/Pipeline Execution.json",
 "json:./report/Environments-report-json/Environments.json",
 "json:./report/Variables-report-json/Variables.json",
 })
public class PkmstTest {
}