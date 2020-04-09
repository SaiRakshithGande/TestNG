package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.basepage.BasePage;

public class Opencart_SearchPage extends BasePage {

	@FindBy(xpath = "//div[@id='search']/input")
	WebElement searchpage;
	@FindBy(xpath = "//*[@id=\"search\"]/span/button")
	WebElement searchbtn;

	public Opencart_SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getSearchbox() {
		searchpage.click();//To click on search
	}

	public void giveKeys(String names) throws InterruptedException {
	

		searchpage.sendKeys(names);//To enter in search
		
		//Thread.sleep(3000);
	}

	public void clickButton() throws InterruptedException {
		searchbtn.click();//To click on search button
		Thread.sleep(3000);

	}

}
