package com.cts.practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginUItesting {
	WebDriver driver;
	MyAccount MyAccount;
	TestCases TestCases;

	@BeforeSuite
	public void initDriver()
	{
	System.setProperty("webdriver.chrome.driver", "J:\\driver\\chromedriver.exe");
	}
	@BeforeTest
	public void launchBrowser()
	{
	driver = new ChromeDriver();
	driver.get("http://practice.automationtesting.in/");
	MyAccount=new MyAccount(driver);
	TestCases=new TestCases(driver);
	}
	@Test(priority=1)
	public void Myaccount() {
	MyAccount.account();
	MyAccount.SetUserName("rakshith.gande@gmail.com");
	MyAccount.SetPassword("Rakshith3788");
	MyAccount.LoginBtnClick();
	MyAccount.Dashboard();
	}

	@Test(priority=2)
	public void testcases() {
	 
	TestCases.open();
	TestCases.SelectTestCase();
	}

}
