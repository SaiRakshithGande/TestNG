package com.opencart.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/Opencart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc02_Search"},
		glue = {"com.opencart.StepDefinations"},
		//monochrome = true
		dryRun=false
		)
public class Opencart_runnersearch {

}
