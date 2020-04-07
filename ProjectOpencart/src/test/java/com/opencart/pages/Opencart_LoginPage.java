package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.basepage.BasePage;

public class Opencart_LoginPage extends BasePage{
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myaccount;
	@FindBy(linkText = "Login")
	WebElement login;
	@FindBy(id = "input-email")
	WebElement usernameweb;
	@FindBy(id="input-password")
	WebElement passwordweb;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;

	
	public Opencart_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void opencart_login() {
		 myaccount.click();
		 login.click();
	}

	public void username(String username) throws InterruptedException {
		Thread.sleep(4000);
		usernameweb.sendKeys(username);
	}

	public void password(String password) throws InterruptedException {
          Thread.sleep(4000);
		passwordweb.sendKeys(password);
	}

	public void loginbtn() {
		loginbtn.click();
	}
}
