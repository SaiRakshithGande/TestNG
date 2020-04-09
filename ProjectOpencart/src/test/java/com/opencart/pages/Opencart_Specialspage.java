package com.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.basepage.BasePage;

public class Opencart_Specialspage extends BasePage {

	@FindBy(linkText = "Specials")
	WebElement offers;
	@FindBy(xpath = "//div[@id='content']/div[2]/div/div/div[2]/div[2]/button/span")
	WebElement Addtocart;
	@FindBy(xpath = "//span[contains(.,'Checkout')]")
	WebElement Check;

	public Opencart_Specialspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getSpecialoffer() throws InterruptedException {
		offers.click();// To click on offers

	}

	public void getAddCart() throws InterruptedException {
		Addtocart.click();// To click on add to cart

	}

	public void goToCheckOut() throws InterruptedException {
		Check.click();// To click on check
		Thread.sleep(3000);

	}

}
