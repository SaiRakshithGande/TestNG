package com.opencart.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/Opencart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc03_AddToCart"},
		glue = {"com.opencart.StepDefinations"},
		monochrome = true
		//dryRun=false
		)
public class OpenCart_runneradd {
	
}
