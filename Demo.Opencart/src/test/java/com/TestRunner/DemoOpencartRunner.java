package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/Opencart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01_opencart_valid_register,@tc02_opencart_valid_login,@tc03_opencart_search,@tc04_opencart_add_to_cart,@tc05_opencart_wishlist,@tc06_opencart_product_comparison"},//test cases to be executed
		glue = {"com.Opencart.stepdefinition"},
		monochrome = true//readable
		)

public class DemoOpencartRunner {

}
