package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.basepage.BasePage;

public class Opencart_AddTocartpage extends BasePage{
	@FindBy(xpath="//div[@id='search']/input")
	WebElement searchpages;
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	WebElement searchbtns;
	@FindBy(xpath="//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span")
	WebElement addtocart;

	public Opencart_AddTocartpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void searchboxes() {
    	searchpages.click();
    }
	
	public void opencart_searching(String name) {
		
		 
		 searchpages.sendKeys(name);
	}

	public void buttonpress() throws InterruptedException {
		searchbtns.click();
		Thread.sleep(3000);
	}
	public void add() throws InterruptedException {
		addtocart.click();
		Thread.sleep(3000);
	}
	
}
