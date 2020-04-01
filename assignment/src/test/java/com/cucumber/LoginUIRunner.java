package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = {"com.cucumber"},
tags = {"@tag1"},
plugin = {"pretty","html:target/cucumber" },
monochrome = true
)

public class LoginUIRunner {

}
