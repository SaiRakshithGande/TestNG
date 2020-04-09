package com.opencart.StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.opencart.basepage.BasePage;
import com.opencart.pages.Opencart_Specialspage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Specials_Sd extends BasePage {

	Opencart_Specialspage special;
	final static Logger logger = LogManager.getLogger(Addtocart_Sd.class.getName());

	@Given("^the user to open browser chrome$")
	public void the_user_to_open_browser_chrome() throws Throwable {
		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user clicks on the specials$")
	public void the_user_clicks_on_the_specials() throws Throwable {
		special = new Opencart_Specialspage(driver);
		special.getSpecialoffer();
		logger.debug("Product searched ");
	}

	@Then("^the user will see the specials and add to the cart$")
	public void the_user_will_see_the_specials_and_add_to_the_cart() throws Throwable {
		special = new Opencart_Specialspage(driver);
		special.getAddCart();
		special.goToCheckOut();
		logger.error("Product added to cart");
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Specialspic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}
	}

	@Then("^the user close the site and browser$")
	public void the_user_close_the_site_and_browser() throws Throwable {
		quit();
	}

}
