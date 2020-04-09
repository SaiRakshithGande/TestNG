package com.opencart.StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.opencart.basepage.BasePage;
import com.opencart.pages.Opencart_SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Sd extends BasePage {
	Opencart_SearchPage search;
	final static Logger logger = LogManager.getLogger(Addtocart_Sd.class.getName());

	@Given("^the user launch the browser$")
	public void the_user_launch_the_browser() throws Throwable {
		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user opens the open cart search (.+) page$")
	public void the_user_opens_the_open_cart_search_page(String names) throws Throwable {
		search = new Opencart_SearchPage(driver);
		search.getSearchbox();
		search.giveKeys("IMAC");
		logger.debug("Product searched ");

	}

	@Then("^the user search the product$")
	public void the_user_search_the_product() throws Throwable {
		search = new Opencart_SearchPage(driver);
		search.clickButton();
		logger.error("Searching for selected product");
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Searchpic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}

	}

	@Then("^the user close the browesr$")
	public void the_user_close_the_browesr() throws Throwable {
		quit();
	}

}
