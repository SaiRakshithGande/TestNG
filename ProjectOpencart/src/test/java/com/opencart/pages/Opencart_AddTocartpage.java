package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.basepage.BasePage;

public class Opencart_AddTocartpage extends BasePage {
	@FindBy(xpath = "//div[@id='search']/input")
	WebElement searchpages;
	@FindBy(xpath = "//*[@id=\"search\"]/span/button")
	WebElement searchbtns;
	@FindBy(xpath = "//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span")
	WebElement addtocart;

	public Opencart_AddTocartpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void textSearchBox() {
		searchpages.click(); // To click on search box
	}

	public void getSearch(String name) {

		searchpages.sendKeys(name); // To enter in search box
	}

	public void buttonPress() throws InterruptedException {
		searchbtns.click(); // To click on search button
		
	}

	public void getItem() throws InterruptedException {
		addtocart.click(); // To click on add to cart
		Thread.sleep(3000);
	}

}
