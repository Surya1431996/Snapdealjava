package com.snapdeal;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

            features = {"src/test/resources/features"},
            glue = {"com.snapdeal.StepDefs", "com.snapdeal.hooks"},
            publish = true,
            plugin = {
                    "pretty",
                    "html:target/cucumber-report1.html",
                    "json:target/cucumber.json",
                    "junit:target/cucumber.xml"}

    )
public class TestRunner {

    }


