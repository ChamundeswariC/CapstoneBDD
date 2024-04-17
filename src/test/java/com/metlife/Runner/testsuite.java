package com.metlife.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = "src/test/java/com/metlife/feature",
        plugin = { "pretty","html:target/cucumber-pretty",
        "json:target/cucumber.json" },
        glue = "com.metlife.StepDefinition",
        dryRun = true)
public class testsuite
{

}
