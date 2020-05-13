package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CognizantPage {
@FindBy(id="i0116")
WebElement  login;
@FindBy(xpath="//input[@id='idSIButton9']")
WebElement next;
@FindBy(id="i0118")
WebElement pass;
@FindBy(id = "idSIButton9")
WebElement signin;
@FindBy(id="idTxtBx_SAOTCC_OTC")
WebElement otp;
@FindBy(id = "320123")
WebElement about;
@FindBy()
public CognizantPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	}

public void getAutomate() throws InterruptedException {
	login.sendKeys("853369@cognizant.com");
	
	next.click();
	Thread.sleep(3000);
	pass.sendKeys("Kittu@1998");
	signin.click();
	otp.click();
	Thread.sleep(3000);
	
}
}