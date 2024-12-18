package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature",
glue = {"stepDefinitions"},
tags = "@reg",
monochrome = true,
plugin = {
		"pretty",
		"html:target/cucumber-reports.html",
		"json:target/cucumber-reports.json"
})

public class TestRunner {

}
