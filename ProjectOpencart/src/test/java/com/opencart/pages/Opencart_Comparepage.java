package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opencart_Comparepage {
@FindBy(xpath="//div[@id='content']/div[2]/div/div/div[3]/button[3]")
WebElement productA ;
@FindBy(xpath="//div[@id='content']/div[2]/div[3]/div/div[3]/button[3]/i")
WebElement productB;
@FindBy(linkText="product comparison")
WebElement compare;
public Opencart_Comparepage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
public void productA1() throws InterruptedException {
	productA.click();
	//productB.click();
	Thread.sleep(3000);
}
public void productA2() throws InterruptedException {
	//productA.click();
	productB.click();
	Thread.sleep(3000);
}

public void comparisons() throws InterruptedException {
	compare.click();
	Thread.sleep(3000);
	
}
}
	
	

