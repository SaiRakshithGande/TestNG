package com.opencart.StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.opencart.basepage.BasePage;
import com.opencart.pages.Opencart_LoginPage;
import com.utilites.ExcelCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Sd extends BasePage {
	Opencart_LoginPage login;
	final static Logger logger = LogManager.getLogger(Addtocart_Sd.class.getName());
	ExcelCode data = new ExcelCode();

	@Given("^a user launch the browser$")
	public void a_user_launch_the_browser() throws Throwable {
		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user opens opencart login page$")
	public void the_user_opens_opencart_login_page() throws Throwable {
		login = new Opencart_LoginPage(driver);
		login.opencartLogin();
		logger.debug("Login page opened ");
	}

	@Then("^the user login using username and password$")
	public void the_user_login_using_username_and_password() throws Throwable {
		login = new Opencart_LoginPage(driver);
		ExcelCode data = new ExcelCode();
		// login.username("rakshith1998@gmail.com");
		// login.password("rakshith3788");
		Thread.sleep(4000);
		login.getUsername(data.get_username(0));
		login.getPassword(data.get_password(0));
		login.loginBtn();
		logger.error("Details are given");
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Loginpic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}
	}

	@Then("^the user close the login page$")
	public void the_user_close_the_login_page() throws Throwable {
		quit();
	}

}
