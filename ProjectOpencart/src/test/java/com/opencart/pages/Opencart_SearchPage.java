package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.basepage.BasePage;

public class Opencart_SearchPage extends BasePage {

	@FindBy(xpath="//div[@id='search']/input")
	WebElement searchpage;
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	WebElement searchbtn;
	public Opencart_SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   
	
	public void searchbox() {
    	searchpage.click();
    }
	
	public void opencart_search(String names) throws InterruptedException {
		// searchpage.click();
		 
		 searchpage.sendKeys(names);
		 Thread.sleep(3000);
	}

	public void button() throws InterruptedException {
		searchbtn.click();
		 Thread.sleep(3000);
	}
	
	
	
}
