package com.cts.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	@FindBy(linkText = "My Account")
	WebElement account;
	
	@FindBy(id = "username")
	WebElement usernameElement;
	
	@FindBy(id = "password")
	WebElement passwordElement;
	
	@FindBy(name = "login")
	WebElement loginBtnElement;
	
	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	WebElement dashBoard;

	public MyAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// this.driver = driver;
	}

	public void account() {
		System.out.println("my-account click");
		account.click();
	}

	public void SetUserName(String userName) {
		usernameElement.sendKeys(userName);
	}

	public void SetPassword(String password) {
		passwordElement.sendKeys(password);
	}

	public void LoginBtnClick() {
		loginBtnElement.click();
	}

	public void Dashboard() {
		dashBoard.click();
	}
}
