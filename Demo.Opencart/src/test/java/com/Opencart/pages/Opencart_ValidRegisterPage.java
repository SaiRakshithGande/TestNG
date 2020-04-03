package com.Opencart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opencart_ValidRegisterPage {
	WebDriver driver;
	By my_account=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By register=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By first_name=By.name("firstname");
	By last_name=By.name("lastname");
	By email=By.name("email");
	By telephone=By.name("telephone");
	By password=By.name("password");
	By confirm=By.name("confirm");
	By agree=By.name("agree");
	By register_submit=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver",  "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/"); //get url from user

	}
	
	public void opencart_register()
	{
		driver.findElement(my_account).click(); //click my account
		driver.findElement(register).click(); //select register from my account
	}
	
	public void register_details() throws InterruptedException
	{
		driver.findElement(first_name).sendKeys("Sai"); //get first name from user
		driver.findElement(last_name).sendKeys("Rakshith"); //get last name from user
		driver.findElement(email).sendKeys("Rakshith1998@gmail.com"); //get email from user
		driver.findElement(telephone).sendKeys("7330015835"); //get telephone from user
		driver.findElement(password).sendKeys("rakshith3788"); //get password from user
		driver.findElement(confirm).sendKeys("rakshith3788"); //confirms the entered password
		driver.findElement(agree).click(); //agree to the terms and condition
		driver.findElement(register_submit).click(); //click the submit button
		Thread.sleep(3000); 
	}
	public void quit()
	{
		driver.close(); //close the browser
	}

}
