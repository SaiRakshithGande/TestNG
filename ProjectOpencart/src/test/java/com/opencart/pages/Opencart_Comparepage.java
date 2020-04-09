package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opencart_Comparepage {
	@FindBy(xpath = "//div[@id='content']/div[2]/div/div/div[3]/button[3]")
	WebElement productA;
	@FindBy(xpath = "//div[@id='content']/div[2]/div[3]/div/div[3]/button[3]/i")
	WebElement productB;
	@FindBy(linkText = "product comparison")
	WebElement compare;

	public Opencart_Comparepage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void getProductA1() throws InterruptedException {
		productA.click();// To click on product A

	}

	public void getProductA2() throws InterruptedException {

		productB.click();// To click on product B

	}

	public void getComparisons() throws InterruptedException {
		compare.click(); // To compare products
		Thread.sleep(3000);

	}
}
