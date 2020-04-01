package com.cucumber;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cts.practice.MyAccount;
import com.cts.practice.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginUIsteps {
	WebDriver driver;
	MyAccount MyAccount;
	TestCases TestCases;

	@Given("^I am on the MyAccount page$")
	public void i_am_on_the_myaccount_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "J:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MyAccount = new MyAccount(driver);
		TestCases = new TestCases(driver);
		MyAccount.account();
	}

	@When("^I fillup (.+)$")
	public void i_fillup(String username) throws Throwable {
//		Thread.sleep(5000);
		MyAccount.SetUserName(username);
	}

	@Then("^click on second testcase$")
	public void click_on_second_testcase() throws Throwable {
		TestCases.SelectTestCase();
	}

	@And("^I fill (.+)$")
	public void i_fill(String password) throws Throwable {
		MyAccount.SetPassword(password);
	}

	@And("^I press loginButton$")
	public void i_press_loginbutton() throws Throwable {
		MyAccount.LoginBtnClick();
	}

	@And("^click on dashboard$")
	public void click_on_dashboard() throws Throwable {
		MyAccount.Dashboard();
	}

	@And("^click on testcases$")
	public void click_on_testcases() throws Throwable {
		TestCases.open();
	}
}
